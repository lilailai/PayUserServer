/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: TbCustActivityRecord.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date          			Author      Changes .</br>
 *  20160920 110912    Lance.Wu     Create  .</br>
 *  Description: 当前类是通过工具生成的.</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.entity;

/**
 * <pre>
 * ClassName: TbCustActivityRecord <br/> 
 * date: 20160920 110912 <br/> 
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public class TbCustActivityRecord extends BaseEntity {

    /** 序号 */
    private static final long serialVersionUID = 1L;

    /** 属性描述： */
    private String createdate;
    /** 属性描述：客户ID */
    private String customerid;
    /** 属性描述：活动KEY    101--挽回流失客户 */
    private String activitykey;
    /** 属性描述：活动兑奖日期 */
    private String awardDate;
    /** 属性描述：活动开始日期 */
    private String activityBeginDate;
    /** 属性描述：活动结束日期 */
    private String activityEndDate;
    /** 属性描述：抽奖次数 */
    private Integer awardcount;
    /** 属性描述： */
    private String id;

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCreatedate() {
        return createdate;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param createdate : 设置值. <br/>
     */
    public void setCreatedate(String createdate) {
        this.createdate = createdate;
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
     * 描述：获取属性值-活动KEY    101--挽回流失客户.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getActivitykey() {
        return activitykey;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param activitykey :活动KEY    101--挽回流失客户 设置值. <br/>
     */
    public void setActivitykey(String activitykey) {
        this.activitykey = activitykey;
    }

    /**
     * 描述：获取属性值-活动兑奖日期.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getAwardDate() {
        return awardDate;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param awardDate :活动兑奖日期 设置值. <br/>
     */
    public void setAwardDate(String awardDate) {
        this.awardDate = awardDate;
    }

    /**
     * 描述：获取属性值-活动开始日期.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getActivityBeginDate() {
        return activityBeginDate;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param activityBeginDate :活动开始日期 设置值. <br/>
     */
    public void setActivityBeginDate(String activityBeginDate) {
        this.activityBeginDate = activityBeginDate;
    }

    /**
     * 描述：获取属性值-活动结束日期.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getActivityEndDate() {
        return activityEndDate;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param activityEndDate :活动结束日期 设置值. <br/>
     */
    public void setActivityEndDate(String activityEndDate) {
        this.activityEndDate = activityEndDate;
    }

    /**
     * 描述：获取属性值-抽奖次数.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getAwardcount() {
        return awardcount;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param awardcount :抽奖次数 设置值. <br/>
     */
    public void setAwardcount(Integer awardcount) {
        this.awardcount = awardcount;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getId() {
        return id;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param id : 设置值. <br/>
     */
    public void setId(String id) {
        this.id = id;
    }

}