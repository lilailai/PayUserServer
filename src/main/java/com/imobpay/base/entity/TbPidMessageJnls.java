/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: TbPidMessageJnls.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date          			Author      Changes .</br>
 *  20160814 080826    Lance.Wu     Create  .</br>
 *  Description: 当前类是通过工具生成的.</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.entity;

/**
 * <pre>
 * ClassName: TbPidMessageJnls <br/> 
 * date: 20160814 080826 <br/> 
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public class TbPidMessageJnls extends BaseEntity {

    /** 序号 */
    private static final long serialVersionUID = 1L;

    /** 属性描述：客户号 */
    private String customerid;
    /** 属性描述：录入时间 */
    private String createtime;
    /** 属性描述：应用类型 */
    private String appuser;
    /** 属性描述：机构号 */
    private String branchid;
    /** 属性描述：身份证性别 */
    private String sex;
    /** 属性描述：身份证民族 */
    private String familyname;
    /** 属性描述：身份证出生日期 */
    private String birthday;
    /** 属性描述：身份证地址 */
    private String address;
    /** 属性描述：身份证有效期 */
    private String validtime;
    /** 属性描述：身份证签发机关 */
    private String issuedepartment;
    /** 属性描述：身份证正面照url */
    private String pidimgurl;
    /** 属性描述：身份证背面照url */
    private String pidantiimgurl;
    /** 属性描述：手持照片url */
    private String picurl;
    /** 属性描述：第一张正面照片识别或拍照,0：识别1：拍照 */
    private String ifonephotograph;
    /** 属性描述：第二张反面照片识别或拍照,0：识别1：拍照 */
    private String iftwophotograph;
    /** 属性描述：第三张手持照片识别或拍照,0：识别1：拍照 */
    private String ifthreephotograph;
    /** 属性描述：录入日期 */
    private String createdate;
    /** 属性描述：流水号 */
    private String id;

    /**
     * 描述：获取属性值-客户号.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCustomerid() {
        return customerid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param customerid :客户号 设置值. <br/>
     */
    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    /**
     * 描述：获取属性值-录入时间.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCreatetime() {
        return createtime;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param createtime :录入时间 设置值. <br/>
     */
    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    /**
     * 描述：获取属性值-应用类型.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getAppuser() {
        return appuser;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param appuser :应用类型 设置值. <br/>
     */
    public void setAppuser(String appuser) {
        this.appuser = appuser;
    }

    /**
     * 描述：获取属性值-机构号.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getBranchid() {
        return branchid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param branchid :机构号 设置值. <br/>
     */
    public void setBranchid(String branchid) {
        this.branchid = branchid;
    }

    /**
     * 描述：获取属性值-身份证性别.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getSex() {
        return sex;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param sex :身份证性别 设置值. <br/>
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 描述：获取属性值-身份证民族.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getFamilyname() {
        return familyname;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param familyname :身份证民族 设置值. <br/>
     */
    public void setFamilyname(String familyname) {
        this.familyname = familyname;
    }

    /**
     * 描述：获取属性值-身份证出生日期.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param birthday :身份证出生日期 设置值. <br/>
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    /**
     * 描述：获取属性值-身份证地址.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getAddress() {
        return address;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param address :身份证地址 设置值. <br/>
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 描述：获取属性值-身份证有效期.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getValidtime() {
        return validtime;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param validtime :身份证有效期 设置值. <br/>
     */
    public void setValidtime(String validtime) {
        this.validtime = validtime;
    }

    /**
     * 描述：获取属性值-身份证签发机关.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getIssuedepartment() {
        return issuedepartment;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param issuedepartment :身份证签发机关 设置值. <br/>
     */
    public void setIssuedepartment(String issuedepartment) {
        this.issuedepartment = issuedepartment;
    }

    /**
     * 描述：获取属性值-身份证正面照url.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getPidimgurl() {
        return pidimgurl;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param pidimgurl :身份证正面照url 设置值. <br/>
     */
    public void setPidimgurl(String pidimgurl) {
        this.pidimgurl = pidimgurl;
    }

    /**
     * 描述：获取属性值-身份证背面照url.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getPidantiimgurl() {
        return pidantiimgurl;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param pidantiimgurl :身份证背面照url 设置值. <br/>
     */
    public void setPidantiimgurl(String pidantiimgurl) {
        this.pidantiimgurl = pidantiimgurl;
    }

    /**
     * 描述：获取属性值-手持照片url.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getPicurl() {
        return picurl;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param picurl :手持照片url 设置值. <br/>
     */
    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }

    /**
     * 描述：获取属性值-第一张正面照片识别或拍照,0：识别1：拍照.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getIfonephotograph() {
        return ifonephotograph;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param ifonephotograph :第一张正面照片识别或拍照,0：识别1：拍照 设置值. <br/>
     */
    public void setIfonephotograph(String ifonephotograph) {
        this.ifonephotograph = ifonephotograph;
    }

    /**
     * 描述：获取属性值-第二张反面照片识别或拍照,0：识别1：拍照.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getIftwophotograph() {
        return iftwophotograph;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param iftwophotograph :第二张反面照片识别或拍照,0：识别1：拍照 设置值. <br/>
     */
    public void setIftwophotograph(String iftwophotograph) {
        this.iftwophotograph = iftwophotograph;
    }

    /**
     * 描述：获取属性值-第三张手持照片识别或拍照,0：识别1：拍照.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getIfthreephotograph() {
        return ifthreephotograph;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param ifthreephotograph :第三张手持照片识别或拍照,0：识别1：拍照 设置值. <br/>
     */
    public void setIfthreephotograph(String ifthreephotograph) {
        this.ifthreephotograph = ifthreephotograph;
    }

    /**
     * 描述：获取属性值-录入日期.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCreatedate() {
        return createdate;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param createdate :录入日期 设置值. <br/>
     */
    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    /**
     * 描述：获取属性值-流水号.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getId() {
        return id;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param id :流水号 设置值. <br/>
     */
    public void setId(String id) {
        this.id = id;
    }

}