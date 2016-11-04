/**
 *  <pre>	
 *  Project Name :PayUserServer .</br>
 *  File : PrepPersonalinfo.java .</br>
 *  Package Name :com.imobpay.base.entity .</br>
 *  Date      Author       Changes .</br>
 *  2016年6月2日   Lance.Wu     Create  .</br>
 *  Description : .</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.entity;

/**
 * <pre>
 * ClassName : PrepPersonalinfo <br/> 
 * date : 20160614 050646 <br/> 
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public class PrepPersonalinfo extends BaseEntity {

    /** 序号 */
    private static final long serialVersionUID = 1L;

    /** 属性描述：初审时间 */
    private String initialChecktime;
    /** 属性描述：用户类型 */
    private String usertype;
    /** 属性描述：实名认证图片上传url */
    private String pidantiimgurl;
    /** 属性描述：实名认证图片上传url */
    private String pidimgurl;
    /** 属性描述：实名认证图片上传url */
    private String picurl;
    /** 属性描述：用户头像url */
    private String mugshoturl;
    /** 属性描述：身份证查询结果 */
    private String resultinfo;
    /** 属性描述：终审状态 */
    private String checkrange;
    /** 属性描述：图片公共头 */
    private String licensepicurl;
    /** 属性描述：机构审核人 */
    private String agencyAuditor;
    /** 属性描述：null */
    private String identitypicurl;
    /** 属性描述：审核人 */
    private String auditor;
    /** 属性描述：日期时间 */
    private String timestamp;
    /** 属性描述：客户编码 */
    private String customerid;
    /** 属性描述：手机号 */
    private String mobileno;
    /** 属性描述：审核状态 */
    private String auditflag;
    /** 属性描述：创建日期 */
    private String createdate;
    /** 属性描述：创建时间 */
    private String createtime;
    /** 属性描述：审核失败描述 */
    private String remark;
    /** 属性描述：终审时间 */
    private String checktime;
    /** 属性描述：照片审核编码  000：（无需上传照片）、111（用户从未实名、审核三张图片都失败）001(上传手持照)、010（上传反面图片）、011（上传反面、手持照片）100（正面图片）、101（上传正面、手持图片）110（上传正面、反面）*/
    private String auditNumber;
    /** 属性描述：身份证正面图片标识,识别：0。s拍照：1 */
    private String pidfrontimgidentifying;
    /** 属性描述：身份证反面图片标识,识别：0。拍照：1 */
    private String pidversoimgidentifying;
    /** 属性描述：个人手持身份证图片标识,识别：0。拍照：1 */
    private String picimgidentifying;

    /**
     * 描述：获取属性值-null .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getInitialChecktime() {
        return initialChecktime;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param initialChecktime :null 设置值. <br/>
     */
    public void setInitialChecktime(String initialChecktime) {
        this.initialChecktime = initialChecktime;
    }

    /**
     * 描述：获取属性值-null .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getUsertype() {
        return usertype;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param usertype :null 设置值. <br/>
     */
    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    /**
     * 描述：获取属性值-null .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getPidantiimgurl() {
        return pidantiimgurl;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param pidantiimgurl :null 设置值. <br/>
     */
    public void setPidantiimgurl(String pidantiimgurl) {
        this.pidantiimgurl = pidantiimgurl;
    }

    /**
     * 描述：获取属性值-null .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getPidimgurl() {
        return pidimgurl;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param pidimgurl :null 设置值. <br/>
     */
    public void setPidimgurl(String pidimgurl) {
        this.pidimgurl = pidimgurl;
    }

    /**
     * 描述：获取属性值-null .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getPicurl() {
        return picurl;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param picurl :null 设置值. <br/>
     */
    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }

    /**
     * 描述：获取属性值-null .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getMugshoturl() {
        return mugshoturl;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param mugshoturl :null 设置值. <br/>
     */
    public void setMugshoturl(String mugshoturl) {
        this.mugshoturl = mugshoturl;
    }

    /**
     * 描述：获取属性值-null .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getResultinfo() {
        return resultinfo;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param resultinfo :null 设置值. <br/>
     */
    public void setResultinfo(String resultinfo) {
        this.resultinfo = resultinfo;
    }

    /**
     * 描述：获取属性值-null .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCheckrange() {
        return checkrange;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param checkrange :null 设置值. <br/>
     */
    public void setCheckrange(String checkrange) {
        this.checkrange = checkrange;
    }

    /**
     * 描述：获取属性值-null .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getLicensepicurl() {
        return licensepicurl;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param licensepicurl :null 设置值. <br/>
     */
    public void setLicensepicurl(String licensepicurl) {
        this.licensepicurl = licensepicurl;
    }

    /**
     * 描述：获取属性值-null .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getAgencyAuditor() {
        return agencyAuditor;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param agencyAuditor :null 设置值. <br/>
     */
    public void setAgencyAuditor(String agencyAuditor) {
        this.agencyAuditor = agencyAuditor;
    }

    /**
     * 描述：获取属性值-null .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getIdentitypicurl() {
        return identitypicurl;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param identitypicurl :null 设置值. <br/>
     */
    public void setIdentitypicurl(String identitypicurl) {
        this.identitypicurl = identitypicurl;
    }

    /**
     * 描述：获取属性值-null .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getAuditor() {
        return auditor;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param auditor :null 设置值. <br/>
     */
    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    /**
     * 描述：获取属性值-null .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param timestamp :null 设置值. <br/>
     */
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * 描述：获取属性值-null .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCustomerid() {
        return customerid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param customerid :null 设置值. <br/>
     */
    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    /**
     * 描述：获取属性值-null .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getMobileno() {
        return mobileno;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param mobileno :null 设置值. <br/>
     */
    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    /**
     * 描述：获取属性值-null .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getAuditflag() {
        return auditflag;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param auditflag :null 设置值. <br/>
     */
    public void setAuditflag(String auditflag) {
        this.auditflag = auditflag;
    }

    /**
     * 描述：获取属性值-null .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCreatedate() {
        return createdate;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param createdate :null 设置值. <br/>
     */
    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    /**
     * 描述：获取属性值-null .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCreatetime() {
        return createtime;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param createtime :null 设置值. <br/>
     */
    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    /**
     * 描述：获取属性值-null .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param remark :null 设置值. <br/>
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 描述：获取属性值-null .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getChecktime() {
        return checktime;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param checktime :null 设置值. <br/>
     */
    public void setChecktime(String checktime) {
        this.checktime = checktime;
    }

    /** 
     * 方法名： getAuditNumber.<br/>
     *  
     * 
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月14日.<br/>
     * 创建时间：下午7:24:49.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public String getAuditNumber() {
        return auditNumber;
    }

    /** 
     * 方法名： setAuditNumber.<br/>
     *  
     * 
     * 
     * 
     *
     * 参数： @param auditNumber 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月14日.<br/>
     * 创建时间：下午7:24:49.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void setAuditNumber(String auditNumber) {
        this.auditNumber = auditNumber;
    }

    /** 
     * 方法名： getPidfrontimgidentifying.<br/>
     * 
     * 
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月15日.<br/>
     * 创建时间：下午7:54:16.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public String getPidfrontimgidentifying() {
        return pidfrontimgidentifying;
    }

    /** 
     * 方法名： setPidfrontimgidentifying.<br/>
     * 
     * 
     * 
     * 
     *
     * 参数： @param pidfrontimgidentifying 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月15日.<br/>
     * 创建时间：下午7:54:16.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void setPidfrontimgidentifying(String pidfrontimgidentifying) {
        this.pidfrontimgidentifying = pidfrontimgidentifying;
    }

    /** 
     * 方法名： getPidversoimgidentifying.<br/>
     * 
     * 
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月15日.<br/>
     * 创建时间：下午7:54:16.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public String getPidversoimgidentifying() {
        return pidversoimgidentifying;
    }

    /** 
     * 方法名： setPidversoimgidentifying.<br/>
     * 
     * 
     * 
     * 
     *
     * 参数： @param pidversoimgidentifying 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月15日.<br/>
     * 创建时间：下午7:54:16.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void setPidversoimgidentifying(String pidversoimgidentifying) {
        this.pidversoimgidentifying = pidversoimgidentifying;
    }

    /** 
     * 方法名： getPicimgidentifying.<br/>
     * 
     * 
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月15日.<br/>
     * 创建时间：下午7:54:16.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public String getPicimgidentifying() {
        return picimgidentifying;
    }

    /** 
     * 方法名： setPicimgidentifying.<br/>
     * 
     * 
     * 
     * 
     *
     * 参数： @param picimgidentifying 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月15日.<br/>
     * 创建时间：下午7:54:16.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void setPicimgidentifying(String picimgidentifying) {
        this.picimgidentifying = picimgidentifying;
    }

}
