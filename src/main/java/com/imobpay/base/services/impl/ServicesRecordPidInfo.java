/** 
* 包名: package com.imobpay.base.services.impl; <br/> 
* 添加时间: 2016年8月9日 下午2:14:09 <br/> 
*/
package com.imobpay.base.services.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONObject;
import com.imobpay.base.console.Console_Column;
import com.imobpay.base.console.Console_ErrCode;
import com.imobpay.base.dao.PaycustomerDao;
import com.imobpay.base.dao.PrepClientVersionDao;
import com.imobpay.base.dao.PrepPersonalinfoDao;
import com.imobpay.base.dao.TbPidMessageJnlsDao;
import com.imobpay.base.entity.Paycustomer;
import com.imobpay.base.entity.PrepClientVersion;
import com.imobpay.base.entity.PrepPersonalinfo;
import com.imobpay.base.entity.TbPidMessageJnls;
import com.imobpay.base.exception.QTException;
import com.imobpay.base.iface.BusinessInterface;
import com.imobpay.base.log.LogPay;
import com.imobpay.base.util.DateUtil;
import com.imobpay.base.util.EmptyChecker;
import com.imobpay.base.util.Tools;

/**
 * 
 * 类名: ServicesRecordPidInfo <br/> 
 * 作用：记录身份证信息(完善实名认证上传信息接口)<br/> 
 * 创建者: HuaiYu.Wen. <br/> 
 * 添加时间: 2016年8月9日 下午2:14:13 <br/> 
 * 版本： 
 * @since JDK 1.6 PayUserServer 1.0
 */
@Service
public class ServicesRecordPidInfo implements BusinessInterface {

    /** 客户端版本操作类 */
    @Resource
    PrepClientVersionDao<PrepClientVersion> prepClientVersionDao;

    /** 客户表操作类 */
    @Resource
    PaycustomerDao<Paycustomer> paycustomerDao;

    /** 用户身份证信息流水表操作类 */
    @Resource
    TbPidMessageJnlsDao<TbPidMessageJnls> tbPidMessageJnlsDao;

    /**  */
    @Resource
    PrepPersonalinfoDao<PrepPersonalinfo> prepPersonalinfoDao;

