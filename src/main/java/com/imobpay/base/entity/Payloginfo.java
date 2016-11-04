/**
 *  <pre>	
 *  Project Name :PayUserServer .</br>
 *  File : Payloginfo.java .</br>
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
 * ClassName : Payloginfo <br/> 
 * date : 20160614 050625 <br/> 
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public class Payloginfo extends BaseEntity {

    /** 序号 */
    private static final long serialVersionUID = 1L;

    /** 属性描述：服务编码 */
    private String            servcode;
    /** 属性描述：调用系统IP地址 */
    private String            reqsysip;
    /** 属性描述：用户ID */
    private String            userid;
    /** 属性描述：登录标志 */
    private String            logintag;
    /** 属性描述：手机版本 */
    private String            mobileversion;
    /** 属性描述：手机 */
    private String            mobileno;
    /** 属性描述：客户ID */
    private String            customerid;
    /** 属性描述：机构ID */
    private String            branchid;
    /** 属性描述：登录IP */
    private String            logip;
    /** 属性描述：null */
    private String            latitude;
    /** 属性描述：null */
    private String            longitude;
    /** 属性描述：APP用户 */
    private String            appuser;
    /** 属性描述：客户端版本 */
    private String            clientversion;
    /** 属性描述：手机系统 */
    private String            mobilesystem;
    /** 属性描述：序号 */
    private String            logno;
    /** 属性描述：登录时间 */
    private String            logtime;
    /** 属性描述：登录日期 */
    private String            logdate;

    /**
     * 描述：获取属性值-服务编码 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getServcode() {
        return servcode;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param servcode :服务编码 设置值. <br/>
     */
    public void setServcode(String servcode) {
        this.servcode = servcode;
    }

    /**
     * 描述：获取属性值-调用系统IP地址 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getReqsysip() {
        return reqsysip;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param reqsysip :调用系统IP地址 设置值. <br/>
     */
    public void setReqsysip(String reqsysip) {
        this.reqsysip = reqsysip;
    }

    /**
     * 描述：获取属性值-用户ID .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param userid :用户ID 设置值. <br/>
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * 描述：获取属性值-登录标志 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getLogintag() {
        return logintag;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param logintag :登录标志 设置值. <br/>
     */
    public void setLogintag(String logintag) {
        this.logintag = logintag;
    }

    /**
     * 描述：获取属性值-手机版本 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getMobileversion() {
        return mobileversion;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param mobileversion :手机版本 设置值. <br/>
     */
    public void setMobileversion(String mobileversion) {
        this.mobileversion = mobileversion;
    }

    /**
     * 描述：获取属性值-手机 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getMobileno() {
        return mobileno;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param mobileno :手机 设置值. <br/>
     */
    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    /**
     * 描述：获取属性值-客户ID .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCustomerid() {
        return customerid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param customerid :客户ID 设置值. <br/>
     */
    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    /**
     * 描述：获取属性值-机构ID .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getBranchid() {
        return branchid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param branchid :机构ID 设置值. <br/>
     */
    public void setBranchid(String branchid) {
        this.branchid = branchid;
    }

    /**
     * 描述：获取属性值-登录IP .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getLogip() {
        return logip;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param logip :登录IP 设置值. <br/>
     */
    public void setLogip(String logip) {
        this.logip = logip;
    }

    /**
     * 描述：获取属性值-null .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param latitude :null 设置值. <br/>
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * 描述：获取属性值-null .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param longitude :null 设置值. <br/>
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     * 描述：获取属性值-APP用户 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getAppuser() {
        return appuser;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param appuser :APP用户 设置值. <br/>
     */
    public void setAppuser(String appuser) {
        this.appuser = appuser;
    }

    /**
     * 描述：获取属性值-客户端版本 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getClientversion() {
        return clientversion;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param clientversion :客户端版本 设置值. <br/>
     */
    public void setClientversion(String clientversion) {
        this.clientversion = clientversion;
    }

    /**
     * 描述：获取属性值-手机系统 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getMobilesystem() {
        return mobilesystem;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param mobilesystem :手机系统 设置值. <br/>
     */
    public void setMobilesystem(String mobilesystem) {
        this.mobilesystem = mobilesystem;
    }

    /**
     * 描述：获取属性值-序号 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getLogno() {
        return logno;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param logno :序号 设置值. <br/>
     */
    public void setLogno(String logno) {
        this.logno = logno;
    }

    /**
     * 描述：获取属性值-登录时间 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getLogtime() {
        return logtime;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param logtime :登录时间 设置值. <br/>
     */
    public void setLogtime(String logtime) {
        this.logtime = logtime;
    }

    /**
     * 描述：获取属性值-登录日期 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getLogdate() {
        return logdate;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param logdate :登录日期 设置值. <br/>
     */
    public void setLogdate(String logdate) {
        this.logdate = logdate;
    }

}