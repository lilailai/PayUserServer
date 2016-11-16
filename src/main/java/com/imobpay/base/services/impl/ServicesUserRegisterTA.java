
 /** 
 * 包名: package com.imobpay.base.services.impl; <br/> 
 * 添加时间: 2016年11月8日 上午11:11:19 <br/> 
 */
package com.imobpay.base.services.impl;

import java.util.HashMap;
import java.util.Map;

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
import com.imobpay.base.dao.CsCardbinDao;
import com.imobpay.base.dao.MobilepaycheckcodeDao;
import com.imobpay.base.dao.PrepClientVersionDao;
import com.imobpay.base.dao.TbvActivityLotteryDao;
import com.imobpay.base.dao.TbvBindcardDao;
import com.imobpay.base.dao.TbvCardDao;
import com.imobpay.base.dao.TbvCustomerDao;
import com.imobpay.base.dao.TbvSecurityDao;
import com.imobpay.base.entity.CsBinBankInfo;
import com.imobpay.base.entity.CsCardbin;
import com.imobpay.base.entity.Mobilepaycheckcode;
import com.imobpay.base.entity.PrepClientVersion;
import com.imobpay.base.entity.TbvActivityLottery;
import com.imobpay.base.entity.TbvBindcard;
import com.imobpay.base.entity.TbvCard;
import com.imobpay.base.entity.TbvCustomer;
import com.imobpay.base.entity.TbvSecurity;
import com.imobpay.base.exception.QTException;
import com.imobpay.base.iface.BusinessInterface;
import com.imobpay.base.log.LogPay;
import com.imobpay.base.util.DateUtil;
import com.imobpay.base.util.EmptyChecker;
import com.imobpay.base.util.Tools;

/**
 * 
 * <pre>
 * 【类型】: ServicesUserRegisterTA <br/> 
 * 【作用】: 用户注册 (TA). <br/>  
 * 【时间】：2016年11月8日 上午11:11:24 <br/> 
 * 【作者】：HuaiYu.Wen <br/> 
 * </pre>
 */
@Service
public class ServicesUserRegisterTA implements BusinessInterface {

    /** 卡类型列表 */
    public static Map<String, String> cType = new HashMap<String, String>();
    static {
        /** 01:借记卡 , 02:预付卡 , 03: 信用卡 */
        cType.put("01", "D");
        cType.put("02", "P");
        cType.put("03", "C");
    }

    /**
     * 中奖抽取表
     */
    @Resource
    TbvActivityLotteryDao<TbvActivityLottery> tbvActiveLotteryDao;
    /**
     * 客户表
     */
    @Resource
    TbvCustomerDao<TbvCustomer>               tbvCusDao;

