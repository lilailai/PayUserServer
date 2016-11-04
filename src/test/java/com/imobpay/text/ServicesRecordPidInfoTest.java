/** 
* 包名: package com.imobpay.text; <br/> 
* 添加时间: 2016年8月9日 下午7:14:27 <br/> 
*/
package com.imobpay.text;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSONObject;
import com.imobpay.base.console.Console_Column;
import com.imobpay.base.console.Console_Server_Jym;
import com.imobpay.base.services.UserServer;

/**
 * 
 * 类名: ServicesRecordPidInfoTest <br/> 
 * 作用： 测试记录身份证信息<br/> 
 * 创建者: HuaiYu.Wen. <br/> 
 * 添加时间: 2016年8月9日 下午7:14:39 <br/> 
 * 版本： 
 * @since JDK 1.6 PayUserServer 1.0
 */
public class ServicesRecordPidInfoTest {
    static {
        String workdir = System.getProperty("user.dir");
        System.setProperty("workdir", workdir);

    }

    /** 
     * 
     * 方法名： main.<br/>
     * 方法作用:测试入口.<br/>
     *
     * 创建者：HuaiYu.Wen.<br/>
     * 创建日期：2016年8月9日.<br/>
     * 创建时间：下午7:15:12.<br/>
     * 参数者异常：@param args .<br/>
     * 返回值：返回类型：void.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    @SuppressWarnings("all")
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "spring-context.xml" });
        UserServer us = (UserServer) context.getBean("userServerImpl");
        JSONObject map = new JSONObject();
        map.put(Console_Column.SERVERJYM, Console_Server_Jym.JYM_RECORDPIDINFO);
        map.put("CUSTOMERID", "A003007295");
        map.put("APPUSER", "qtpay");
        map.put("MOBILENO", "18017259810");

//        map.put("SEX", "男");
//        map.put("FAMILYNAME", "汉");
//        map.put("BIRTHDAY", "1983年02月05日");
//        map.put("ADDRESS", "湖南省株洲市建设南路3号");
//        map.put("ISSUEDEPARTMENT", "湖南省株洲市芦淞区公安局");
//        map.put("VALIDTIME", "2014.02.12-2012.12.12");

        map.put("ONEREALNAMEURL", "http://pic.imobpay.com:10080/00800004/A000000000/A000000275/IDFRONT/1420936816219_A000000275.png");
        map.put("TWOREALNAMEURL", "http://pic.imobpay.com:10080/00800004/A000000000/A000000275/IDBACK/1420936816219_A000000275.png");
        map.put("THREEREALNAMEURL", "http://pic.imobpay.com:10080/00800004/A000000000/A000000275/IDHAND/1420936816219_A000000275.png");
        map.put("IFONEPHOTOGRAPH", "1");
        map.put("IFTWOPHOTOGRAPH", "1");
        map.put("IFTHREEPHOTOGRAPH", "1");

        String execute = us.execute(map.toJSONString());
        JSONObject json = (JSONObject) JSONObject.parseObject(execute);
        System.out.println(json.toString());

    }

}
