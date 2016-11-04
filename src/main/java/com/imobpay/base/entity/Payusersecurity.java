/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: Payusersecurity.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date      Author       Changes .</br>
 *  2016年6月2日   Lance.Wu     Create  .</br>
 *  Description: .</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.entity;

/**
 * <pre>
 * ClassName: Payusersecurity <br/> 
 * date: 20160617 030601 <br/> 
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public class Payusersecurity extends BaseEntity {

    /** 序号 */
    private static final long serialVersionUID = 1L;

    /** 属性描述：时间戳  */
    private String            timestamp;
    /** 属性描述：用户ID  */
    private String            userid;
    /** 属性描述：机构号  */
    private String            branchid;
    /** 属性描述：密码次数  */
    private Integer           passworderrcnt;
    /** 属性描述：终端密码  */
    private String            userpassword;

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
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param timestamp :时间戳  设置值. <br/>
     */
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
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
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param userid :用户ID  设置值. <br/>
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * 描述：获取属性值-机构号 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getBranchid() {
        return branchid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param branchid :机构号  设置值. <br/>
     */
    public void setBranchid(String branchid) {
        this.branchid = branchid;
    }

    /**
     * 描述：获取属性值-密码次数 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getPassworderrcnt() {
        return passworderrcnt;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param passworderrcnt :密码次数  设置值. <br/>
     */
    public void setPassworderrcnt(Integer passworderrcnt) {
        this.passworderrcnt = passworderrcnt;
    }

    /**
     * 描述：获取属性值-终端密码 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getUserpassword() {
        return userpassword;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param userpassword :终端密码  设置值. <br/>
     */
    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

}