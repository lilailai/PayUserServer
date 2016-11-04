/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: TbCardBusinessLimit.java .</br>
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
 * ClassName: TbCardBusinessLimit <br/> 
 * date: 20160617 110613 <br/> 
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public class TbCardBusinessLimit extends BaseEntity {

    /** 序号 */
    private static final long serialVersionUID = 1L;

    /** 属性描述：状态 (1有效，0无效)  */
    private String            status;
    /** 属性描述：状态时间  */
    private String            statusTime;
    /** 属性描述：交易类型: 1手机充值 2流量卡充值 3个人信息完善4个人实名认证图片信息上传手机号段限制（个人和商户）  */
    private String            transType;
    /** 属性描述：限制码  */
    private String            transNo;
    /**
     * 手机号前三位截取
     */
    private String            transNoSub;

    /** 
     * 方法名： getTransNoSub.<br/>
     *
     * 返回值：@return 返回值 
     *
     * 创建者：madman.<br/>
     * 创建日期：2016年6月17日.<br/>
     * 创建时间：上午11:31:21.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public String getTransNoSub() {
        return transNoSub;
    }

    /** 
     * 方法名： setTransNoSub.<br/>
     * 参数： @param transNoSub 设置值
     *
     * 创建者：madman.<br/>
     * 创建日期：2016年6月17日.<br/>
     * 创建时间：上午11:31:21.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void setTransNoSub(String transNoSub) {
        this.transNoSub = transNoSub;
    }

    /**
     * 描述：获取属性值-状态 (1有效，0无效) .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getStatus() {
        return status;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param status :状态 (1有效，0无效)  设置值. <br/>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 描述：获取属性值-状态时间 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getStatusTime() {
        return statusTime;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param statusTime :状态时间  设置值. <br/>
     */
    public void setStatusTime(String statusTime) {
        this.statusTime = statusTime;
    }

    /**
     * 描述：获取属性值-交易类型: 1手机充值 2流量卡充值 3个人信息完善4个人实名认证图片信息上传手机号段限制（个人和商户） .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getTransType() {
        return transType;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param transType :交易类型: 1手机充值 2流量卡充值 3个人信息完善4个人实名认证图片信息上传手机号段限制（个人和商户）  设置值. <br/>
     */
    public void setTransType(String transType) {
        this.transType = transType;
    }

    /**
     * 描述：获取属性值-限制码 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getTransNo() {
        return transNo;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param transNo :限制码  设置值. <br/>
     */
    public void setTransNo(String transNo) {
        this.transNo = transNo;
    }

}