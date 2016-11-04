/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: ServicesLogin.java .</br>
 *  Package Name:com.imobpay.base.services.impl .</br>
 *  Date      Author       Changes .</br>
 *  2016年6月13日   Lance.Wu     Create  .</br>
 *  Description: .</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.services.impl;

import javax.annotation.Resource;

import org.mortbay.log.Log;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.imobpay.base.config.PropertiesConfig;
import com.imobpay.base.config.SendEncrypt;
import com.imobpay.base.console.Console_Column;
import com.imobpay.base.console.Console_ErrCode;
import com.imobpay.base.dao.CsBindcardDao;
import com.imobpay.base.dao.IdentityQueryDao;
import com.imobpay.base.dao.PaybranchDao;
import com.imobpay.base.dao.PaycustomerDao;
import com.imobpay.base.dao.PaycustomersecurityDao;
import com.imobpay.base.dao.PaylcacctDao;
import com.imobpay.base.dao.PayloginfoDao;
import com.imobpay.base.dao.PayuserDao;
import com.imobpay.base.dao.PrepAdvancedVipDao;
import com.imobpay.base.dao.PrepClientVersionDao;
import com.imobpay.base.dao.PrepPersonalinfoDao;
import com.imobpay.base.entity.CsBindcard;
import com.imobpay.base.entity.IdentityQuery;
import com.imobpay.base.entity.Paybranch;
import com.imobpay.base.entity.Paycustomer;
import com.imobpay.base.entity.Paycustomersecurity;
import com.imobpay.base.entity.Paylcacct;
import com.imobpay.base.entity.Payloginfo;
import com.imobpay.base.entity.Payuser;
import com.imobpay.base.entity.PrepAdvancedVip;
import com.imobpay.base.entity.PrepClientVersion;
import com.imobpay.base.entity.PrepPersonalinfo;
import com.imobpay.base.entity.errorBeanImpl.MapResultBean;
import com.imobpay.base.entity.vo.UserLoginResultBean;
import com.imobpay.base.exception.QTException;
import com.imobpay.base.iface.BusinessInterface;
import com.imobpay.base.log.LogPay;
import com.imobpay.base.util.DateUtil;
import com.imobpay.base.util.EmptyChecker;
import com.imobpay.base.util.HttpHelper;
import com.imobpay.base.util.JunitBase;
import com.imobpay.base.util.Tools;

/**
 * 
 * 类名: servicesUserLogin <br/> 
 * 作用：用户登录<br/> 
 * 方法：实现用户登录<br/> 
 * 创建者: 张朝辉. <br/> 
 * 添加时间: 2016年7月29日 下午3:38:21 <br/> 
 * 版本： 
 * @since JDK 1.6 PayUserServer 1.0
 * 请求参数：
 * UserLogin(JYM)、MOBILENO(手机号)、PASSWORD（密码）、OSTYPE（客户端类型）、APPUSER（应用类型）、
 * MOBILESERIALNUM（手机序列号）、VERSION（客户端版本）、LONGITUDE（用户经度）、LATITUDE（用户维度）、
 * USERIP（用户ip）、TRANSDATE（交易日期）、TRANSTIME（交易时间）、TRANSLOGNO（交易流水）
 */
@Service
public class ServicesUserLogin implements BusinessInterface {

    /** 客户端版本操作类 */
    @Resource
    PrepClientVersionDao<PrepClientVersion> prepClientVersionDao;

    /** 机构类操作类 */
    @Resource
    PaybranchDao<Paybranch>                 paybranchDao;

    /** 用户操作类 */
    @Resource
    PayuserDao<Payuser>                     payuserDao;

    /** 用户详细信息操作类 */
    @Resource
    PaycustomerDao<Paycustomer>             paycustomerDao;

    /** 安全信息表 */
    @Resource
    PaycustomersecurityDao                  paycustomersecurityDao;

