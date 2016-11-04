/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: TbKybJnls.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date      Author       Changes .</br>
 *  20160617 040645 <br/>   Lance.Wu     Create  .</br>
 *  Description: .</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.dao;

import java.util.List;

import com.imobpay.base.entity.TbKybJnls;

/**
 * <pre>
 * ClassName: TbKybJnls <br/> 
 * date: 20160617 040645 <br/> 
 * 
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public interface TbKybJnlsDao {

    /**
    * insert:(添加操作). <br/> 
    * @author Lance.Wu  <br/>
    * @param bean  添加对像 <br/>
    * @since JDK 1.6  1.0  <br/>
    */
    public void insert(TbKybJnls bean);

    /**
    * update:(修改操作). <br/> 
    * @author Lance.Wu  <br/>
    * @param bean  修改对像 <br/>
    * @since JDK 1.6  1.0  <br/>
    */
    public void update(TbKybJnls bean);

    /**
    * delete:(删除操作). <br/> 
    * @author Lance.Wu  <br/>
    * @param bean  删除对像 <br/>
    * @since JDK 1.6  1.0  <br/>
    */
    public void delete(TbKybJnls bean);

    /**
    * delete:(查询操作). <br/> 
    * @author Lance.Wu  <br/>
    * @param bean  查询对像 <br/>
    * @return TbKybJnls <br/>
    * @since JDK 1.6  1.0  <br/>
    */
    public TbKybJnls selectById(TbKybJnls bean);

    /**
    * delete:(分页查询操作). <br/> 
    * @author Lance.Wu  <br/>
    * @param bean  查询对像 <br/>
    * @return List<TbKybJnls> <br/>
    * @since JDK 1.6  1.0  <br/>
    */
    public List<TbKybJnls> list(TbKybJnls bean);

    /**
    * delete:(分页查询个数操作). <br/> 
    * @author Lance.Wu  <br/>
    * @param bean  查询对像 <br/>
    * @return Integer <br/>
    * @since JDK 1.6  1.0  <br/>
    */
    public Integer listCount(TbKybJnls bean);

}