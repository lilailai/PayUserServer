/**
 *  <pre>	
 *  Project Name :PayUserServer .</br>
 *  File : Paycustomersecurity.java .</br>
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
 * ClassName : Paycustomersecurity <br/> 
 * date : 20160614 050611 <br/> 
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public class Paycustomersecurity extends BaseEntity {

    /** 序号 */
    private static final long serialVersionUID = 1L;

    /** 属性描述：用户登录密码 */
    private String            loginpassword;
    /** 属性描述：是否设置独立支付密码，0没有设置，已设置 */
    private String            paypassflag;
    /** 属性描述：输入密码错误次数，3次密码错，不能登录 */
    private Integer           passworderrcnt;
    /** 属性描述：用户编码 */
    private String            customerid;
    /** 属性描述：用户客户端密码 */
    private String            paypassword;
    /** 属性描述：时间戳 */
    private String            timestamp;

    /**
     * 描述：获取属性值-用户登录密码 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getLoginpassword() {
        return loginpassword;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param loginpassword :用户登录密码 设置值. <br/>
     */
    public void setLoginpassword(String loginpassword) {
        this.loginpassword = loginpassword;
    }

    /**
     * 描述：获取属性值-是否设置独立支付密码，0没有设置，已设置 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getPaypassflag() {
        return paypassflag;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param paypassflag :是否设置独立支付密码，0没有设置，已设置 设置值. <br/>
     */
    public void setPaypassflag(String paypassflag) {
        this.paypassflag = paypassflag;
    }

    /**
     * 描述：获取属性值-输入密码错误次数，3次密码错，不能登录 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getPassworderrcnt() {
        return passworderrcnt;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param passworderrcnt :输入密码错误次数，3次密码错，不能登录 设置值. <br/>
     */
    public void setPassworderrcnt(Integer passworderrcnt) {
        this.passworderrcnt = passworderrcnt;
    }

    /**
     * 描述：获取属性值-用户编码 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCustomerid() {
        return customerid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param customerid :用户编码 设置值. <br/>
     */
    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    /**
     * 描述：获取属性值-用户客户端密码 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getPaypassword() {
        return paypassword;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param paypassword :用户客户端密码 设置值. <br/>
     */
    public void setPaypassword(String paypassword) {
        this.paypassword = paypassword;
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

}