/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: Paycustomer.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date      Author       Changes .</br>
 *  20160614 050606 <br/>   Lance.Wu     Create  .</br>
 *  Description: .</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.dao;

import com.imobpay.base.entity.Paycustomer;
import com.imobpay.base.iface.BaseDao;

/**
 * <pre>
 * ClassName: PaycustomerDao <br/> 
 * date: 20160614 050606 <br/> 
 * @param <T>
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public interface PaycustomerDao<T> extends BaseDao<T> {

    /**
     * 查询新用户序列
     * selectBySeq:(这里用一句话描述这个方法的作用). <br/> 
     * 
     * @author madman
     * @return
     * @return 返回结果：String
     * @since JDK 1.6 PayUserServer 1.0
     */
    public String selectBySeq();

    /**
     * 
     * 方法名： updEnteringPidInfo.<br/>
     * 方法作用:更新客户表中身份证信息 .<br/>
     *
     * 创建者：HuaiYu.Wen.<br/>
     * 创建日期：2016年8月9日.<br/>
     * 创建时间：下午4:16:38.<br/>
     * 参数者异常：@param paycustomer .<br/>
     * 返回值：返回类型：void.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void updEnteringPidInfo(Paycustomer paycustomer);

    /**
     * 
     * 方法名： updateCustomerTag.<br/>
     * 方法作用:更新当前客户的customertag为0.<br/>
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月11日.<br/>
     * 创建时间：下午12:11:02.<br/>
     * 参数或者异常：@param paycustomer .<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void updateCustomerTag(Paycustomer paycustomer);

    /***
     * 
     * 方法名： updateVerifyUser.<br/>
     * 方法作用:将当前存量用户更新为已认证用户.<br/>
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月30日.<br/>
     * 创建时间：下午1:05:17.<br/>
     * 参数或者异常：@param paycustomer .<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void updateVerifyUser(Paycustomer paycustomer);

}