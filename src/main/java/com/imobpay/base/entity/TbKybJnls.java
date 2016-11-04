/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: TbKybJnls.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date      Author       Changes .</br>
 *  2016年6月2日   Lance.Wu     Create  .</br>
 *  Description: .</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.entity;

/**
 * <pre>
 * ClassName: TbKybJnls <br/> 
 * date: 20160617 040645 <br/> 
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public class TbKybJnls extends BaseEntity {

    /** 序号 */
    private static final long serialVersionUID = 1L;

    /** 属性描述：服务编码  */
    private String            servcode;
    /** 属性描述：交易类型 1：卡券收入 2：卡券支出  */
    private String            ptype;
    /** 属性描述：null  */
    private String            customerid;
    /** 属性描述：null  */
    private String            username;
    /** 属性描述：null  */
    private String            mobileno;
    /** 属性描述：null  */
    private String            msgtxt;
    /** 属性描述：null  */
    private String            branchid;
    /** 属性描述：null  */
    private String            msgcode;
    /** 属性描述：优惠券  */
    private String            promotionamt;
    /** 属性描述：null  */
    private String            locallogno;
    /** 属性描述：null  */
    private String            localtime;
    /** 属性描述：null  */
    private String            localdate;

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
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param servcode :服务编码  设置值. <br/>
     */
    public void setServcode(String servcode) {
        this.servcode = servcode;
    }

    /**
     * 描述：获取属性值-交易类型 1：卡券收入 2：卡券支出 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getPtype() {
        return ptype;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param ptype :交易类型 1：卡券收入 2：卡券支出  设置值. <br/>
     */
    public void setPtype(String ptype) {
        this.ptype = ptype;
    }

    /**
     * 描述：获取属性值-null .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCustomerid() {
        return customerid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param customerid :null  设置值. <br/>
     */
    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    /**
     * 描述：获取属性值-null .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getUsername() {
        return username;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param username :null  设置值. <br/>
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 描述：获取属性值-null .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getMobileno() {
        return mobileno;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param mobileno :null  设置值. <br/>
     */
    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    /**
     * 描述：获取属性值-null .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getMsgtxt() {
        return msgtxt;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param msgtxt :null  设置值. <br/>
     */
    public void setMsgtxt(String msgtxt) {
        this.msgtxt = msgtxt;
    }

    /**
     * 描述：获取属性值-null .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getBranchid() {
        return branchid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param branchid :null  设置值. <br/>
     */
    public void setBranchid(String branchid) {
        this.branchid = branchid;
    }

    /**
     * 描述：获取属性值-null .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getMsgcode() {
        return msgcode;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param msgcode :null  设置值. <br/>
     */
    public void setMsgcode(String msgcode) {
        this.msgcode = msgcode;
    }

    /**
     * 描述：获取属性值-优惠券 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getPromotionamt() {
        return promotionamt;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param promotionamt :优惠券  设置值. <br/>
     */
    public void setPromotionamt(String promotionamt) {
        this.promotionamt = promotionamt;
    }

    /**
     * 描述：获取属性值-null .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getLocallogno() {
        return locallogno;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param locallogno :null  设置值. <br/>
     */
    public void setLocallogno(String locallogno) {
        this.locallogno = locallogno;
    }

    /**
     * 描述：获取属性值-null .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getLocaltime() {
        return localtime;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param localtime :null  设置值. <br/>
     */
    public void setLocaltime(String localtime) {
        this.localtime = localtime;
    }

    /**
     * 描述：获取属性值-null .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getLocaldate() {
        return localdate;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param localdate :null  设置值. <br/>
     */
    public void setLocaldate(String localdate) {
        this.localdate = localdate;
    }

}