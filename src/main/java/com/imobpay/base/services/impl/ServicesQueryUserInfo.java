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

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.mortbay.log.Log;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.imobpay.base.console.Console_Column;
import com.imobpay.base.console.Console_ErrCode;
import com.imobpay.base.dao.CsBindcardDao;
import com.imobpay.base.dao.PayamountcontrolDao;
import com.imobpay.base.dao.PaybranchDao;
import com.imobpay.base.dao.PaycustomerDao;
import com.imobpay.base.dao.PaycustomersecurityDao;
import com.imobpay.base.dao.PayguarantorDao;
import com.imobpay.base.dao.PaylcacctDao;
import com.imobpay.base.dao.PayuserDao;
import com.imobpay.base.dao.PrepAdvancedVipDao;
import com.imobpay.base.dao.PrepClientVersionDao;
import com.imobpay.base.dao.PrepPersonalinfoDao;
import com.imobpay.base.dao.TbCustActivityRecordDao;
import com.imobpay.base.dao.TbCustCustomerDao;
import com.imobpay.base.dao.TbCustFunctionPermissionDao;
import com.imobpay.base.dao.TbGlbSysParamDao;
import com.imobpay.base.dao.VwCustCreditDao;
import com.imobpay.base.dao.VwOrdCreditDao;
import com.imobpay.base.entity.CsBindcard;
import com.imobpay.base.entity.Payamountcontrol;
import com.imobpay.base.entity.Paybranch;
import com.imobpay.base.entity.Paycustomer;
import com.imobpay.base.entity.Paycustomersecurity;
import com.imobpay.base.entity.Payguarantor;
import com.imobpay.base.entity.Paylcacct;
import com.imobpay.base.entity.Payuser;
import com.imobpay.base.entity.PrepAdvancedVip;
import com.imobpay.base.entity.PrepClientVersion;
import com.imobpay.base.entity.PrepPersonalinfo;
import com.imobpay.base.entity.TbCustActivityRecord;
import com.imobpay.base.entity.TbCustCustomer;
import com.imobpay.base.entity.TbCustFunctionPermission;
import com.imobpay.base.entity.TbGlbSysParam;
import com.imobpay.base.entity.VwCustCredit;
import com.imobpay.base.entity.VwOrdCredit;
import com.imobpay.base.entity.errorBeanImpl.MapResultBean;
import com.imobpay.base.entity.vo.QueryMenuResultBean;
import com.imobpay.base.entity.vo.UserInfoQueryResultBean;
import com.imobpay.base.enums.CustomerStatus;
import com.imobpay.base.enums.VipStartLev;
import com.imobpay.base.exception.QTException;
import com.imobpay.base.iface.BusinessInterface;
import com.imobpay.base.log.LogPay;
import com.imobpay.base.services.CommomServer;
import com.imobpay.base.util.EmptyChecker;
import com.imobpay.base.util.Tools;

/**
 * <pre>
 * ClassName: ServicesQueryUserInfo <br/> 
 * Function: execute. <br/> 
 * Reason: 查询用户信息业务类. <br/>  
 * date: 2016年5月30日 下午4:07:13 <br/> 
 * @param（请求参数）：
 *  CUSTOMERID(客户号)、MOBILENO（手机号）、TRANSTYPE（交易类型）、APPUSER（APP名称）
 * @return(返回参数)：
 * 
 * 
 * @author Lance.Wu . <br/> 
 * @version   . <br/> 
 * @since JDK 1.6 UserDServer 1.0 . <br/>
 * </pre>
 */
@Service
public class ServicesQueryUserInfo implements BusinessInterface {

    /** 公共对像 */
    @Resource
    CommomServer commomServer;

    /** 客户端版本操作类 */
    @Resource
    PrepClientVersionDao<PrepClientVersion> prepClientVersionDao;

    /** 机构类操作类 */
    @Resource
    PaybranchDao<Paybranch> paybranchDao;

    /** 用户操作类 */
    @Resource
    PayuserDao<Payuser> payuserDao;

