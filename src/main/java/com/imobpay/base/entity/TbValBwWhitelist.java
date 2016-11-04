/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: TbValBwWhitelist.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date      Author       Changes .</br>
 *  2016年6月2日   Lance.Wu     Create  .</br>
 *  Description: .</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.entity;

/**
 * <pre>
 * ClassName: TbValBwWhitelist <br/> 
 * date: 20160617 010630 <br/> 
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public class TbValBwWhitelist extends BaseEntity {

    /** 序号 */
    private static final long serialVersionUID = 1L;

    /** 属性描述：白名单标志位  */
    private Integer           flag;
    /** 属性描述：null  */
    private String            currentusercode;
    /** 属性描述：0 启用  1 停用  */
    private String            whitetag;
    /** 属性描述：null  */
    private String            currentusername;
    /** 属性描述：null  */
    private String            localtime;
    /** 属性描述：1 手机 2 身份证 3 银行卡  */
    private String            whitetype;
    /** 属性描述：关键字 包括 手机、身份证、银行卡  */
    private String            whitekey;

    /**
     * 描述：获取属性值-白名单标志位 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param flag :白名单标志位  设置值. <br/>
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    /**
     * 描述：获取属性值-null .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCurrentusercode() {
        return currentusercode;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param currentusercode :null  设置值. <br/>
     */
    public void setCurrentusercode(String currentusercode) {
        this.currentusercode = currentusercode;
    }

    /**
     * 描述：获取属性值-0 启用  1 停用 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getWhitetag() {
        return whitetag;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param whitetag :0 启用  1 停用  设置值. <br/>
     */
    public void setWhitetag(String whitetag) {
        this.whitetag = whitetag;
    }

    /**
     * 描述：获取属性值-null .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCurrentusername() {
        return currentusername;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param currentusername :null  设置值. <br/>
     */
    public void setCurrentusername(String currentusername) {
        this.currentusername = currentusername;
    }

    /**
     * 描述：获取属性值-null .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getLocaltime() {
        return localtime;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param localtime :null  设置值. <br/>
     */
    public void setLocaltime(String localtime) {
        this.localtime = localtime;
    }

    /**
     * 描述：获取属性值-1 手机 2 身份证 3 银行卡 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getWhitetype() {
        return whitetype;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param whitetype :1 手机 2 身份证 3 银行卡  设置值. <br/>
     */
    public void setWhitetype(String whitetype) {
        this.whitetype = whitetype;
    }

    /**
     * 描述：获取属性值-关键字 包括 手机、身份证、银行卡 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getWhitekey() {
        return whitekey;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param whitekey :关键字 包括 手机、身份证、银行卡  设置值. <br/>
     */
    public void setWhitekey(String whitekey) {
        this.whitekey = whitekey;
    }

}