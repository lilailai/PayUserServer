/**
 *  <pre>	
 *  Project Name  :PayUserServer .</br>
 *  File  : Payamountcontrol.java .</br>
 *  Package Name  :com.imobpay.base.entity .</br>
 *  Date      Author       Changes .</br>
 *  2016年6月2日   Lance.Wu     Create  .</br>
 *  Description  : .</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.entity;

/**
 * <pre>
 * ClassName  : Payamountcontrol <br/> 
 * date  : 20160614 050650 <br/> 
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public class Payamountcontrol extends BaseEntity {

    /** 序号 */
    private static final long serialVersionUID = 1L;

    /** 属性描述：机构号 */
    private String            branchid;
    /** 属性描述：服务编码 */
    private String            servcode;
    /** 属性描述：产品号 */
    private String            productid;
    /** 属性描述：支付类型,0 刷卡 ； 1 账户支付 */
    private String            paytype;
    /** 属性描述："机构类型,00 不区分实名，不区分卡种；01 不区分实名，区分卡种；10 区分实名，不区分卡种；11 区分实名，区分卡种" */
    private String            branchtype;
    /** 属性描述：单笔下限 */
    private Integer           lowlimit;
    /** 属性描述：当卡日交易额 */
    private Integer           cardday;
    /** 属性描述：当卡月交易额 */
    private Integer           cardmonth;
    /** 属性描述：单账户交易额 */
    private Integer           accountday;
    /** 属性描述：单账户交易额 */
    private Integer           accountmonth;
    /** 属性描述：单笔上限 */
    private Integer           upplimit;
    /** 属性描述：支付等级 */
    private String            limitid;

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
     * 创建时间：2016年6月3日 下午7  :27  :50 <br/>
     * 参数  : @param branchid   :机构号 设置值. <br/>
     */
    public void setBranchid(String branchid) {
        this.branchid = branchid;
    }

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
     * 创建时间：2016年6月3日 下午7  :27  :50 <br/>
     * 参数  : @param servcode   :服务编码 设置值. <br/>
     */
    public void setServcode(String servcode) {
        this.servcode = servcode;
    }

    /**
     * 描述：获取属性值-产品号 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getProductid() {
        return productid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7  :27  :50 <br/>
     * 参数  : @param productid  :产品号 设置值. <br/>
     */
    public void setProductid(String productid) {
        this.productid = productid;
    }

    /**
     * 描述：获取属性值-支付类型,0 刷卡 ； 1 账户支付 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getPaytype() {
        return paytype;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7  :27  :50 <br/>
     * 参数  : @param paytype  :支付类型,0 刷卡 ； 1 账户支付 设置值. <br/>
     */
    public void setPaytype(String paytype) {
        this.paytype = paytype;
    }

    /**
     * 描述：获取属性值-"机构类型,00 不区分实名，不区分卡种；01 不区分实名，区分卡种；10 区分实名，不区分卡种；11 区分实名，区分卡种" .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getBranchtype() {
        return branchtype;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7  :27  :50 <br/>
     * 参数  : @param branchtype  :
     * "机构类型,00 不区分实名，不区分卡种；01 不区分实名，区分卡种；10 区分实名，不区分卡种；11 区分实名，区分卡种" 设置值. <br/>
     */
    public void setBranchtype(String branchtype) {
        this.branchtype = branchtype;
    }

    /**
     * 描述：获取属性值-单笔下限 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getLowlimit() {
        return lowlimit;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7  :27  :50 <br/>
     * 参数  : @param lowlimit  :单笔下限 设置值. <br/>
     */
    public void setLowlimit(Integer lowlimit) {
        this.lowlimit = lowlimit;
    }

    /**
     * 描述：获取属性值-当卡日交易额 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getCardday() {
        return cardday;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7  :27  :50 <br/>
     * 参数  : @param cardday  :当卡日交易额 设置值. <br/>
     */
    public void setCardday(Integer cardday) {
        this.cardday = cardday;
    }

    /**
     * 描述：获取属性值-当卡月交易额 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getCardmonth() {
        return cardmonth;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7  :27  :50 <br/>
     * 参数  : @param cardmonth  :当卡月交易额 设置值. <br/>
     */
    public void setCardmonth(Integer cardmonth) {
        this.cardmonth = cardmonth;
    }

    /**
     * 描述：获取属性值-单账户交易额 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getAccountday() {
        return accountday;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7  :27  :50 <br/>
     * 参数  : @param accountday  :单账户交易额 设置值. <br/>
     */
    public void setAccountday(Integer accountday) {
        this.accountday = accountday;
    }

    /**
     * 描述：获取属性值-单账户交易额 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getAccountmonth() {
        return accountmonth;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7  :27  :50 <br/>
     * 参数  : @param accountmonth  :单账户交易额 设置值. <br/>
     */
    public void setAccountmonth(Integer accountmonth) {
        this.accountmonth = accountmonth;
    }

    /**
     * 描述：获取属性值-单笔上限 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getUpplimit() {
        return upplimit;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7  :27  :50 <br/>
     * 参数  : @param upplimit  :单笔上限 设置值. <br/>
     */
    public void setUpplimit(Integer upplimit) {
        this.upplimit = upplimit;
    }

    /**
     * 描述：获取属性值-支付等级 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getLimitid() {
        return limitid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7  :27  :50 <br/>
     * 参数  : @param limitid  :支付等级 设置值. <br/>
     */
    public void setLimitid(String limitid) {
        this.limitid = limitid;
    }

}