    /** 用户详细信息操作类 */
    @Resource
    PaycustomerDao<Paycustomer> paycustomerDao;

    /** 用户限额表 */
    @Resource
    PayamountcontrolDao<Payamountcontrol> payamountcontrolDao;

    /** 用户参数表 */
    @Resource
    PayguarantorDao<Payguarantor> payguarantorDao;

    /** 个人用户信息 */
    @Resource
    PrepPersonalinfoDao<PrepPersonalinfo> prepPersonalinfoDao;

    /** 理财账号 */
    @Resource
    PaylcacctDao<Paylcacct> paylcacctDao;

    /** 安全信息表 */
    @Resource
    PaycustomersecurityDao paycustomersecurityDao;

    /** 查询白名单表 */
    @Resource
    TbCustCustomerDao<TbCustCustomer> tbCustCustomerDao;

    /** 查询收入视图 */
    @Resource
    VwCustCreditDao<VwCustCredit> vwCustCreditDao;

    /** 查询无忧还白名单表 */
    @Resource
    TbCustFunctionPermissionDao<TbCustFunctionPermission> tbCustFunctionPermissionDao;
    /** 查询交易订单视图 */
    @Resource
    VwOrdCreditDao<VwOrdCredit> vwOrdCreditDao;
    /** 查询高级认证表 */
    @Resource
    PrepAdvancedVipDao<PrepAdvancedVip> prepAdvancedVipDao;

    /** 查询绑卡表的提现卡 */
    @Resource
    CsBindcardDao<CsBindcard> csBindcardDao;
    /** 查询绑卡表的提现卡 */
    @Resource
    TbGlbSysParamDao<TbGlbSysParam> tbGlbSysParamDao;

    /**  */
    @Resource
    TbCustActivityRecordDao<TbCustActivityRecord> tbCustActivityRecordDao;

