/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: TbCustFunctionPermission.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date          			Author      Changes .</br>
 *  20160729 100754    Lance.Wu     Create  .</br>
 *  Description: 当前类是通过工具生成的.</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.entity;

/**
 * <pre>
 * ClassName: TbCustFunctionPermission <br/> 
 * date: 20160729 100754 <br/> 
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public class TbCustFunctionPermission extends BaseEntity {

    /** 序号 */
    private static final long serialVersionUID = 1L;

    /** 属性描述：权限内容，0--所有权限，其他---对应的编码，如产品ID等 */
    private String functionValue;
    /** 属性描述：功能名称 */
    private String functionName;
    /** 属性描述：有效标志：1---有效  2--无效 */
    private String status;
    /** 属性描述：客户ID */
    private String customerid;
    /** 属性描述： */
    private Integer id;

    /**
     * 描述：获取属性值-权限内容，0--所有权限，其他---对应的编码，如产品ID等.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getFunctionValue() {
        return functionValue;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param functionValue :权限内容，0--所有权限，其他---对应的编码，如产品ID等 设置值. <br/>
     */
    public void setFunctionValue(String functionValue) {
        this.functionValue = functionValue;
    }

    /**
     * 描述：获取属性值-功能名称.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getFunctionName() {
        return functionName;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param functionName :功能名称 设置值. <br/>
     */
    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * 描述：获取属性值-有效标志：1---有效  2--无效.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getStatus() {
        return status;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param status :有效标志：1---有效  2--无效 设置值. <br/>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 描述：获取属性值-客户ID.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCustomerid() {
        return customerid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param customerid :客户ID 设置值. <br/>
     */
    public void setCustomerid(String customerid) {
        this.customerid = customerid;
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