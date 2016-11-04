/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: TbValBwWhitelist.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date      Author       Changes .</br>
 *  20160617 010630 <br/>   Lance.Wu     Create  .</br>
 *  Description: .</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.dao;

import java.util.List;

import com.imobpay.base.entity.TbValBwWhitelist;

/**
 * <pre>
 * ClassName: TbValBwWhitelist <br/> 
 * date: 20160617 010630 <br/> 
 * 
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public interface TbValBwWhitelistDao {

    /**
    * insert:(添加操作). <br/> 
    * @author Lance.Wu  <br/>
    * @param bean  添加对像 <br/>
    * @since JDK 1.6  1.0  <br/>
    */
    public void insert(TbValBwWhitelist bean);

    /**
    * update:(修改操作). <br/> 
    * @author Lance.Wu  <br/>
    * @param bean  修改对像 <br/>
    * @since JDK 1.6  1.0  <br/>
    */
    public void update(TbValBwWhitelist bean);

    /**
    * delete:(删除操作). <br/> 
    * @author Lance.Wu  <br/>
    * @param bean  删除对像 <br/>
    * @since JDK 1.6  1.0  <br/>
    */
    public void delete(TbValBwWhitelist bean);

    /**
    * delete:(查询操作). <br/> 
    * @author Lance.Wu  <br/>
    * @param bean  查询对像 <br/>
    * @return TbValBwWhitelist <br/>
    * @since JDK 1.6  1.0  <br/>
    */
    public TbValBwWhitelist selectById(TbValBwWhitelist bean);

    /**
    * delete:(分页查询操作). <br/> 
    * @author Lance.Wu  <br/>
    * @param bean  查询对像 <br/>
    * @return List<TbValBwWhitelist> <br/>
    * @since JDK 1.6  1.0  <br/>
    */
    public List<TbValBwWhitelist> list(TbValBwWhitelist bean);

    /**
    * delete:(分页查询个数操作). <br/> 
    * @author Lance.Wu  <br/>
    * @param bean  查询对像 <br/>
    * @return Integer <br/>
    * @since JDK 1.6  1.0  <br/>
    */
    public Integer listCount(TbValBwWhitelist bean);

}