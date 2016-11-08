/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: CsCardbin.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date          			Author      Changes .</br>
 *  20160827 050805    Lance.Wu     Create  .</br>
 *  Description: 当前类是通过工具生成的.</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.entity;

/**
 * <pre>
 * ClassName: CsCardbin <br/> 
 * date: 20160827 050805 <br/> 
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public class CsCardbin extends BaseEntity {

    /** 序号 */
    private static final long serialVersionUID = 1L;

    /** 属性描述： */
    private String            bankid;
    /** 属性描述： */
    private String            feemsg;
    /** 属性描述： */
    private String            cardno;
    /** 属性描述： */
    private Integer           cardlen;
    /** 属性描述： */
    private String            cardbin;
    /** 属性描述： */
    private String            cardname;
    /** 属性描述： */
    private String            bankname;
    /** 属性描述： */
    private String            branchid;
    /** 属性描述： */
    private String            branchid2;
    /** 属性描述： */
    private String            cardtype;
    /** 属性描述： */
    private String            cardorg;
    /** 属性描述： */
    private Integer           cardtag;
    /** 属性描述： */
    private Integer           cardtag2;
    /** 属性描述：通道标识：1001：多渠道一笔投（T+0/T+0）、0101：多渠道两笔代付（T+0）、0011：华势一笔投 */
    private String            channelsflag;
    /** 属性描述：到账时间描述 */
    private String            paymentdesc;
    /** 属性描述： */
    private String            issusers;

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
    public String getFeemsg() {
        return feemsg;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param feemsg : 设置值. <br/>
     */
    public void setFeemsg(String feemsg) {
        this.feemsg = feemsg;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCardno() {
        return cardno;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param cardno : 设置值. <br/>
     */
    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getCardlen() {
        return cardlen;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param cardlen : 设置值. <br/>
     */
    public void setCardlen(Integer cardlen) {
        this.cardlen = cardlen;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCardbin() {
        return cardbin;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param cardbin : 设置值. <br/>
     */
    public void setCardbin(String cardbin) {
        this.cardbin = cardbin;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCardname() {
        return cardname;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param cardname : 设置值. <br/>
     */
    public void setCardname(String cardname) {
        this.cardname = cardname;
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
    public String getBranchid() {
        return branchid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param branchid : 设置值. <br/>
     */
    public void setBranchid(String branchid) {
        this.branchid = branchid;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getBranchid2() {
        return branchid2;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param branchid2 : 设置值. <br/>
     */
    public void setBranchid2(String branchid2) {
        this.branchid2 = branchid2;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCardtype() {
        return cardtype;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param cardtype : 设置值. <br/>
     */
    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCardorg() {
        return cardorg;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param cardorg : 设置值. <br/>
     */
    public void setCardorg(String cardorg) {
        this.cardorg = cardorg;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getCardtag() {
        return cardtag;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param cardtag : 设置值. <br/>
     */
    public void setCardtag(Integer cardtag) {
        this.cardtag = cardtag;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getCardtag2() {
        return cardtag2;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param cardtag2 : 设置值. <br/>
     */
    public void setCardtag2(Integer cardtag2) {
        this.cardtag2 = cardtag2;
    }

    /**
     * 描述：获取属性值-通道标识：1001：多渠道一笔投（T+0/T+0）、0101：多渠道两笔代付（T+0）、0011：华势一笔投.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getChannelsflag() {
        return channelsflag;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param channelsflag
     * :通道标识：1001：多渠道一笔投（T+0/T+0）、0101：多渠道两笔代付（T+0）、0011：华势一笔投 设置值. <br/>
     */
    public void setChannelsflag(String channelsflag) {
        this.channelsflag = channelsflag;
    }

    /**
     * 描述：获取属性值-到账时间描述.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getPaymentdesc() {
        return paymentdesc;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param paymentdesc :到账时间描述 设置值. <br/>
     */
    public void setPaymentdesc(String paymentdesc) {
        this.paymentdesc = paymentdesc;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getIssusers() {
        return issusers;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param issusers : 设置值. <br/>
     */
    public void setIssusers(String issusers) {
        this.issusers = issusers;
    }

}