/**
 *  <pre>	
 *  Project Name :PayUserServer .</br>
 *  File : Payuser.java .</br>
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
 * ClassName : Payuser <br/> 
 * date : 20160614 050629 <br/> 
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public class Payuser extends BaseEntity {

    /** 序号 */
    private static final long serialVersionUID = 1L;

    /** 属性描述：null */
    private String            logintag;
    /** 属性描述：时间戳 */
    private String            timestamp;
    /** 属性描述：对应机构号 */
    private String            branchid;
    /** 属性描述：用户ID */
    private String            userid;
    /** 属性描述：对应的客户编码 */
    private String            customerid;
    /** 属性描述：用户类型 */
    private String            useridtype;
    /**在机构下 和非机构下的标记 1 表示在机构下 0表示非机构下*/
    private String            flag;
    /**信用卡高级认证是否需要验证验证码 0：不需要 1：需要*/
    private String            ifMobileCode;

    /**
     * @return the flag
     */
    public String getFlag() {
        return flag;
    }

    /** 
     * flag. 
     * 
     * @param   flag    the flag to set 
     * @since   JDK 1.6 PayUserServer
     */
    public void setFlag(String flag) {
        this.flag = flag;
    }

    /**
     * 描述：获取属性值-null .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getLogintag() {
        return logintag;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param logintag :null 设置值. <br/>
     */
    public void setLogintag(String logintag) {
        this.logintag = logintag;
    }

    /**
     * 描述：获取属性值-时间戳 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param timestamp :时间戳 设置值. <br/>
     */
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * 描述：获取属性值-对应机构号 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getBranchid() {
        return branchid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param branchid :对应机构号 设置值. <br/>
     */
    public void setBranchid(String branchid) {
        this.branchid = branchid;
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
     * 描述：获取属性值-对应的客户编码 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCustomerid() {
        return customerid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param customerid :对应的客户编码 设置值. <br/>
     */
    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    /**
     * 描述：获取属性值-用户类型 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getUseridtype() {
        return useridtype;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param useridtype :用户类型 设置值. <br/>
     */
    public void setUseridtype(String useridtype) {
        this.useridtype = useridtype;
    }

    /** 
     * 方法名： getIfMobileCode.<br/>
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月14日.<br/>
     * 创建时间：下午8:25:36.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public String getIfMobileCode() {
        return ifMobileCode;
    }

    /** 
     * 方法名： setIfMobileCode.<br/>
     *
     * 参数： @param ifMobileCode 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月14日.<br/>
     * 创建时间：下午8:25:36.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void setIfMobileCode(String ifMobileCode) {
        this.ifMobileCode = ifMobileCode;
    }

}