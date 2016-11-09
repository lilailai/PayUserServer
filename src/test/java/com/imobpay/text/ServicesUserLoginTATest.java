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
import com.imobpay.base.console.UserConsoleColumn;
import com.imobpay.base.services.UserServer;

/** 
 * <pre>
 * 【类型】: ServicesUserLoginTATest <br/> 
 * 【作用】: 测试用户登录TA. <br/>  
 * 【时间】：2016年11月9日 上午10:20:40 <br/> 
 * 【作者】：HuaiYu.Wen <br/> 
 * </pre>
 */
public class ServicesUserLoginTATest {
    
    static {
        String workdir = System.getProperty("user.dir");
        System.setProperty("workdir", workdir);
    }
    
    /**
     * 
     * 【方法名】    :测试用户登录TA. <br/> 
     * 【注意】: (这里描述这个方法的注意事项 – 可选).<br/> 
     * 【作者】: HuaiYu.Wen .<br/>
     * 【时间】： 2016年11月9日 上午10:21:04 .<br/>
     * 【参数】： .<br/> .<br/>
     */
    @SuppressWarnings("resource")
    @Test
    public void servicesUserLoginTATest() {
        
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "spring-context.xml" });
        UserServer us = (UserServer) context.getBean("userServerImpl");
        JSONObject item = new JSONObject();
        
        item.put(Console_Column.SERVERJYM, Console_Server_Jym.JYM_TAUSERLOGIN);

        item.put("APPUSER", "wcehi");
        item.put("MOBILENO", "13671874939");
        item.put("PASSWORD",
                "194169cde430663e2a3c83d2a9a5670c378178b570b282d3dbc0dc1f9885da08f55d545a8901dcc2d73abe91382b657764c50f39f5a5ae9865e6a5e24a6cc9db06e5948c75ffa86294ecf580b7c42c3f6d5da6561073c2a39737933d959c7654abe9439fbf206c8fc43619e8db931e8739f071e858b45c4fd2827ad15edf4a60");
        item.put(UserConsoleColumn.PUB_ACCOUNT, "imobpay");

        String execute = us.execute(item.toJSONString());
        System.out.println(execute);
    }
    
    
}