    @Override
    @Transactional(rollbackFor = QTException.class)
    public String execute(String reqParame) throws QTException {
        /** 返回json对象 */
        JSONObject json = new JSONObject();

        json.put(Console_Column.MSG_CODE, Console_ErrCode.SUCCESS);
        json.put(Console_Column.MSG_TEXT, Console_ErrCode.SUCCESSDESC);
        /** 转换请求报文为json对象 */
        JSONObject reqJson = JSONObject.parseObject(reqParame);
        /** 判断必传参数是否为空 */
        EmptyChecker.checkEmptyJson(reqJson, Console_Column.CUSTOMERID, Console_Column.APPUSER, Console_Column.MOBILENO, Console_Column.ONEREALNAMEURL, Console_Column.TWOREALNAMEURL,
                Console_Column.THREEREALNAMEURL, Console_Column.IFONEPHOTOGRAPH, Console_Column.IFTWOPHOTOGRAPH, Console_Column.IFTHREEPHOTOGRAPH);
        /** 获取参数 */
        String customerId = reqJson.getString(Console_Column.CUSTOMERID);
        String appUser = reqJson.getString(Console_Column.APPUSER);
        String mobileNo = reqJson.getString(Console_Column.MOBILENO);
        String sex = castNullVail(reqJson.getString(Console_Column.SEX));
        String familyName = castNullVail(reqJson.getString(Console_Column.FAMILYNAME));
        String birthday = castNullVail(reqJson.getString(Console_Column.BIRTHDAY));
        String address = castNullVail(reqJson.getString(Console_Column.ADDRESS));
        String issueDepartment = castNullVail(reqJson.getString(Console_Column.ISSUEDEPARTMENT));
        String validTime = castNullVail(reqJson.getString(Console_Column.VALIDTIME));
        String oneRealNameUrl = reqJson.getString(Console_Column.ONEREALNAMEURL);
        String twoRealNameUrl = reqJson.getString(Console_Column.TWOREALNAMEURL);
        String threeRealNameUrl = reqJson.getString(Console_Column.THREEREALNAMEURL);
        String ifOnePhotograph = reqJson.getString(Console_Column.IFONEPHOTOGRAPH);
        String ifTwoPhotograph = reqJson.getString(Console_Column.IFTWOPHOTOGRAPH);
        String ifThreePhotograph = reqJson.getString(Console_Column.IFTHREEPHOTOGRAPH);

        String validBegin = Console_Column.EMPTY;
        String validEnd = Console_Column.EMPTY;
        /** 判断有效日期是否为空 */
        if (EmptyChecker.isNotEmpty(validTime)) {
            validBegin = validTime.substring(0, validTime.indexOf("-")).replace(".", "-");
            validEnd = validTime.substring(validTime.indexOf("-") + 1).replace(".", "-");
        }

        /** 查询机构信息 */
        PrepClientVersion pcv = new PrepClientVersion();
        pcv.setAppuser(appUser);
        PrepClientVersion resultPcv = prepClientVersionDao.selectById(pcv);
        if (EmptyChecker.isEmpty(resultPcv)) {
            LogPay.error("未配置客户端应用类型[PrepClientVersion表]:" + appUser);
            throw new QTException(Console_ErrCode.BUSS_EMPTY, Console_ErrCode.SYSNOSERVEDESC);
        }

        /** 判断该客户是否在paycustomer中存在 */
        Paycustomer cusBean = new Paycustomer();
        cusBean.setCustomerid(customerId);

        Paycustomer tempCus = paycustomerDao.selectById(cusBean);
        if (EmptyChecker.isEmpty(tempCus)) {
            LogPay.error("客户信息不存在[Paycustomer表]:" + customerId);
            throw new QTException(Console_ErrCode.NO_RESULT, Console_ErrCode.NORESULTDESC);
        }

        /** 查询历史流水 */
        TbPidMessageJnls jnls = new TbPidMessageJnls();
        jnls.setCustomerid(customerId);
        TbPidMessageJnls tbPidMessageJnlsData = tbPidMessageJnlsDao.selectById(jnls);
        /** 如果不存在历史流水直接获取信息录入 */
        if (EmptyChecker.isNotEmpty(tbPidMessageJnlsData)) {
            sex = EmptyChecker.isEmpty(sex) ? tbPidMessageJnlsData.getSex() : sex;
            familyName = EmptyChecker.isEmpty(familyName) ? tbPidMessageJnlsData.getFamilyname() : familyName;
            birthday = EmptyChecker.isEmpty(birthday) ? tbPidMessageJnlsData.getBirthday() : birthday;
            address = EmptyChecker.isEmpty(address) ? tbPidMessageJnlsData.getAddress() : address;
            validTime = EmptyChecker.isEmpty(validTime) ? tbPidMessageJnlsData.getValidtime() : validTime;
            issueDepartment = EmptyChecker.isEmpty(issueDepartment) ? tbPidMessageJnlsData.getIssuedepartment() : issueDepartment;

            sex = castNullVail(sex);
            familyName = castNullVail(familyName);
            birthday = castNullVail(birthday);
            address = castNullVail(address);
            issueDepartment = castNullVail(issueDepartment);
            validTime = castNullVail(validTime);
        }

        /** 录入paycustomer表信息 */
        cusBean.setSex(sex);
        cusBean.setFamilyname(familyName);
        cusBean.setBirthday(birthday);
        cusBean.setAddress(address);
        cusBean.setIssuedepartment(issueDepartment);
        cusBean.setIdcardvalidbegin(validBegin);
        cusBean.setIdcardvalidend(validEnd);
        cusBean.setCustomertag(Console_Column.CUSTOMERTAG_2);
        paycustomerDao.updEnteringPidInfo(cusBean);

        /** 记录用户身份证信息上传流水 */
        jnls.setId(Tools.getOnlyPK());
        jnls.setBranchid(resultPcv.getBranchid());
        jnls.setAppuser(appUser);
        jnls.setSex(sex);
        jnls.setAddress(address);
        jnls.setBirthday(birthday);
        jnls.setFamilyname(familyName);
        jnls.setIssuedepartment(issueDepartment);
        jnls.setCreatedate(DateUtil.getCurrDate(DateUtil.YYYYMMDD));
        jnls.setCreatetime(DateUtil.getCurrDate(DateUtil.HHMMSS));
        jnls.setPicurl(threeRealNameUrl);
        jnls.setPidantiimgurl(twoRealNameUrl);
        jnls.setPidimgurl(oneRealNameUrl);
        jnls.setIfonephotograph(ifOnePhotograph);
        jnls.setIftwophotograph(ifTwoPhotograph);
        jnls.setIfthreephotograph(ifThreePhotograph);
        jnls.setValidtime(validTime);

        tbPidMessageJnlsDao.insert(jnls);

        /** 清除原有记录 */
        PrepPersonalinfo prepPersonalinfoBean = new PrepPersonalinfo();
        prepPersonalinfoBean.setCustomerid(customerId);
        //修改人：张朝辉 时间：20160831  如果数据已经存在当前用户信息，则直接进行update操作，否则执行插入操作。
        PrepPersonalinfo prepPersonalinfos =prepPersonalinfoDao.selectById(prepPersonalinfoBean);
        if (EmptyChecker.isNotEmpty(prepPersonalinfos)) {
            /** 添加一条新记录 */
            prepPersonalinfoBean.setAuditflag(Console_Column.VALUE_2);
            prepPersonalinfoBean.setTimestamp(DateUtil.getCurrDate(DateUtil.YYYYMMDDHHMMSS));
            prepPersonalinfoBean.setCreatedate(DateUtil.getCurrDate(DateUtil.YYYYMMDD));
            prepPersonalinfoBean.setCreatetime(DateUtil.getCurrDate(DateUtil.HHMMSS));
            prepPersonalinfoBean.setMobileno(mobileNo);
            prepPersonalinfoBean.setPidimgurl(oneRealNameUrl);
            prepPersonalinfoBean.setPidantiimgurl(twoRealNameUrl);
            prepPersonalinfoBean.setPicurl(threeRealNameUrl);
            prepPersonalinfoBean.setPidfrontimgidentifying(ifOnePhotograph);
            prepPersonalinfoBean.setPidversoimgidentifying(ifTwoPhotograph);
            prepPersonalinfoBean.setPicimgidentifying(ifThreePhotograph);
            //更新审核信息表
            prepPersonalinfoDao.imgUpdatePersonalInfo(prepPersonalinfoBean);
        } else {

            /** 添加一条新记录 */
            prepPersonalinfoBean.setAuditflag(Console_Column.VALUE_2);
            prepPersonalinfoBean.setTimestamp(DateUtil.getCurrDate(DateUtil.YYYYMMDDHHMMSS));
            prepPersonalinfoBean.setCreatedate(DateUtil.getCurrDate(DateUtil.YYYYMMDD));
            prepPersonalinfoBean.setCreatetime(DateUtil.getCurrDate(DateUtil.HHMMSS));
            prepPersonalinfoBean.setMobileno(mobileNo);
            prepPersonalinfoBean.setPidimgurl(oneRealNameUrl);
            prepPersonalinfoBean.setPidantiimgurl(twoRealNameUrl);
            prepPersonalinfoBean.setPicurl(threeRealNameUrl);
            prepPersonalinfoBean.setPidfrontimgidentifying(ifOnePhotograph);
            prepPersonalinfoBean.setPidversoimgidentifying(ifTwoPhotograph);
            prepPersonalinfoBean.setPicimgidentifying(ifThreePhotograph);
            // 插入审核信息表
            prepPersonalinfoDao.insertInitial(prepPersonalinfoBean);
        }
        return json.toString();
    }

    /**
     * 
     * 方法名： castNullVail.<br/>
     * 方法作用:去空值.<br/>
     *
     * 创建者：HuaiYu.Wen.<br/>
     * 创建日期：2016年8月16日.<br/>
     * 创建时间：下午3:43:53.<br/>
     * 参数者异常：@param src
     * 参数者异常：@return .<br/>
     * 返回值：返回类型：String.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public String castNullVail(String src) {
        if (EmptyChecker.isEmpty(src)) {
            return Console_Column.EMPTY;
        }
        return src;
    }
}
