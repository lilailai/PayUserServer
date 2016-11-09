package com.imobpay.base.services.impl;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.imobpay.base.config.PropertiesConfig;
import com.imobpay.base.config.SendEncrypt;
import com.imobpay.base.console.Console_Column;
import com.imobpay.base.console.Console_ErrCode;
import com.imobpay.base.console.UserConsoleColumn;
import com.imobpay.base.dao.TbvBranchParamDao;
import com.imobpay.base.dao.TbvCustomerDao;
import com.imobpay.base.dao.TbvSecurityDao;
import com.imobpay.base.entity.TbvBranchParam;
import com.imobpay.base.entity.TbvCusSecurity;
import com.imobpay.base.entity.TbvCustomer;
import com.imobpay.base.entity.TbvSecurity;
import com.imobpay.base.exception.QTException;
import com.imobpay.base.iface.BusinessInterface;
import com.imobpay.base.util.EmptyChecker;

/**
 * 
 * <pre>
 * 【类型】: ServicesUserLoginTA <br/> 
 * 【作用】: 用户登录. <br/>  
 * 【时间】：2016年11月9日 上午9:46:33 <br/> 
 * 【作者】：HuaiYu.Wen <br/> 
 * </pre>
 */
@Service
public class ServicesUserLoginTA implements BusinessInterface {
    /**
     * 客户表
     */
    @Resource
    TbvCustomerDao<TbvCustomer>       tbvCusDao;
    /**
     * 密码表
     */
    @Resource
    TbvSecurityDao<TbvSecurity>       tbvSecDao;

    /** 机构公众号对应表 */
    @Resource
    TbvBranchParamDao<TbvBranchParam> tbvBranchParmDao;

    /***
     * 应用环境
     */
    @Resource
    ApplicationContext                applicationContext;

    @Override
    public String execute(String json) throws QTException {
        JSONObject reqJson = JSONObject.parseObject(json);
        EmptyChecker.checkEmpty(reqJson, UserConsoleColumn.MOBILENO, UserConsoleColumn.APPUSER, UserConsoleColumn.PASSWORD, UserConsoleColumn.PUB_ACCOUNT);
        String mobileno = reqJson.getString(UserConsoleColumn.MOBILENO);
        String password = reqJson.getString(UserConsoleColumn.PASSWORD);
        /*** 微信公众号 */
        String pubAccount = reqJson.getString(UserConsoleColumn.PUB_ACCOUNT);

        PropertiesConfig config = (PropertiesConfig) applicationContext.getBean("propertiesConfig");

        /** 发送加密机 获取加密密码 */
        String newPwd = SendEncrypt.send(mobileno, password, config);
        // 查询用户密码
        TbvCusSecurity t1 = new TbvCusSecurity();
        t1.setMobile(mobileno);
        TbvCusSecurity selectCusSecurity = tbvCusDao.selectCusSecurity(t1);

        if (EmptyChecker.isEmpty(selectCusSecurity)) {
            throw new QTException(Console_ErrCode.NOTE_NOREGISTERCODE, Console_ErrCode.NOTE_NOREGISTERDESC);
        }

        /*** 添加判断条件当前登录的公众号与注册的公众号是否相同 如果相同则语允许登录 不相同则返回用户受限 请联系代理商 */
        String branchid = selectCusSecurity.getBranchid();
        TbvBranchParam tbracnch = new TbvBranchParam();
        tbracnch.setBranchid(branchid);
        TbvBranchParam selBranch = tbvBranchParmDao.selectById(tbracnch);
        if (EmptyChecker.isEmpty(selBranch)) {
            throw new QTException(Console_ErrCode.NOTE_NOBRANCHIDCODE, Console_ErrCode.NOTE_NOBRANCHIDDESC);
        }
        /** 判断机构绑定的公众号与送上来的公众号是否相等 如果不相等则不允许登录 */
        String pubaccount = selBranch.getPubaccount();
        if (EmptyChecker.isEmpty(pubaccount) || !pubaccount.equals(pubAccount)) {
            throw new QTException(Console_ErrCode.NOTE_USERLIMITATCODE, Console_ErrCode.NOTE_USERLIMITATDESC);
        }

        if (UserConsoleColumn.TA_CUS_STATUS_2.equals(selectCusSecurity.getStatus())) {
            throw new QTException(Console_ErrCode.NOTE_USERLIMITATCODE, Console_ErrCode.NOTE_USERLIMITATDESC);
        }
        // 判断密码次数
        if (Integer.parseInt(selectCusSecurity.getPassworderrcnt()) >= 3) {
            throw new QTException(Console_ErrCode.NOTE_PWDERRORTHREECODE, Console_ErrCode.NOTE_PWDERRORTHREEDESC);
        }
        if (!newPwd.equals(selectCusSecurity.getPaypassword())) {
            TbvSecurity t = new TbvSecurity();
            t.setTid(selectCusSecurity.getTid());
            tbvSecDao.updateCusSecCount(t);
            throw new QTException(Console_ErrCode.NOTE_PWDERRORCODE, Console_ErrCode.NOTE_PWDERRORDESC);
        }

        /** 组装成功信息返回 */
        JSONObject respJson = new JSONObject();
        respJson.put(Console_Column.MSG_CODE, Console_ErrCode.SUCCESS);
        respJson.put(Console_Column.MSG_TEXT, Console_ErrCode.SUCCESSDESC);
        return respJson.toString();
    }
}
