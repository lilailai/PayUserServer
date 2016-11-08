/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: TbvCustomer.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date      Author       Changes .</br>
 *  20160827 100810 <br/>   Lance.Wu     Create  .</br>
 *  Description: .</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.dao;

import com.imobpay.base.entity.TbvCusSecurity;
import com.imobpay.base.iface.BaseDao;

/**
 * <pre>
 * ClassName: TbvCustomer <br/> 
 * date: 20160827 100810 <br/> 
 * @param <T> 对象
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public interface TbvCustomerDao<T> extends BaseDao<T> {
    /**
     * 
     * selectCusSecurity:(查询用户密码). <br/>
     * 
     * @author madman
     * @param tbvCusSecurity
     *            参数
     * @return
     * @return 返回结果：TbvCusSecurity
     * @since JDK 1.6 PayTACard 1.0
     */
    public TbvCusSecurity selectCusSecurity(TbvCusSecurity tbvCusSecurity);

    /**
     * 
     * selectCusByMobOrTa:(判断手机号或TA卡是否使用). <br/>
     * 
     * @author madman
     * @param tbvCusSecurity
     *            参数
     * @return
     * @return 返回结果：int
     * @since JDK 1.6 PayTACard 1.0
     */
    public int selectCusByMobOrTa(TbvCusSecurity tbvCusSecurity);
    
    
    
    /**
     * 
     * selectByTid:(). <br/> 
     * TODO(获取序列ID).<br/> 
     * 
     * @author madman
     * @return
     * @return 返回结果：String
     * @since JDK 1.6 PayTACard 1.0
     */
    public String selectByTid();
    
    
    
    
    
    

}