    /** 理财账号 */
    @Resource
    PaylcacctDao<Paylcacct>                 paylcacctDao;

    /** 登录日志信息 */
    @Resource
    PayloginfoDao                           payloginfoDao;

    /** Spring对像 */
    @Resource
    ApplicationContext                      applicationContext;

    /** 用户详细信息操作类 */
    @Resource
    IdentityQueryDao<IdentityQuery>         identityQueryDao;
    /** 修改提现卡状态 */
    @Resource
    CsBindcardDao<CsBindcard>               csBindcardDao;
    /** 修改信用卡状态 */
    @Resource
    PrepAdvancedVipDao<PrepAdvancedVip>     prepAdvancedVipDao;
    /** 更新老客户实名图片信息 */
    @Resource
    PrepPersonalinfoDao<PrepPersonalinfo> prepPersonalinfoDao;

    @Override
    public String execute(String reqParame) throws QTException {
        JSONObject item = JSONObject.parseObject(reqParame);
        String resultJson = null;
        boolean flag = false;
        //返回实体bean
        UserLoginResultBean userLoginResultBean = new UserLoginResultBean();
        /** 判断必填项内容 */
        EmptyChecker.checkEmptyJson(item, Console_Column.APPUSER, Console_Column.MOBILENO, Console_Column.PASSWORD, Console_Column.OSTYPE, Console_Column.MOBILESERIALNUM, Console_Column.VERSION,
                Console_Column.TRANSDATE, Console_Column.TRANSTIME, Console_Column.TRANSLOGNO);

        /** 获取客户端版本信息 */
        String appUser = item.get(Console_Column.APPUSER).toString();
        String osType = item.get(Console_Column.OSTYPE).toString();
        String mobile = item.get(Console_Column.MOBILENO).toString();
        String pwd = item.get(Console_Column.PASSWORD).toString();

        String branchId = "";
        String customerid = "";
        String customerName = "";
        String respString = null;
        PrepClientVersion pcv = new PrepClientVersion();
        pcv.setAppuser(appUser);
        PrepClientVersion resultPcv = prepClientVersionDao.selectById(pcv);
        /** 判断查询对象和机构号为空 */
        if (EmptyChecker.isEmpty(resultPcv) || EmptyChecker.isEmpty(resultPcv.getBranchid())) {
            LogPay.error("未配置客户端应用类型[PrepClientVersion表]" + resultPcv);
            throw new QTException(Console_ErrCode.CLIENT_BEANCH, Console_ErrCode.BRANCHDESC);
        }
        /**获取机构号*/
        branchId = resultPcv.getBranchid();
        /** 查询机构信息 获取机构名称 */
        Paybranch paraPb = new Paybranch();
        paraPb.setBranchid(branchId);
        Paybranch resultPayBranch = paybranchDao.selectById(paraPb);
        if (EmptyChecker.isEmpty(resultPayBranch)) {
            LogPay.error("未配置客户端应用类型[Paybranch表为空]" + resultPayBranch);
            throw new QTException(Console_ErrCode.CLIENT_PAYBEANCH, Console_ErrCode.PAYBRANCHDESC);
        }

        /** 判断机构受限 */
        if (EmptyChecker.isNotEmpty(resultPayBranch.getBranchattr())) {
            String branchattr = resultPayBranch.getBranchattr();
            String status = branchattr.substring(0, 1);
            if (status.equals(Console_Column.BRANCHATTR_9)) {
                LogPay.error("未配置客户端应用类型[Paybranch表-BRANCHATTR为9]");
                throw new QTException(Console_ErrCode.CLIENT_PAYBEANCHSTATUS, Console_ErrCode.PAYBRANCHFLAGDESC);
            }
        }

        /** 获取用户信息- 判断当前用户信息是否存在 */
        Payuser paramPayuser = new Payuser();
        paramPayuser.setBranchid(branchId);
        paramPayuser.setUserid(mobile);
        Payuser resultPayuser = payuserDao.selectById(paramPayuser);
        if (EmptyChecker.isEmpty(resultPayuser)) {
            LogPay.error("未配置客户端应用类型[Payuser表为空]");
            throw new QTException(Console_ErrCode.CLIENT_PAYUSER, Console_ErrCode.NOREGISTER);
        }

        /** 判断机构受限-获取用户号 */
        if (EmptyChecker.isNotEmpty(resultPayuser.getUseridtype())) {
            String useridtype = resultPayuser.getUseridtype();
            String status = useridtype.substring(0, 1);
            if (status.equals(Console_Column.USERIDTYPE_9)) {
                LogPay.error("未配置客户端应用类型[Payuser表-USERIDTYPE为9]");
                throw new QTException(Console_ErrCode.CLIENT_PAYBEANCHSTATUS, Console_ErrCode.PAYBRANCHFLAGDESC);
            }
        }
        customerid = resultPayuser.getCustomerid();
        if (EmptyChecker.isEmpty(customerid)) {
            LogPay.error("未配置客户端应用类型[Payuser表-customerid为空]" + customerid);
            throw new QTException(Console_ErrCode.CLIENT_PAYUSER, Console_ErrCode.NOREGISTER);
        }

        /** 获取用户信息-判断用户是否为空，判断状态是否是黑名单 */
        Paycustomer paramPaycustomer = new Paycustomer();
        paramPaycustomer.setCustomerid(customerid);
        Paycustomer resultPaycustomer = paycustomerDao.selectById(paramPaycustomer);

        if (EmptyChecker.isEmpty(resultPaycustomer)) {
            LogPay.error("客户端应用类型[Paycustomer表为空]" + resultPaycustomer);
            throw new QTException(Console_ErrCode.CLIENT_PAYUSER, Console_ErrCode.NOREGISTER);
        }

        String customertag = resultPaycustomer.getCustomertag();
        if (customertag.equals(Console_Column.CUSTOMERTAG_B)) {
            LogPay.error("未配置客户端应用类型[Paycustomer表-customertag为B(黑名单)]" + customertag);
            throw new QTException(Console_ErrCode.CLIENT_PAYBEANCHSTATUS, Console_ErrCode.PAYBRANCHFLAGDESC);
        }

        /** 查询用户安全信息表- 判断当前的登录次数 */
        Paycustomersecurity paraPayCusSec = new Paycustomersecurity();
        paraPayCusSec.setCustomerid(customerid);
        Paycustomersecurity resultPayCusSec = paycustomersecurityDao.selectById(paraPayCusSec);

        if (EmptyChecker.isEmpty(resultPayCusSec)) {
            LogPay.error("未配置客户端应用类型[Paycustomersecurity表为空]" + resultPayCusSec);
            throw new QTException(Console_ErrCode.CLIENT_PAYUSER, Console_ErrCode.NOREGISTER);
        }

        PropertiesConfig config = (PropertiesConfig) applicationContext.getBean("propertiesConfig");

        /** 发送加密机 获取加密密码 */
        String newPwd = SendEncrypt.send(mobile, pwd, config);

        Paycustomersecurity paraPayCusSecUpdate = new Paycustomersecurity();
        paraPayCusSecUpdate.setCustomerid(customerid);
        //调用加密机后，比较如果用户密码错误，则返回密码错
        if (!newPwd.equals(resultPayCusSec.getLoginpassword())) {
            LogPay.error("用户密码数据库值:【" + resultPayCusSec.getLoginpassword() + "】 调用加密机返回值:【" + newPwd + "】");
            throw new QTException(Console_ErrCode.CLIENT_PASSWORD, Console_ErrCode.PWDERRDESC);

        }

        userLoginResultBean.setCustomerId(customerid);
        userLoginResultBean.setRealName(resultPaycustomer.getCustomername());
        userLoginResultBean.setUserName(resultPaycustomer.getUsername());
        userLoginResultBean.setUserType(resultPaycustomer.getCustomertype());
        // 是否设置独立密码1已经设置0没设置
        userLoginResultBean.setPayPassFlag(resultPayCusSec.getPaypassflag());

        if (Console_Column.ZERO.equals(resultPaycustomer.getIfNewUser())) {

            //1、判断当前客户customertag是否为1
            if (Console_Column.ONE.equals(resultPaycustomer.getCustomertag()) || Console_Column.TWO.equals(resultPaycustomer.getCustomertag())
                    || Console_Column.FOURE.equals(resultPaycustomer.getCustomertag()) || Console_Column.FIVE.equals(resultPaycustomer.getCustomertag())) {
                //2、若为1，则查询身份证认证表，是否有认证信息。

                if (Console_Column.CUSTOMERTYPE_STATUS.equals(resultPaycustomer.getCustomertype())) {
                    customerName = resultPaycustomer.getCustomername();
                } else {
                    customerName = resultPaycustomer.getUsername();
                }
                //创建身份证对象。
                IdentityQuery identityQuery = new IdentityQuery();
                identityQuery.setIdentityNo(resultPaycustomer.getCustomerpid());
                IdentityQuery identityQuerys = identityQueryDao.selectById(identityQuery);

                if (EmptyChecker.isNotEmpty(identityQuerys) && EmptyChecker.isNotEmpty(identityQuerys.getName())) {
                    //3、若有当前身份证信息，比对姓名是否一致。不一致，就修改当前客户customertag状态为0.否则不操作。
                    if (!customerName.equals(identityQuerys.getName())) {
                        //放入当前用户customerid和customertag值。将当前用户置为新用户。
                        Paycustomer paramPaycustomers = new Paycustomer();
                        paramPaycustomers.setCustomerid(customerid);
                        paramPaycustomers.setCustomertag(Console_Column.CUSTOMERTAG_FLAG);
                        //更新当前用户为新用户
                        paycustomerDao.updateCustomerTag(paramPaycustomers);
                        LogPay.info("将当前客户的认证状态customertag置为0，成功！！！");
                        //现有绑定提现卡和信用卡删除
                        //验证失败
                        flag = false;
                        //调用更新卡状态方法。
                        this.updateCardTag(resultPaycustomer.getCustomertag(), customerid, flag);  
                        LogPay.info("删除当前用户信用卡和提现卡成功！！！");
                    } else {
                        //修改客户为已认证状态和修改卡状态。
                        //验证成功
                        flag = true;
                        //调用更新卡状态方法。//customerTag ：4 更新信用卡审核失败和到账卡审核中 其他情况两种卡均为审核中。
                        this.updateCardTag(resultPaycustomer.getCustomertag(), customerid, flag);
                        LogPay.info("更新信用卡和闪付卡状态成功！！！");
                        //更新当前老用户为已经验证状态，由0》》1。
                        Paycustomer paramPaycustomerss = new Paycustomer();
                        paramPaycustomerss.setCustomerid(customerid);
                        paycustomerDao.updateVerifyUser(paramPaycustomerss);
                        LogPay.info("将老用户，更新为已验证通过成功！！！");

                    }

                } else {
                    //4、若没有查询到身份证信息，调用身份证验证接口进行验证，返回不一致，就修改当前客户customertag状态为0。
                    //组装发送对外服务报文 客户号、身份证号、姓名、机构号
                    JSONObject reJsonObject = new JSONObject();
                    reJsonObject.put(Console_Column.P_TRANCODE, Console_Column.REQKEY);
                    reJsonObject.put(Console_Column.CUSTOMERID, resultPaycustomer.getCustomerid());
                    reJsonObject.put(Console_Column.IDNUMBER, resultPaycustomer.getCustomerpid());
                    reJsonObject.put(Console_Column.REAL_NAME, customerName);
                    reJsonObject.put(Console_Column.BRANCHID, branchId);
                    try {
                        respString = HttpHelper.send(config.getQtservicesUrl(), JunitBase.creditMessage(reJsonObject.toString()));
                    } catch (Exception e) {
                        LogPay.info("存量用户发往通道验证，发送校验服务失败！！！" + e.getMessage(), e);
                        LogPay.error("存量用户发往通道验证，发送校验服务失败！！！" + e.getMessage(), e);
                    }
                    LogPay.info("请求身份证校验服务结果为：" + respString);
                    //当请求返回不为空时，做进一步解析。
                    if (EmptyChecker.isNotEmpty(respString)) {
                        String respsubString = respString.substring(48);
                        JSONObject respJsonObject = JSONObject.parseObject(respsubString);
                        String msgCode = respJsonObject.getString(Console_Column.P_MSG_CODE);
                        //当返回码 不为15的时候，认为认证失败。
                        if (!Console_Column.INFO_SUCCESS_CODE.equals(msgCode)) {
                            //放入当前用户customerid和customertag值。将当前用户置为新用户。
                            Paycustomer paramPaycustomers = new Paycustomer();
                            paramPaycustomers.setCustomerid(customerid);
                            paramPaycustomers.setCustomertag(Console_Column.CUSTOMERTAG_FLAG);
                            //更新当前用户为新用户
                            paycustomerDao.updateCustomerTag(paramPaycustomers);
                            LogPay.info("将当前客户的认证状态customertag置为0，成功！！！");
                            //验证失败
                            flag = false;
                            //调用更新卡状态方法。
                            this.updateCardTag(resultPaycustomer.getCustomertag(), customerid, flag);  
                            LogPay.info("删除当前用户信用卡和提现卡成功！！！");
                        } else {
                            //验证成功
                            flag = true;
                            //调用更新卡状态方法。//customerTag ：4 更新信用卡审核失败和到账卡审核中 其他情况两种卡均为审核中。
                            this.updateCardTag(resultPaycustomer.getCustomertag(), customerid, flag);
                            LogPay.info("更新信用卡和闪付卡状态成功！！！");
                            //更新当前老用户为已经验证状态，由0》》1。
                            Paycustomer paramPaycustomerss = new Paycustomer();
                            paramPaycustomerss.setCustomerid(customerid);
                            paycustomerDao.updateVerifyUser(paramPaycustomerss);
                            LogPay.info("将老用户，更新为已验证通过成功！！！");
                        }
                    } else {
                        LogPay.info("请求身份证校验服务失败，结果为：" + respString);
                    }
                }

            } else {
                LogPay.info("存量用户审核通过的，无需进行通道验证。");
            }
        } else {
            LogPay.info("当前用户v3.7用户");
        }
        /** 添加日志信息 */
        Payloginfo paramPayloginfo = new Payloginfo();

        String version = item.getString(Console_Column.VERSION);
        String userIp = item.getString(Console_Column.USERIP);
        String longitude = item.getString(Console_Column.LONGITUDE);
        String latitude = item.getString(Console_Column.LATITUDE);
        String mobSys = Console_Column.MOBSYS_D;
        String mobSysVer = Console_Column.MOBSYSVER;
        String reqSysIp = item.getString(Console_Column.REQSYSIP);
        String userLoginTag = "";
        if (osType.toUpperCase().indexOf(Console_Column.MOBSYS_IOS) != -1) {
            mobSys = Console_Column.MOBSYS_IOS;
            userLoginTag = Console_Column.USERLOGINTAG_I;
            mobSysVer = osType.substring(3);
        } else {
            mobSys = Console_Column.MOBSYS_ANDROID;
            userLoginTag = Console_Column.USERLOGINTAG_A;
            mobSysVer = osType.substring(7);
        }
        String logidString = ServicesGetId.loginId + Tools.getTrmSeqNum();
        LogPay.info("本台机器登录loginID为："+logidString);
        paramPayloginfo.setServcode(item.get(Console_Column.SERVERJYM) + "");
        paramPayloginfo.setUserid(resultPayuser.getUserid());
        paramPayloginfo.setLogtime(DateUtil.getCurrTime());
        paramPayloginfo.setLogdate(DateUtil.getCurrDate());
        paramPayloginfo.setLogno(logidString);
        paramPayloginfo.setMobileno(mobile);
        paramPayloginfo.setCustomerid(resultPaycustomer.getCustomerid());
        paramPayloginfo.setBranchid(resultPcv.getBranchid());
        paramPayloginfo.setLogip(userIp);
        paramPayloginfo.setLatitude(latitude);
        paramPayloginfo.setLongitude(longitude);
        paramPayloginfo.setAppuser(resultPcv.getAppuser());
        paramPayloginfo.setClientversion(version);
        paramPayloginfo.setMobilesystem(mobSys);
        paramPayloginfo.setMobileversion(mobSysVer);
        paramPayloginfo.setLogintag(userLoginTag);
        paramPayloginfo.setReqsysip(reqSysIp);
        payloginfoDao.insert(paramPayloginfo);

        /** 修改用户的登录状态 */
        Payuser paramPayuserUpdate = new Payuser();
        paramPayuserUpdate.setCustomerid(customerid);
        paramPayuserUpdate.setUserid(mobile);

        if (EmptyChecker.isEmpty(resultPayuser.getLogintag())) {
            paramPayuserUpdate.setLogintag(userLoginTag);
            //更新用户登录状态
            payuserDao.update(paramPayuserUpdate);
        } else {
            //如果登录状态和数据库不同，放入固定值T。
            if (!userLoginTag.equals(resultPayuser.getLogintag())) {
                paramPayuserUpdate.setLogintag(Console_Column.LOGINTAG);
                //更新用户登录状态
                payuserDao.update(paramPayuserUpdate);
            }
        }
        //组装返回报文
        MapResultBean<UserLoginResultBean> resultJsonBean = new MapResultBean<UserLoginResultBean>();
        resultJson = resultJsonBean.getTotalResult(userLoginResultBean, Console_ErrCode.SUCCESS, Console_ErrCode.SUCCESSDESC);
        Log.info("转换之后的json为：" + resultJson);
        return resultJson;
    }

