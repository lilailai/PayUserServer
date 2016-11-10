/**
 *  <pre>	
 *  Project Name:UserDServer .</br>
 *  File: User100001.java .</br>
 *  Package Name:com.imobpay.base.services.impl .</br>
 *  Date      Author       Changes .</br>
 *  2016年5月30日   Lance.Wu     Create  .</br>
 *  Description: .</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.services.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.imobpay.base.console.Console_Column;
import com.imobpay.base.console.Console_ErrCode;
import com.imobpay.base.console.UserConsoleColumn;
import com.imobpay.base.dao.TbvBindcardDao;
import com.imobpay.base.dao.TbvCardDao;
import com.imobpay.base.dao.TbvCustomerDao;
import com.imobpay.base.entity.TbvBindcard;
import com.imobpay.base.entity.TbvCard;
import com.imobpay.base.entity.TbvCustomer;
import com.imobpay.base.exception.QTException;
import com.imobpay.base.iface.BusinessInterface;
import com.imobpay.base.util.EmptyChecker;

/**
 * 
 * <pre>
 * 【类型】: ServicesQueryUserInfoTA <br/> 
 * 【作用】: TA查询用户信息. <br/>  
 * 【时间】：2016年11月10日 下午2:25:44 <br/> 
 * 【作者】：HuaiYu.Wen <br/> 
 * </pre>
 */
@Service
public class ServicesQueryUserInfoTA implements BusinessInterface {
    /**
     * TA客户表
     */
    @Resource
    TbvCustomerDao<TbvCustomer> tbvCustomerDao;
    /**
     * 绑定卡表
     */
    @Resource
    TbvBindcardDao<TbvBindcard> tbvBindCardDao;
    /**
     * 卡表
     */
    @Resource
    TbvCardDao<TbvCard> tbvCardDao;

    @Override
    public String execute(String reqParame) throws QTException {

        /** 转换参数 */
        JSONObject reqJson = JSONObject.parseObject(reqParame);

        /** 判断必填项内容 */
        EmptyChecker.checkEmptyJson(reqJson, UserConsoleColumn.MOBILENO);
        
        /** 获取参数 */
        String mobile = reqJson.getString(UserConsoleColumn.MOBILENO);

        /** 查询个人信息 */
        TbvCustomer tbvCustomer = new TbvCustomer();
        tbvCustomer.setMobile(mobile);
        TbvCustomer tbvCustomerIfo = tbvCustomerDao.selectById(tbvCustomer);
        
        /** 判断是否为空 */
        if (EmptyChecker.isEmpty(tbvCustomerIfo)) {
            throw new QTException(Console_ErrCode.NO_RESULT, Console_ErrCode.NORESULTDESC);
        }
        
        /** 组装返回数据 */
        JSONObject respMap = new JSONObject();
        String taaccount = tbvCustomerIfo.getTaaccount();
        respMap.put(UserConsoleColumn.MOBILE, tbvCustomerIfo.getMobile());
        respMap.put(UserConsoleColumn.RS_TAACCOUNT, taaccount);
        respMap.put(UserConsoleColumn.USERNAME, tbvCustomerIfo.getUsername());
        respMap.put(UserConsoleColumn.RS_CUSTOMERPID, tbvCustomerIfo.getCustomerpid());
        respMap.put(UserConsoleColumn.RS_SHOPNAME, tbvCustomerIfo.getShopname());
        respMap.put(UserConsoleColumn.RS_MAIN_BUS, tbvCustomerIfo.getMainBus());
        respMap.put(UserConsoleColumn.RS_PROVINCE, tbvCustomerIfo.getProvince());
        respMap.put(UserConsoleColumn.RS_CITY, tbvCustomerIfo.getCity());
        respMap.put(UserConsoleColumn.RS_REGION, tbvCustomerIfo.getRegion());
        respMap.put(UserConsoleColumn.RS_ADDRESS, tbvCustomerIfo.getAddress());
        respMap.put(UserConsoleColumn.RS_BRANCHID, tbvCustomerIfo.getBranchid());
        respMap.put(UserConsoleColumn.RS_STATUS, tbvCustomerIfo.getStatus());
        respMap.put(UserConsoleColumn.RS_CUSTOMERREGDATE, tbvCustomerIfo.getCustomerregdate());

        /**tid*/
        String tid = tbvCustomerIfo.getTid();
        TbvBindcard tbc = new TbvBindcard();
        tbc.setTid(tid);
        TbvBindcard tbvBindCard = tbvBindCardDao.selectById(tbc);
        String accountNo = "";
        String accountNanme = "";
        String bankId = "";
        if (EmptyChecker.isNotEmpty(tbvBindCard)) {
            accountNo = tbvBindCard.getAccountno();
            accountNanme = tbvBindCard.getAccountname();
            bankId = tbvBindCard.getBankid();
        }
        respMap.put(UserConsoleColumn.RS_ACCOUNTNO, accountNo);
        respMap.put(UserConsoleColumn.RS_ACCOUNTNANME, accountNanme);
        respMap.put(UserConsoleColumn.RS_BANKID, bankId);

        /**查询卡表*/
        TbvCard tbvCard = new TbvCard();
        tbvCard.setTaaccount(taaccount);
        tbvCard = tbvCardDao.selectById(tbvCard);

        /** 判断查询出的结果及是否为空 */
        if (EmptyChecker.isEmpty(tbvCard)) {
            throw new QTException(Console_ErrCode.NO_RESULT, Console_ErrCode.NORESULTDESC);
        }
        String qrCodeUrl = tbvCard.getUrl();
        respMap.put(UserConsoleColumn.RS_QRCODEURL, qrCodeUrl);

        /** 转换参数 */
        String results = JSONObject.toJSONString(respMap, SerializerFeature.WriteNullStringAsEmpty);

        /** 组装报文并返回 */
        JSONObject respJson = new JSONObject();
        respJson.put(Console_Column.MSG_CODE, Console_ErrCode.SUCCESS);
        respJson.put(Console_Column.MSG_TEXT, Console_ErrCode.SUCCESSDESC);
        respJson.put(Console_Column.RESULTBEAN, results);
        return respJson.toString();
    }
}
