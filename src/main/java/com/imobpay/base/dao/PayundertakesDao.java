/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: Payundertakes.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date      Author       Changes .</br>
 *  20160617 030632 <br/>   Lance.Wu     Create  .</br>
 *  Description: .</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.dao;

import com.imobpay.base.entity.Payundertakes;
import com.imobpay.base.iface.BaseDao;

/**
 * 
 * ClassName: PayundertakesDao <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason: TODO ADD REASON(可选). <br/> 
 * date: 2016年6月22日 下午2:18:22 <br/> 
 * 
 * @author madman
 * @param  <T> 伐型参数
 * @version @param <T>  参数
 * @since JDK 1.6 PayUserServer 1.0
 */
public interface PayundertakesDao<T> extends BaseDao<T> {
    /**
    * 查询机构是否在注册白名单返回之内
    * selByBranchIdReg:(这里用一句话描述这个方法的作用). <br/> 
    * TODO(这里描述这个方法的注意事项 – 可选).<br/> 
    * 
    * @author madman
    * @param bean 参数
    * @return
    * @return 返回结果：Integer
    * @since JDK 1.6 PayUserServer 1.0
    */
    public Integer selByBranchIdReg(Payundertakes bean);
}