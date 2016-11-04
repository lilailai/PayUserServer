/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: PrepAdvancedVip.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date      Author       Changes .</br>
 *  20160809 090829 <br/>   Lance.Wu     Create  .</br>
 *  Description: .</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.dao;

import com.imobpay.base.entity.PrepAdvancedVip;
import com.imobpay.base.iface.BaseDao;

/**
 * <pre>
 * ClassName: PrepAdvancedVip <br/> 
 * date: 20160809 090829 <br/> 
 * @param <T> PrepAdvancedVip 对象
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public interface PrepAdvancedVipDao<T> extends BaseDao<T> {

    /**
     * 
     * 方法名： updateCreditCardStatus.<br/>
     * 方法作用:将当前用户的信用卡更新.<br/>
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月30日.<br/>
     * 创建时间：下午3:39:38.<br/>
     * 参数或者异常：@param prepAdvancedVip .<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void updateCreditCardStatus(PrepAdvancedVip prepAdvancedVip);

}