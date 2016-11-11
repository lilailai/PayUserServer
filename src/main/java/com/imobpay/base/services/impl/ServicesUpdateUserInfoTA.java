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

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.imobpay.base.config.PropertiesConfig;
import com.imobpay.base.config.SendEncrypt;
import com.imobpay.base.console.Console_Column;
import com.imobpay.base.console.Console_ErrCode;
import com.imobpay.base.console.UserConsoleColumn;
import com.imobpay.base.dao.CsCardbinDao;
import com.imobpay.base.dao.MobilepaycheckcodeDao;
import com.imobpay.base.dao.PrepClientVersionDao;
import com.imobpay.base.dao.TbvBindcardDao;
import com.imobpay.base.dao.TbvCustomerDao;
import com.imobpay.base.dao.TbvHisCustomerDao;
import com.imobpay.base.dao.TbvSecurityDao;
import com.imobpay.base.entity.CsBinBankInfo;
import com.imobpay.base.entity.CsCardbin;
import com.imobpay.base.entity.Mobilepaycheckcode;
import com.imobpay.base.entity.PrepClientVersion;
import com.imobpay.base.entity.TbvBindcard;
import com.imobpay.base.entity.TbvCustomer;
import com.imobpay.base.entity.TbvHisCustomer;
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
 * 【类型】: ServicesUpdateUserInfoTA <br/> 
 * 【作用】: 修改用户信息. <br/>  
 * 【时间】：2016年11月11日 下午3:11:42 <br/> 
 * 【作者】：HuaiYu.Wen <br/> 
 * </pre>
 */
@Service
public class ServicesUpdateUserInfoTA implements BusinessInterface {

    /**
     * TA客户信息表
     */
    @Resource
    TbvCustomerDao<TbvCustomer>               tbvCustomerDao;
    /**
     * TA绑定卡表
     */
    @Resource
    TbvBindcardDao<TbvBindcard>               tbvBindcardDao;
    /**
     * TA用户历史表
     */
    @Resource
    TbvHisCustomerDao<TbvHisCustomer>         tbvHisCustomerDao;
    /**
     * TA记录用户输入密码错误数表
     */
    @Resource
    TbvSecurityDao<TbvSecurity>               tbvSecurityDao;
    /***
     * 应用环境
     */
    @Resource
    ApplicationContext                        applicationContext;
    /**
     * 卡bin表
     */
    @Resource
    CsCardbinDao<CsCardbin>                   csCardBinDao;
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

