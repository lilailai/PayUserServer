/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: TbGlbSysParam.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date          			Author      Changes .</br>
 *  20160809 030848    Lance.Wu     Create  .</br>
 *  Description: 当前类是通过工具生成的.</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.entity;

/**
 * <pre>
 * ClassName: TbGlbSysParam <br/> 
 * date: 20160809 030848 <br/> 
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public class TbGlbSysParam extends BaseEntity {

    /** 序号 */
    private static final long serialVersionUID = 1L;

    /** 属性描述：排序编号 */
    private Integer orderbyseq;
    /** 属性描述：使用系统 */
    private String usesys;
    /** 属性描述：状态:1可用，0不可用 */
    private String status;
    /** 属性描述：参数描述 */
    private String paramDesc;
    /** 属性描述：参数名称 */
    private String paramName;
    /** 属性描述：参数值 */
    private String paramValue;

    /**
     * 描述：获取属性值-排序编号.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getOrderbyseq() {
        return orderbyseq;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param orderbyseq :排序编号 设置值. <br/>
     */
    public void setOrderbyseq(Integer orderbyseq) {
        this.orderbyseq = orderbyseq;
    }

    /**
     * 描述：获取属性值-使用系统.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getUsesys() {
        return usesys;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param usesys :使用系统 设置值. <br/>
     */
    public void setUsesys(String usesys) {
        this.usesys = usesys;
    }

    /**
     * 描述：获取属性值-状态:1可用，0不可用.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getStatus() {
        return status;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param status :状态:1可用，0不可用 设置值. <br/>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 描述：获取属性值-参数描述.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getParamDesc() {
        return paramDesc;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param paramDesc :参数描述 设置值. <br/>
     */
    public void setParamDesc(String paramDesc) {
        this.paramDesc = paramDesc;
    }

    /**
     * 描述：获取属性值-参数名称.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getParamName() {
        return paramName;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param paramName :参数名称 设置值. <br/>
     */
    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    /**
     * 描述：获取属性值-参数值.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getParamValue() {
        return paramValue;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param paramValue :参数值 设置值. <br/>
     */
    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }

}