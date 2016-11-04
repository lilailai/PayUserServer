/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: Payloginfo.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date      Author       Changes .</br>
 *  20160614 050625 <br/>   Lance.Wu     Create  .</br>
 *  Description: .</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.dao;

import java.util.List;
import com.imobpay.base.entity.Payloginfo;

/**
 * <pre>
 * ClassName: Payloginfo <br/> 
 * date: 20160614 050625 <br/> 
 * 
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public interface PayloginfoDao {

    /**
     * insert:(添加操作). <br/>
     * 
     * @author Lance.Wu <br/>
     * @param bean
     *            添加对像 <br/>
     * @since JDK 1.6 1.0 <br/>
     */
    public void insert(Payloginfo bean);

    /**
     * update:(修改操作). <br/>
     * 
     * @author Lance.Wu <br/>
     * @param bean
     *            修改对像 <br/>
     * @since JDK 1.6 1.0 <br/>
     */
    public void update(Payloginfo bean);

    /**
     * delete:(删除操作). <br/>
     * 
     * @author Lance.Wu <br/>
     * @param bean
     *            删除对像 <br/>
     * @since JDK 1.6 1.0 <br/>
     */
    public void delete(Payloginfo bean);

    /**
     * delete:(查询操作). <br/>
     * 
     * @author Lance.Wu <br/>
     * @param bean
     *            查询对像 <br/>
     * @return Payloginfo <br/>
     * @since JDK 1.6 1.0 <br/>
     */
    public Payloginfo selectById(Payloginfo bean);

    /**
     * delete:(分页查询操作). <br/>
     * 
     * @author Lance.Wu <br/>
     * @param bean
     *            查询对像 <br/>
     * @return List<Payloginfo> <br/>
     * @since JDK 1.6 1.0 <br/>
     */
    public List<Payloginfo> list(Payloginfo bean);

    /**
     * delete:(分页查询个数操作). <br/>
     * 
     * @author Lance.Wu <br/>
     * @param bean
     *            查询对像 <br/>
     * @return Integer <br/>
     * @since JDK 1.6 1.0 <br/>
     */
    public Integer listCount(Payloginfo bean);

}