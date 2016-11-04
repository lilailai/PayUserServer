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
public class ServicesUserLoginTest {
    
    static {
        String workdir = System.getProperty("user.dir");
        System.setProperty("workdir", workdir);
    }
    
    /**
     * 
     * 方法名： servicesUserLoginTest.<br/>
     * 方法作用:测试登录.<br/>
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
    public void servicesUserLoginTest() {
        
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "spring-context.xml" });
        UserServer us = (UserServer) context.getBean("userServerImpl");
        JSONObject item = new JSONObject();
        
        item.put(Console_Column.SERVERJYM, Console_Server_Jym.JYM_USERLOGIN);
        item.put(Console_Column.OSTYPE, "android2.3.5");
        item.put(Console_Column.APPUSER, "qtpay");
        item.put(Console_Column.MOBILENO, "13122198813");
        item.put(
                Console_Column.PASSWORD,
                "07080a9b9b33b884d81d6feb8be43f2db9dbe6d5a3e7a91a8fd4157fb8d41b7f5b3c716f6df77fcfdae93305357b45e3f10368b954f4b09406163382a7530dff2eedb05766210cca7fc93e19545d0ab4fc0a0137578a912865b5d1cf6abee93baa5f5dc84e5af8f70a84d973ca35821e114fe0698b918123f87a34faf54ffb02");
        item.put(Console_Column.MOBILESERIALNUM, "3598360434842560000000000000000000000000");
        item.put(Console_Column.VERSION, "2.9.0");
        item.put(Console_Column.TRANSDATE, "20160802");
        item.put(Console_Column.TRANSTIME, "091934");
        item.put(Console_Column.TRANSLOGNO, "000293");
        item.put(Console_Column.USERIP, "101.81.183.95");

        String execute = us.execute(item.toJSONString());
        System.out.println(execute);
    }
    
    
}

