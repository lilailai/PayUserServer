/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: VwOrdCredit.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date          			Author      Changes .</br>
 *  20160729 010739    Lance.Wu     Create  .</br>
 *  Description: 当前类是通过工具生成的.</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.entity;

/**
 * <pre>
 * ClassName: VwOrdCredit <br/> 
 * date: 20160729 010739 <br/> 
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public class VwOrdCredit extends BaseEntity {

    /** 序号 */
    private static final long serialVersionUID = 1L;

    /** 属性描述： */
    private String customerid;
    /** 属性描述： */
    private Integer lendDays;
    /** 属性描述： */
    private String customerName;
    /** 属性描述： */
    private String mobileNo;
    /** 属性描述： */
    private String customerpid;
    /** 属性描述： */
    private String status;
    /** 属性描述： */
    private Integer applyAmount;
    /** 属性描述： */
    private Integer lendAmount;
    /** 属性描述： */
    private String lendDate;
    /** 属性描述： */
    private String lendTime;
    /** 属性描述： */
    private String expireDate;
    /** 属性描述： */
    private Integer managerFee;
    /** 属性描述： */
    private Integer poundateFee;
    /** 属性描述： */
    private Integer overdueFee;
    /** 属性描述： */
    private Integer payFee;
    /** 属性描述： */
    private Integer payCapital;
    /** 属性描述： */
    private Integer payManagerFee;
    /** 属性描述： */
    private Integer payPoundateFee;
    /** 属性描述： */
    private Integer payOverdueFee;
    /** 属性描述： */
    private Integer noPayFee;
    /** 属性描述： */
    private Integer noPayCapital;
    /** 属性描述： */
    private Integer noPayManagerFee;
    /** 属性描述： */
    private Integer noPayPoundateFee;
    /** 属性描述： */
    private Integer noPayOverdueFee;
    /** 属性描述： */
    private String settleFlag;
    /** 属性描述： */
    private String overdueFlag;
    /** 属性描述： */
    private Integer overdueDay;
    /** 属性描述： */
    private String orderDate;
    /** 属性描述： */
    private String orderTime;
    /** 属性描述： */
    private String orderId;

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCustomerid() {
        return customerid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param customerid : 设置值. <br/>
     */
    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getLendDays() {
        return lendDays;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param lendDays : 设置值. <br/>
     */
    public void setLendDays(Integer lendDays) {
        this.lendDays = lendDays;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param customerName : 设置值. <br/>
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getMobileNo() {
        return mobileNo;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param mobileNo : 设置值. <br/>
     */
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCustomerpid() {
        return customerpid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param customerpid : 设置值. <br/>
     */
    public void setCustomerpid(String customerpid) {
        this.customerpid = customerpid;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getStatus() {
        return status;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param status : 设置值. <br/>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getApplyAmount() {
        return applyAmount;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param applyAmount : 设置值. <br/>
     */
    public void setApplyAmount(Integer applyAmount) {
        this.applyAmount = applyAmount;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getLendAmount() {
        return lendAmount;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param lendAmount : 设置值. <br/>
     */
    public void setLendAmount(Integer lendAmount) {
        this.lendAmount = lendAmount;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getLendDate() {
        return lendDate;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param lendDate : 设置值. <br/>
     */
    public void setLendDate(String lendDate) {
        this.lendDate = lendDate;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getLendTime() {
        return lendTime;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param lendTime : 设置值. <br/>
     */
    public void setLendTime(String lendTime) {
        this.lendTime = lendTime;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getExpireDate() {
        return expireDate;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param expireDate : 设置值. <br/>
     */
    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getManagerFee() {
        return managerFee;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param managerFee : 设置值. <br/>
     */
    public void setManagerFee(Integer managerFee) {
        this.managerFee = managerFee;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getPoundateFee() {
        return poundateFee;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param poundateFee : 设置值. <br/>
     */
    public void setPoundateFee(Integer poundateFee) {
        this.poundateFee = poundateFee;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getOverdueFee() {
        return overdueFee;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param overdueFee : 设置值. <br/>
     */
    public void setOverdueFee(Integer overdueFee) {
        this.overdueFee = overdueFee;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getPayFee() {
        return payFee;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param payFee : 设置值. <br/>
     */
    public void setPayFee(Integer payFee) {
        this.payFee = payFee;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getPayCapital() {
        return payCapital;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param payCapital : 设置值. <br/>
     */
    public void setPayCapital(Integer payCapital) {
        this.payCapital = payCapital;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getPayManagerFee() {
        return payManagerFee;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param payManagerFee : 设置值. <br/>
     */
    public void setPayManagerFee(Integer payManagerFee) {
        this.payManagerFee = payManagerFee;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getPayPoundateFee() {
        return payPoundateFee;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param payPoundateFee : 设置值. <br/>
     */
    public void setPayPoundateFee(Integer payPoundateFee) {
        this.payPoundateFee = payPoundateFee;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getPayOverdueFee() {
        return payOverdueFee;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param payOverdueFee : 设置值. <br/>
     */
    public void setPayOverdueFee(Integer payOverdueFee) {
        this.payOverdueFee = payOverdueFee;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getNoPayFee() {
        return noPayFee;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param noPayFee : 设置值. <br/>
     */
    public void setNoPayFee(Integer noPayFee) {
        this.noPayFee = noPayFee;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getNoPayCapital() {
        return noPayCapital;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param noPayCapital : 设置值. <br/>
     */
    public void setNoPayCapital(Integer noPayCapital) {
        this.noPayCapital = noPayCapital;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getNoPayManagerFee() {
        return noPayManagerFee;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param noPayManagerFee : 设置值. <br/>
     */
    public void setNoPayManagerFee(Integer noPayManagerFee) {
        this.noPayManagerFee = noPayManagerFee;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getNoPayPoundateFee() {
        return noPayPoundateFee;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param noPayPoundateFee : 设置值. <br/>
     */
    public void setNoPayPoundateFee(Integer noPayPoundateFee) {
        this.noPayPoundateFee = noPayPoundateFee;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getNoPayOverdueFee() {
        return noPayOverdueFee;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param noPayOverdueFee : 设置值. <br/>
     */
    public void setNoPayOverdueFee(Integer noPayOverdueFee) {
        this.noPayOverdueFee = noPayOverdueFee;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getSettleFlag() {
        return settleFlag;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param settleFlag : 设置值. <br/>
     */
    public void setSettleFlag(String settleFlag) {
        this.settleFlag = settleFlag;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getOverdueFlag() {
        return overdueFlag;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param overdueFlag : 设置值. <br/>
     */
    public void setOverdueFlag(String overdueFlag) {
        this.overdueFlag = overdueFlag;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getOverdueDay() {
        return overdueDay;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param overdueDay : 设置值. <br/>
     */
    public void setOverdueDay(Integer overdueDay) {
        this.overdueDay = overdueDay;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param orderDate : 设置值. <br/>
     */
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getOrderTime() {
        return orderTime;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param orderTime : 设置值. <br/>
     */
    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param orderId : 设置值. <br/>
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

}