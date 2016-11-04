/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: PrepPersonalinfo.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date      Author       Changes .</br>
 *  20160614 050646 <br/>   Lance.Wu     Create  .</br>
 *  Description: .</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.dao;

import com.imobpay.base.entity.PrepPersonalinfo;
import com.imobpay.base.iface.BaseDao;

/**
 * <pre>
 * ClassName: PrepPersonalinfoDao <br/> 
 * date: 20160614 050646 <br/> 
 * @param <T>
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public interface PrepPersonalinfoDao<T> extends BaseDao<T> {

    /**
     * 
     * 方法名： insertInitial.<br/>
     * 方法作用:添加初始信息.<br/>
     *
     * 创建者：HuaiYu.Wen.<br/>
     * 创建日期：2016年8月15日.<br/>
     * 创建时间：上午10:49:26.<br/>
     * 参数者异常：@param bean .<br/>
     * 返回值：返回类型：void.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void insertInitial(PrepPersonalinfo bean);

    /**
     * 
     * 方法名： imgUpdatePersonalInfo.<br/>
     * 方法作用:如果用户信息存在，更新用户信息.<br/>
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年9月1日.<br/>
     * 创建时间：下午2:03:23.<br/>
     * 参数或者异常：@param bean .<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void imgUpdatePersonalInfo(PrepPersonalinfo bean);

    /**
     * 
     * 方法名： imgUpdatePersonalInfo.<br/>
     * 方法作用:如果用户信息存在，更新用户信息.<br/>
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年9月1日.<br/>
     * 创建时间：下午2:03:23.<br/>
     * 参数或者异常：@param bean .<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void imgUpdatePhotoStatus(PrepPersonalinfo bean);

}