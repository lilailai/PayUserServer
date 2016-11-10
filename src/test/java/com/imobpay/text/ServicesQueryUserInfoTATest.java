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
 * 
 * <pre>
 * 【类型】: ServicesQueryUserInfoTATest <br/> 
 * 【作用】: 测试查询用户信息TA. <br/>  
 * 【时间】：2016年11月10日 下午3:27:26 <br/> 
 * 【作者】：HuaiYu.Wen <br/> 
 * </pre>
 */
public class ServicesQueryUserInfoTATest {

    static {
        String workdir = System.getProperty("user.dir");
        System.setProperty("workdir", workdir);
    }

    /**
     * 
     * 【方法名】    : servicesQueryUserInfoTATest. <br/> 
     * 【作用】: 测试查询用户信息TA.<br/> 
     * 【作者】: HuaiYu.Wen .<br/>
     * 【时间】： 2016年11月10日 下午3:27:45 .<br/>
     * 【参数】： .<br/> .<br/>
     */
    @SuppressWarnings("resource")
    @Test
    public void servicesQueryUserInfoTATest() {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "spring-context.xml" });
        UserServer us = (UserServer) context.getBean("userServerImpl");
        JSONObject item = new JSONObject();

        item.put(Console_Column.SERVERJYM, Console_Server_Jym.JYM_TAQUERYUSERINFO);

        item.put("MOBILENO", "13671874939");

        String execute = us.execute(item.toJSONString());
        System.out.println(execute);
    }

}
