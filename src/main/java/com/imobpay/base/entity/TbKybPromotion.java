/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: TbKybPromotion.java .</br>
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
 * ClassName: TbKybPromotion <br/> 
 * date: 20160617 040608 <br/> 
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public class TbKybPromotion extends BaseEntity {

    /** 序号 */
    private static final long serialVersionUID = 1L;

    /** 属性描述：可用优惠金额  */
    private Integer           availamt;
    /** 属性描述：优惠券金额  */
    private Integer           totalamt;
    /** 属性描述：时间戳  */
    private String            inserttime;
    /** 属性描述：激活状态 1: 已激活 0: 未激活  */
    private String            status;
    /** 属性描述：null  */
    private String            customerid;

    /**
     * 描述：获取属性值-可用优惠金额 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getAvailamt() {
        return availamt;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param availamt :可用优惠金额  设置值. <br/>
     */
    public void setAvailamt(Integer availamt) {
        this.availamt = availamt;
    }

    /**
     * 描述：获取属性值-优惠券金额 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getTotalamt() {
        return totalamt;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param totalamt :优惠券金额  设置值. <br/>
     */
    public void setTotalamt(Integer totalamt) {
        this.totalamt = totalamt;
    }

    /**
     * 描述：获取属性值-时间戳 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getInserttime() {
        return inserttime;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param inserttime :时间戳  设置值. <br/>
     */
    public void setInserttime(String inserttime) {
        this.inserttime = inserttime;
    }

    /**
     * 描述：获取属性值-激活状态 1: 已激活 0: 未激活 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getStatus() {
        return status;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param status :激活状态 1: 已激活 0: 未激活  设置值. <br/>
     */
    public void setStatus(String status) {
        this.status = status;
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

}