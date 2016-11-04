package com.imobpay.base.services.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONObject;
import com.imobpay.base.config.PropertiesConfig;
import com.imobpay.base.config.SendEncrypt;
import com.imobpay.base.console.Console_Column;
import com.imobpay.base.console.Console_ErrCode;
import com.imobpay.base.dao.PaybranchDao;
import com.imobpay.base.dao.PaycustomerDao;
import com.imobpay.base.dao.PaycustomersecurityDao;
import com.imobpay.base.dao.PayundertakesDao;
import com.imobpay.base.dao.PayuserDao;
import com.imobpay.base.dao.PayusersecurityDao;
import com.imobpay.base.dao.PrepClientVersionDao;
import com.imobpay.base.dao.TbCardBusinessLimitDao;
import com.imobpay.base.dao.TbKybJnlsDao;
import com.imobpay.base.dao.TbKybPromotionDao;
import com.imobpay.base.dao.TbKybUserinfoDao;
import com.imobpay.base.dao.TbValBwWhitelistDao;
import com.imobpay.base.entity.Paybranch;
import com.imobpay.base.entity.Paycustomer;
import com.imobpay.base.entity.Paycustomersecurity;
import com.imobpay.base.entity.Payundertakes;
import com.imobpay.base.entity.Payuser;
import com.imobpay.base.entity.Payusersecurity;
import com.imobpay.base.entity.PrepClientVersion;
import com.imobpay.base.entity.TbCardBusinessLimit;
import com.imobpay.base.entity.TbKybJnls;
import com.imobpay.base.entity.TbKybPromotion;
import com.imobpay.base.entity.TbKybUserinfo;
import com.imobpay.base.entity.TbValBwWhitelist;
import com.imobpay.base.exception.QTException;
import com.imobpay.base.iface.BusinessInterface;
import com.imobpay.base.log.LogPay;
import com.imobpay.base.util.EmptyChecker;
import com.imobpay.base.util.Format;

/**
 * 
 * ClassName: ServicesUserRegister <br/> 
 * Function: 用户注册. <br/> 
 * Reason: 用户注册 <br/> 
 * date: 2016年6月17日 上午11:55:05 <br/> 
 * 请求参数：
 *        
 * 返回参数：
 *        
 *          
 * @author madman
 * @version  
 * @since JDK 1.6 PayUserServer 1.0
 */
@Service
public class ServicesUserRegister implements BusinessInterface {

    /** 客户端版本操作类 */
    @Resource
    PrepClientVersionDao<PrepClientVersion> prepClientVersionDao;

    /** 机构类操作类 */
    @Resource
    PaybranchDao<Paybranch>                 paybranchDao;

    /** 用户操作类 */
    @Resource
    PayuserDao<Payuser>                     payuserDao;
    /** 用户安全表 */
    @Resource
    PayusersecurityDao                      payUserSecDao;

    /** 用户详细信息操作类 */
    @Resource
    PaycustomerDao<Paycustomer>             paycustomerDao;
    /**用户密码安全表*/
    @Resource
    PaycustomersecurityDao                  payCustomerSecurityDao;
    /**机构信息配置表*/
    @Resource
    PayundertakesDao<Payundertakes>         payundertakesDao;
    /**卡油宝流水表*/
    @Resource
    TbKybJnlsDao                            tbKybJnlsDao;
    /**卡油宝用户表*/
    @Resource
    TbKybUserinfoDao                        tbKybUserinfoDao;
    /**卡油宝优惠券表*/
    @Resource
    TbKybPromotionDao                       tbKybPromotionDao;

