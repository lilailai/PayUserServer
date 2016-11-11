/**
 *  <pre>	
 *  Project Name:UserDServer .</br>
 *  File: JymFindServerConfig.java .</br>
 *  Package Name:com.imobpay.base.util .</br>
 *  Date      Author       Changes .</br>
 *  2016年6月2日   Lance.Wu     Create  .</br>
 *  Description: .</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.config;

import java.util.HashMap;
import java.util.Map;

import com.imobpay.base.console.Console_Server_Jym;
import com.imobpay.base.util.EmptyChecker;

/**
 * <pre>
 * ClassName: JymFindServerConfig <br/> 
 * date: 2016年6月2日 上午11:20:00 <br/> 
 * 
 * @author Lance.Wu . <br/> 
 * @version   . <br/> 
 * @since JDK 1.6 UserDServer 1.0 . <br/>
 * </pre>
 */
public final class JymFindServerConfig {

    /** 单列 */
    private JymFindServerConfig() {
    }

    /** 存储交易码类 */
    static Map<String, Object> item   = new HashMap<String, Object>();
    /** 返回类型 设置 */
    static Map<String, Object> result = new HashMap<String, Object>();

    static {
        /** 添加用户 */
        item.put(Console_Server_Jym.JYM_QUERYUSERINFO, "servicesQueryUserInfo");
        item.put(Console_Server_Jym.JYM_USERLOGIN, "servicesUserLogin");
        item.put(Console_Server_Jym.JYM_USERREGISTER, "servicesUserRegister");

        item.put(Console_Server_Jym.JYM_RECORDPIDINFO, "servicesRecordPidInfo");
        
        item.put(Console_Server_Jym.JYM_TAUSERREGISTER, "servicesUserRegisterTA");
        
        item.put(Console_Server_Jym.JYM_TAUSERLOGIN, "servicesUserLoginTA");
        item.put(Console_Server_Jym.JYM_TAQUERYUSERINFO, "servicesQueryUserInfoTA");
        item.put(Console_Server_Jym.JYM_TAUPDATEUSERINFO, "servicesUpdateUserInfoTA");
        /** 错误码返回类 */
        result.put(Console_Server_Jym.JYM_QUERYUSERINFO, "mapResultBean");
        result.put(Console_Server_Jym.JYM_USERLOGIN, "mapResultBean");
//        result.put(Console_Server_Jym.JYM_QUERYUSERINFO, "defaultResultBean");
        result.put(Console_Server_Jym.JYM_RECORDPIDINFO, "defaultResultBean");
        result.put(Console_Server_Jym.JYM_TAUSERREGISTER, "defaultResultBean");
        result.put(Console_Server_Jym.JYM_TAUSERLOGIN, "defaultResultBean");
        result.put(Console_Server_Jym.JYM_TAQUERYUSERINFO, "defaultResultBean");
        result.put(Console_Server_Jym.JYM_TAUPDATEUSERINFO, "defaultResultBean");

    }

    /**
     * getServerObject:(获取服务编号). <br/>
     * 
     * @author Lance.Wu <br/>
     * @param jym
     * <br/>
     * @return 返回结果：String <br/>
     * @since JDK 1.6 UserDServer 1.0 <br/>
     */
    public static String getServerObject(String jym) {
        return item.get(jym) + "";
    }

    /**
     * 
     * getServerResultType:(返回不同类型的参数). <br/>
     * 
     * @author Lance.Wu <br/>
     * @param jym
     *            交易码
     * @return <br/>
     * @since JDK 1.6 PayUserServer 1.0 <br/>
     */
    public static String getServerResultType(Object jym) {

        if (EmptyChecker.isEmpty(jym) || EmptyChecker.isEmpty(result.get(jym))) {
            return "defaultResultBean";
        }

        return result.get(jym).toString();
    }
}
