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
 * 【类型】: ServicesUpdateUserInfoTATest <br/> 
 * 【作用】: 测试更新用户信息TA接口 <br/>  
 * 【时间】：2016年11月11日 下午5:12:50 <br/> 
 * 【作者】：HuaiYu.Wen <br/> 
 * </pre>
 */
public class ServicesUpdateUserInfoTATest {

    static {
        String workdir = System.getProperty("user.dir");
        System.setProperty("workdir", workdir);
    }

    /**
     * 
     * 【方法名】    : servicesUpdateUserInfoTATest. <br/> 
     * 【作用】: 测试更新用户信息TA接口 .<br/> 
     * 【作者】: HuaiYu.Wen .<br/>
     * 【时间】： 2016年11月11日 下午5:13:26 .<br/>
     * 【参数】： .<br/> .<br/>
     */
    @SuppressWarnings("resource")
    @Test
    public void servicesUpdateUserInfoTATest() {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "spring-context.xml" });
        UserServer us = (UserServer) context.getBean("userServerImpl");
        JSONObject item = new JSONObject();

        item.put(Console_Column.SERVERJYM, Console_Server_Jym.JYM_TAUPDATEUSERINFO);
        item.put("TAACCOUNT", "622355xxxxxxxxxx");
        item.put("UPDTYPE", "3");
        item.put("PAYPASSWORD", "99999");
        item.put("MOBILENO", "13162328499");
        item.put("APPUSER", "weiyin");
        item.put("IP", "33");
        item.put("LONGITUDE", "11");
        item.put("LATITUDE", "22");
        item.put("CONTENT", "{\"shopName\":\"111\",\"mainBus\":\"业务\"" + ",\"address\":\"地址\",\"province\":\"省\",\"region\":\"区\",\"city\":\"城市\"}");

        
        String execute = us.execute(item.toJSONString());
        System.out.println(execute);
    }

}
