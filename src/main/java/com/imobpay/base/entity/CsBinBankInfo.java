/**
 *  Project Name:PayTACard
 *  File: CsBinBankInfo.java
 *  Package Name:com.imobpay.base.pojo
 *  Date      Author       Changes
 *  2016年8月27日   madman     Create
 *  Description:
 *  Copyright 2014-2015 QIANTUO FINANCE Services Co.,Ltd. All rights reserved.
 */
package com.imobpay.base.entity;

import java.io.Serializable;

/**
 * ClassName: CsBinBankInfo <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2016年8月27日 下午6:09:37 <br/>
 * 
 * @author madman
 * @version
 * @since JDK 1.6 PayTACard 1.0
 */
public class CsBinBankInfo implements Serializable {
    /**
     * serialVersionUID:TODO(用一句话描述这个变量表示什么).
     * 
     * @since JDK 1.6
     */
    private static final long serialVersionUID = 1L;
    /**
     * 银行名称
     */
    public String             bankname;
    /**
     * 省份编号
     */
    public String             provinceid;
    /**
     * 省份名称
     */
    public String             provincename;
    /**
     * 城市编号
     */
    public String             cityid;
    /**
     * 城市名称
     */
    public String             cityname;
    /**
     * 银行机构名称
     */
    public String             bankbranchname;
    /**
     * 卡类型
     */
    public String             cardtype;
    /**
     * 银行编号
     */
    public String             bankid;
    /**
     * 银行机构编号
     */
    public String             bankbranchid;
    /**
     * 卡号
     */
    public String             cardno;
    /**
     * 卡号长度
     */
    public String             cardleng;
    /**
     * 银行号
     */
    public String             bankno;

    /**
     * @return the bankno
     */
    public String getBankno() {
        return bankno;
    }

    /**
     * bankno.
     * 
     * @param bankno
     *            the bankno to set
     * @since JDK 1.6 PayTACard
     */
    public void setBankno(String bankno) {
        this.bankno = bankno;
    }

    /**
     * @return the bankname
     */
    public String getBankname() {
        return bankname;
    }

    /**
     * bankname.
     * 
     * @param bankname
     *            the bankname to set
     * @since JDK 1.6 PayTACard
     */
    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    /**
     * @return the provinceid
     */
    public String getProvinceid() {
        return provinceid;
    }

    /**
     * provinceid.
     * 
     * @param provinceid
     *            the provinceid to set
     * @since JDK 1.6 PayTACard
     */
    public void setProvinceid(String provinceid) {
        this.provinceid = provinceid;
    }

    /**
     * @return the provincename
     */
    public String getProvincename() {
        return provincename;
    }

    /**
     * provincename.
     * 
     * @param provincename
     *            the provincename to set
     * @since JDK 1.6 PayTACard
     */
    public void setProvincename(String provincename) {
        this.provincename = provincename;
    }

    /**
     * @return the cityid
     */
    public String getCityid() {
        return cityid;
    }

    /**
     * cityid.
     * 
     * @param cityid
     *            the cityid to set
     * @since JDK 1.6 PayTACard
     */
    public void setCityid(String cityid) {
        this.cityid = cityid;
    }

    /**
     * @return the cityname
     */
    public String getCityname() {
        return cityname;
    }

    /**
     * cityname.
     * 
     * @param cityname
     *            the cityname to set
     * @since JDK 1.6 PayTACard
     */
    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    /**
     * @return the bankbranchname
     */
    public String getBankbranchname() {
        return bankbranchname;
    }

    /**
     * bankbranchname.
     * 
     * @param bankbranchname
     *            the bankbranchname to set
     * @since JDK 1.6 PayTACard
     */
    public void setBankbranchname(String bankbranchname) {
        this.bankbranchname = bankbranchname;
    }

    /**
     * @return the cardtype
     */
    public String getCardtype() {
        return cardtype;
    }

    /**
     * cardtype.
     * 
     * @param cardtype
     *            the cardtype to set
     * @since JDK 1.6 PayTACard
     */
    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
    }

    /**
     * @return the bankid
     */
    public String getBankid() {
        return bankid;
    }

    /**
     * bankid.
     * 
     * @param bankid
     *            the bankid to set
     * @since JDK 1.6 PayTACard
     */
    public void setBankid(String bankid) {
        this.bankid = bankid;
    }

    /**
     * @return the bankbranchid
     */
    public String getBankbranchid() {
        return bankbranchid;
    }

    /**
     * bankbranchid.
     * 
     * @param bankbranchid
     *            the bankbranchid to set
     * @since JDK 1.6 PayTACard
     */
    public void setBankbranchid(String bankbranchid) {
        this.bankbranchid = bankbranchid;
    }

    /**
     * @return the cardno
     */
    public String getCardno() {
        return cardno;
    }

    /**
     * cardno.
     * 
     * @param cardno
     *            the cardno to set
     * @since JDK 1.6 PayTACard
     */
    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    /**
     * @return the cardleng
     */
    public String getCardleng() {
        return cardleng;
    }

    /**
     * cardleng.
     * 
     * @param cardleng
     *            the cardleng to set
     * @since JDK 1.6 PayTACard
     */
    public void setCardleng(String cardleng) {
        this.cardleng = cardleng;
    }

}
