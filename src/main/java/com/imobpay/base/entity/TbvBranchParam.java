/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: TbvBranchParam.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date          			Author      Changes .</br>
 *  20160923 100957    Lance.Wu     Create  .</br>
 *  Description: 当前类是通过工具生成的.</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.entity;

/**
 * <pre>
 * ClassName: TbvBranchParam <br/> 
 * date: 20160923 100957 <br/> 
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public class TbvBranchParam extends BaseEntity {

    /** 序号 */
    private static final long serialVersionUID = 1L;

    /** 属性描述：票的url */
    private String            ticketUrl;
    /** 属性描述： tokenUrl */
    private String            tokenUrl;
    /** 属性描述： 创建时间 */
    private String            createtime;
    /** 属性描述： token */
    private String            token;
    /** 属性描述：机构号 */
    private String            branchid;
    /** 属性描述：票 */
    private String            ticket;
    /** 属性描述：状态 */
    private String            status;
    /** 属性描述：公众号 */
    private String            pubaccount;
    /** 属性描述：appid */
    private String            appid;
    /** 属性描述：密钥 */
    private String            secret;
    /** 属性描述：描述 */
    private String            tadesc;
    /** 属性描述：描述 */
    private String            taurl;

    /**
     * 描述：获取属性值.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return taurl .<br/>
     */
    public String getTaurl() {
        return taurl;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年9月27日 上午9:54:27 <br/>
     * 参数: @param taurl 设置值. <br/>
     */
    public void setTaurl(String taurl) {
        this.taurl = taurl;
    }

    /**
     * 描述：获取属性值.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return appid .<br/>
     */
    public String getAppid() {
        return appid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年9月26日 下午4:16:34 <br/>
     * 参数: @param appid 设置值. <br/>
     */
    public void setAppid(String appid) {
        this.appid = appid;
    }

    /**
     * 描述：获取属性值.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return secret .<br/>
     */
    public String getSecret() {
        return secret;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年9月26日 下午4:16:34 <br/>
     * 参数: @param secret 设置值. <br/>
     */
    public void setSecret(String secret) {
        this.secret = secret;
    }

    /**
     * 描述：获取属性值.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return tadesc .<br/>
     */
    public String getTadesc() {
        return tadesc;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年9月26日 下午4:16:34 <br/>
     * 参数: @param tadesc 设置值. <br/>
     */
    public void setTadesc(String tadesc) {
        this.tadesc = tadesc;
    }

    /**
     * 描述：获取属性值.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return pubaccount .<br/>
     */
    public String getPubaccount() {
        return pubaccount;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年9月26日 上午10:35:05 <br/>
     * 参数: @param pubaccount 设置值. <br/>
     */
    public void setPubaccount(String pubaccount) {
        this.pubaccount = pubaccount;
    }

    /**
     * 描述：获取属性值.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return status .<br/>
     */
    public String getStatus() {
        return status;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年9月26日 上午10:13:59 <br/>
     * 参数: @param status 设置值. <br/>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getTicketUrl() {
        return ticketUrl;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param ticketUrl : 设置值. <br/>
     */
    public void setTicketUrl(String ticketUrl) {
        this.ticketUrl = ticketUrl;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getTokenUrl() {
        return tokenUrl;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param tokenUrl : 设置值. <br/>
     */
    public void setTokenUrl(String tokenUrl) {
        this.tokenUrl = tokenUrl;
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
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getToken() {
        return token;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param token : 设置值. <br/>
     */
    public void setToken(String token) {
        this.token = token;
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
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getTicket() {
        return ticket;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param ticket : 设置值. <br/>
     */
    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

}