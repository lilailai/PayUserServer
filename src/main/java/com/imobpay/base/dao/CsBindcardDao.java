/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: CsBindcard.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date      Author       Changes .</br>
 *  20160809 110833 <br/>   Lance.Wu     Create  .</br>
 *  Description: .</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.dao;

import com.imobpay.base.entity.CsBindcard;
import com.imobpay.base.iface.BaseDao;

/**
 * <pre>
 * ClassName: CsBindcard <br/> 
 * date: 20160809 110833 <br/> 
 * @param <T> CsBindcard 对象
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public interface CsBindcardDao<T> extends BaseDao<T> {

    /**
     * 
     * 方法名： insertCopyCard.<br/>
     * 方法作用:将当前用户的提现卡插入到备份表.<br/>
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月30日.<br/>
     * 创建时间：下午3:48:11.<br/>
     * 参数或者异常@param bean .<br/>
     * 参数或者异常： .<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void insertCopyCard(CsBindcard bean);

    /**
     * 
     * 方法名： deleteCard.<br/>
     * 方法作用:删除已备份的提现卡.<br/>
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月30日.<br/>
     * 创建时间：下午3:46:25.<br/>
     * 参数或者异常： .<br/>
     * 参数或者异常@param bean .<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void deleteCard(CsBindcard bean);

    /**
     * 
     * 方法名： updateCardStatus.<br/>
     * 方法作用:更新提现卡状态1：成功 0：无效 3：审核中.<br/>
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月30日.<br/>
     * 创建时间：下午3:46:25.<br/>
     * 参数或者异常： .<br/>
     * 参数或者异常@param bean .<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void updateCardStatus(CsBindcard bean);
}