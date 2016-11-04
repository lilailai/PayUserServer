/** 
 * 包名: package com.imobpay.base.aop; <br/> 
 * 添加时间: 2016年6月29日 下午4:07:43 <br/> 
 */
/**
 *  Project Name:PayUserServer
 *  File: MonitorAop.java
 *  Package Name:com.imobpay.base.aop
 *  Date      Author       Changes
 *  2016年6月29日   madman     Create
 *  Description:
 *  Copyright 2014-2015 QIANTUO FINANCE Services Co.,Ltd. All rights reserved.
 */
package com.imobpay.base.aop;

import org.aspectj.lang.JoinPoint;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/** 
 * 类名: MonitorAop <br/> 
 * 创建者: madman. <br/> 
 * 添加时间: 2016年6月29日 下午4:07:43 <br/> 
 * 版本： JDK 1.6 PayUserServer 1.0
 */
@Scope("prototype")
@Service
public class MonitorAop {
    /**
     * 
     * before:(这里用一句话描述这个方法的作用). <br/> 
     * 
     * 切入点 调用方法之前记录时间
     * 
     * @author madman
     * @param str str
     * @throws InterruptedException InterruptedException
     * @since JDK 1.6 PayUserServer 1.0
     */
    public void before(JoinPoint str) throws InterruptedException {
        Object[] args = str.getArgs();
        for (Object object : args) {
            System.out.println(object);
        }
        System.out.println("调用之前执行" + System.currentTimeMillis() + "====" + str);

    }
    /**
     * 
     * 方法名： after.<br/>
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月5日.<br/>
     * 创建时间：下午2:46:04.<br/>
     * 参数者异常：@param resultJson .<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void after(JoinPoint resultJson) {
        Object[] args = resultJson.getArgs();
        for (Object object : args) {
            System.out.println("111" + object);
        }
        System.out.println("调用之后执行" + System.currentTimeMillis() + "----" + resultJson);
    }
    /**
     * 
     * 方法名： afterreturning.<br/>
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月5日.<br/>
     * 创建时间：下午2:53:42.<br/>
     * 参数者异常：@param joinPoint
     * 参数者异常：@param obj .<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void afterreturning(JoinPoint joinPoint, Object obj) {
        System.out.println("获取返回值---GG思密达:" + obj);
        Object[] args = joinPoint.getArgs();
        for (Object object : args) {
            System.out.println("111" + object);
        }
        System.out.println("调用之后执行" + System.currentTimeMillis() + "----" + joinPoint);
    }

    /**
     * 
     * 方法名： afterException.<br/>
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月5日.<br/>
     * 创建时间：下午2:54:00.<br/>
     * 参数者异常：@param joinPoint .<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void afterException(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        for (Object object : args) {
            System.out.println("111" + object);
        }
        System.out.println("发生异常时候执行" + System.currentTimeMillis() + "----" + joinPoint);
    }
}
