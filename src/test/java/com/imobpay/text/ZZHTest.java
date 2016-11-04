/**
 *  <pre>	
 *  Project Name:UserDServer .</br>
 *  File: Test.java .</br>
 *  Package Name:com.imobpay.text .</br>
 *  Date      Author       Changes .</br>
 *  2016年6月1日   Lance.Wu     Create  .</br>
 *  Description: .</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.text;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSONObject;
import com.imobpay.base.console.Console_Column;
import com.imobpay.base.console.Console_Server_Jym;
import com.imobpay.base.services.UserServer;

/**
 * <pre>
 * ClassName: Test <br/> 
 * date: 2016年6月1日 下午4:53:16 <br/> 
 * 
 * @author Lance.Wu . <br/> 
 * @version   . <br/> 
 * @since JDK 1.6 UserDServer 1.0 . <br/>
 * </pre>
 */
public class ZZHTest {
    static {
        String workdir = System.getProperty("user.dir");
        System.setProperty("workdir", workdir);
    }

    /**
     * 
     * main:(这里用一句话描述这个方法的作用). <br/>
     * 
     * @author Lance.Wu <br/>
     * @param args
     * <br/>
     * @since JDK 1.6 PayUserServer 1.0 <br/>
     */
    @SuppressWarnings("all")
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("workdir"));
        /*
         * ClassPathXmlApplicationContext context = new
         * ClassPathXmlApplicationContext(new String[] {
         * "spring-test-context.xml" }); UserServer us = (UserServer)
         * context.getBean("userServer");
         */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "spring-context.xml" });
        UserServer us = (UserServer) context.getBean("userServerImpl");
        JSONObject item = new JSONObject();
        // 调用用户登录组装报文
         packageAppLogin(item);
        // 组装查询用户信息接口
//        packageUserInfo(item);
        String execute = us.execute(item.toJSONString());
        System.out.println(execute);
    }

    /**
     * 
     * 方法名： packageUserInfo.<br/>
     * 方法作用:组装查询用户信息报文.<br/>
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月17日.<br/>
     * 创建时间：下午5:07:42.<br/>
     * 参数者异常：@param item
     * 返回值： @return 返回结果：Map<String,Object>.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public static JSONObject packageUserInfo(JSONObject item) {
        item.put(Console_Column.SERVERJYM, Console_Server_Jym.JYM_QUERYUSERINFO);
        item.put(Console_Column.CUSTOMERID, "A003007309");
        item.put(Console_Column.MOBILENO, "13122198813");
        item.put(Console_Column.TRANSTYPE, "00");
        item.put(Console_Column.APPUSER, "bmzhangguibao");
        return item;

    }

    /**
     * 
     * 方法名： packageAppLogin.<br/>
     * 方法作用:组装登录测试报文.<br/>
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月17日.<br/>
     * 创建时间：下午3:39:09.<br/>
     * 参数者异常：@param item
     * 返回值： @return 返回结果：Map<String,Object>.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public static JSONObject packageAppLogin(JSONObject item) {

        // item.put(Console_Column.SERVERJYM,
        // Console_Server_Jym.JYM_QUERYUSERINFO + 1);

        // item.put(Console_Column.SERVERJYM,
        // Console_Server_Jym.JYM_QUERYUSERINFO + 1);

        item.put(Console_Column.SERVERJYM, Console_Server_Jym.JYM_USERLOGIN);
        item.put(Console_Column.OSTYPE, "IOS");
        item.put(Console_Column.APPUSER, "qtpay");
        item.put(Console_Column.MOBILENO, "18616923951");
        item.put(
                Console_Column.PASSWORD,
                "9898b3377724e49020ec52dcba83d5f8c21fd7e4b960c9b9b21dcb3fcbfe6e57289501b7f8ab8dcbf64c3fc870654b53cd17e03fe5fb4c2c7284a7f1c87d373b01b6eac188cdd6ed04b1f3b9cf1b23b38d0c7f7586c599742240e7b6cb131b380d18fb112e92f8dbec08b655679999231ad876b3bb6191ecdc31aaa80ef3ba01");
        item.put(Console_Column.MOBILESERIALNUM, "18616923951");
        item.put(Console_Column.VERSION, "1.0.1");
        item.put(Console_Column.TRANSDATE, "1.0.1");
        item.put(Console_Column.TRANSTIME, "1.0.1");
        item.put(Console_Column.TRANSLOGNO, "123");
        item.put(Console_Column.USERIP, "192.168.1.129");
        item.put(Console_Column.USERIP, "9.1.5");
        // item.put(Console_Column.CUSTOMERID, "A000000922");
        // item.put(Console_Column.MOBILENO, "18616923951");
        // item.put(Console_Column.TRANSTYPE, "01");
        // item.put(Console_Column.APPUSER, "qtpay");
        return item;

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