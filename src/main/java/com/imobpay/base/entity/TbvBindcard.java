/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: TbvBindcard.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date          			Author      Changes .</br>
 *  20160827 100810    Lance.Wu     Create  .</br>
 *  Description: 当前类是通过工具生成的.</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.entity;

/**
 * <pre>
 * ClassName: TbvBindcard <br/> 
 * date: 20160827 100810 <br/> 
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public class TbvBindcard extends BaseEntity {

    /** 序号 */
    private static final long serialVersionUID = 1L;

    /** 属性描述： */
    private String            repaymentDate;
    /** 属性描述：机构号 */
    private String            branchid;
    /** 属性描述：身份证号 */
    private String            idno;
    /** 属性描述：有效日期 */
    private String            validtime;
    /** 属性描述：是否本人卡 ：0--本人卡 */
    private String            cardholder;
    /** 属性描述：归属人姓名 */
    private String            accountname;
    /** 属性描述：绑卡序号 */
    private String            cardidx;
    /** 属性描述：银行ID */
    private String            bankid;
    /** 属性描述：银行名称 */
    private String            bankname;
    /** 属性描述：支行ID */
    private String            bankbranchid;
    /** 属性描述：支行名称 */
    private String            bankbranchname;
    /** 属性描述：省份ID */
    private String            provinceid;
    /** 属性描述：省份 */
    private String            bankprovince;
    /** 属性描述：城市ID */
    private String            cityid;
    /** 属性描述：城市名 */
    private String            bankcity;
    /** 属性描述：别名 */
    private String            aliasname;
    /** 属性描述：卡类型 D.借记卡,C.贷记卡. */
    private String            cardtype;
    /** 属性描述：绑定类型 L.理财产品,T.提取. Z--转账 SF--转账 X--信用卡 */
    private String            cardbindtype;
    /** 属性描述：是否绑定 0.未绑定,1已绑定 */
    private String            isbind;
    /** 属性描述：创建日期 */
    private String            begindate;
    /** 属性描述：创建时间 */
    private String            enddate;
    /** 属性描述：校验描述 */
    private String            verifydesc;
    /** 属性描述：卡号 */
    private String            accountno;
    /** 属性描述： */
    private String            tid;
    /** 属性描述：ID */
    private String            id;

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getRepaymentDate() {
        return repaymentDate;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param repaymentDate : 设置值. <br/>
     */
    public void setRepaymentDate(String repaymentDate) {
        this.repaymentDate = repaymentDate;
    }

    /**
     * 描述：获取属性值-机构号.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getBranchid() {
        return branchid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param branchid :机构号 设置值. <br/>
     */
    public void setBranchid(String branchid) {
        this.branchid = branchid;
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
     * 描述：获取属性值-有效日期.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getValidtime() {
        return validtime;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param validtime :有效日期 设置值. <br/>
     */
    public void setValidtime(String validtime) {
        this.validtime = validtime;
    }

    /**
     * 描述：获取属性值-是否本人卡 ：0--本人卡.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCardholder() {
        return cardholder;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param cardholder :是否本人卡 ：0--本人卡 设置值. <br/>
     */
    public void setCardholder(String cardholder) {
        this.cardholder = cardholder;
    }

    /**
     * 描述：获取属性值-归属人姓名.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getAccountname() {
        return accountname;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param accountname :归属人姓名 设置值. <br/>
     */
    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

    /**
     * 描述：获取属性值-绑卡序号.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCardidx() {
        return cardidx;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param cardidx :绑卡序号 设置值. <br/>
     */
    public void setCardidx(String cardidx) {
        this.cardidx = cardidx;
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
     * 描述：获取属性值-银行名称.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getBankname() {
        return bankname;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param bankname :银行名称 设置值. <br/>
     */
    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    /**
     * 描述：获取属性值-支行ID.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getBankbranchid() {
        return bankbranchid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param bankbranchid :支行ID 设置值. <br/>
     */
    public void setBankbranchid(String bankbranchid) {
        this.bankbranchid = bankbranchid;
    }

    /**
     * 描述：获取属性值-支行名称.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getBankbranchname() {
        return bankbranchname;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param bankbranchname :支行名称 设置值. <br/>
     */
    public void setBankbranchname(String bankbranchname) {
        this.bankbranchname = bankbranchname;
    }

    /**
     * 描述：获取属性值-省份ID.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getProvinceid() {
        return provinceid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param provinceid :省份ID 设置值. <br/>
     */
    public void setProvinceid(String provinceid) {
        this.provinceid = provinceid;
    }

    /**
     * 描述：获取属性值-省份.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getBankprovince() {
        return bankprovince;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param bankprovince :省份 设置值. <br/>
     */
    public void setBankprovince(String bankprovince) {
        this.bankprovince = bankprovince;
    }

    /**
     * 描述：获取属性值-城市ID.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCityid() {
        return cityid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param cityid :城市ID 设置值. <br/>
     */
    public void setCityid(String cityid) {
        this.cityid = cityid;
    }

    /**
     * 描述：获取属性值-城市名.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getBankcity() {
        return bankcity;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param bankcity :城市名 设置值. <br/>
     */
    public void setBankcity(String bankcity) {
        this.bankcity = bankcity;
    }

    /**
     * 描述：获取属性值-别名.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getAliasname() {
        return aliasname;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param aliasname :别名 设置值. <br/>
     */
    public void setAliasname(String aliasname) {
        this.aliasname = aliasname;
    }

    /**
     * 描述：获取属性值-卡类型 D.借记卡,C.贷记卡..<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCardtype() {
        return cardtype;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param cardtype :卡类型 D.借记卡,C.贷记卡. 设置值. <br/>
     */
    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
    }

    /**
     * 描述：获取属性值-绑定类型 L.理财产品,T.提取. Z--转账 SF--转账 X--信用卡.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCardbindtype() {
        return cardbindtype;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param cardbindtype :绑定类型 L.理财产品,T.提取. Z--转账 SF--转账 X--信用卡 设置值. <br/>
     */
    public void setCardbindtype(String cardbindtype) {
        this.cardbindtype = cardbindtype;
    }

    /**
     * 描述：获取属性值-是否绑定 0.未绑定,1已绑定.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getIsbind() {
        return isbind;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param isbind :是否绑定 0.未绑定,1已绑定 设置值. <br/>
     */
    public void setIsbind(String isbind) {
        this.isbind = isbind;
    }

    /**
     * @return the begindate
     */
    public String getBegindate() {
        return begindate;
    }

    /**
     * begindate.
     * 
     * @param begindate
     *            the begindate to set
     * @since JDK 1.6 PayTACard
     */
    public void setBegindate(String begindate) {
        this.begindate = begindate;
    }

    /**
     * @return the enddate
     */
    public String getEnddate() {
        return enddate;
    }

    /**
     * enddate.
     * 
     * @param enddate
     *            the enddate to set
     * @since JDK 1.6 PayTACard
     */
    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    /**
     * 描述：获取属性值-校验描述.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getVerifydesc() {
        return verifydesc;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param verifydesc :校验描述 设置值. <br/>
     */
    public void setVerifydesc(String verifydesc) {
        this.verifydesc = verifydesc;
    }

    /**
     * 描述：获取属性值-卡号.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getAccountno() {
        return accountno;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param accountno :卡号 设置值. <br/>
     */
    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getTid() {
        return tid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param tid : 设置值. <br/>
     */
    public void setTid(String tid) {
        this.tid = tid;
    }

    /**
     * 描述：获取属性值-ID.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getId() {
        return id;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param id :ID 设置值. <br/>
     */
    public void setId(String id) {
        this.id = id;
    }

}