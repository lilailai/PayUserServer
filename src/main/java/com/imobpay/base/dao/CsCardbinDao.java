/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: CsCardbin.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date      Author       Changes .</br>
 *  20160827 050805 <br/>   Lance.Wu     Create  .</br>
 *  Description: .</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.dao;

import com.imobpay.base.entity.CsBinBankInfo;
import com.imobpay.base.iface.BaseDao;

/**
 * <pre>
 * ClassName: CsCardbin <br/> 
 * date: 20160827 050805 <br/> 
 * @param <T> 对象
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public interface CsCardbinDao<T> extends BaseDao<T> {
    /**
     * 
     * selectByCardLen:(这里用一句话描述这个方法的作用). <br/>
     * TODO(这里描述这个方法适用条件 – 可选).<br/>
     * TODO(这里描述这个方法的注意事项 – 可选).<br/>
     * 
     * @author madman
     * @param csBinBankInfo
     *            实体类
     * @return
     * @return 返回结果：CsBinBankInfo
     * @since JDK 1.6 PayTACard 1.0
     */
    public CsBinBankInfo selectByCardLen(CsBinBankInfo csBinBankInfo);

    /**
     * 
     * selectBranckBank:(获取银行信息). <br/>
     * 
     * @author madman
     * @param csBinBankInfo
     *            请求参数
     * @return 返回结果：CsBinBankInfo 请求参数
     * @since JDK 1.6 PayTACard 1.0
     */
    public CsBinBankInfo selectBranckBank(CsBinBankInfo csBinBankInfo);

    /**
     * 
     * selectPayBankNo:(判断银行是否在18家银行之内). <br/>
     * 
     * @author madman
     * @param bankno
     *            银行号
     * @return int 返回结果
     * @since JDK 1.6 PayTACard 1.0
     */
    public int selectPayBankNo(String bankno);

}