    @Override
    public String execute(String reqParame) throws QTException {
        /** 获取参数 */
        JSONObject reqJson = JSONObject.parseObject(reqParame);
        /** 判断必填项内容 */
        EmptyChecker.checkEmptyJson(reqJson, UserConsoleColumn.UPD_TYPE, UserConsoleColumn.CONTENT, UserConsoleColumn.MOBILENO, UserConsoleColumn.APPUSER);
        String type = reqJson.getString(UserConsoleColumn.UPD_TYPE);
        String content = reqJson.getString(UserConsoleColumn.CONTENT);
        String mobileno = reqJson.getString(UserConsoleColumn.MOBILENO);
        String appUser = reqJson.getString(UserConsoleColumn.APPUSER);

        // 2016年10月12日17:28:26 由madman添加
        String branchId = reqJson.getString(UserConsoleColumn.BRANCHID);
        LogPay.info("传送过来的机构号:" + branchId);
        /** 获取修改内容 */
        JSONObject contentJson = JSONObject.parseObject(content);
        /** 结算卡修改 要查卡bin表 */
        if (UserConsoleColumn.UPD_TYPE_1.equals(type)) {
            /** 判断必填项内容 */
            EmptyChecker.checkEmptyJson(contentJson, UserConsoleColumn.RS_ACCOUNTNO, UserConsoleColumn.RS_MOBILEMAC);
            String accountNo = contentJson.getString(UserConsoleColumn.RS_ACCOUNTNO);
            String mobmac = contentJson.getString(UserConsoleColumn.RS_MOBILEMAC);

            /** 判断当前卡是否为借记卡 */
            CsBinBankInfo cb = new CsBinBankInfo();
            cb.setCardno(accountNo);
            cb.setCardleng(accountNo.length() + "");
            CsBinBankInfo selectByCardLen = csCardBinDao.selectByCardLen(cb);
            if (EmptyChecker.isEmpty(selectByCardLen)) {
                throw new QTException(Console_ErrCode.NOTE_BANKINFODCODE, Console_ErrCode.NOTE_BANKINFODESC);
            }
            String cardType = ServicesUserRegisterTA.getCType(selectByCardLen.getCardtype());
            if (!cardType.equals(UserConsoleColumn.CARD_TYPE_D)) {
                throw new QTException(Console_ErrCode.NOTE_BINDDEBITCODE, Console_ErrCode.NOTE_BINDDEBITDESC);
            }

            // 验证短信验证码
            PrepClientVersion pcv = new PrepClientVersion();
            pcv.setAppuser(appUser);
            PrepClientVersion selectPcv = clientDao.selectById(pcv);
            if (EmptyChecker.isEmpty(selectPcv)) {
                throw new QTException(Console_ErrCode.NOTE_NOBRANCHIDCODE, Console_ErrCode.NOTE_NOBRANCHIDDESC);
            }
            Mobilepaycheckcode mpc = new Mobilepaycheckcode();

            // 2016年10月12日17:28:56由 madman添加 如果传送过来的机构号不为空 则机构号以传过来的为准
            if (EmptyChecker.isNotEmpty(branchId)) {
                mpc.setBranchid(branchId);
            } else {
                mpc.setBranchid(selectPcv.getBranchid());
            }
            mpc.setMobileno(mobileno);
            Mobilepaycheckcode selectMac = mobCheckDao.selectById(mpc);
            if (EmptyChecker.isEmpty(selectMac)) {
                throw new QTException(Console_ErrCode.NOTE_CHECKEERRORCODE, Console_ErrCode.NOTE_CHECKEERRORDESC);
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
            if (!mobmac.equals(selectMac.getCheckcode())) {
                throw new QTException(Console_ErrCode.NOTE_CHECKEERRORCODE, Console_ErrCode.NOTE_CHECKEERRORDESC);
            }
            mpc.setChecktag("1");
            mobCheckDao.update(mpc);

            // 添加绑定银行卡数据
            TbvBindcard tbc = new TbvBindcard();
            tbc.setAccountno(accountNo);
            tbc.setBankid(selectByCardLen.getBankid());
            tbc.setBankname(selectByCardLen.getBankname());
            tbc.setBankbranchid(selectByCardLen.getBankbranchid());
            tbc.setBankbranchname(selectByCardLen.getBankbranchname());
            tbc.setProvinceid(selectByCardLen.getProvinceid());
            tbc.setBankprovince(selectByCardLen.getProvincename());
            tbc.setCityid(selectByCardLen.getCityid());
            tbc.setBankcity(selectByCardLen.getCityname());
            tbc.setBegindate(DateUtil.getCurrDate(DateUtil.YYYYMMDDHHMMSS));
            tbc.setEnddate(DateUtil.getCurrDate(DateUtil.YYYYMMDDHHMMSS));
            TbvCustomer tbvCustomer = new TbvCustomer();
            tbvCustomer.setMobile(mobileno);
            tbvCustomer = tbvCustomerDao.selectById(tbvCustomer);
            String tid = tbvCustomer.getTid();
            if (EmptyChecker.isEmpty(tbvCustomer) || EmptyChecker.isEmpty(tid)) {
                throw new QTException(Console_ErrCode.NOTE_NOREGISTERCODE, Console_ErrCode.NOTE_NOREGISTERDESC);
            }
            tbc.setBranchid(tbvCustomer.getBranchid());
            tbc.setTid(tid);
            tbvBindcardDao.update(tbc);
        }
        /** 密码修改 */
        if (UserConsoleColumn.UPD_TYPE_2.equals(type)) {
            EmptyChecker.checkEmptyJson(contentJson, UserConsoleColumn.RS_PAYPASSWORD, UserConsoleColumn.RS_NEW_PAYPASSWORD);
            String payPassword = contentJson.getString(UserConsoleColumn.RS_PAYPASSWORD);
            String newPassword = contentJson.getString(UserConsoleColumn.RS_NEW_PAYPASSWORD);
            /** 判断必填项内容 */
            /** 发送加密机 获取加密密码 */
            PropertiesConfig config = (PropertiesConfig) applicationContext.getBean("propertiesConfig");
            String encrPassword = SendEncrypt.send(mobileno, payPassword, config);
            TbvSecurity tbvSecurity = new TbvSecurity();
            tbvSecurity.setPaypassword(encrPassword);
            TbvCustomer tbvCustomer = new TbvCustomer();
            tbvCustomer.setMobile(mobileno);
            tbvCustomer = tbvCustomerDao.selectById(tbvCustomer);
            if (EmptyChecker.isEmpty(tbvCustomer)) {
                throw new QTException(Console_ErrCode.NOTE_NOREGISTERCODE, Console_ErrCode.NOTE_NOREGISTERDESC);
            }
            tbvSecurity.setTid(tbvCustomer.getTid());
            tbvSecurity = tbvSecurityDao.selectById(tbvSecurity);
            if (EmptyChecker.isEmpty(tbvSecurity)) {
                throw new QTException(Console_ErrCode.NOTE_PWDFORMERERRCODE, Console_ErrCode.NOTE_PWDFORMERERRDESC);
            }
            String encrNewPassword = SendEncrypt.send(mobileno, newPassword, config);
            tbvSecurity.setPaypassword(encrNewPassword);
            tbvSecurity.setPassworderrcnt(0);
            tbvSecurity.setTimestamp(DateUtil.getCurrDate(DateUtil.YYYYMMDDHHMMSS));
            tbvSecurityDao.update(tbvSecurity);
        }
        /** 商户信息修改 */
        if (UserConsoleColumn.UPD_TYPE_3.equals(type)) {
            EmptyChecker.checkEmptyJson(contentJson, UserConsoleColumn.RS_SHOPNAME, UserConsoleColumn.RS_MAIN_BUS, UserConsoleColumn.RS_ADDRESS, UserConsoleColumn.RS_PROVINCE,
                    UserConsoleColumn.RS_CITY, UserConsoleColumn.RS_REGION);

            /** 入历史表 */
            TbvCustomer tbvCustomerOld = new TbvCustomer();
            tbvCustomerOld.setMobile(mobileno);
            tbvCustomerOld = tbvCustomerDao.selectById(tbvCustomerOld);
            if (EmptyChecker.isEmpty(tbvCustomerOld)) {
                throw new QTException(Console_ErrCode.NOTE_NOREGISTERCODE, Console_ErrCode.NOTE_NOREGISTERDESC);
            }
            TbvHisCustomer tbvHisCustomer = new TbvHisCustomer();
            tbvHisCustomer.setMobile(tbvCustomerOld.getMobile());
            tbvHisCustomer.setTid(tbvCustomerOld.getTid());
            tbvHisCustomer.setUsername(tbvCustomerOld.getUsername());
            tbvHisCustomer.setCustomerpid(tbvCustomerOld.getCustomerpid());
            tbvHisCustomer.setShopname(tbvCustomerOld.getShopname());
            tbvHisCustomer.setMainBus(tbvCustomerOld.getMainBus());
            tbvHisCustomer.setProvince(tbvCustomerOld.getProvince());
            tbvHisCustomer.setCity(tbvCustomerOld.getCity());
            tbvHisCustomer.setRegion(tbvCustomerOld.getRegion());
            tbvHisCustomer.setAddress(tbvCustomerOld.getAddress());
            tbvHisCustomer.setIp(tbvCustomerOld.getIp());
            tbvHisCustomer.setLongitude(tbvCustomerOld.getLongitude());
            tbvHisCustomer.setLatitude(tbvCustomerOld.getLatitude());
            tbvHisCustomer.setBranchid(tbvCustomerOld.getBranchid());
            tbvHisCustomer.setTaaccount(tbvCustomerOld.getTaaccount());
            tbvHisCustomer.setStatus(tbvCustomerOld.getStatus());
            tbvHisCustomer.setCustomerregdate(tbvCustomerOld.getCustomerregdate());
            String insertTime = DateUtil.getCurrDate(DateUtil.YYYYMMDDHHMMSS);
            tbvHisCustomer.setCreatedate(insertTime);
            tbvHisCustomerDao.insert(tbvHisCustomer);

            /** 商户信息修改 */
            String shopName = contentJson.getString(UserConsoleColumn.RS_SHOPNAME);
            String mainBus = contentJson.getString(UserConsoleColumn.RS_MAIN_BUS);
            String address = contentJson.getString(UserConsoleColumn.RS_ADDRESS);
            String province = contentJson.getString(UserConsoleColumn.RS_PROVINCE);
            String city = contentJson.getString(UserConsoleColumn.RS_CITY);
            String region = contentJson.getString(UserConsoleColumn.RS_REGION);
            String ip = reqJson.getString(UserConsoleColumn.IP);
            String latitude = reqJson.getString(UserConsoleColumn.LATITUDE);
            String longitude = reqJson.getString(UserConsoleColumn.LONGITUDE);

            TbvCustomer tbvCustomer = new TbvCustomer();
            tbvCustomer.setShopname(shopName);
            tbvCustomer.setMainBus(mainBus);
            tbvCustomer.setAddress(address);
            tbvCustomer.setMobile(mobileno);
            tbvCustomer.setProvince(province);
            tbvCustomer.setCity(city);
            tbvCustomer.setRegion(region);
            tbvCustomer.setIp(ip);
            tbvCustomer.setLatitude(latitude);
            tbvCustomer.setLongitude(longitude);
            tbvCustomerDao.update(tbvCustomer);
        }

        /** 组装成功信息返回 */
        JSONObject respJson = new JSONObject();
        respJson.put(Console_Column.MSG_CODE, Console_ErrCode.SUCCESS);
        respJson.put(Console_Column.MSG_TEXT, Console_ErrCode.SUCCESSDESC);
        return respJson.toString();
    }
}
