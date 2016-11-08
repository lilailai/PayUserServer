/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: TbvSecurity.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date      Author       Changes .</br>
 *  20160828 020843 <br/>   Lance.Wu     Create  .</br>
 *  Description: .</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.dao;

import com.imobpay.base.entity.TbvSecurity;
import com.imobpay.base.iface.BaseDao;

/**
 * <pre>
 * ClassName: TbvSecurity <br/> 
 * date: 20160828 020843 <br/> 
 * @param <T> 对象
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public interface TbvSecurityDao<T> extends BaseDao<T> {
    /***
     * 
     * updateCusSecurity:(). <br/>
     * TODO(定时更新密码错误三次的用户密码次数).<br/>
     * 
     * @author madman
     * @since JDK 1.6 PayTACard 1.0
     */
    public void updateCusSecurity();

    /**
     * 
     * updateCusSecCount:(用户密码错误次数添加1). <br/>
     * 
     * @author madman
     * @param tbvSecurity
     *            密码错误次数添加1
     * @since JDK 1.6 PayTACard 1.0
     */
    public void updateCusSecCount(TbvSecurity tbvSecurity);
}