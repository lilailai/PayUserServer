
 /** 
 * 包名: package com.imobpay.base.services.impl; <br/> 
 * 添加时间: 2016年11月8日 上午11:11:19 <br/> 
 */
package com.imobpay.base.services.impl;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONObject;
import com.imobpay.base.config.PropertiesConfig;
import com.imobpay.base.config.SendEncrypt;
import com.imobpay.base.console.Console_Column;
import com.imobpay.base.console.Console_ErrCode;
import com.imobpay.base.console.UserConsoleColumn;
import com.imobpay.base.dao.MobilepaycheckcodeDao;
import com.imobpay.base.dao.PrepClientVersionDao;
import com.imobpay.base.dao.TbvCustomerDao;
import com.imobpay.base.dao.TbvSecurityDao;
import com.imobpay.base.entity.Mobilepaycheckcode;
import com.imobpay.base.entity.PrepClientVersion;
import com.imobpay.base.entity.TbvCustomer;
import com.imobpay.base.entity.TbvSecurity;
import com.imobpay.base.exception.QTException;
import com.imobpay.base.iface.BusinessInterface;
import com.imobpay.base.log.LogPay;
import com.imobpay.base.util.DateUtil;
import com.imobpay.base.util.EmptyChecker;
import com.imobpay.base.util.Format;

/**
 * 
 * <pre>
 * 【类型】: ServicesFindUserPassTA <br/> 
 * 【作用】: TA找回密码 <br/>  
 * 【时间】：2016年11月18日 上午9:53:51 <br/> 
 * 【作者】：HuaiYu.Wen <br/> 
 * </pre>
 */
@Service
public class ServicesFindUserPassTA implements BusinessInterface {
    /**
     * 客户表
     */
    @Resource
    TbvCustomerDao<TbvCustomer>               tbvCusDao;
    
    /**
     * 密码表
     */
    @Resource
    TbvSecurityDao<TbvSecurity>               tbvSecur;
    
    /**
     * 客户端版本表
     */
    @Resource
    PrepClientVersionDao<PrepClientVersion>   clientDao;
    
    /**
     * 短信验证码表
     */
    @Resource
    MobilepaycheckcodeDao<Mobilepaycheckcode> mobCheckDao;
    
    /***
     * 应用环境
     */
    @Resource
    ApplicationContext                        applicationContext;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public String execute(String json) throws QTException {
        
        /** 转换报文 */
        JSONObject reqJson = JSONObject.parseObject(json);
        
        /** 校验必填参数 */
        EmptyChecker.checkEmpty(reqJson, UserConsoleColumn.MOBILENO, UserConsoleColumn.MOBILEMAC, UserConsoleColumn.APPUSER, UserConsoleColumn.PASSWORD, UserConsoleColumn.USEFNAME,
                UserConsoleColumn.CUSTOMERPID);
        
        /** 获取参数 */
        String password = reqJson.getString(UserConsoleColumn.PASSWORD);
        String appuser = reqJson.getString(UserConsoleColumn.APPUSER);
        String mobile = reqJson.getString(UserConsoleColumn.MOBILENO);
        String mobMac = reqJson.getString(UserConsoleColumn.MOBILEMAC);
        String userName = reqJson.getString(UserConsoleColumn.USEFNAME);
        String pid = reqJson.getString(UserConsoleColumn.CUSTOMERPID);

        String branchId = reqJson.getString(UserConsoleColumn.BRANCHID);
        LogPay.info("传送过来的机构号:" + branchId);
        
        /** 验证短信验证码*/
        PrepClientVersion pcv = new PrepClientVersion();
        pcv.setAppuser(appuser);
        PrepClientVersion selectPcv = clientDao.selectById(pcv);
        if (EmptyChecker.isEmpty(selectPcv)) {
            throw new QTException(Console_ErrCode.NOTE_NOBRANCHIDCODE, Console_ErrCode.NOTE_NOBRANCHIDDESC);
        }
        
        /** 如果传送过来的机构号不为空 则机构号以传过来的为准 */
        Mobilepaycheckcode mpc = new Mobilepaycheckcode();
        if (EmptyChecker.isNotEmpty(branchId)) {
            mpc.setBranchid(branchId);
        } else {
            mpc.setBranchid(selectPcv.getBranchid());
        }
        mpc.setMobileno(mobile);
        Mobilepaycheckcode selectMac = mobCheckDao.selectById(mpc);
        if (EmptyChecker.isEmpty(selectMac)) {
            throw new QTException(Console_ErrCode.NOTE_NOTGETCHECKCODE, Console_ErrCode.NOTE_NOTGETCHECKDESC);
        }

        if (!UserConsoleColumn.CHECKTAG_0.equals(selectMac.getChecktag())) {
            throw new QTException(Console_ErrCode.NOTE_CHECKPASTDUECODE, Console_ErrCode.NOTE_CHECKPASTDUEDESC);
        }
        /**
         * 验证码的有效时间为10分钟
         * */
        boolean nowTime = Long.valueOf(Format.time()) - Long.valueOf(selectMac.getEfftime()) > 0;
        if (nowTime) {
            throw new QTException(Console_ErrCode.NOTE_CHECKPASTDUECODE, Console_ErrCode.NOTE_CHECKPASTDUEDESC);
        }
        if (!mobMac.equals(selectMac.getCheckcode())) {
            throw new QTException(Console_ErrCode.NOTE_CHECKEERRORCODE, Console_ErrCode.NOTE_CHECKEERRORDESC);
        }
        mpc.setChecktag("1");
        mobCheckDao.update(mpc);
        /** 查询用户是否存在*/
        TbvCustomer t = new TbvCustomer();
        t.setMobile(mobile);
        TbvCustomer selectByIdMob = tbvCusDao.selectById(t);
        if (EmptyChecker.isEmpty(selectByIdMob)) {
            throw new QTException(Console_ErrCode.NOTE_NOREGISTERCODE, Console_ErrCode.NOTE_NOREGISTERDESC);
        }

        String serUserName = selectByIdMob.getUsername();
        String serPid = selectByIdMob.getCustomerpid();
        /** 判断用户的姓名和证件号会否一致*/
        if (!userName.equals(serUserName) || !pid.equals(serPid)) {
            throw new QTException(Console_ErrCode.NOTE_REALNAMEERRCODE, Console_ErrCode.NOTE_REALNAMEERRDESC);
        }

        /** 发送加密机 获取加密密码 */
        PropertiesConfig config = (PropertiesConfig) applicationContext.getBean("propertiesConfig");
        String newPwd = SendEncrypt.send(mobile, password, config);
        
        /** 查询用户密码*/
        TbvSecurity t1 = new TbvSecurity();
        t1.setTid(selectByIdMob.getTid());
        t1.setPaypassword(newPwd);
        t1.setPassworderrcnt(0);
        t1.setTimestamp(DateUtil.getCurrDate(DateUtil.YYYYMMDDHHMMSS));
        tbvSecur.update(t1);

        /** 组装成功信息返回 */
        JSONObject respJson = new JSONObject();
        respJson.put(Console_Column.MSG_CODE, Console_ErrCode.SUCCESS);
        respJson.put(Console_Column.MSG_TEXT, Console_ErrCode.SUCCESSDESC);
        return respJson.toString();
    }
}

