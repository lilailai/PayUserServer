/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: TbGlbSysParam.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date      Author       Changes .</br>
 *  20160809 030848 <br/>   Lance.Wu     Create  .</br>
 *  Description: .</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.dao;

import com.imobpay.base.iface.BaseDao;

/**
 * <pre>
 * ClassName: TbGlbSysParam <br/> 
 * date: 20160809 030848 <br/> 
 * @param <T> TbGlbSysParam 对象
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public interface TbGlbSysParamDao<T> extends BaseDao<T> {

    /**
     * 
     * 方法名： getSqueId.<br/>
     * 方法作用:查询登录需要机器需要id.<br/>
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月24日.<br/>
     * 创建时间：下午9:13:02.<br/>
     * 参数或者异常：@return int.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public int getSqueId();

}