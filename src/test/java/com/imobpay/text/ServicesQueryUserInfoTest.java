/** 
 * 包名: package com.imobpay.text; <br/> 
 * 添加时间: 2016年8月5日 上午11:13:44 <br/> 
 */
/**
 *  Project Name:PayUserServer
 *  File: ServicesQueryUserInfoTest.java
 *  Package Name:com.imobpay.text
 *  <P>
 *  创建时间     创建者              修改记录
 *  2016年8月5日   张朝辉     Create
 *  </p>
 *  <p>File Description :  this Class dosome </p>
 *  Description:
 *  Copyright 2014-2015 QIANTUO FINANCE Services Co.,Ltd. All rights reserved.
 */
package com.imobpay.text;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSONObject;
import com.imobpay.base.console.Console_Column;
import com.imobpay.base.console.Console_Server_Jym;
import com.imobpay.base.services.UserServer;

/** 
 * 类名: ServicesQueryUserInfoTest <br/> 
 * 作用：TODO(简单一句话描述)<br/> 
 * 方法：TODO(简单描述方法)<br/> 
 * 创建者: 张朝辉. <br/> 
 * 添加时间: 2016年8月5日 上午11:13:44 <br/> 
 * 版本： 
 * @since JDK 1.6 PayUserServer 1.0
 */
public class ServicesQueryUserInfoTest {
    
    static {
        String workdir = System.getProperty("user.dir");
        System.setProperty("workdir", workdir);
    }
    
    /**
     * 
     * 方法名： servicesQueryUserInfoTest.<br/>
     * 方法作用:测试用户信息查询.<br/>
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月1日.<br/>
     * 创建时间：下午5:11:50.<br/>
     * 参数或者异常： .<br/>
     * 返回值： @return 返回结果：void.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    @SuppressWarnings("resource")
    @Test
    public void servicesQueryUserInfoTest() {
        
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "spring-context.xml" });
        UserServer us = (UserServer) context.getBean("userServerImpl");
        JSONObject item = new JSONObject();
        
        item.put(Console_Column.SERVERJYM, Console_Server_Jym.JYM_QUERYUSERINFO);
        item.put(Console_Column.CUSTOMERID, "A003007309");
        item.put(Console_Column.MOBILENO, "13122198813");
        item.put(Console_Column.TRANSTYPE, "00");
        item.put(Console_Column.APPUSER, "bmzhangguibao");

        String execute = us.execute(item.toJSONString());
        System.out.println(execute);
    }
    
    
}

