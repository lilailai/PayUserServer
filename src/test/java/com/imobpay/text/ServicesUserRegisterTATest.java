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
 * 【类型】: ServicesUserRegisterTATest <br/> 
 * 【作用】: 测试用户注册TA. <br/>  
 * 【时间】：2016年11月8日 下午5:18:52 <br/> 
 * 【作者】：HuaiYu.Wen <br/> 
 * </pre>
 */
public class ServicesUserRegisterTATest {
    
    static {
        String workdir = System.getProperty("user.dir");
        System.setProperty("workdir", workdir);
    }
    
    /**
     * 
     * 【方法名】    : servicesUserRegisterTATest. <br/> 
     * 【注意】: 测试用户注册TA.<br/> 
     * 【作者】: HuaiYu.Wen .<br/>
     * 【时间】： 2016年11月8日 下午5:18:25 .<br/>
     * 【参数】： .<br/> .<br/>
     * <p>
     * 修改记录.<br/>
     * 修改人: HuaiYu.Wen 修改描述：创建新新件 .<br/>
     * <p/>
     */
    @SuppressWarnings("resource")
    @Test
    public void servicesUserRegisterTATest() {
        
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "spring-context.xml" });
        UserServer us = (UserServer) context.getBean("userServerImpl");
        JSONObject item = new JSONObject();
        
        item.put(Console_Column.SERVERJYM, Console_Server_Jym.JYM_TAUSERREGISTER);

        item.put("APPUSER", "qtpay");
        item.put("MOBILENO", "13162328499");
        item.put("OPENID", "6789");
        item.put("LONGITUDE", "LONGITUDE");
        item.put("LATITUDE", "LATITUDE");
        item.put("IP", "IP");

        item.put("PASSWORD",
                "99f610e21e41ef7809e6ff30d8f006f84ac43b1e8e7666b9aeb13ddefe0385efa7629461c24c4941e6c8e1946812a1b1943026a52a1386f27d228400c6dd88a5f6180931f7bb75877ae2c4145195cc7e2998634adee6ae96a9c5e08d74cbd0eff8d5b8257c5e5b88412faf6188fc16901129b55dc170f622922446a7cb031916");

        item.put("TAACCOUNT", "F87728F6D4B9B90C265483D080E7E7C9");
        item.put("REGION", "123454678");

        item.put("SHOPNAME", "疯子的店铺");

        item.put("USEFNAME", "疯子");

        item.put("CUSTOMERPID", "12345678974258963");

        item.put("MAINBUS", "你猜呀");

        item.put("PROVINCE", "中国上海");

        item.put("CITY", "国上海");

        item.put("ADDRESS", "想嘻嘻嘻嘻嘻嘻嘻嘻嘻嘻嘻嘻嘻嘻嘻想");

        item.put("CARDNO", "622310xxxxxxxxxxxx");

        item.put("BANKBRANCHID", "120124521");
        item.put("IDNO", "430525177745251244");

        String execute = us.execute(item.toJSONString());
        System.out.println(execute);
    }
    
    
}

