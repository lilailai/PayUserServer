/**
 *  <pre>	
 *  Project Name :PayUserServer .</br>
 *  File : Paylcacct.java .</br>
 *  Package Name :com.imobpay.base.entity .</br>
 *  Date      Author       Changes .</br>
 *  2016年6月2日   Lance.Wu     Create  .</br>
 *  Description : .</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.entity;

/**
 * <pre>
 * ClassName : Paylcacct <br/> 
 * date : 20160614 050620 <br/> 
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public class Paylcacct extends BaseEntity {

    /** 序号 */
    private static final long serialVersionUID = 1L;

    /** 属性描述：创建时间 */
    private String            createtime;
    /** 属性描述：创建日期 */
    private String            createdate;
    /** 属性描述：待收本金 */
    private Integer           pendingamt;
    /** 属性描述：状态 */
    private String            status;
    /** 属性描述：理财本金 */
    private Integer           baseamt;
    /** 属性描述：客户编码 */
    private String            customerid;

    /**
     * 描述：获取属性值-null .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCreatetime() {
        return createtime;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param createtime :null 设置值. <br/>
     */
    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    /**
     * 描述：获取属性值-null .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCreatedate() {
        return createdate;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param createdate :null 设置值. <br/>
     */
    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    /**
     * 描述：获取属性值-null .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getPendingamt() {
        return pendingamt;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param pendingamt :null 设置值. <br/>
     */
    public void setPendingamt(Integer pendingamt) {
        this.pendingamt = pendingamt;
    }

    /**
     * 描述：获取属性值-null .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getStatus() {
        return status;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param status :null 设置值. <br/>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 描述：获取属性值-null .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getBaseamt() {
        return baseamt;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param baseamt :null 设置值. <br/>
     */
    public void setBaseamt(Integer baseamt) {
        this.baseamt = baseamt;
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
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param customerid :null 设置值. <br/>
     */
    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

}