    /**
     * 卡bin表
     */
    @Resource
    CsCardbinDao<CsCardbin>                   csCardBinDao;
    /**
     * 绑定卡表
     */
    @Resource
    TbvBindcardDao<TbvBindcard>               tbvBindCardDao;
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
     * TA卡
     */
    @Resource
    TbvCardDao<TbvCard>                       tbvCardDao;
    /**
     * 短信验证码表
     */
    @Resource
    MobilepaycheckcodeDao<Mobilepaycheckcode> mobCheckDao;
    /***
     * 
     */
    @Resource
    ApplicationContext                        applicationContext;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public String execute(String json) throws QTException {

        JSONObject reqJson = JSONObject.parseObject(json);
        EmptyChecker.checkEmpty(reqJson, UserConsoleColumn.MOBILENO, UserConsoleColumn.APPUSER, UserConsoleColumn.PASSWORD, UserConsoleColumn.TAACCOUNT, UserConsoleColumn.SHOPNAME,
                UserConsoleColumn.USEFNAME, UserConsoleColumn.CUSTOMERPID, UserConsoleColumn.MAINBUS, UserConsoleColumn.PROVINCE, UserConsoleColumn.CITY, UserConsoleColumn.REGION,
                UserConsoleColumn.ADDRESS, UserConsoleColumn.CARDNO, UserConsoleColumn.OPENID);
        // 判断手机号是否注册 或者 TA卡是否已经使用
        String mobile = reqJson.getString(UserConsoleColumn.MOBILENO);
        String appuser = reqJson.getString(UserConsoleColumn.APPUSER);
        String passwd = reqJson.getString(UserConsoleColumn.PASSWORD);
        String taAccountMac = reqJson.getString(UserConsoleColumn.TAACCOUNT);
        String cardNo = reqJson.getString(UserConsoleColumn.CARDNO);
        String userName = reqJson.getString(UserConsoleColumn.USEFNAME);
        String pid = reqJson.getString(UserConsoleColumn.CUSTOMERPID);
        String shopName = reqJson.getString(UserConsoleColumn.SHOPNAME);
        String mainBus = reqJson.getString(UserConsoleColumn.MAINBUS);
        String province = reqJson.getString(UserConsoleColumn.PROVINCE);
        String city = reqJson.getString(UserConsoleColumn.CITY);
        String region = reqJson.getString(UserConsoleColumn.REGION);
        String address = reqJson.getString(UserConsoleColumn.ADDRESS);
        String ip = reqJson.getString(UserConsoleColumn.IP);
        String longitude = reqJson.getString(UserConsoleColumn.LONGITUDE);
        String latitude = reqJson.getString(UserConsoleColumn.LATITUDE);

        String openid = reqJson.getString(UserConsoleColumn.OPENID);
        // 优先判断TA卡号是否存在
        TbvCard tcard = new TbvCard();
        tcard.setTaaccountmac(taAccountMac);
        TbvCard taCard = tbvCardDao.selectById(tcard);
        if (EmptyChecker.isEmpty(taCard)) {
            throw new QTException(Console_ErrCode.URL_NOEXITISCODE, Console_ErrCode.URL_NOEXITISDESC);
        }
        /** 判断TA卡是否已绑定 */
        if ("1".equalsIgnoreCase(taCard.getBindflag())) {
            throw new QTException(Console_ErrCode.NOTE_BINDEDCODE, Console_ErrCode.NOTE_BINDEDDESC);
        }
        // 获取ta卡号
        String taAccount = taCard.getTaaccount();

        TbvCustomer t2 = new TbvCustomer();
        t2.setTaaccount(taAccount);
        TbvCustomer selectByIdTa = tbvCusDao.selectById(t2);
        if (EmptyChecker.isNotEmpty(selectByIdTa)) {
            throw new QTException(Console_ErrCode.NOTE_REGISTEREDCODE, Console_ErrCode.NOTE_REGISTEREDDESC);
        }
        // 判断当前卡是否为借记卡
        CsBinBankInfo cb = new CsBinBankInfo();
        cb.setCardno(cardNo);
        cb.setCardleng(cardNo.length() + "");
        CsBinBankInfo selectByCardLen = csCardBinDao.selectByCardLen(cb);
        if (EmptyChecker.isEmpty(selectByCardLen)) {
            throw new QTException(Console_ErrCode.NOTE_BANKINFODCODE, Console_ErrCode.NOTE_BANKINFODESC);
        }
        String cardType = getCType(selectByCardLen.getCardtype());
        if (!UserConsoleColumn.CARD_TYPE_D.equals(cardType)) {
            throw new QTException(Console_ErrCode.NOTE_BINDDEBITCODE, Console_ErrCode.NOTE_BINDDEBITDESC);
        }
        // 验证短信验证码
        PrepClientVersion pcv = new PrepClientVersion();
        pcv.setAppuser(appuser);
        PrepClientVersion selectPcv = clientDao.selectById(pcv);
        if (EmptyChecker.isEmpty(selectPcv)) {
            throw new QTException(Console_ErrCode.NOTE_NOBRANCHIDCODE, Console_ErrCode.NOTE_NOBRANCHIDDESC);
        }
        String tid = tbvCusDao.selectByTid();
        LogPay.info("生成是序列ID:" + tid);
        // 添加用户密码表
        /** 发送加密机 获取加密密码 */
        PropertiesConfig config = (PropertiesConfig) applicationContext.getBean("propertiesConfig");
        String newPwd = SendEncrypt.send(mobile, passwd, config);

        // 判断用户是否注册 放到这里的目的是为了防止程序运行太长 用户注册出现系统繁忙
        TbvCustomer t = new TbvCustomer();
        t.setMobile(mobile);
        TbvCustomer selectByIdMob = tbvCusDao.selectById(t);
        if (EmptyChecker.isNotEmpty(selectByIdMob)) {
            throw new QTException(Console_ErrCode.NOTE_MOBILENOYETCODE, Console_ErrCode.NOTE_MOBILENOYETDESC);
        }

        TbvSecurity tsu = new TbvSecurity();
        tsu.setTimestamp(DateUtil.getCurrDate(DateUtil.YYYYMMDDHHMMSS));
        tsu.setTid(tid);
        tsu.setPaypassword(newPwd);
        tsu.setPassworderrcnt(0);
        tbvSecur.insert(tsu);

        // 添加用户信息
        TbvCustomer tc = new TbvCustomer();
        tc.setTid(tid);
        tc.setMobile(mobile);
        tc.setUsername(userName);
        tc.setCustomerpid(pid);
        tc.setShopname(shopName);
        tc.setMainBus(mainBus);
        tc.setProvince(province);
        tc.setCity(city);
        tc.setRegion(region);
        tc.setAddress(address);
        tc.setIp(ip);
        tc.setLongitude(longitude);
        tc.setLatitude(latitude);
        tc.setBranchid(taCard.getBranchid());
        tc.setTaaccount(taAccount);
        tc.setStatus("1");
        tc.setCustomerregdate(DateUtil.getCurrDate(DateUtil.YYYYMMDDHHMMSS));
        tc.setOpenid(openid);
        tbvCusDao.insert(tc);
        // 添加绑定银行卡数据
        TbvBindcard tbc = new TbvBindcard();
        tbc.setId(Tools.getOnlyPK());
        tbc.setTid(tid);
        tbc.setAccountno(cardNo);
        tbc.setAccountname(userName);
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
        tbc.setBranchid(taCard.getBranchid());
        tbc.setIdno(pid);
        tbvBindCardDao.insert(tbc);
        // 修改TA绑定卡的状态
        tcard.setBindflag("1");
        tcard.setTaaccount(taAccount);
        tbvCardDao.update(tcard);
        // 更新中奖纪录表里的TA卡状态
        TbvActivityLottery tLottery = new TbvActivityLottery();
        tLottery.setId(taAccount);
        TbvActivityLottery selectById = tbvActiveLotteryDao.selectById(tLottery);
        if (EmptyChecker.isNotEmpty(selectById)) {
            LogPay.info("此TA卡为活动卡，同步更新活动表TA卡状态:" + taAccount);
            TbvActivityLottery tbvActiveLottery = new TbvActivityLottery();
            tbvActiveLottery.setId(taAccount);
            tbvActiveLottery.setStatus("2");
            tbvActiveLotteryDao.updateCodeLottery(tbvActiveLottery);
        }

        /** 组装成功信息返回 */
        JSONObject respJson=new JSONObject();
        respJson.put(Console_Column.MSG_CODE, Console_ErrCode.SUCCESS);
        respJson.put(Console_Column.MSG_TEXT, Console_ErrCode.SUCCESSDESC);
        return respJson.toString();
    }
    
    /**
     * 【方法名】    : getCType. <br/> 
     * 【作用】: 获取卡类型.<br/> 
     * 【作者】: HuaiYu.Wen .<br/>
     * 【时间】： 2016年11月8日 下午2:25:08 .<br/>
     * 【参数】： .<br/>
     * @param key 
     * @return .<br/>
     * <p>
     * 修改记录.<br/>
     * 修改人: HuaiYu.Wen 修改描述：创建新新件 .<br/>
     * <p/>
     */
    public static String getCType(String key) {
        if (EmptyChecker.isEmpty(cType.get(key))) {
            return key + "";
        }
        return (String) cType.get(key);
    }
}

