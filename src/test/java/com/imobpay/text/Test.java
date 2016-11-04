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

import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.imobpay.base.console.Console_Column;
import com.imobpay.base.console.Console_Server_Jym;
import com.imobpay.base.entity.ReultErrorBean;

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
public class Test {

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
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "spring-context.xml" });
        
        ReultErrorBean bean = (ReultErrorBean)context.getBean("resultBean");
       
        System.out.println(bean.returnBeanJson("123", "12312"));
        
//        UserServer us = (UserServer) context.getBean("userServerImpl");
        
        
        
//        Map<String, Object> item = new HashMap<String, Object>();
        // 调用用户登录组装报文
        // packageAppLogin(item);
        // 组装查询用户信息接口
//        packageUserInfo(item);
        // Map<String, Object> execute = us.executeJson(json)(item);
        // JSONObject json = (JSONObject) JSONObject.toJSON(execute);
        // System.out.println(json.toString());
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
    public static Map<String, Object> packageUserInfo(Map<String, Object> item) {
        item.put(Console_Column.SERVERJYM, Console_Server_Jym.JYM_QUERYUSERINFO);
        item.put(Console_Column.CUSTOMERID, "A000244276");
        item.put(Console_Column.MOBILENO, "13122198813");
        item.put(Console_Column.TRANSTYPE, "00");
        item.put(Console_Column.APPUSER, "qtpay");
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
    public static Map<String, Object> packageAppLogin(Map<String, Object> item) {

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
}
