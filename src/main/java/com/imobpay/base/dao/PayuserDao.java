/**
 *  <pre> 
 *  Project Name:PayUserServer .</br>
 *  File: Payuser.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date      Author       Changes .</br>
 *  20160614 050629 <br/>   Lance.Wu     Create  .</br>
 *  Description: .</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre> 
 */
package com.imobpay.base.dao;

import com.imobpay.base.entity.Payuser;
import com.imobpay.base.iface.BaseDao;

/**
 * 
 * ClassName: PayuserDao <br/> 
 * date: 2016年6月21日 上午11:01:01 <br/> 
 * @param <T> 用户对象
 * @author madman
 * @version @param <PayUser> 
 * @since JDK 1.6 PayUserServer 1.0
 */
public interface PayuserDao<T> extends BaseDao<T> {
    /**
     * 
      *@方法名称:selByBranchIdCount
      *@方法作用：判断用户有没有在配置的机构下面注册 如果注册了则不能注册其他的 但能注册配置里面的机构
      *@方法条件：
      *@方法流程：
      *@作者:madman 作者 注册标识 1是在机构下 0不在机构下
      * @param bean  传入对象
      *@return 返回结果
      *
     */
    public Integer selectByUserWhite(Payuser bean);

  
}