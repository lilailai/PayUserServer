/** 
 * 包名: package com.imobpay.base.services.impl; <br/> 
 * 添加时间: 2016年8月25日 下午3:13:37 <br/> 
 */
/**
 *  Project Name:PayUserServer
 *  File: ServicesGetId.java
 *  Package Name:com.imobpay.base.services.impl
 *  <P>
 *  创建时间     创建者              修改记录
 *  2016年8月25日   张朝辉     Create
 *  </p>
 *  <p>File Description :  this Class dosome </p>
 *  Description:
 *  Copyright 2014-2015 QIANTUO FINANCE Services Co.,Ltd. All rights reserved.
 */
package com.imobpay.base.services.impl;

import javax.annotation.Resource;

import com.imobpay.base.dao.TbGlbSysParamDao;
import com.imobpay.base.entity.TbGlbSysParam;
import com.imobpay.base.util.Format;

/** 
 * 类名: ServicesGetId <br/> 
 * 作用：获取各种参数id<br/> 
 * 创建者: 张朝辉. <br/> 
 * 添加时间: 2016年8月25日 下午3:13:37 <br/> 
 * 版本： 
 * @since JDK 1.6 PayUserServer 1.0
 */
public class ServicesGetId {

    /** 查询参数表 */
    @Resource
    TbGlbSysParamDao<TbGlbSysParam> tbGlbSysParamDao;
    /** 定义登录key */
    public static String loginId = "";

    /**
     * 
     * 方法名： getloginId.<br/>
     * 方法作用:获取登录id.<br/>
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月25日.<br/>
     * 创建时间：下午2:39:03.<br/>
     * 参数或者异常： .<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void getloginId() {
        loginId = tbGlbSysParamDao.getSqueId() + Format.getTwoRand();
    }

}