    /**
     * 
     * 处理业务类. 
     * @see com.imobpay.base.iface.BusinessInterface#execute(java.lang.String)
     * @param reqParame 参数
     * @throws  QTException 自定义异常
     * @return 返回结果
     */
    @Override
    public String execute(String reqParame) throws QTException {
        String resultJson = "";
        // 返回用户信息查询对象
        UserInfoQueryResultBean resultBean = new UserInfoQueryResultBean();
        // 白名单返回对象
        QueryMenuResultBean queryMenuResultBean = new QueryMenuResultBean();
        // 各种审核信息对象。
        Map<String, Object> addMessageMap = new HashMap<String, Object>();
        // 个人付款返回对象。
        Map<String, Object> resultMap = new HashMap<String, Object>();
        // 结果map
        Map<String, Object> respMap = new HashMap<String, Object>();
        // 接收参数转换json数据格式。
        JSONObject param = JSONObject.parseObject(reqParame);
        // 高级认证卡张数
        int vipCount = 0;
        // 提现卡张数
        int bindcardCount = 0;

        /** 判断为空参数 */
        EmptyChecker.checkEmptyJson(param, Console_Column.CUSTOMERID, Console_Column.MOBILENO, Console_Column.TRANSTYPE, Console_Column.APPUSER);

        String appUser = param.get(Console_Column.APPUSER).toString();
        String mobile = param.get(Console_Column.MOBILENO).toString();
        String transType = param.get(Console_Column.TRANSTYPE).toString();
        String customerId = param.get(Console_Column.CUSTOMERID).toString();

        /** 查询机构信息 */
        PrepClientVersion pcv = new PrepClientVersion();
        pcv.setAppuser(appUser);
        PrepClientVersion resultPcv = prepClientVersionDao.selectById(pcv);
        if (EmptyChecker.isEmpty(resultPcv)) {
            LogPay.error("未配置客户端应用类型[PrepClientVersion表]");
            throw new QTException(Console_ErrCode.NO_RESULT, Console_ErrCode.NORESULTDESC);
        }

        /** 判断机构号为空 */
        if (EmptyChecker.isEmpty(resultPcv.getBranchid())) {
            LogPay.error("未配置客户端应用类型[PrepClientVersion表-branchId为空]");
            throw new QTException(Console_ErrCode.NO_RESULT, Console_ErrCode.NORESULTDESC);
        }

        /** 获取用户信息- 判断当前用户信息是否存在 */
        Payuser paramPayuser = new Payuser();
        paramPayuser.setBranchid(resultPcv.getBranchid());
        paramPayuser.setUserid(mobile);
        Payuser resultPayuser = payuserDao.selectById(paramPayuser);
        if (EmptyChecker.isEmpty(resultPayuser)) {
            LogPay.error("未配置客户端应用类型[Payuser表为空]");
            throw new QTException(Console_ErrCode.NO_RESULT, Console_ErrCode.NOREGISTER);
        }

        /**获取用户号 */
        if (EmptyChecker.isEmpty(resultPayuser.getCustomerid())) {
            LogPay.error("未配置客户端应用类型[Payuser表-customerid为空]");
            throw new QTException(Console_ErrCode.NO_RESULT, Console_ErrCode.NOREGISTER);
        }

        /** 获取用户信息-判断用户是否为空，判断状态是否是黑名单 */
        Paycustomer paramPaycustomer = new Paycustomer();
        paramPaycustomer.setCustomerid(resultPayuser.getCustomerid());
        Paycustomer resultPaycustomer = paycustomerDao.selectById(paramPaycustomer);

        if (EmptyChecker.isEmpty(resultPaycustomer)) {
            LogPay.error("未配置客户端应用类型[Paycustomer表为空]");
            throw new QTException(Console_ErrCode.NO_RESULT, Console_ErrCode.NOREGISTER);
        }

        /** 判断返回信息数据 */
        if (transType.equals(Console_Column.TRANSTYPE_00)) {

            Payamountcontrol paramPayAmount = new Payamountcontrol();
            paramPayAmount.setBranchid(resultPcv.getBranchid());
            paramPayAmount.setServcode(Console_Column.SERVCODE_100017);
            paramPayAmount.setProductid(Console_Column.PRODUCTID_0000000001);
            paramPayAmount.setLimitid(resultPaycustomer.getViplevel() + 1 + "");

            Payamountcontrol resultPayAmount = payamountcontrolDao.selectById(paramPayAmount);

            /** 判断当前限额对像为空 */
            if (EmptyChecker.isEmpty(resultPayAmount) || EmptyChecker.isEmpty(resultPayAmount.getAccountday())) {
                paramPayAmount.setBranchid(Console_Column.BRANCHID_00000000);
                resultPayAmount = payamountcontrolDao.selectById(paramPayAmount);
            }

            /** 查询用户基本信息 */
            PrepPersonalinfo paramPrepPersonalinfo = new PrepPersonalinfo();
            paramPrepPersonalinfo.setCustomerid(resultPaycustomer.getCustomerid());
            PrepPersonalinfo resultPrepPersonalinfo = prepPersonalinfoDao.selectById(paramPrepPersonalinfo);

            /** 获取理财账号信息 */
            Paylcacct paramPaylcaat = new Paylcacct();
            paramPaylcaat.setCustomerid(resultPaycustomer.getCustomerid());
            Paylcacct resultPaylcaat = paylcacctDao.selectById(paramPaylcaat);

            /** 查询用户其它信息 */
            Payguarantor paramPaygur = new Payguarantor();
            paramPaygur.setCustomerid(resultPaycustomer.getCustomerid());
            Payguarantor resultPaygur = payguarantorDao.selectById(paramPaygur);

            /** 如果是10则表示已经开过理财账户 */
            if (EmptyChecker.isNotEmpty(resultPaylcaat) && EmptyChecker.isNotEmpty(resultPaylcaat.getCustomerid())) {
                resultBean.setAcctFlag(Console_Column.ACCTFLAG_1);
            } else {
                resultBean.setAcctFlag(Console_Column.ACCTFLAG_0);
            }

            // 如果默认还是没有查询到金额，就将金额放入默认值0
            if (EmptyChecker.isEmpty(resultPayAmount) || EmptyChecker.isEmpty(resultPayAmount.getAccountday())) {
                resultBean.setAccountday("0");
            } else {
                // 有则放入数据库的值。
                resultBean.setAccountday(resultPayAmount.getAccountday() + "");
            }
            resultBean.setCustomerId(resultPaycustomer.getCustomerid());
            resultBean.setRealName(resultPaycustomer.getCustomername());
            resultBean.setCustomerName(resultPaycustomer.getUsername());
            resultBean.setCertPid(resultPaycustomer.getCustomerpid());
            resultBean.setAttention(resultPaycustomer.getAttention());
            resultBean.setBranchId(resultPcv.getBranchid());
            resultBean.setAuditFlag(resultPaycustomer.getAuditflag());
            resultBean.setGuarantorId(null == resultPaygur || null == resultPaygur.getGuarantorid() ? "0" : "1");
            resultBean.setCreditTag(resultPaycustomer.getCredittag());
            resultBean.setAuthenFlag(resultPaycustomer.getCustomertag());
            resultBean.setCheckrange(resultPaycustomer.getCheckrange());
            resultBean.setVipLevel(resultPaycustomer.getViplevel() + "");
            resultBean.setEmail(resultPaycustomer.getEmail());
            resultBean.setCustomerType(resultPaycustomer.getCustomertype());
            resultBean.setCustomerAddr(resultPaycustomer.getCustomeraddr());
            resultBean.setBusinessLicence(resultPaycustomer.getBusinesslicence());
            resultBean.setMemo(resultPaycustomer.getMemo());
            // 证件类型
            resultBean.setCertType(resultPaycustomer.getCustomerpidtype());
            /** 放入用户实名信息描述*/
            if (CustomerStatus.NEW.getStatus().equals(resultPaycustomer.getCustomertag())) {
                resultBean.setTagDesc(CustomerStatus.NEW.getDesc());
                resultBean.setStatusDesc(CustomerStatus.NEW.getDesc());
            } else if (CustomerStatus.PERFECT.getStatus().equals(resultPaycustomer.getCustomertag())) {
                resultBean.setTagDesc(CustomerStatus.PERFECT.getDesc());
                resultBean.setStatusDesc(CustomerStatus.PERFECT.getDesc());
            } else if (CustomerStatus.REVIEWIN.getStatus().equals(resultPaycustomer.getCustomertag())) {
                resultBean.setTagDesc(CustomerStatus.REVIEWIN.getDesc());
                resultBean.setStatusDesc(CustomerStatus.REVIEWIN.getDesc());
            } else if (CustomerStatus.REVIEWSTARTPASS.getStatus().equals(resultPaycustomer.getCustomertag())) {
                if (CustomerStatus.REVIEWENDPASS.getStatus().equals(resultPaycustomer.getCheckrange())) {
                    resultBean.setTagDesc(CustomerStatus.REVIEWENDPASS.getDesc());
                    resultBean.setStatusDesc(CustomerStatus.REVIEWENDPASS.getDesc());
                } else {
                    resultBean.setTagDesc(CustomerStatus.REVIEWSTARTPASS.getDesc());
                    resultBean.setStatusDesc(CustomerStatus.FIRSTAUDIT.getDesc());
                }
            } else if (CustomerStatus.REVIEWFAIL.getStatus().equals(resultPaycustomer.getCustomertag())) {
                resultBean.setTagDesc(CustomerStatus.REVIEWFAIL.getDesc());
                resultBean.setStatusDesc(CustomerStatus.REVIEWFAIL.getDesc());
            } else if (CustomerStatus.REALNAMEUPDATE.getStatus().equals(resultPaycustomer.getCustomertag())) {
                resultBean.setTagDesc(CustomerStatus.REALNAMEUPDATE.getDesc());
                resultBean.setStatusDesc(CustomerStatus.REALNAMEUPDATE.getDesc());
            } else {
                resultBean.setTagDesc(CustomerStatus.STATUSFAIL.getDesc());
                resultBean.setStatusDesc(CustomerStatus.STATUSFAIL.getDesc());
            }

            // 放入用户VIP等级信息描述
            if (VipStartLev.COMMON.getLev() == resultPaycustomer.getViplevel()) {
                resultBean.setVipLevelDescription(VipStartLev.COMMON.getDesc());
            } else if (VipStartLev.ONE.getLev() == resultPaycustomer.getViplevel()) {
                resultBean.setVipLevelDescription(VipStartLev.ONE.getDesc());
            } else if (VipStartLev.TWO.getLev() == resultPaycustomer.getViplevel()) {
                resultBean.setVipLevelDescription(VipStartLev.TWO.getDesc());
            } else if (VipStartLev.THREE.getLev() == resultPaycustomer.getViplevel()) {
                resultBean.setVipLevelDescription(VipStartLev.THREE.getDesc());
            } else if (VipStartLev.FOUR.getLev() == resultPaycustomer.getViplevel()) {
                resultBean.setVipLevelDescription(VipStartLev.FOUR.getDesc());
            } else if (VipStartLev.FIVE.getLev() == resultPaycustomer.getViplevel()) {
                resultBean.setVipLevelDescription(VipStartLev.FIVE.getDesc());
            } else {
                resultBean.setVipLevelDescription(VipStartLev.COMMON.getDesc());
            }
            /** 查询用户安全信息表- 判断当前的用户是否设置支付密码 */
            Paycustomersecurity paraPayCusSec = new Paycustomersecurity();
            paraPayCusSec.setCustomerid(customerId);
            Paycustomersecurity resultPayCusSec = paycustomersecurityDao.selectById(paraPayCusSec);

            if (EmptyChecker.isEmpty(resultPayCusSec)) {
                LogPay.error("未配置客户端应用类型[Paycustomersecurity表为空]" + resultPayCusSec);
                throw new QTException(Console_ErrCode.NO_RESULT, Console_ErrCode.NOREGISTER);
            }
            // 放入是否设置支付密码。
            resultBean.setPayPassFlag(resultPayCusSec.getPaypassflag());

            /** 获取返回信息    PrepPersonalinfo表PIDIMGURL（正面照）、PIDANTIIMGURL（反面照）、PICURL（手持照）、auditNumber（照片审核编码） */
            if (EmptyChecker.isEmpty(resultPrepPersonalinfo)) {
                resultBean.setRemark("");
                addMessageMap.put(Console_Column.HU_ONEREALNAMEURL, "");
                addMessageMap.put(Console_Column.HU_TWOREALNAMEURL, "");
                addMessageMap.put(Console_Column.HU_THREEREALNAMEURL, "");
                addMessageMap.put(Console_Column.HU_IFONEPHOTOGRAPH, "");
                addMessageMap.put(Console_Column.HU_IFTWOPHOTOGRAPH, "");
                addMessageMap.put(Console_Column.HU_IFTHREEPHOTOGRAPH, "");
            } else {
                // 放入服务器图片
                resultBean.setRemark(resultPrepPersonalinfo.getRemark());
                addMessageMap.put(Console_Column.HU_ONEREALNAMEURL, resultPrepPersonalinfo.getPidimgurl());
                addMessageMap.put(Console_Column.HU_TWOREALNAMEURL, resultPrepPersonalinfo.getPidantiimgurl());
                addMessageMap.put(Console_Column.HU_THREEREALNAMEURL, resultPrepPersonalinfo.getPicurl());
                addMessageMap.put(Console_Column.HU_IFONEPHOTOGRAPH, resultPrepPersonalinfo.getPidfrontimgidentifying());
                addMessageMap.put(Console_Column.HU_IFTWOPHOTOGRAPH, resultPrepPersonalinfo.getPidversoimgidentifying());
                addMessageMap.put(Console_Column.HU_IFTHREEPHOTOGRAPH, resultPrepPersonalinfo.getPicimgidentifying());
            }

            // 只有当高级认证标识设置为1时，才进行输入手机号验证码。
            if (EmptyChecker.isNotEmpty(resultPayuser.getIfMobileCode())) {
                // 需验证
                if (Console_Column.FLAG_1.equals(resultPayuser.getIfMobileCode())) {
                    addMessageMap.put(Console_Column.HU_IFVERIFICATION, resultPayuser.getIfMobileCode());
                } else {
                    // 无需验证
                    addMessageMap.put(Console_Column.HU_IFVERIFICATION, Console_Column.FLAG_0);
                }
            } else {
                // 无需验证
                addMessageMap.put(Console_Column.HU_IFVERIFICATION, Console_Column.FLAG_0);
            }

            // 判断审核码
            if (Console_Column.VALUE_4.equals(resultPaycustomer.getCustomertag())) {
                if (EmptyChecker.isNotEmpty(resultPrepPersonalinfo.getAuditNumber())) {
                    addMessageMap.put(Console_Column.HU_PICCODE, resultPrepPersonalinfo.getAuditNumber());
                } else {
                    LogPay.error("实名审核失败，并且未对应失败图片编码");
                    throw new QTException(Console_ErrCode.NO_RESULT, Console_ErrCode.NORESULTDESC);
                }
            } else {
                addMessageMap.put(Console_Column.HU_PICCODE, "");
            }

            // 查询高级认证卡张数
            PrepAdvancedVip prepAdvancedVip = new PrepAdvancedVip();
            prepAdvancedVip.setCustomerid(customerId);
            prepAdvancedVip.setStatus(Console_Column.VIPFLAG_1);
            vipCount = prepAdvancedVipDao.listCount(prepAdvancedVip);
            // 查询提现卡张数
            CsBindcard csBindcard = new CsBindcard();
            csBindcard.setCustomerid(customerId);
            csBindcard.setCardbindtype(Console_Column.BINDCARD_STATUS);
            csBindcard.setStatus(Console_Column.CARDFLAG_1);
            bindcardCount = csBindcardDao.listCount(csBindcard);

            if (CustomerStatus.REVIEWSTARTPASS.getStatus().equals(resultPaycustomer.getCustomertag()) && CustomerStatus.REVIEWENDPASS.getStatus().equals(resultPaycustomer.getCheckrange())) {

                // 如果提现卡和高级认证卡都有一张审核通过
                if (vipCount >= 1 && bindcardCount >= 1) {

                    addMessageMap.put(Console_Column.HU_CREDITSTATUS, Console_Column.THREE);
                    addMessageMap.put(Console_Column.HU_BANKCARDDESC, Console_Column.BANKCARDDESC_SUCCES);
                    addMessageMap.put(Console_Column.HU_BANKCARDNUM, String.valueOf(vipCount + bindcardCount));
                } else if (vipCount >= 1 && bindcardCount < 1) {
                    // 若果高级认证卡审核通过至少1张，则
                    addMessageMap.put(Console_Column.HU_CREDITSTATUS, Console_Column.TWO);
                    addMessageMap.put(Console_Column.HU_BANKCARDDESC, Console_Column.BANKCARDDESC_FAIL);
                    addMessageMap.put(Console_Column.HU_BANKCARDNUM, String.valueOf(vipCount));
                } else if (vipCount < 1 && bindcardCount >= 1) {
                    // 若体现卡至少存在1张，并且高级认证卡没有时，则返回提现卡张数。
                    addMessageMap.put(Console_Column.HU_CREDITSTATUS, Console_Column.TWO);
                    addMessageMap.put(Console_Column.HU_BANKCARDDESC, Console_Column.BANKCARDDESC_FAIL);
                    addMessageMap.put(Console_Column.HU_BANKCARDNUM, String.valueOf(bindcardCount));
                } else {
                    // 其他情况返回未完成认证，返回银行张数零。
                    addMessageMap.put(Console_Column.HU_CREDITSTATUS, Console_Column.ONE);
                    addMessageMap.put(Console_Column.HU_BANKCARDDESC, Console_Column.BANKCARDDESC_FAIL);
                    addMessageMap.put(Console_Column.HU_BANKCARDNUM, Console_Column.ZERO);
                }

            } else {
                // 未审核通过。
                // 其他情况返回未完成认证，返回银行张数零。
                addMessageMap.put(Console_Column.HU_CREDITSTATUS, Console_Column.ZERO);
                addMessageMap.put(Console_Column.HU_BANKCARDDESC, Console_Column.BANKCARDDESC_FAIL);
                addMessageMap.put(Console_Column.HU_BANKCARDNUM, Console_Column.ZERO);
            }

            // 查询当前用户是否需要，上传抓取信息字段状态 0：不需要 1：需要。

            // 判断数据库抓取用户信息字段。
            if (Console_Column.FLAG_1.equals(resultPaycustomer.getIsgrab())) {
                addMessageMap.put(Console_Column.HU_ISGRAB, resultPaycustomer.getIsgrab());
            } else {
                addMessageMap.put(Console_Column.HU_ISGRAB, Console_Column.UPLOADDATE_0);
            }
            /**
             * 修改人:文怀宇
             * 修改描述:追加瑞钱包活动是否白名单标识
             * 修改时间:2016年9月20日11:30:22
             */
            TbCustActivityRecord tbcActity = new TbCustActivityRecord();
            tbcActity.setCustomerid(customerId);
            tbcActity.setActivitykey(Console_Column.KEY_101);
            Integer count = tbCustActivityRecordDao.listCount(tbcActity);
            if (EmptyChecker.isEmpty(count) || count < 1) {
                queryMenuResultBean.setIfActivityWhite(Console_Column.VALUE_0);
            } else {
                queryMenuResultBean.setIfActivityWhite(Console_Column.VALUE_1);
            }

            // 获取无忧还和51付白名单等信息
            TbCustCustomer tbCustCustomer = new TbCustCustomer();
            tbCustCustomer.setCustomerid(customerId);
            tbCustCustomer.setMobileno(mobile);
            tbCustCustomer.setQualificationFlag(Console_Column.WU_FLAG_1);
            TbCustCustomer reTbCustCustomer = tbCustCustomerDao.selectById(tbCustCustomer);
            // 查询是否申请限额等信息
            VwCustCredit vwCustCredit = new VwCustCredit();
            vwCustCredit.setCustomerid(customerId);
            vwCustCredit.setMobileno(mobile);
            VwCustCredit reVwCustCredit = vwCustCreditDao.selectById(vwCustCredit);
            // 查询益芯白名单
            TbCustFunctionPermission tbCustFunctionPermission = new TbCustFunctionPermission();
            tbCustFunctionPermission.setCustomerid(customerId);
            tbCustFunctionPermission.setStatus(Console_Column.ONE);
            TbCustFunctionPermission reTbCustFunctionPermission = tbCustFunctionPermissionDao.selectById(tbCustFunctionPermission);

            // 如果查询益芯白名单，当前用户不存在就放入0，如果存在则放入1
            if (EmptyChecker.isEmpty(reTbCustFunctionPermission)) {
                queryMenuResultBean.setIfYixinWhite(Console_Column.ZERO);
            } else {
                queryMenuResultBean.setIfYixinWhite(Console_Column.ONE);
            }
            if (EmptyChecker.isEmpty(reTbCustCustomer)) {
                // 当前客户不在白名单中，放入白名单、有无申请、有无借款记录、是否有欠款、是否逾期参数信息。
                queryMenuResultBean.setIfWhite(Console_Column.ZERO);
                queryMenuResultBean.setIfApplyLimit(Console_Column.ZERO);
                queryMenuResultBean.setIfBorrowRecord(Console_Column.ONE);
                queryMenuResultBean.setIfArrears(Console_Column.ONE);
                queryMenuResultBean.setIfOverdue(Console_Column.ONE);
            } else {
                // 放入是否为白名单、姓名
                queryMenuResultBean.setIfWhite(Console_Column.ONE);

                if (EmptyChecker.isEmpty(reVwCustCredit)) {
                    queryMenuResultBean.setIfApplyLimit(Console_Column.ZERO);
                    queryMenuResultBean.setIfBorrowRecord(Console_Column.ONE);
                    queryMenuResultBean.setIfArrears(Console_Column.ONE);
                    queryMenuResultBean.setIfOverdue(Console_Column.ONE);
                } else {
                    // 查询订单视图 当前用户是否存在借款申请和借款记录
                    tbCustCustomer.setMobileno(null);
                    tbCustCustomer.setQualificationFlag(null);
                    TbCustCustomer testFlagObj = tbCustCustomerDao.selectById(tbCustCustomer);
                    VwOrdCredit vwOrdCredit = new VwOrdCredit();
                    vwOrdCredit.setMobileNo(mobile);
                    vwOrdCredit.setCustomerid(customerId);
                    int orderCount = vwOrdCreditDao.listCount(vwOrdCredit);
                    if (EmptyChecker.isNotEmpty(testFlagObj)) {
                        // 判断有无申请
                        if (Console_Column.ONE.equals(testFlagObj.getTestFlag())) {
                            queryMenuResultBean.setIfApplyLimit(Console_Column.ONE);
                        } else {
                            queryMenuResultBean.setIfApplyLimit(Console_Column.ZERO);
                        }
                    } else {
                        queryMenuResultBean.setIfApplyLimit(Console_Column.ZERO);
                    }
                    // 判断是否有借款申请
                    if (orderCount > 0) {
                        queryMenuResultBean.setIfBorrowRecord(Console_Column.ZERO);
                    } else {
                        queryMenuResultBean.setIfBorrowRecord(Console_Column.ONE);
                    }
                    // 是否有借款
                    if (Console_Column.TWO.equals(reVwCustCredit.getSettleFlag())) {
                        queryMenuResultBean.setIfArrears(Console_Column.ZERO);
                    } else {
                        queryMenuResultBean.setIfArrears(Console_Column.ONE);
                    }
                    // 是否有逾期
                    if (Console_Column.ONE.equals(reVwCustCredit.getOverdueFlag())) {
                        queryMenuResultBean.setIfOverdue(Console_Column.ZERO);
                    } else {
                        queryMenuResultBean.setIfOverdue(Console_Column.ONE);
                    }
                }
            }

            respMap.put(Console_Column.ADDMESSAGE, addMessageMap);
            respMap.put(Console_Column.RESULTBEAN, resultBean);
            respMap.put(Console_Column.QUERYMENU, queryMenuResultBean);

        } else if (Console_Column.TRANSTYPE_01.equals(transType)) {
            resultMap.put(Console_Column.HU_AUTHENFLAG, resultPaycustomer.getCustomertag());
            if (Console_Column.CUSTOMERTAG_NUM0.equals(resultPaycustomer.getCustomertag())) {
                resultMap.put(Console_Column.HU_REALNAME, resultPaycustomer.getCustomername());
            } else {
                if (Console_Column.TRANSTYPE_00.equals(resultPaycustomer.getCustomertype())) {
                    if (EmptyChecker.isNotEmpty(resultPaycustomer.getCustomername())) {
                        // 如果姓名不为空，则将姓名转换为张**
                        resultMap.put(Console_Column.HU_REALNAME, Tools.handlCustomerName(resultPaycustomer.getCustomername()));
                    } else {
                        // 则放入空字符串。
                        resultMap.put(Console_Column.HU_REALNAME, "");
                    }
                } else {
                    resultMap.put(Console_Column.HU_REALNAME, resultPaycustomer.getCustomername());
                }
            }
            respMap.put(Console_Column.RESULTBEAN, resultMap);
        } else {
            LogPay.info("传入业务类型错误：" + transType);
            throw new QTException(Console_ErrCode.NO_FAIL, Console_ErrCode.BUSINESSERROR);
        }

        MapResultBean<Object> resultJsonBean = new MapResultBean<Object>();
        resultJson = resultJsonBean.getTotalResult(respMap, Console_ErrCode.SUCCESS, Console_ErrCode.SUCCESSDESC);
        Log.info("转换之后的json为：" + resultJson);
        return resultJson;

    }

}
