package com.imobpay.base.entity.vo;

/**
 * 
 * 类名: UserInfoQueryResultBean <br/> 
 * 作用：用户信息查询返回字段信息<br/> 
 * 创建者: 张朝辉. <br/> 
 * 添加时间: 2016年6月23日 下午3:59:34 <br/> 
 * 版本： 
 * @since JDK 1.6 PayUserServer 1.0
 */
public class QueryMenuResultBean {

    /** 无忧还是否在白名单   0：不在白名单；1：在白名单 */
    private String ifWhite;
    /** 无忧还有无申请  0：无申请；1：已申请  */
    private String ifApplyLimit;
    /** 无忧还是否有借款记录 0：有借款记录；1：无借款记录*/
    private String ifBorrowRecord;
    /** 无忧还是否有欠款   0：有欠款；1：无欠款*/
    private String ifArrears;
    /** 无忧还是否有逾期   0：有逾期；1：无逾期*/
    private String ifOverdue;
    /** 当前用户姓名*/
    private String userName;
    /** 当前用户姓名*/
    private String ifYixinWhite;
    /** 是否是瑞钱包活动用户标识 0：不在白名单；1：在白名单 */
    private String ifActivityWhite;

    /**
     * 
     * 方法名： getIfActivityWhite.<br/>
     * 方法作用:获取属性值.<br/>
     *
     * 创建者：HuaiYu.Wen.<br/>
     * 创建日期：2016年9月20日.<br/>
     * 创建时间：下午1:46:53.<br/>
     * 参数者异常：@return .<br/>
     * 返回值：返回类型：String.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public String getIfActivityWhite() {
        return ifActivityWhite;
    }

    /**
     * 
     * 方法名： setIfActivityWhite.<br/>
     * 方法作用:设置属性值.<br/>
     *
     * 创建者：HuaiYu.Wen.<br/>
     * 创建日期：2016年9月20日.<br/>
     * 创建时间：下午1:46:58.<br/>
     * 参数者异常：@param ifActivityWhite .<br/>
     * 返回值：返回类型：void.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void setIfActivityWhite(String ifActivityWhite) {
        this.ifActivityWhite = ifActivityWhite;
    }

    /** 
     * 方法名： getIfWhite.<br/>
     *  
     *  
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月29日.<br/>
     * 创建时间：下午12:06:09.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public String getIfWhite() {
        return ifWhite;
    }

    /**
     * 
     * 方法名： setIfWhite.<br/>
     * 方法作用:设置属性值.<br/>
     *
     * 创建者：HuaiYu.Wen.<br/>
     * 创建日期：2016年9月20日.<br/>
     * 创建时间：下午1:47:19.<br/>
     * 参数者异常：@param ifWhite .<br/>
     * 返回值：返回类型：void.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void setIfWhite(String ifWhite) {
        this.ifWhite = ifWhite;
    }

    /** 
     * 方法名： getIfApplyLimit.<br/>
     *  
     *  
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月29日.<br/>
     * 创建时间：下午12:06:09.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public String getIfApplyLimit() {
        return ifApplyLimit;
    }

    /** 
     * 方法名： setIfApplyLimit.<br/>
     *  
     *  
     * 
     * 
     *
     * 参数： @param ifApplyLimit 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月29日.<br/>
     * 创建时间：下午12:06:09.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void setIfApplyLimit(String ifApplyLimit) {
        this.ifApplyLimit = ifApplyLimit;
    }

    /** 
     * 方法名： getIfBorrowRecord.<br/>
     *  
     *  
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月29日.<br/>
     * 创建时间：下午12:06:09.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public String getIfBorrowRecord() {
        return ifBorrowRecord;
    }

    /** 
     * 方法名： setIfBorrowRecord.<br/>
     *  
     *  
     * 
     * 
     *
     * 参数： @param ifBorrowRecord 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月29日.<br/>
     * 创建时间：下午12:06:09.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void setIfBorrowRecord(String ifBorrowRecord) {
        this.ifBorrowRecord = ifBorrowRecord;
    }

    /** 
     * 方法名： getIfArrears.<br/>
     *  
     *  
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月29日.<br/>
     * 创建时间：下午12:06:09.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public String getIfArrears() {
        return ifArrears;
    }

    /** 
     * 方法名： setIfArrears.<br/>
     *  
     *  
     * 
     * 
     *
     * 参数： @param ifArrears 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月29日.<br/>
     * 创建时间：下午12:06:09.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void setIfArrears(String ifArrears) {
        this.ifArrears = ifArrears;
    }

    /** 
     * 方法名： getIfOverdue.<br/>
     *  
     *  
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月29日.<br/>
     * 创建时间：下午12:06:09.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public String getIfOverdue() {
        return ifOverdue;
    }

    /** 
     * 方法名： setIfOverdue.<br/>
     *  
     *  
     * 
     * 
     *
     * 参数： @param ifOverdue 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月29日.<br/>
     * 创建时间：下午12:06:09.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void setIfOverdue(String ifOverdue) {
        this.ifOverdue = ifOverdue;
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
     * 创建时间：下午12:06:09.<br/>
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
     * 创建时间：下午12:06:09.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /** 
     * 方法名： getIfYixinWhite.<br/>
     *  
     *  
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月29日.<br/>
     * 创建时间：下午12:06:09.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public String getIfYixinWhite() {
        return ifYixinWhite;
    }

    /** 
     * 方法名： setIfYixinWhite.<br/>
     *  
     *  
     * 
     * 
     *
     * 参数： @param ifYixinWhite 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月29日.<br/>
     * 创建时间：下午12:06:09.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void setIfYixinWhite(String ifYixinWhite) {
        this.ifYixinWhite = ifYixinWhite;
    }

}
