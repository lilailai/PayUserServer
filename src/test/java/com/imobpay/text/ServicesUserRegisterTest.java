/** 
 * 包名: package com.imobpay.text; <br/> 
 * 添加时间: 2016年6月17日 下午5:30:03 <br/> 
 */
/**
 *  Project Name:PayUserServer
 *  File: ServicesUserRegisterTest.java
 *  Package Name:com.imobpay.text
 *  Date      Author       Changes
 *  2016年6月17日   madman     Create
 *  Description:
 *  Copyright 2014-2015 QIANTUO FINANCE Services Co.,Ltd. All rights reserved.
 */
package com.imobpay.text;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSONObject;
import com.imobpay.base.console.Console_Column;
import com.imobpay.base.console.Console_Server_Jym;
import com.imobpay.base.services.TiboJmsUntil;
import com.imobpay.base.services.UserServer;

/** 
 * 类名: ServicesUserRegisterTest <br/> 
 * 作用：TODO(简单一句话描述)<br/> 
 * 方法：TODO(简单描述方法)<br/> 
 * 创建者: madman. <br/> 
 * 添加时间: 2016年6月17日 下午5:30:03 <br/> 
 * 版本： JDK 1.6 PayUserServer 1.0
 */
public class ServicesUserRegisterTest {
    static {
        String workdir = System.getProperty("user.dir");
        System.setProperty("workdir", workdir);

    }

    /** 
     * main:(这里用一句话描述这个方法的作用). <br/> 
     * TODO(这里描述这个方法适用条件 – 可选).<br/> 
     * TODO(这里描述这个方法的注意事项 – 可选).<br/> 
     * 
     * @author madman
     * @param args 传入参数
     * @since JDK 1.6 PayUserServer 1.0 
     */
    @SuppressWarnings("all")
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "spring-context.xml" });
        UserServer us = (UserServer) context.getBean("userServerImpl");
        JSONObject map = new JSONObject();
        map.put(Console_Column.SERVERJYM, Console_Server_Jym.JYM_QUERYUSERINFO);

        map.put("APPUSER", "qtpay");
        map.put("USERIP", "123.44.4");
        map.put("MOBILENO", "13162328491");
        map.put("USERNAME", "13162328491");
        map.put("MOBILEMAC", "6789");
        map.put("REFERRERMOBILENO", "");
        map.put("PASSWORD",
                "3a5dfbcd565b0e52b7fff54178fff5c3d129c1f0d9412789b6ad094b5742fc55397136f324b19ef0b22668e31543561eeca98695ef2dcc10d186e4fa966f380b9a799c885a2d7058f4cb6ee314a8d4880dc8396fd7785d3c12e0caa081253d94fa2223896836898e56c9ae39c50539765104fd2a4e70b7459655542a3e37b5fd");
        map.put("OSTYPE", "IOS9.1.5");
        map.put("MOBILESERIALNUM", "1111111");
        map.put("VERSION", "1.2.0");
        map.put("LONGITUDE", "0.0");
        map.put("LATITUDE", "0.0");
        map.put("IPINFO", "192.168.1.2");
        map.put("TRANSDATE", "20150921");
        map.put("TRANSTIME", "190322");
        map.put("TRANSLOGNO", "123456");
        String execute = us.execute(map.toJSONString());
        JSONObject json = (JSONObject) JSONObject.parseObject(execute);
        System.out.println(json.toString());

    }

    /**
     * 测试队列 收发
     * tibcoTest:(这里用一句话描述这个方法的作用). <br/> 
     * TODO(这里描述这个方法适用条件 – 可选).<br/> 
     * TODO(这里描述这个方法的注意事项 – 可选).<br/> 
     * 
     * @author madman
     * @since JDK 1.6 PayUserServer 1.0
     */
    @SuppressWarnings("all")
    @Test
    public void tibcoTest() {
        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "spring-context.xml" });
            JSONObject js = new JSONObject();
            js.put("123", "折时间");
            TiboJmsUntil jmsUntil = (TiboJmsUntil) context.getBean("tiboJmsUntil");
            jmsUntil.sendStreamMessage("UserDubboServerxx.IN", "UserDubboServerxx.OUT", true, js.toString(), System.currentTimeMillis() + "", "UTF-8");
            TiboJmsUntil jmsUntil2 = (TiboJmsUntil) context.getBean("tiboJmsUntil");
            jmsUntil2.sendStreamMessage("UserDubboServerxx.IN", "UserDubboServerxx.OUT", true, js.toString(), System.currentTimeMillis() + "", "UTF-8");
            // TiboJmsUntil jmsUntil3 = (TiboJmsUntil)
            // context.getBean("tiboJmsUntil");
            // jmsUntil3.sendStreamMessage("UserDubboServerxx.IN",
            // "UserDubboServerxx.OUT", true, js.toString(),
            // System.currentTimeMillis() + "", "UTF-8");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
