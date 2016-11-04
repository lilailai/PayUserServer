/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: Paycustomer.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date          			Author      Changes .</br>
 *  20160809 030828    Lance.Wu     Create  .</br>
 *  Description: 当前类是通过工具生成的.</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.entity;

/**
 * <pre>
 * ClassName: Paycustomer <br/> 
 * date: 20160809 030828 <br/> 
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public class Paycustomer extends BaseEntity {

    /** 序号 */
    private static final long serialVersionUID = 1L;

    /** 属性描述：身份证性别 */
    private String sex;
    /** 属性描述： */
    private String acctflag;
    /** 属性描述：身份证出生日期 */
    private String birthday;
    /** 属性描述：身份证地址 */
    private String address;
    /** 属性描述：身份证签发机关 */
    private String issuedepartment;
    /** 属性描述：是否抓取用户信息标识,0为不需要抓取,1为需要抓取 */
    private String isgrab;
    /** 属性描述：标记   0--未标记   1--已标记 */
    private String signflag;
    /** 属性描述：标记原因 */
    private String signreason;
    /** 属性描述： */
    private String qauditstatus;
    /** 属性描述：添加用户时间戳 */
    private String timestamp;
    /** 属性描述：用户编码 */
    private String customerid;
    /** 属性描述：企业用户的法人名字 */
    private String username;
    /** 属性描述：用户类型，00:个人 01:企业 */
    private String customertype;
    /** 属性描述：是否内部员工，1--是内部员工，null--不是内部员工 */
    private String isEmployee;
    /** 属性描述：1成功，2：失败 3：中间状态 */
    private String isFasttrialStatus;
    /** 属性描述：中文名称 */
    private String customername;
    /** 属性描述：证件类型，01:身份证 */
    private String customerpidtype;
    /** 属性描述：证件号码 */
    private String customerpid;
    /** 属性描述：创建日期 */
    private String customerregdate;
    /** 属性描述：所属机构 */
    private String branchid;
    /** 属性描述：是否关注，Y:关注 N:不关注 */
    private String attention;
    /** 属性描述：是否认证，0:未认证 1:完善资料 2：审核中  3：认证通过, 4-审核失败，5--头像上传中，6--法人信息已完善，7--商户信息已完善，8--法人图片上传中，9--商户图片上传中，A--法人信息审核中，B--黑名单用户，C--商户信息审核中，D--法人审核失败，E--商户审核失败 */
    private String customertag;
    /** 属性描述：用户等级 */
    private Integer viplevel;
    /** 属性描述：变更日期 */
    private String lastchangedate;
    /** 属性描述：用户权限，X0 冻结X天 40永久冻结 */
    private String memo;
    /** 属性描述：邮箱 */
    private String email;
    /** 属性描述：注册地址 */
    private String customeraddr;
    /** 属性描述：商户营业执照 */
    private String businesslicence;
    /** 属性描述：审核状态 */
    private String checkrange;
    /** 属性描述：初审次数 */
    private Integer firstreject;
    /** 属性描述：复审次数 */
    private Integer finalreject;
    /** 属性描述：客户手机号信息 */
    private String mobilenolocate;
    /** 属性描述：标识 */
    private String remark;
    /** 属性描述：信用卡状态 */
    private String credittag;
    /** 属性描述：身份证有效期开始 */
    private String idcardvalidbegin;
    /** 属性描述：身份证有效期结束 */
    private String idcardvalidend;
    /** 属性描述：信用卡有效期结束 */
    private String creditvalid;
    /** 属性描述：0 */
    private String auditflag;
    /** 属性描述：1无权限，0有权限 */
    private String perflag;
    /** 属性描述：用户是否已经添加公共图片 0 未添加 1 已添加 */
    private String shopstatus;
    /** 属性描述：最后一次重置密码 */
    private String lastresetpassword;
    /** 属性描述：0表示不显示 1表示显示  */
    private String featureflag;
    /** 属性描述：身份证民族 */
    private String familyname;
    /** 属性描述：当前用户是否为存量用户及是否验证标识，0：标识存量用户，需要通道验证；1：标识已经发通道验证过的用户；2：新版本上线后申请用户 */
    private String ifNewUser;

    /**
     * 描述：获取属性值-标记 0--未标记 1--已标记 .<br/>
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
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getAcctflag() {
        return acctflag;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param acctflag : 设置值. <br/>
     */
    public void setAcctflag(String acctflag) {
        this.acctflag = acctflag;
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
     * 描述：获取属性值-是否抓取用户信息标识,0为不需要抓取,1为需要抓取.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getIsgrab() {
        return isgrab;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param isgrab :是否抓取用户信息标识,0为不需要抓取,1为需要抓取 设置值. <br/>
     */
    public void setIsgrab(String isgrab) {
        this.isgrab = isgrab;
    }

    /**
     * 描述：获取属性值-标记   0--未标记   1--已标记.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getSignflag() {
        return signflag;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param signflag :标记   0--未标记   1--已标记 设置值. <br/>
     */
    public void setSignflag(String signflag) {
        this.signflag = signflag;
    }

    /**
     * 描述：获取属性值-标记原因.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getSignreason() {
        return signreason;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param signreason :标记原因 设置值. <br/>
     */
    public void setSignreason(String signreason) {
        this.signreason = signreason;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getQauditstatus() {
        return qauditstatus;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param qauditstatus : 设置值. <br/>
     */
    public void setQauditstatus(String qauditstatus) {
        this.qauditstatus = qauditstatus;
    }

    /**
     * 描述：获取属性值-添加用户时间戳.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param timestamp :添加用户时间戳 设置值. <br/>
     */
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * 描述：获取属性值-用户编码.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCustomerid() {
        return customerid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param customerid :用户编码 设置值. <br/>
     */
    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    /**
     * 描述：获取属性值-企业用户的法人名字.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getUsername() {
        return username;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param username :企业用户的法人名字 设置值. <br/>
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 描述：获取属性值-用户类型，00:个人 01:企业.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCustomertype() {
        return customertype;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param customertype :用户类型，00:个人 01:企业 设置值. <br/>
     */
    public void setCustomertype(String customertype) {
        this.customertype = customertype;
    }

    /**
     * 描述：获取属性值-是否内部员工，1--是内部员工，null--不是内部员工.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getIsEmployee() {
        return isEmployee;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param isEmployee :是否内部员工，1--是内部员工，null--不是内部员工 设置值. <br/>
     */
    public void setIsEmployee(String isEmployee) {
        this.isEmployee = isEmployee;
    }

    /**
     * 描述：获取属性值-1成功，2：失败 3：中间状态.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getIsFasttrialStatus() {
        return isFasttrialStatus;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param isFasttrialStatus :1成功，2：失败 3：中间状态 设置值. <br/>
     */
    public void setIsFasttrialStatus(String isFasttrialStatus) {
        this.isFasttrialStatus = isFasttrialStatus;
    }

    /**
     * 描述：获取属性值-中文名称.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCustomername() {
        return customername;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param customername :中文名称 设置值. <br/>
     */
    public void setCustomername(String customername) {
        this.customername = customername;
    }

    /**
     * 描述：获取属性值-证件类型，01:身份证.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCustomerpidtype() {
        return customerpidtype;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param customerpidtype :证件类型，01:身份证 设置值. <br/>
     */
    public void setCustomerpidtype(String customerpidtype) {
        this.customerpidtype = customerpidtype;
    }

    /**
     * 描述：获取属性值-证件号码.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCustomerpid() {
        return customerpid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param customerpid :证件号码 设置值. <br/>
     */
    public void setCustomerpid(String customerpid) {
        this.customerpid = customerpid;
    }

    /**
     * 描述：获取属性值-创建日期.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCustomerregdate() {
        return customerregdate;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param customerregdate :创建日期 设置值. <br/>
     */
    public void setCustomerregdate(String customerregdate) {
        this.customerregdate = customerregdate;
    }

    /**
     * 描述：获取属性值-所属机构.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getBranchid() {
        return branchid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param branchid :所属机构 设置值. <br/>
     */
    public void setBranchid(String branchid) {
        this.branchid = branchid;
    }

    /**
     * 描述：获取属性值-是否关注，Y:关注 N:不关注.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getAttention() {
        return attention;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param attention :是否关注，Y:关注 N:不关注 设置值. <br/>
     */
    public void setAttention(String attention) {
        this.attention = attention;
    }

    /**
     * 描述：获取属性值-是否认证，0:未认证 1:完善资料 2：审核中  3：认证通过, 4-审核失败，5--头像上传中，6--法人信息已完善，7--商户信息已完善，8--法人图片上传中，9--商户图片上传中，A--法人信息审核中，B--黑名单用户，C--商户信息审核中，D--法人审核失败，E--商户审核失败.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCustomertag() {
        return customertag;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param customertag :是否认证，0:未认证 1:完善资料 2：审核中  3：认证通过, 4-审核失败，5--头像上传中，6--法人信息已完善，7--商户信息已完善，8--法人图片上传中，9--商户图片上传中，A--法人信息审核中，B--黑名单用户，C--商户信息审核中，D--法人审核失败，E--商户审核失败 设置值. <br/>
     */
    public void setCustomertag(String customertag) {
        this.customertag = customertag;
    }

    /**
     * 描述：获取属性值-用户等级.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getViplevel() {
        return viplevel;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param viplevel :用户等级 设置值. <br/>
     */
    public void setViplevel(Integer viplevel) {
        this.viplevel = viplevel;
    }

    /**
     * 描述：获取属性值-变更日期.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getLastchangedate() {
        return lastchangedate;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param lastchangedate :变更日期 设置值. <br/>
     */
    public void setLastchangedate(String lastchangedate) {
        this.lastchangedate = lastchangedate;
    }

    /**
     * 描述：获取属性值-用户权限，X0 冻结X天 40永久冻结.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param memo :用户权限，X0 冻结X天 40永久冻结 设置值. <br/>
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * 描述：获取属性值-邮箱.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getEmail() {
        return email;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param email :邮箱 设置值. <br/>
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 描述：获取属性值-注册地址.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCustomeraddr() {
        return customeraddr;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param customeraddr :注册地址 设置值. <br/>
     */
    public void setCustomeraddr(String customeraddr) {
        this.customeraddr = customeraddr;
    }

    /**
     * 描述：获取属性值-商户营业执照.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getBusinesslicence() {
        return businesslicence;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param businesslicence :商户营业执照 设置值. <br/>
     */
    public void setBusinesslicence(String businesslicence) {
        this.businesslicence = businesslicence;
    }

    /**
     * 描述：获取属性值-审核状态.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCheckrange() {
        return checkrange;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param checkrange :审核状态 设置值. <br/>
     */
    public void setCheckrange(String checkrange) {
        this.checkrange = checkrange;
    }

    /**
     * 描述：获取属性值-初审次数.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getFirstreject() {
        return firstreject;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param firstreject :初审次数 设置值. <br/>
     */
    public void setFirstreject(Integer firstreject) {
        this.firstreject = firstreject;
    }

    /**
     * 描述：获取属性值-复审次数.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getFinalreject() {
        return finalreject;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param finalreject :复审次数 设置值. <br/>
     */
    public void setFinalreject(Integer finalreject) {
        this.finalreject = finalreject;
    }

    /**
     * 描述：获取属性值-客户手机号信息.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getMobilenolocate() {
        return mobilenolocate;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param mobilenolocate :客户手机号信息 设置值. <br/>
     */
    public void setMobilenolocate(String mobilenolocate) {
        this.mobilenolocate = mobilenolocate;
    }

    /**
     * 描述：获取属性值-标识.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param remark :标识 设置值. <br/>
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 描述：获取属性值-信用卡状态.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCredittag() {
        return credittag;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param credittag :信用卡状态 设置值. <br/>
     */
    public void setCredittag(String credittag) {
        this.credittag = credittag;
    }

    /**
     * 描述：获取属性值-身份证有效期开始.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getIdcardvalidbegin() {
        return idcardvalidbegin;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param idcardvalidbegin :身份证有效期开始 设置值. <br/>
     */
    public void setIdcardvalidbegin(String idcardvalidbegin) {
        this.idcardvalidbegin = idcardvalidbegin;
    }

    /**
     * 描述：获取属性值-身份证有效期结束.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getIdcardvalidend() {
        return idcardvalidend;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param idcardvalidend :身份证有效期结束 设置值. <br/>
     */
    public void setIdcardvalidend(String idcardvalidend) {
        this.idcardvalidend = idcardvalidend;
    }

    /**
     * 描述：获取属性值-信用卡有效期结束.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCreditvalid() {
        return creditvalid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param creditvalid :信用卡有效期结束 设置值. <br/>
     */
    public void setCreditvalid(String creditvalid) {
        this.creditvalid = creditvalid;
    }

    /**
     * 描述：获取属性值-0.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getAuditflag() {
        return auditflag;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param auditflag :0 设置值. <br/>
     */
    public void setAuditflag(String auditflag) {
        this.auditflag = auditflag;
    }

    /**
     * 描述：获取属性值-1无权限，0有权限.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getPerflag() {
        return perflag;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param perflag :1无权限，0有权限 设置值. <br/>
     */
    public void setPerflag(String perflag) {
        this.perflag = perflag;
    }

    /**
     * 描述：获取属性值-用户是否已经添加公共图片 0 未添加 1 已添加.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getShopstatus() {
        return shopstatus;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param shopstatus :用户是否已经添加公共图片 0 未添加 1 已添加 设置值. <br/>
     */
    public void setShopstatus(String shopstatus) {
        this.shopstatus = shopstatus;
    }

    /**
     * 描述：获取属性值-最后一次重置密码.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getLastresetpassword() {
        return lastresetpassword;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param lastresetpassword :最后一次重置密码 设置值. <br/>
     */
    public void setLastresetpassword(String lastresetpassword) {
        this.lastresetpassword = lastresetpassword;
    }

    /**
     * 描述：获取属性值-0表示不显示 1表示显示 .<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getFeatureflag() {
        return featureflag;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param featureflag :0表示不显示 1表示显示  设置值. <br/>
     */
    public void setFeatureflag(String featureflag) {
        this.featureflag = featureflag;
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
     * 方法名： getIfNewUser.<br/>
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月30日.<br/>
     * 创建时间：上午10:56:01.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public String getIfNewUser() {
        return ifNewUser;
    }

    /** 
     * 方法名： setIfNewUser.<br/>
     * 参数： @param ifNewUser 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月30日.<br/>
     * 创建时间：上午10:56:01.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void setIfNewUser(String ifNewUser) {
        this.ifNewUser = ifNewUser;
    }
}
