package com.imobpay.base.entity.vo;

/**
 * 
 * 类名: UserInfoQueryResultBean <br/> 
 * 作用：用户登录返回信息<br/> 
 * 创建者: 张朝辉. <br/> 
 * 添加时间: 2016年6月23日 下午3:59:34 <br/> 
 * 版本： 
 * @since JDK 1.6 PayUserServer 1.0
 */
public class UserLoginResultBean {
    /**
     * 用户姓名
     */
    private String realName;
    /**
     * 用户姓名
     */
    private String userName;
    /**
     * 客户编号
     */
    private String customerId;
    /**
     * 用户类型
     */
    private String userType;
    /**
     * 是否设置独立密码1已经设置0没设置
     */
    private String payPassFlag;
    /** 
     * 方法名： getRealName.<br/>
     * 
     *  
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月29日.<br/>
     * 创建时间：下午8:40:46.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public String getRealName() {
        return realName;
    }
    /** 
     * 方法名： setRealName.<br/>
     * 
     *  
     * 
     * 
     *
     * 参数： @param realName 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月29日.<br/>
     * 创建时间：下午8:40:46.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }
    /** 
     * 方法名： getUserName.<br/>
     * 
     *  
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月29日.<br/>
     * 创建时间：下午8:40:46.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public String getUserName() {
        return userName;
    }
    /** 
     * 方法名： setUserName.<br/>
     * 
     *  
     * 
     * 
     *
     * 参数： @param userName 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月29日.<br/>
     * 创建时间：下午8:40:46.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    /** 
     * 方法名： getCustomerId.<br/>
     * 
     *  
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月29日.<br/>
     * 创建时间：下午8:40:46.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public String getCustomerId() {
        return customerId;
    }
    /** 
     * 方法名： setCustomerId.<br/>
     * 
     *  
     * 
     * 
     *
     * 参数： @param customerId 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月29日.<br/>
     * 创建时间：下午8:40:46.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    /** 
     * 方法名： getUserType.<br/>
     * 
     *  
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月29日.<br/>
     * 创建时间：下午8:40:46.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public String getUserType() {
        return userType;
    }
    /** 
     * 方法名： setUserType.<br/>
     * 
     *  
     * 
     * 
     *
     * 参数： @param userType 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月29日.<br/>
     * 创建时间：下午8:40:46.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }
    /** 
     * 方法名： getPayPassFlag.<br/>
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月29日.<br/>
     * 创建时间：下午8:53:13.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public String getPayPassFlag() {
        return payPassFlag;
    }
    /** 
     * 方法名： setPayPassFlag.<br/>
     *
     * 参数： @param payPassFlag 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月29日.<br/>
     * 创建时间：下午8:53:13.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void setPayPassFlag(String payPassFlag) {
        this.payPassFlag = payPassFlag;
    }
    
    
    
}
