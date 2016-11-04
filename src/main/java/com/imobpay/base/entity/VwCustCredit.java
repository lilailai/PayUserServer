/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: VwCustCredit.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date          			Author      Changes .</br>
 *  20160729 100740    Lance.Wu     Create  .</br>
 *  Description: 当前类是通过工具生成的.</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.entity;

import java.math.BigDecimal;

/**
 * <pre>
 * ClassName: VwCustCredit <br/> 
 * date: 20160729 100740 <br/> 
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public class VwCustCredit extends BaseEntity {

    /** 序号 */
    private static final long serialVersionUID = 1L;

    /** 属性描述： */
    private String customerpid;
    /** 属性描述： */
    private BigDecimal overdueDay;
    /** 属性描述： */
    private String mobileno;
    /** 属性描述： */
    private BigDecimal creditMoney;
    /** 属性描述： */
    private BigDecimal applyAmount;
    /** 属性描述： */
    private BigDecimal lendAmount;
    /** 属性描述： */
    private BigDecimal allowAmount;
    /** 属性描述： */
    private BigDecimal waitAuditAmount;
    /** 属性描述： */
    private BigDecimal auditedAmount;
    /** 属性描述： */
    private BigDecimal managerFee;
    /** 属性描述： */
    private BigDecimal poundateFee;
    /** 属性描述： */
    private BigDecimal overdueFee;
    /** 属性描述： */
    private BigDecimal payFee;
    /** 属性描述： */
    private BigDecimal payCapital;
    /** 属性描述： */
    private BigDecimal payManagerFee;
    /** 属性描述： */
    private BigDecimal payPoundateFee;
    /** 属性描述： */
    private BigDecimal payOverdueFee;
    /** 属性描述： */
    private BigDecimal noPayFee;
    /** 属性描述： */
    private BigDecimal noPayCapital;
    /** 属性描述： */
    private BigDecimal noPayManagerFee;
    /** 属性描述： */
    private BigDecimal noPayPoundateFee;
    /** 属性描述： */
    private BigDecimal noPayOverdueFee;
    /** 属性描述： */
    private String settleFlag;
    /** 属性描述： */
    private String overdueFlag;
    /** 属性描述： */
    private String customerid;

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
     * 返回类型：@return BigDecimal .<br/>
     */
    public BigDecimal getOverdueDay() {
        return overdueDay;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param overdueDay : 设置值. <br/>
     */
    public void setOverdueDay(BigDecimal overdueDay) {
        this.overdueDay = overdueDay;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getMobileno() {
        return mobileno;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param mobileno : 设置值. <br/>
     */
    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return BigDecimal .<br/>
     */
    public BigDecimal getCreditMoney() {
        return creditMoney;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param creditMoney : 设置值. <br/>
     */
    public void setCreditMoney(BigDecimal creditMoney) {
        this.creditMoney = creditMoney;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return BigDecimal .<br/>
     */
    public BigDecimal getApplyAmount() {
        return applyAmount;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param applyAmount : 设置值. <br/>
     */
    public void setApplyAmount(BigDecimal applyAmount) {
        this.applyAmount = applyAmount;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return BigDecimal .<br/>
     */
    public BigDecimal getLendAmount() {
        return lendAmount;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param lendAmount : 设置值. <br/>
     */
    public void setLendAmount(BigDecimal lendAmount) {
        this.lendAmount = lendAmount;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return BigDecimal .<br/>
     */
    public BigDecimal getAllowAmount() {
        return allowAmount;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param allowAmount : 设置值. <br/>
     */
    public void setAllowAmount(BigDecimal allowAmount) {
        this.allowAmount = allowAmount;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return BigDecimal .<br/>
     */
    public BigDecimal getWaitAuditAmount() {
        return waitAuditAmount;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param waitAuditAmount : 设置值. <br/>
     */
    public void setWaitAuditAmount(BigDecimal waitAuditAmount) {
        this.waitAuditAmount = waitAuditAmount;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return BigDecimal .<br/>
     */
    public BigDecimal getAuditedAmount() {
        return auditedAmount;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param auditedAmount : 设置值. <br/>
     */
    public void setAuditedAmount(BigDecimal auditedAmount) {
        this.auditedAmount = auditedAmount;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return BigDecimal .<br/>
     */
    public BigDecimal getManagerFee() {
        return managerFee;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param managerFee : 设置值. <br/>
     */
    public void setManagerFee(BigDecimal managerFee) {
        this.managerFee = managerFee;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return BigDecimal .<br/>
     */
    public BigDecimal getPoundateFee() {
        return poundateFee;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param poundateFee : 设置值. <br/>
     */
    public void setPoundateFee(BigDecimal poundateFee) {
        this.poundateFee = poundateFee;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return BigDecimal .<br/>
     */
    public BigDecimal getOverdueFee() {
        return overdueFee;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param overdueFee : 设置值. <br/>
     */
    public void setOverdueFee(BigDecimal overdueFee) {
        this.overdueFee = overdueFee;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return BigDecimal .<br/>
     */
    public BigDecimal getPayFee() {
        return payFee;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param payFee : 设置值. <br/>
     */
    public void setPayFee(BigDecimal payFee) {
        this.payFee = payFee;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return BigDecimal .<br/>
     */
    public BigDecimal getPayCapital() {
        return payCapital;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param payCapital : 设置值. <br/>
     */
    public void setPayCapital(BigDecimal payCapital) {
        this.payCapital = payCapital;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return BigDecimal .<br/>
     */
    public BigDecimal getPayManagerFee() {
        return payManagerFee;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param payManagerFee : 设置值. <br/>
     */
    public void setPayManagerFee(BigDecimal payManagerFee) {
        this.payManagerFee = payManagerFee;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return BigDecimal .<br/>
     */
    public BigDecimal getPayPoundateFee() {
        return payPoundateFee;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param payPoundateFee : 设置值. <br/>
     */
    public void setPayPoundateFee(BigDecimal payPoundateFee) {
        this.payPoundateFee = payPoundateFee;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return BigDecimal .<br/>
     */
    public BigDecimal getPayOverdueFee() {
        return payOverdueFee;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param payOverdueFee : 设置值. <br/>
     */
    public void setPayOverdueFee(BigDecimal payOverdueFee) {
        this.payOverdueFee = payOverdueFee;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return BigDecimal .<br/>
     */
    public BigDecimal getNoPayFee() {
        return noPayFee;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param noPayFee : 设置值. <br/>
     */
    public void setNoPayFee(BigDecimal noPayFee) {
        this.noPayFee = noPayFee;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return BigDecimal .<br/>
     */
    public BigDecimal getNoPayCapital() {
        return noPayCapital;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param noPayCapital : 设置值. <br/>
     */
    public void setNoPayCapital(BigDecimal noPayCapital) {
        this.noPayCapital = noPayCapital;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return BigDecimal .<br/>
     */
    public BigDecimal getNoPayManagerFee() {
        return noPayManagerFee;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param noPayManagerFee : 设置值. <br/>
     */
    public void setNoPayManagerFee(BigDecimal noPayManagerFee) {
        this.noPayManagerFee = noPayManagerFee;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return BigDecimal .<br/>
     */
    public BigDecimal getNoPayPoundateFee() {
        return noPayPoundateFee;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param noPayPoundateFee : 设置值. <br/>
     */
    public void setNoPayPoundateFee(BigDecimal noPayPoundateFee) {
        this.noPayPoundateFee = noPayPoundateFee;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return BigDecimal .<br/>
     */
    public BigDecimal getNoPayOverdueFee() {
        return noPayOverdueFee;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param noPayOverdueFee : 设置值. <br/>
     */
    public void setNoPayOverdueFee(BigDecimal noPayOverdueFee) {
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

}