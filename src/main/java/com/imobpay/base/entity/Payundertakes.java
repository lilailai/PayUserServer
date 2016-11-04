/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: Payundertakes.java .</br>
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
 * ClassName: Payundertakes <br/> 
 * date: 20160617 030632 <br/> 
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public class Payundertakes extends BaseEntity {

    /** 序号 */
    private static final long serialVersionUID = 1L;

    /** 属性描述：身份证机构白名单，0不启用1启用  */
    private String            pidflag;
    /** 属性描述：是否启用加油金账户，0不启用1启用  */
    private String            oilaccountflag;
    /** 属性描述：GPS标志，0--需要，其他--不需要  */
    private String            gpstag;
    /** 属性描述：是否可以特殊注册,1--可以用  */
    private String            regtag;
    /** 属性描述：机构积分功能状态  */
    private String            itags;
    /** 属性描述：机构号  */
    private String            branchid;
    /** 属性描述：代发队列名  */
    private String            undertakesname;
    /** 属性描述：会员费状态  */
    private String            status;
    /** 属性描述：闪付标识  */
    private String            vipsfflag;

    /**
     * 描述：获取属性值-身份证机构白名单，0不启用1启用 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getPidflag() {
        return pidflag;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param pidflag :身份证机构白名单，0不启用1启用  设置值. <br/>
     */
    public void setPidflag(String pidflag) {
        this.pidflag = pidflag;
    }

    /**
     * 描述：获取属性值-是否启用加油金账户，0不启用1启用 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getOilaccountflag() {
        return oilaccountflag;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param oilaccountflag :是否启用加油金账户，0不启用1启用  设置值. <br/>
     */
    public void setOilaccountflag(String oilaccountflag) {
        this.oilaccountflag = oilaccountflag;
    }

    /**
     * 描述：获取属性值-GPS标志，0--需要，其他--不需要 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getGpstag() {
        return gpstag;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param gpstag :GPS标志，0--需要，其他--不需要  设置值. <br/>
     */
    public void setGpstag(String gpstag) {
        this.gpstag = gpstag;
    }

    /**
     * 描述：获取属性值-是否可以特殊注册,1--可以用 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getRegtag() {
        return regtag;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param regtag :是否可以特殊注册,1--可以用  设置值. <br/>
     */
    public void setRegtag(String regtag) {
        this.regtag = regtag;
    }

    /**
     * 描述：获取属性值-机构积分功能状态 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getItags() {
        return itags;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param itags :机构积分功能状态  设置值. <br/>
     */
    public void setItags(String itags) {
        this.itags = itags;
    }

    /**
     * 描述：获取属性值-机构号 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getBranchid() {
        return branchid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param branchid :机构号  设置值. <br/>
     */
    public void setBranchid(String branchid) {
        this.branchid = branchid;
    }

    /**
     * 描述：获取属性值-代发队列名 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getUndertakesname() {
        return undertakesname;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param undertakesname :代发队列名  设置值. <br/>
     */
    public void setUndertakesname(String undertakesname) {
        this.undertakesname = undertakesname;
    }

    /**
     * 描述：获取属性值-会员费状态 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getStatus() {
        return status;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param status :会员费状态  设置值. <br/>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 描述：获取属性值-闪付标识 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getVipsfflag() {
        return vipsfflag;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param vipsfflag :闪付标识  设置值. <br/>
     */
    public void setVipsfflag(String vipsfflag) {
        this.vipsfflag = vipsfflag;
    }

}