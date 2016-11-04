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
public class UserInfoQueryResultBean {

    /** 客户号 */
    private String customerId;
    /** 姓名 */
    private String realName;
    /** 客户身份证号 */
    private String certPid;
    /** 机构号 */
    private String branchId;
    /** VIP等级 */
    private String vipLevel;
    /** 是否关注 Y:关注 N:不关注 */
    private String attention;
    /** 用户审核状态customertag 是否认证，0:未认证 1:完善资料 2：审核中  3：认证通过, 4-审核失败，5--头像上传中，6--法人信息已完善，7--商户信息已完善，8--法人图片上传中，9--商户图片上传中，A--法人信息审核中，B--黑名单用户，C--商户信息审核中，D--法人审核失败，E--商户审核失败 */
    private String authenFlag;
    /** 邮箱号 */
    private String email;
    /** 身份证审核描述 */
    private String remark;
    /** 用户类型*/
    private String customerType;
    /** 商户地址*/
    private String customerAddr;
    /** 商户凭证号 BUSINESSLICENCE*/
    private String businessLicence;
    /**商户名称*/
    private String customerName;
    /** 用户权限，X0 冻结X天 40永久冻结 */
    private String memo;
    /** 提现当日额度 */
    private String accountday;
    /** 用户等级对应描述 */
    private String tagDesc;
    /** 审核标识 */
    private String auditFlag;
    /** 担保人号 */
    private String guarantorId;
    /** 信用卡状态 */
    private String creditTag;
    /** 用户等级描述*/
    private String vipLevelDescription;
    /** 用户初审还是终审标志 */
    private String checkrange;
    /** 是否开通理财功能 1表示开通成功 */
    private String acctFlag;
    /** 理财审核状态描述 */
    private String statusDesc;
    /** 证件类型 */
    private String certType;
    /** 是否设置支付密码标识*/
    private String payPassFlag;


