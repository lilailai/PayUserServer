/**
 *  <pre>	
 *  Project Name :PayUserServer .</br>
 *  File : Paybranch.java .</br>
 *  Package Name :com.imobpay.base.entity .</br>
 *  Date      Author       Changes .</br>
 *  2016年6月2日   Lance.Wu     Create  .</br>
 *  Description : .</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.entity;

/**
 * <pre>
 * ClassName : Paybranch <br/> 
 * date : 20160614 050601 <br/> 
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public class Paybranch extends BaseEntity {

    /** 序号 */
    private static final long serialVersionUID = 1L;

    /** 属性描述：null */
    private String            email;
    /** 属性描述：机构编码 */
    private String            branchid;
    /** 属性描述：机构名称 */
    private String            branchname;
    /** 属性描述：机构属性 */
    private String            branchattr;
    /** 属性描述：PM显示机构 */
    private String            prepbranchPm;
    /** 属性描述：上级机构 */
    private String            prepbranch;
    /** 属性描述：初审复审状态,0 未初审；1 有初审 */
    private String            auditflag;
    /** 属性描述：机构等级 */
    private String            branchlevel;
    /** 属性描述：清算机构 */
    private String            branchacct;

    /**
     * 描述：获取属性值-null .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getEmail() {
        return email;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param email :null 设置值. <br/>
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 描述：获取属性值-机构编码 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getBranchid() {
        return branchid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param branchid :机构编码 设置值. <br/>
     */
    public void setBranchid(String branchid) {
        this.branchid = branchid;
    }

    /**
     * 描述：获取属性值-机构名称 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getBranchname() {
        return branchname;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param branchname :机构名称 设置值. <br/>
     */
    public void setBranchname(String branchname) {
        this.branchname = branchname;
    }

    /**
     * 描述：获取属性值-机构属性 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getBranchattr() {
        return branchattr;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param branchattr :机构属性 设置值. <br/>
     */
    public void setBranchattr(String branchattr) {
        this.branchattr = branchattr;
    }

    /**
     * 描述：获取属性值-PM显示机构 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getPrepbranchPm() {
        return prepbranchPm;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param prepbranchPm :PM显示机构 设置值. <br/>
     */
    public void setPrepbranchPm(String prepbranchPm) {
        this.prepbranchPm = prepbranchPm;
    }

    /**
     * 描述：获取属性值-上级机构 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getPrepbranch() {
        return prepbranch;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param prepbranch :上级机构 设置值. <br/>
     */
    public void setPrepbranch(String prepbranch) {
        this.prepbranch = prepbranch;
    }

    /**
     * 描述：获取属性值-初审复审状态,0 未初审；1 有初审 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getAuditflag() {
        return auditflag;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param auditflag :初审复审状态,0 未初审；1 有初审 设置值. <br/>
     */
    public void setAuditflag(String auditflag) {
        this.auditflag = auditflag;
    }

    /**
     * 描述：获取属性值-机构等级 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getBranchlevel() {
        return branchlevel;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param branchlevel :机构等级 设置值. <br/>
     */
    public void setBranchlevel(String branchlevel) {
        this.branchlevel = branchlevel;
    }

    /**
     * 描述：获取属性值-清算机构 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getBranchacct() {
        return branchacct;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7 :27 :50 <br/>
     * 参数 : @param branchacct :清算机构 设置值. <br/>
     */
    public void setBranchacct(String branchacct) {
        this.branchacct = branchacct;
    }

}