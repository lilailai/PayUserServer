/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: CsBindcard.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date          			Author      Changes .</br>
 *  20160809 120806    Lance.Wu     Create  .</br>
 *  Description: 当前类是通过工具生成的.</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.entity;

/**
 * <pre>
 * ClassName: CsBindcard <br/> 
 * date: 20160809 120806 <br/> 
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public class CsBindcard extends BaseEntity {

    /** 序号 */
    private static final long serialVersionUID = 1L;

    /** 属性描述： */
    private String verifydesc;
    /** 属性描述： */
    private String createtime;
    /** 属性描述：是否为本人 */
    private String cardholder;
    /** 属性描述：每月还款日，字符串varchar2，长度2，充许null、空 */
    private String repaymentDate;
    /** 属性描述：机构号  */
    private String branchid;
    /** 属性描述：有效期  */
    private String validtime;
    /** 属性描述：身份证号 */
    private String idno;
    /** 属性描述： */
    private String createdate;
    /** 属性描述：0.无效,1有效 */
    private String status;
    /** 属性描述： */
    private String accountname;
    /** 属性描述： */
    private String cardidx;
    /** 属性描述： */
    private String bankid;
    /** 属性描述： */
    private String bankname;
    /** 属性描述： */
    private String bankbranchid;
    /** 属性描述： */
    private String bankbranchname;
    /** 属性描述： */
    private String provinceid;
    /** 属性描述： */
    private String bankprovince;
    /** 属性描述： */
    private String cityid;
    /** 属性描述： */
    private String bankcity;
    /** 属性描述： */
    private String aliasname;
    /** 属性描述：D.借记卡,C.贷记卡. */
    private String cardtype;
    /** 属性描述：L.理财产品,T.提取. Z */
    private String cardbindtype;
    /** 属性描述：0.未绑定,1已绑定 */
    private String isbind;
    /** 属性描述： */
    private String accountno;
    /** 属性描述： */
    private String customerid;
    /** 属性描述： */
    private String id;

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getVerifydesc() {
        return verifydesc;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param verifydesc : 设置值. <br/>
     */
    public void setVerifydesc(String verifydesc) {
        this.verifydesc = verifydesc;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCreatetime() {
        return createtime;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param createtime : 设置值. <br/>
     */
    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    /**
     * 描述：获取属性值-是否为本人.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCardholder() {
        return cardholder;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param cardholder :是否为本人 设置值. <br/>
     */
    public void setCardholder(String cardholder) {
        this.cardholder = cardholder;
    }

    /**
     * 描述：获取属性值-每月还款日，字符串varchar2，长度2，充许null、空.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getRepaymentDate() {
        return repaymentDate;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param repaymentDate :每月还款日，字符串varchar2，长度2，充许null、空 设置值. <br/>
     */
    public void setRepaymentDate(String repaymentDate) {
        this.repaymentDate = repaymentDate;
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
     * 描述：获取属性值-有效期 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getValidtime() {
        return validtime;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param validtime :有效期  设置值. <br/>
     */
    public void setValidtime(String validtime) {
        this.validtime = validtime;
    }

    /**
     * 描述：获取属性值-身份证号.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getIdno() {
        return idno;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param idno :身份证号 设置值. <br/>
     */
    public void setIdno(String idno) {
        this.idno = idno;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCreatedate() {
        return createdate;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param createdate : 设置值. <br/>
     */
    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    /**
     * 描述：获取属性值-0.无效,1有效.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getStatus() {
        return status;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param status :0.无效,1有效 设置值. <br/>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getAccountname() {
        return accountname;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param accountname : 设置值. <br/>
     */
    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCardidx() {
        return cardidx;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param cardidx : 设置值. <br/>
     */
    public void setCardidx(String cardidx) {
        this.cardidx = cardidx;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getBankid() {
        return bankid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param bankid : 设置值. <br/>
     */
    public void setBankid(String bankid) {
        this.bankid = bankid;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getBankname() {
        return bankname;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param bankname : 设置值. <br/>
     */
    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getBankbranchid() {
        return bankbranchid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param bankbranchid : 设置值. <br/>
     */
    public void setBankbranchid(String bankbranchid) {
        this.bankbranchid = bankbranchid;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getBankbranchname() {
        return bankbranchname;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param bankbranchname : 设置值. <br/>
     */
    public void setBankbranchname(String bankbranchname) {
        this.bankbranchname = bankbranchname;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getProvinceid() {
        return provinceid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param provinceid : 设置值. <br/>
     */
    public void setProvinceid(String provinceid) {
        this.provinceid = provinceid;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getBankprovince() {
        return bankprovince;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param bankprovince : 设置值. <br/>
     */
    public void setBankprovince(String bankprovince) {
        this.bankprovince = bankprovince;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCityid() {
        return cityid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param cityid : 设置值. <br/>
     */
    public void setCityid(String cityid) {
        this.cityid = cityid;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getBankcity() {
        return bankcity;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param bankcity : 设置值. <br/>
     */
    public void setBankcity(String bankcity) {
        this.bankcity = bankcity;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getAliasname() {
        return aliasname;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param aliasname : 设置值. <br/>
     */
    public void setAliasname(String aliasname) {
        this.aliasname = aliasname;
    }

    /**
     * 描述：获取属性值-D.借记卡,C.贷记卡..<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCardtype() {
        return cardtype;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param cardtype :D.借记卡,C.贷记卡. 设置值. <br/>
     */
    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
    }

    /**
     * 描述：获取属性值-L.理财产品,T.提取. Z.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCardbindtype() {
        return cardbindtype;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param cardbindtype :L.理财产品,T.提取. Z 设置值. <br/>
     */
    public void setCardbindtype(String cardbindtype) {
        this.cardbindtype = cardbindtype;
    }

    /**
     * 描述：获取属性值-0.未绑定,1已绑定.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getIsbind() {
        return isbind;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param isbind :0.未绑定,1已绑定 设置值. <br/>
     */
    public void setIsbind(String isbind) {
        this.isbind = isbind;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getAccountno() {
        return accountno;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param accountno : 设置值. <br/>
     */
    public void setAccountno(String accountno) {
        this.accountno = accountno;
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

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getId() {
        return id;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param id : 设置值. <br/>
     */
    public void setId(String id) {
        this.id = id;
    }

}