    /**
     * 
     * 方法名： updateCardTag.<br/>
     * 方法作用:更新卡状态.<br/>
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月30日.<br/>
     * 创建时间：下午12:11:14.<br/>
     * 参数或者异常：@param customerTag .<br/>
     * 参数或者异常：@param customerId .<br/>
     * 参数或者异常：@param flag .<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     * @throws QTException 
     */
    public void updateCardTag(String customerTag, String customerId, boolean flag) throws QTException {
        if (EmptyChecker.isEmpty(customerId)) {
            throw new QTException(Console_ErrCode.CLIENT_PAYUSER, Console_ErrCode.NOREGISTER);
        }
        //如果验证通过
        if (flag) {
            //根据客户不同的审核状态，调整相应卡的状态。
            if (Console_Column.ONE.equals(customerTag)) {
                //更新信用卡和到账卡审核中
                PrepAdvancedVip prepAdvancedVip = new PrepAdvancedVip();
                prepAdvancedVip.setCustomerid(customerId);
                prepAdvancedVip.setStatus(Console_Column.ZERO);
                //将当前用户信用卡，更新为审核中。
                prepAdvancedVipDao.updateCreditCardStatus(prepAdvancedVip);
                CsBindcard csBindcard = new CsBindcard();
                csBindcard.setCustomerid(customerId);
                csBindcard.setStatus(Console_Column.THREE);
                //将当前提现卡更新为审核中
                csBindcardDao.updateCardStatus(csBindcard);
                LogPay.info("客户审核状态为："+customerTag+"客户信用卡和提现卡更新成功！！！");
            } else if (Console_Column.TWO.equals(customerTag)) {
              //更新信用卡和到账卡审核中
                PrepAdvancedVip prepAdvancedVip = new PrepAdvancedVip();
                prepAdvancedVip.setCustomerid(customerId);
                prepAdvancedVip.setStatus(Console_Column.ZERO);
                //将当前用户信用卡，更新为审核中。
                prepAdvancedVipDao.updateCreditCardStatus(prepAdvancedVip);
                CsBindcard csBindcard = new CsBindcard();
                csBindcard.setCustomerid(customerId);
                csBindcard.setStatus(Console_Column.THREE);
                //将当前提现卡更新为审核中
                csBindcardDao.updateCardStatus(csBindcard);
                LogPay.info("客户审核状态为："+customerTag+"客户信用卡和提现卡更新成功！！！");
            } else if (Console_Column.FOURE.equals(customerTag)) {
              //更新信用卡审核失败和到账卡审核中
                PrepAdvancedVip prepAdvancedVip = new PrepAdvancedVip();
                prepAdvancedVip.setCustomerid(customerId);
                prepAdvancedVip.setStatus(Console_Column.TWO);
                //将当前用户信用卡，更新为审核失败。
                prepAdvancedVipDao.updateCreditCardStatus(prepAdvancedVip);
                CsBindcard csBindcard = new CsBindcard();
                csBindcard.setCustomerid(customerId);
                csBindcard.setStatus(Console_Column.THREE);
                //当前用卡更新为审核中。
                csBindcardDao.updateCardStatus(csBindcard);
                
                PrepPersonalinfo personalinfo=new PrepPersonalinfo();
                personalinfo.setCustomerid(customerId);
                prepPersonalinfoDao.imgUpdatePhotoStatus(personalinfo);
                LogPay.info("客户审核状态为："+customerTag+"客户信用卡和提现卡更新成功！！！");
            } else if (Console_Column.FIVE.equals(customerTag)) {
                //更新信用卡和到账卡审核中
                PrepAdvancedVip prepAdvancedVip = new PrepAdvancedVip();
                prepAdvancedVip.setCustomerid(customerId);
                prepAdvancedVip.setStatus(Console_Column.ZERO);
                //将当前用户信用卡，更新为审核中。
                prepAdvancedVipDao.updateCreditCardStatus(prepAdvancedVip);
                CsBindcard csBindcard = new CsBindcard();
                csBindcard.setCustomerid(customerId);
                csBindcard.setStatus(Console_Column.THREE);
              //将当前提现卡更新为审核中
                csBindcardDao.updateCardStatus(csBindcard);
                LogPay.info("客户审核状态为："+customerTag+"客户信用卡和提现卡更新成功！！！");
            } else {
                //当前用户审核状态异常
                LogPay.info("当前用户审核状态异常");
            }
        } else {
            //将本客户现有的提现卡，先备份，后删除。关于信用卡直接将其置为逻辑删除状态。
            //更新信用卡和到账卡审核中
            PrepAdvancedVip prepAdvancedVip = new PrepAdvancedVip();
            prepAdvancedVip.setCustomerid(customerId);
            prepAdvancedVip.setStatus(Console_Column.FOURE);
            //将当前用户信用卡，更新为删除状态。
            prepAdvancedVipDao.updateCreditCardStatus(prepAdvancedVip);
            CsBindcard csBindcard = new CsBindcard();
            csBindcard.setCustomerid(customerId);
            //将当前用户的提现卡备份到备份表。
            csBindcardDao.insertCopyCard(csBindcard);
            //删除当前绑卡表中用户的提现卡。
            csBindcardDao.deleteCard(csBindcard);
            LogPay.info("删除当前用户的提现卡和信用卡成功！！！");
        }
    }

}
