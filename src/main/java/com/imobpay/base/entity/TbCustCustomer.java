/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: TbCustCustomer.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date          			Author      Changes .</br>
 *  20160729 100738    Lance.Wu     Create  .</br>
 *  Description: 当前类是通过工具生成的.</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.entity;

/**
 * <pre>
 * ClassName: TbCustCustomer <br/> 
 * date: 20160729 100738 <br/> 
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public class TbCustCustomer extends BaseEntity {

    /** 序号 */
    private static final long serialVersionUID = 1L;

    /** 属性描述：测评结果：0：未测评 1：已测评 */
    private String testFlag;
    /** 属性描述：审核状态  0：未提交审核信息  1：资格审核中 ，2  资格审核通过，3：资格审核未通过 */
    private String auditFlag;
    /** 属性描述：客户名称 */
    private String customername;
    /** 属性描述：证件号码 */
    private String customerpid;
    /** 属性描述：手机号码 */
    private String mobileno;
    /** 属性描述：资格标志  1：有申请资格   2：无申请资格 */
    private String qualificationFlag;
    /** 属性描述： */
    private String mobilenoFlag;
    /** 属性描述：审核失败原因 */
    private String auditFailReason;
    /** 属性描述：受信额度 */
    private Integer creditMoney;
    /** 属性描述：受信日期 */
    private String creditDate;
    /** 属性描述： */
    private String realnameFlag;
    /** 属性描述： */
    private String creditReportFlag;
    /** 属性描述：客户编码 */
    private String customerid;

    /**
     * 描述：获取属性值-测评结果：0：未测评 1：已测评.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getTestFlag() {
        return testFlag;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param testFlag :测评结果：0：未测评 1：已测评 设置值. <br/>
     */
    public void setTestFlag(String testFlag) {
        this.testFlag = testFlag;
    }

    /**
     * 描述：获取属性值-审核状态  0：未提交审核信息  1：资格审核中 ，2  资格审核通过，3：资格审核未通过.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getAuditFlag() {
        return auditFlag;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param auditFlag :审核状态  0：未提交审核信息  1：资格审核中 ，2  资格审核通过，3：资格审核未通过 设置值. <br/>
     */
    public void setAuditFlag(String auditFlag) {
        this.auditFlag = auditFlag;
    }

    /**
     * 描述：获取属性值-客户名称.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCustomername() {
        return customername;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param customername :客户名称 设置值. <br/>
     */
    public void setCustomername(String customername) {
        this.customername = customername;
    }

    /**
     * 描述：获取属性值-证件号码.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCustomerpid() {
        return customerpid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param customerpid :证件号码 设置值. <br/>
     */
    public void setCustomerpid(String customerpid) {
        this.customerpid = customerpid;
    }

    /**
     * 描述：获取属性值-手机号码.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getMobileno() {
        return mobileno;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param mobileno :手机号码 设置值. <br/>
     */
    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    /**
     * 描述：获取属性值-资格标志  1：有申请资格   2：无申请资格.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getQualificationFlag() {
        return qualificationFlag;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param qualificationFlag :资格标志  1：有申请资格   2：无申请资格 设置值. <br/>
     */
    public void setQualificationFlag(String qualificationFlag) {
        this.qualificationFlag = qualificationFlag;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getMobilenoFlag() {
        return mobilenoFlag;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param mobilenoFlag : 设置值. <br/>
     */
    public void setMobilenoFlag(String mobilenoFlag) {
        this.mobilenoFlag = mobilenoFlag;
    }

    /**
     * 描述：获取属性值-审核失败原因.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getAuditFailReason() {
        return auditFailReason;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param auditFailReason :审核失败原因 设置值. <br/>
     */
    public void setAuditFailReason(String auditFailReason) {
        this.auditFailReason = auditFailReason;
    }

    /**
     * 描述：获取属性值-受信额度.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getCreditMoney() {
        return creditMoney;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param creditMoney :受信额度 设置值. <br/>
     */
    public void setCreditMoney(Integer creditMoney) {
        this.creditMoney = creditMoney;
    }

    /**
     * 描述：获取属性值-受信日期.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCreditDate() {
        return creditDate;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param creditDate :受信日期 设置值. <br/>
     */
    public void setCreditDate(String creditDate) {
        this.creditDate = creditDate;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getRealnameFlag() {
        return realnameFlag;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param realnameFlag : 设置值. <br/>
     */
    public void setRealnameFlag(String realnameFlag) {
        this.realnameFlag = realnameFlag;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCreditReportFlag() {
        return creditReportFlag;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param creditReportFlag : 设置值. <br/>
     */
    public void setCreditReportFlag(String creditReportFlag) {
        this.creditReportFlag = creditReportFlag;
    }

    /**
     * 描述：获取属性值-客户编码.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCustomerid() {
        return customerid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param customerid :客户编码 设置值. <br/>
     */
    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

}