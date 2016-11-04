/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: TbKybUserinfo.java .</br>
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
 * ClassName: TbKybUserinfo <br/> 
 * date: 20160617 040657 <br/> 
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public class TbKybUserinfo extends BaseEntity {

    /** 序号 */
    private static final long serialVersionUID = 1L;

    /** 属性描述：null  */
    private String            appuser;
    /** 属性描述：null  */
    private String            branchid;
    /** 属性描述：null  */
    private String            userpid;
    /** 属性描述：null  */
    private String            mobileno;
    /** 属性描述：时间戳  */
    private String            inserttime;
    /** 属性描述：null  */
    private String            username;
    /** 属性描述：优惠状态 1: 已获取 0: 未获取  */
    private String            promotion;
    /** 属性描述：网路注册用户 1: 是 0: 否  */
    private String            netuser;
    /** 属性描述：null  */
    private String            customerid;

    /**
     * 描述：获取属性值-null .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getAppuser() {
        return appuser;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param appuser :null  设置值. <br/>
     */
    public void setAppuser(String appuser) {
        this.appuser = appuser;
    }

    /**
     * 描述：获取属性值-null .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getBranchid() {
        return branchid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param branchid :null  设置值. <br/>
     */
    public void setBranchid(String branchid) {
        this.branchid = branchid;
    }

    /**
     * 描述：获取属性值-null .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getUserpid() {
        return userpid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param userpid :null  设置值. <br/>
     */
    public void setUserpid(String userpid) {
        this.userpid = userpid;
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
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param mobileno :null  设置值. <br/>
     */
    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    /**
     * 描述：获取属性值-时间戳 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getInserttime() {
        return inserttime;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param inserttime :时间戳  设置值. <br/>
     */
    public void setInserttime(String inserttime) {
        this.inserttime = inserttime;
    }

    /**
     * 描述：获取属性值-null .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getUsername() {
        return username;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param username :null  设置值. <br/>
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 描述：获取属性值-优惠状态 1: 已获取 0: 未获取 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getPromotion() {
        return promotion;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param promotion :优惠状态 1: 已获取 0: 未获取  设置值. <br/>
     */
    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    /**
     * 描述：获取属性值-网路注册用户 1: 是 0: 否 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getNetuser() {
        return netuser;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param netuser :网路注册用户 1: 是 0: 否  设置值. <br/>
     */
    public void setNetuser(String netuser) {
        this.netuser = netuser;
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
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param customerid :null  设置值. <br/>
     */
    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

}