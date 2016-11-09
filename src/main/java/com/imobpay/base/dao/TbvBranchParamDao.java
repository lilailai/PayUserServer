/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: TbvBranchParam.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date      Author       Changes .</br>
 *  20160923 100957 <br/>   Lance.Wu     Create  .</br>
 *  Description: .</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.dao;

import java.util.List;

import com.imobpay.base.iface.BaseDao;

/**
 * <pre>
 * ClassName: TbvBranchParam <br/> 
 * date: 20160923 100957 <br/> 
 * @param <T> 对象
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public interface TbvBranchParamDao<T> extends BaseDao<T> {
    /**
     * 
     * 【方法名】    : selectPublist. <br/> 
     * 【作用】: 查询需要更新的微信号.<br/> 
     * 【作者】: HuaiYu.Wen .<br/>
     * 【时间】： 2016年11月9日 上午9:51:44 .<br/>
     * 【参数】： .<br/>
     * @param bean 
     * @return .<br/>
     * <p>
     * 修改记录.<br/>
     * 修改人: HuaiYu.Wen 修改描述：创建新新件 .<br/>
     * <p/>
     */
    public List<T> selectPublist(T bean);
}