    /** 
     * 方法名： getCustomerId.<br/>
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月23日.<br/>
     * 创建时间：下午4:00:57.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public String getCustomerId() {
        return customerId;
    }

    /** 
     * 方法名： setCustomerId.<br/>
     *
     * 参数： @param customerId 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月23日.<br/>
     * 创建时间：下午4:00:57.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /** 
     * 方法名： getRealName.<br/>
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月23日.<br/>
     * 创建时间：下午4:00:57.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public String getRealName() {
        return realName;
    }

    /** 
     * 方法名： setRealName.<br/>
     *
     * 参数： @param realName 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月23日.<br/>
     * 创建时间：下午4:00:57.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /** 
     * 方法名： getCertPid.<br/>
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月23日.<br/>
     * 创建时间：下午4:00:57.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public String getCertPid() {
        return certPid;
    }

    /** 
     * 方法名： setCertPid.<br/>
     *
     * 参数： @param certPid 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月23日.<br/>
     * 创建时间：下午4:00:57.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void setCertPid(String certPid) {
        this.certPid = certPid;
    }

    /** 
     * 方法名： getBranchId.<br/>
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月23日.<br/>
     * 创建时间：下午4:00:57.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public String getBranchId() {
        return branchId;
    }

    /** 
     * 方法名： setBranchId.<br/>
     *
     * 参数： @param branchId 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月23日.<br/>
     * 创建时间：下午4:00:57.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    /** 
     * 方法名： getVipLevel.<br/>
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月23日.<br/>
     * 创建时间：下午4:00:57.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public String getVipLevel() {
        return vipLevel;
    }

    /** 
     * 方法名： setVipLevel.<br/>
     *
     * 参数： @param vipLevel 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月23日.<br/>
     * 创建时间：下午4:00:57.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void setVipLevel(String vipLevel) {
        this.vipLevel = vipLevel;
    }

    /** 
     * 方法名： getAttention.<br/>
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月23日.<br/>
     * 创建时间：下午4:00:57.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public String getAttention() {
        return attention;
    }

    /** 
     * 方法名： setAttention.<br/>
     *
     * 参数： @param attention 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月23日.<br/>
     * 创建时间：下午4:00:57.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void setAttention(String attention) {
        this.attention = attention;
    }

    /** 
     * 方法名： getAuthenFlag.<br/>
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月23日.<br/>
     * 创建时间：下午4:00:57.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public String getAuthenFlag() {
        return authenFlag;
    }

    /** 
     * 方法名： setAuthenFlag.<br/>
     *
     * 参数： @param authenFlag 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月23日.<br/>
     * 创建时间：下午4:00:57.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void setAuthenFlag(String authenFlag) {
        this.authenFlag = authenFlag;
    }

    /** 
     * 方法名： getEmail.<br/>
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月23日.<br/>
     * 创建时间：下午4:00:57.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public String getEmail() {
        return email;
    }

    /** 
     * 方法名： setEmail.<br/>
     *
     * 参数： @param email 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月23日.<br/>
     * 创建时间：下午4:00:57.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /** 
     * 方法名： getRemark.<br/>
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月23日.<br/>
     * 创建时间：下午4:00:57.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public String getRemark() {
        return remark;
    }

    /** 
     * 方法名： setRemark.<br/>
     * 参数： @param remark 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月23日.<br/>
     * 创建时间：下午4:00:57.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /** 
     * 方法名： getCustomerType.<br/>
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月23日.<br/>
     * 创建时间：下午4:00:57.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public String getCustomerType() {
        return customerType;
    }

    /** 
     * 方法名： setCustomerType.<br/>
     *
     * 参数： @param customerType 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月23日.<br/>
     * 创建时间：下午4:00:57.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    /** 
     * 方法名： getCustomerAddr.<br/>
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月23日.<br/>
     * 创建时间：下午4:00:57.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public String getCustomerAddr() {
        return customerAddr;
    }

    /** 
     * 方法名： setCustomerAddr.<br/>
     *
     * 参数： @param customerAddr 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月23日.<br/>
     * 创建时间：下午4:00:57.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void setCustomerAddr(String customerAddr) {
        this.customerAddr = customerAddr;
    }

    /** 
     * 方法名： getBusinessLicence.<br/>
     * 
     *  
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月23日.<br/>
     * 创建时间：下午4:00:57.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public String getBusinessLicence() {
        return businessLicence;
    }

    /** 
     * 方法名： setBusinessLicence.<br/>
     * 
     *  
     * 
     * 
     *
     * 参数： @param businessLicence 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月23日.<br/>
     * 创建时间：下午4:00:57.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void setBusinessLicence(String businessLicence) {
        this.businessLicence = businessLicence;
    }

    /** 
     * 方法名： getCustomerName.<br/>
     * 
     *  
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月23日.<br/>
     * 创建时间：下午4:00:57.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public String getCustomerName() {
        return customerName;
    }

    /** 
     * 方法名： setCustomerName.<br/>
     * 
     *  
     * 
     * 
     *
     * 参数： @param customerName 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月23日.<br/>
     * 创建时间：下午4:00:57.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /** 
     * 方法名： getMemo.<br/>
     * 
     *  
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月23日.<br/>
     * 创建时间：下午4:00:57.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public String getMemo() {
        return memo;
    }

    /** 
     * 方法名： setMemo.<br/>
     * 
     *  
     * 
     * 
     *
     * 参数： @param memo 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月23日.<br/>
     * 创建时间：下午4:00:57.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /** 
     * 方法名： getAccountday.<br/>
     * 
     *  
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月23日.<br/>
     * 创建时间：下午4:00:57.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public String getAccountday() {
        return accountday;
    }

    /** 
     * 方法名： setAccountday.<br/>
     * 
     *  
     * 
     * 
     *
     * 参数： @param accountday 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月23日.<br/>
     * 创建时间：下午4:00:57.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void setAccountday(String accountday) {
        this.accountday = accountday;
    }

    /** 
     * 方法名： getTagDesc.<br/>
     * 
     *  
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月23日.<br/>
     * 创建时间：下午4:00:57.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public String getTagDesc() {
        return tagDesc;
    }

    /** 
     * 方法名： setTagDesc.<br/>
     * 
     *  
     * 
     * 
     *
     * 参数： @param tagDesc 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月23日.<br/>
     * 创建时间：下午4:00:57.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void setTagDesc(String tagDesc) {
        this.tagDesc = tagDesc;
    }

    /** 
     * 方法名： getAuditFlag.<br/>
     * 
     *  
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月23日.<br/>
     * 创建时间：下午4:00:57.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public String getAuditFlag() {
        return auditFlag;
    }

    /** 
     * 方法名： setAuditFlag.<br/>
     * 
     *  
     * 
     * 
     *
     * 参数： @param auditFlag 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月23日.<br/>
     * 创建时间：下午4:00:57.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void setAuditFlag(String auditFlag) {
        this.auditFlag = auditFlag;
    }

    /** 
     * 方法名： getGuarantorId.<br/>
     * 
     *  
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月23日.<br/>
     * 创建时间：下午4:00:57.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public String getGuarantorId() {
        return guarantorId;
    }

    /** 
     * 方法名： setGuarantorId.<br/>
     * 
     *  
     * 
     * 
     *
     * 参数： @param guarantorId 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月23日.<br/>
     * 创建时间：下午4:00:57.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void setGuarantorId(String guarantorId) {
        this.guarantorId = guarantorId;
    }

    /** 
     * 方法名： getCreditTag.<br/>
     * 
     *  
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月23日.<br/>
     * 创建时间：下午4:00:57.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public String getCreditTag() {
        return creditTag;
    }

    /** 
     * 方法名： setCreditTag.<br/>
     * 
     *  
     * 
     * 
     *
     * 参数： @param creditTag 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月23日.<br/>
     * 创建时间：下午4:00:57.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void setCreditTag(String creditTag) {
        this.creditTag = creditTag;
    }

    /** 
     * 方法名： getVipLevelDescription.<br/>
     * 
     *  
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月23日.<br/>
     * 创建时间：下午4:00:57.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public String getVipLevelDescription() {
        return vipLevelDescription;
    }

    /** 
     * 方法名： setVipLevelDescription.<br/>
     * 
     *  
     * 
     * 
     *
     * 参数： @param vipLevelDescription 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月23日.<br/>
     * 创建时间：下午4:00:57.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void setVipLevelDescription(String vipLevelDescription) {
        this.vipLevelDescription = vipLevelDescription;
    }

    /** 
     * 方法名： getCheckrange.<br/>
     * 
     *  
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月23日.<br/>
     * 创建时间：下午4:00:57.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public String getCheckrange() {
        return checkrange;
    }

    /** 
     * 方法名： setCheckrange.<br/>
     * 
     *  
     * 
     * 
     *
     * 参数： @param checkrange 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月23日.<br/>
     * 创建时间：下午4:00:57.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void setCheckrange(String checkrange) {
        this.checkrange = checkrange;
    }

    /** 
     * 方法名： getAcctFlag.<br/>
     * 
     *  
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月23日.<br/>
     * 创建时间：下午4:00:57.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public String getAcctFlag() {
        return acctFlag;
    }

    /** 
     * 方法名： setAcctFlag.<br/>
     * 
     *  
     * 
     * 
     *
     * 参数： @param acctFlag 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月23日.<br/>
     * 创建时间：下午4:00:57.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void setAcctFlag(String acctFlag) {
        this.acctFlag = acctFlag;
    }

    /** 
     * 方法名： getStatusDesc.<br/>
     * 
     *  
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月23日.<br/>
     * 创建时间：下午4:00:57.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public String getStatusDesc() {
        return statusDesc;
    }

    /** 
     * 方法名： setStatusDesc.<br/>
     * 
     *  
     * 
     * 
     *
     * 参数： @param statusDesc 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月23日.<br/>
     * 创建时间：下午4:00:57.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }

    /** 
     * 方法名： getCertType.<br/>
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月1日.<br/>
     * 创建时间：上午11:27:23.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public String getCertType() {
        return certType;
    }

    /** 
     * 方法名： setCertType.<br/>
     *
     * 参数： @param certType 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月1日.<br/>
     * 创建时间：上午11:27:23.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void setCertType(String certType) {
        this.certType = certType;
    }

    /** 
     * 方法名： getPayPassFlag.<br/>
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月1日.<br/>
     * 创建时间：上午11:31:53.<br/>
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
     * 创建日期：2016年8月1日.<br/>
     * 创建时间：上午11:31:53.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void setPayPassFlag(String payPassFlag) {
        this.payPassFlag = payPassFlag;
    }

    
}