    /***用户注册限制表*/
    @Resource
    TbCardBusinessLimitDao                  tbCardBusinessLimitDao;
    /***注册白名单表*/
    @Resource
    TbValBwWhitelistDao                     bwWhitelistDao;
    /** Spring对像 */
    @Autowired
    ApplicationContext                      applicationContext;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public String execute(String reqParame) throws  QTException {
        JSONObject param = JSONObject.parseObject(reqParame);
     
        Map<String, Object> resultMap = new HashMap<String, Object>();

        /** 判断为空参数 */
        EmptyChecker.checkEmptyJson(param, Console_Column.APPUSER, Console_Column.MOBILENO, Console_Column.PASSWORD, Console_Column.MOBILEMAC, Console_Column.USERNAME, Console_Column.OSTYPE,
                Console_Column.MOBILESERIALNUM, Console_Column.VERSION, Console_Column.TRANSDATE, Console_Column.TRANSTIME, Console_Column.TRANSLOGNO);

        String mobileno = param.get(Console_Column.MOBILENO).toString();
        String appuser = param.get(Console_Column.APPUSER).toString();
        /**判断当前用户注册是否受限*/
        TbCardBusinessLimit cardBusinessLimit = new TbCardBusinessLimit();
        cardBusinessLimit.setTransNo(mobileno);
        cardBusinessLimit.setTransNoSub(mobileno.substring(0, 3) + "XXXXXXXX");
        Integer liminCount = tbCardBusinessLimitDao.selecrByMobLimit(cardBusinessLimit);
        if (liminCount > 0) {
            throw new QTException(Console_ErrCode.BUSS_EMPTY, Console_ErrCode.SYSNOSERVEDESC);
        }
        /** 查询机构信息 */
        PrepClientVersion pcv = new PrepClientVersion();
        pcv.setAppuser(appuser);
        PrepClientVersion resultPcv = prepClientVersionDao.selectById(pcv);
        if (EmptyChecker.isEmpty(resultPcv)) {
            LogPay.error("未配置客户端应用类型[PrepClientVersion表]");
            throw new QTException(Console_ErrCode.BUSS_EMPTY, Console_ErrCode.SYSNOSERVEDESC);
        }

        /** 判断机构号为空 */
        if (EmptyChecker.isEmpty(resultPcv.getBranchid())) {
            LogPay.error("未配置客户端应用类型[PrepClientVersion表-branchId为空]");
            throw new QTException(Console_ErrCode.BUSS_EMPTY, Console_ErrCode.SYSNOSERVEDESC);
        }
        String branchId = resultPcv.getBranchid();
        /** 判断用户是否已经注册 */
        Payuser paramPayuser = new Payuser();
        paramPayuser.setBranchid(branchId);
        paramPayuser.setUserid(mobileno);
        Payuser resultPayuser = payuserDao.selectById(paramPayuser);
        if (EmptyChecker.isNotEmpty(resultPayuser)) {
            LogPay.error("用户已注册," + "手机号:" + mobileno, ",机构号:" + branchId + ",应用类型:" + appuser);
            throw new QTException(Console_ErrCode.BUSS_EMPTY, Console_ErrCode.USER_REG);
        }
        /**是否开启注册限制*/
        int regCount = 1;
        String regFlag = "Y";
     
        /**查询白名单 判断用户注册是否超限*/
        boolean bW = false;
        TbValBwWhitelist whitelist = new TbValBwWhitelist();
        whitelist.setWhitekey(mobileno);
        whitelist.setWhitetype("1");
        whitelist.setWhitetag("0");
        TbValBwWhitelist tbWhite = bwWhitelistDao.selectById(whitelist);
        if (EmptyChecker.isNotEmpty(tbWhite)) {
            bW = true;
        }
        if ("Y".equals(regFlag) && !bW) {
            /**判断用户是否在配置机构注册过 在配置机构注册过不能在其他机构注册*/
            paramPayuser.setFlag("1");
            int regBrdCount = payuserDao.selectByUserWhite(paramPayuser);
            /**判断当前机构是否在配置机构表中 如果在机构表中则可以注册*/
            boolean boolReg = false;
            Payundertakes payundertakes = new Payundertakes();
            payundertakes.setBranchid(branchId);
            int reg = payundertakesDao.selByBranchIdReg(payundertakes);
            if (reg > 0) {
                boolReg = true;
            }
            if (regBrdCount > 0 && !boolReg) {
                throw new QTException(Console_ErrCode.BUSS_EMPTY, "注册APP超限");
            }
            /**在非配置机构下的APP注册总个数只能是一个*/
            paramPayuser.setFlag("0");
            int rCou = payuserDao.selectByUserWhite(paramPayuser);
            if (rCou >= regCount && !boolReg) {
                throw new QTException(Console_ErrCode.BUSS_EMPTY, "注册APP超限");
            }
        }

        String passWord = param.get(Console_Column.PASSWORD).toString();

        PropertiesConfig config = (PropertiesConfig) applicationContext.getBean("propertiesConfig");

        /** 发送加密机 获取加密密码 */
        String newPwd = SendEncrypt.send(mobileno, passWord, config);
        String seq = paycustomerDao.selectBySeq();
        // 修改人:wenhuaiyu 时间:2016年5月17日16:07:52 修改描述:新增下面一行代码
        // recordAddr(sess);
        /**往paycustomer表添加数据*/
        Paycustomer paycustomer = new Paycustomer();
        paycustomer.setTimestamp(Format.time());
        paycustomer.setCustomerid(seq);
        paycustomer.setCustomerpidtype("00");
        paycustomer.setCustomerregdate(Format.formatDate());
        paycustomer.setBranchid(branchId);
        paycustomer.setAttention("N");
        paycustomer.setCustomertag("0");
        paycustomer.setViplevel(1);
        paycustomer.setLastchangedate(Format.formatDate());
        paycustomer.setFirstreject(0);
        paycustomer.setFinalreject(0);
        paycustomerDao.insert(paycustomer);
        /**往payuser中添加数据*/
        Payuser payuser = new Payuser();
        payuser.setTimestamp(Format.time());
        payuser.setUseridtype("00");
        payuser.setUserid(mobileno);
        payuser.setCustomerid(seq);
        payuser.setBranchid(branchId);
        payuserDao.insert(payuser);
        /**往PAYCUSTOMERSECURITY表添加数据*/
        Paycustomersecurity psec = new Paycustomersecurity();
        psec.setTimestamp(Format.time());
        psec.setCustomerid(seq);
        psec.setPaypassword(newPwd);
        psec.setPassworderrcnt(0);
        psec.setLoginpassword(newPwd);
        payCustomerSecurityDao.insert(psec);
        /**往PAYUSERSECURITY表中添加数据*/
        Payusersecurity pUserSec = new Payusersecurity();
        pUserSec.setTimestamp(Format.time());
        pUserSec.setUserid(mobileno);
        pUserSec.setPassworderrcnt(0);
        pUserSec.setBranchid(branchId);
        payUserSecDao.insert(pUserSec);
        /**查询当前机构是否需要开通卡油宝账户*/
        Payundertakes payundertakes = new Payundertakes();
        payundertakes.setOilaccountflag("1");
        payundertakes.setBranchid(branchId);

        boolean b = false;
        Payundertakes selectById = payundertakesDao.selectById(payundertakes);
        if (EmptyChecker.isNotEmpty(selectById)) {
            b = true;
        }
        /**判断当前机构是否需要开通卡油宝账户（并初始化账户初始余额）*/
        if (b) {
            /**判断当前机构是否需要初始化优惠*/
            String promotionamt = "0";
            String netuser = "0";
            if ("200003".equals(param.get("JYM"))) {
                promotionamt = "5000";
                netuser = "1";
            }
            /**添加卡油宝流水表*/
            TbKybJnls kybJnls = new TbKybJnls();
            kybJnls.setServcode("200001");
            kybJnls.setPtype("1");
            kybJnls.setCustomerid(seq);
            kybJnls.setUsername("");
            kybJnls.setMobileno(mobileno);
            kybJnls.setBranchid(branchId);
            kybJnls.setLocaldate(Format.formatDate());
            kybJnls.setLocaltime(Format.formatTime());
            kybJnls.setLocallogno(Format.getSequenceNo());
            kybJnls.setPromotionamt(promotionamt);
            kybJnls.setMsgcode("00");
            kybJnls.setMsgtxt("交易成功");
            tbKybJnlsDao.insert(kybJnls);
            /**添加卡油宝用户信息表*/
            TbKybUserinfo tbKybUserinfo = new TbKybUserinfo();
            tbKybUserinfo.setAppuser(appuser);
            tbKybUserinfo.setBranchid(branchId);
            tbKybUserinfo.setCustomerid(seq);
            tbKybUserinfo.setUsername("");
            tbKybUserinfo.setUserpid("");
            tbKybUserinfo.setMobileno(mobileno);
            tbKybUserinfo.setPromotion("0");
            tbKybUserinfo.setNetuser(netuser);
            tbKybUserinfo.setInserttime(Format.time());
            tbKybUserinfoDao.insert(tbKybUserinfo);
            /**用户券余额*/
            TbKybPromotion tbKybPromotion = new TbKybPromotion();
            tbKybPromotion.setCustomerid(seq);
            tbKybPromotion.setTotalamt(Integer.parseInt(promotionamt));
            tbKybPromotion.setAvailamt(0);
            tbKybPromotion.setStatus("0");
            tbKybPromotion.setInserttime(Format.time());
            tbKybPromotionDao.insert(tbKybPromotion);
        }
        resultMap.put("MSG_CODE", "0000");
        resultMap.put("MSG_TEXT", "交易成功");

        return "";
    }
}
