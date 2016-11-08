/**
 *  Project Name:PayTACard
 *  File: TbvCusSecurity.java
 *  Package Name:com.imobpay.base.pojo
 *  Date      Author       Changes
 *  2016年8月27日   madman     Create
 *  Description:
 *  Copyright 2014-2015 QIANTUO FINANCE Services Co.,Ltd. All rights reserved.
 */
package com.imobpay.base.entity;

import java.io.Serializable;

/**
 * ClassName: TbvCusSecurity <br/>
 * Function: 用户登录 <br/>
 * date: 2016年8月27日 下午3:23:51 <br/>
 * 
 * @author madman
 * @version
 * @since JDK 1.6 PayTACard 1.0
 */
public class TbvCusSecurity implements Serializable {
    /**
     * serialVersionUID:TODO(用一句话描述这个变量表示什么).
     * 
     * @since JDK 1.6
     */
    private static final long serialVersionUID = 1L;
    /** 属性描述：用户客户端密码 */
    private String            paypassword;
    /** 属性描述：TA卡号 */
    private String            taaccount;
    /** 属性描述：手机 */
    private String            mobile;
    /** 状态 */
    private String            status;
    /** 客户编号 */
    private String            customerid;
    /** 客户编号 */
    private String            tid;
    /** 密码错误次数 */
    private String            passworderrcnt;
    /** 机构号 */
    public String             branchid;

    /**
     * 描述：获取属性值.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return branchid .<br/>
     */
    public String getBranchid() {
        return branchid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年9月22日 下午4:26:43 <br/>
     * 参数: @param branchid 设置值. <br/>
     */
    public void setBranchid(String branchid) {
        this.branchid = branchid;
    }

    /**
     * @return the tid
     */
    public String getTid() {
        return tid;
    }

    /**
     * tid.
     * 
     * @param tid
     *            the tid to set
     * @since JDK 1.6 PayTACard
     */
    public void setTid(String tid) {
        this.tid = tid;
    }

    /**
     * @return the passworderrcnt
     */
    public String getPassworderrcnt() {
        return passworderrcnt;
    }

    /**
     * passworderrcnt.
     * 
     * @param passworderrcnt
     *            the passworderrcnt to set
     * @since JDK 1.6 PayTACard
     */
    public void setPassworderrcnt(String passworderrcnt) {
        this.passworderrcnt = passworderrcnt;
    }

    /**
     * @return the customerid
     */
    public String getCustomerid() {
        return customerid;
    }

    /**
     * customerid.
     * 
     * @param customerid
     *            the customerid to set
     * @since JDK 1.6 PayTACard
     */
    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * status.
     * 
     * @param status
     *            the status to set
     * @since JDK 1.6 PayTACard
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the paypassword
     */
    public String getPaypassword() {
        return paypassword;
    }

    /**
     * paypassword.
     * 
     * @param paypassword
     *            the paypassword to set
     * @since JDK 1.6 PayTACard
     */
    public void setPaypassword(String paypassword) {
        this.paypassword = paypassword;
    }

    /**
     * @return the taaccount
     */
    public String getTaaccount() {
        return taaccount;
    }

    /**
     * taaccount.
     * 
     * @param taaccount
     *            the taaccount to set
     * @since JDK 1.6 PayTACard
     */
    public void setTaaccount(String taaccount) {
        this.taaccount = taaccount;
    }

    /**
     * @return the mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * mobile.
     * 
     * @param mobile
     *            the mobile to set
     * @since JDK 1.6 PayTACard
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

}
