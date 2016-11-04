/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: PrepAdvancedVip.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date          			Author      Changes .</br>
 *  20160809 120851    Lance.Wu     Create  .</br>
 *  Description: 当前类是通过工具生成的.</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.entity;

/**
 * <pre>
 * ClassName: PrepAdvancedVip <br/> 
 * date: 20160809 120851 <br/> 
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public class PrepAdvancedVip extends BaseEntity {

    /** 序号 */
    private static final long serialVersionUID = 1L;

    /** 属性描述：最后修改时间 */
    private String lastchangedate;
    /** 属性描述：信用卡有效期 */
    private String bankname;
    /** 属性描述：会员费到期日 */
    private String feedate;
    /** 属性描述：交易时间 */
    private String transtime;
    /** 属性描述：交易流水 */
    private String translogno;
    /** 属性描述：0 初始状态 1付款成功 2退款中 3退款成功 4退款失败 */
    private String transflag;
    /** 属性描述：交易日期 */
    private String transdate;
    /** 属性描述： */
    private String isassure;
    /** 属性描述：是否付费标记 */
    private String isgotofee;
    /** 属性描述： */
    private String customerid;
    /** 属性描述： */
    private String account;
    /** 属性描述： */
    private String type;
    /** 属性描述： */
    private String url;
    /** 属性描述： */
    private String timestamp;
    /** 属性描述： */
    private String branchid;
    /** 属性描述： */
    private String appuser;
    /** 属性描述：0待审核1审核通过2审核失败3 重新认证4逻辑删除 */
    private String status;
    /** 属性描述：0 等待验证 1验证通过 2 验证不通过 */
    private String flag;
    /** 属性描述：信用卡有效期限 */
    private String validtime;
    /** 属性描述：驳回原因 */
    private String rejectreason;
    /** 属性描述：登记描述 */
    private String leveldesc;
    /** 属性描述：信用卡类型 0 ic卡 1磁条卡 */
    private String cardtype;
    /** 属性描述：银行ID */
    private String bankid;
    /** 属性描述： */
    private Integer id;

    /**
     * 描述：获取属性值-最后修改时间.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getLastchangedate() {
        return lastchangedate;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param lastchangedate :最后修改时间 设置值. <br/>
     */
    public void setLastchangedate(String lastchangedate) {
        this.lastchangedate = lastchangedate;
    }

    /**
     * 描述：获取属性值-信用卡有效期.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getBankname() {
        return bankname;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param bankname :信用卡有效期 设置值. <br/>
     */
    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    /**
     * 描述：获取属性值-会员费到期日.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getFeedate() {
        return feedate;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param feedate :会员费到期日 设置值. <br/>
     */
    public void setFeedate(String feedate) {
        this.feedate = feedate;
    }

    /**
     * 描述：获取属性值-交易时间.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getTranstime() {
        return transtime;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param transtime :交易时间 设置值. <br/>
     */
    public void setTranstime(String transtime) {
        this.transtime = transtime;
    }

    /**
     * 描述：获取属性值-交易流水.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getTranslogno() {
        return translogno;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param translogno :交易流水 设置值. <br/>
     */
    public void setTranslogno(String translogno) {
        this.translogno = translogno;
    }

    /**
     * 描述：获取属性值-0 初始状态 1付款成功 2退款中 3退款成功 4退款失败.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getTransflag() {
        return transflag;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param transflag :0 初始状态 1付款成功 2退款中 3退款成功 4退款失败 设置值. <br/>
     */
    public void setTransflag(String transflag) {
        this.transflag = transflag;
    }

    /**
     * 描述：获取属性值-交易日期.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getTransdate() {
        return transdate;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param transdate :交易日期 设置值. <br/>
     */
    public void setTransdate(String transdate) {
        this.transdate = transdate;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getIsassure() {
        return isassure;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param isassure : 设置值. <br/>
     */
    public void setIsassure(String isassure) {
        this.isassure = isassure;
    }

    /**
     * 描述：获取属性值-是否付费标记.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getIsgotofee() {
        return isgotofee;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param isgotofee :是否付费标记 设置值. <br/>
     */
    public void setIsgotofee(String isgotofee) {
        this.isgotofee = isgotofee;
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
    public String getAccount() {
        return account;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param account : 设置值. <br/>
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getType() {
        return type;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param type : 设置值. <br/>
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getUrl() {
        return url;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param url : 设置值. <br/>
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param timestamp : 设置值. <br/>
     */
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
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
    public String getAppuser() {
        return appuser;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param appuser : 设置值. <br/>
     */
    public void setAppuser(String appuser) {
        this.appuser = appuser;
    }

    /**
     * 描述：获取属性值-0待审核1审核通过2审核失败3 重新认证4逻辑删除.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getStatus() {
        return status;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param status :0待审核1审核通过2审核失败3 重新认证4逻辑删除 设置值. <br/>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 描述：获取属性值-0 等待验证 1验证通过 2 验证不通过.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getFlag() {
        return flag;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param flag :0 等待验证 1验证通过 2 验证不通过 设置值. <br/>
     */
    public void setFlag(String flag) {
        this.flag = flag;
    }

    /**
     * 描述：获取属性值-信用卡有效期限.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getValidtime() {
        return validtime;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param validtime :信用卡有效期限 设置值. <br/>
     */
    public void setValidtime(String validtime) {
        this.validtime = validtime;
    }

    /**
     * 描述：获取属性值-驳回原因.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getRejectreason() {
        return rejectreason;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param rejectreason :驳回原因 设置值. <br/>
     */
    public void setRejectreason(String rejectreason) {
        this.rejectreason = rejectreason;
    }

    /**
     * 描述：获取属性值-登记描述.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getLeveldesc() {
        return leveldesc;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param leveldesc :登记描述 设置值. <br/>
     */
    public void setLeveldesc(String leveldesc) {
        this.leveldesc = leveldesc;
    }

    /**
     * 描述：获取属性值-信用卡类型 0 ic卡 1磁条卡.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCardtype() {
        return cardtype;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param cardtype :信用卡类型 0 ic卡 1磁条卡 设置值. <br/>
     */
    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
    }

    /**
     * 描述：获取属性值-银行ID.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getBankid() {
        return bankid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param bankid :银行ID 设置值. <br/>
     */
    public void setBankid(String bankid) {
        this.bankid = bankid;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getId() {
        return id;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param id : 设置值. <br/>
     */
    public void setId(Integer id) {
        this.id = id;
    }

}