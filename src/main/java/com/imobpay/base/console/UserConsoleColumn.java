/** 
* 包名: package com.imobpay.base.console; <br/> 
* 添加时间: 2016年11月8日 下午1:44:25 <br/> 
*/
package com.imobpay.base.console;

/**
 * 
 * <pre>
 * 【类型】: User_Console <br/> 
 * 【作用】: 用户服务常量类. <br/>  
 * 【时间】：2016年11月8日 下午1:47:49 <br/> 
 * 【作者】：HuaiYu.Wen <br/> 
 * </pre>
 */
public class UserConsoleColumn {
    /******************搬迁微信服务常量字段开始*****************/
    /** 返回空值 */
    public static final String RETURNNULL               = "";
    /** 交易码 */
    public static final String JYM                      = "JYM";
    /** 跳转URL */
    public static final String RESPONSE_URL             = "RESPONSE_URL";
    /** TA卡用户状态 1 正常 2冻结 */
    public static final String TA_STATUS_1              = "1";
    /** TA卡用户状态 1 正常 2冻结 */
    public static final String TA_STATUS_2              = "2";
    /** 用户状态 1 正常 2冻结 */
    public static final String TA_CUS_STATUS_1          = "1";
    /** 用户状态 1 正常 2冻结 */
    public static final String TA_CUS_STATUS_2          = "2";
    /** 手机号 */
    public static final String MOBILENO                 = "MOBILENO";
    /** 应用类型 */
    public static final String APPUSER                  = "APPUSER";
    /** 登录密码 */
    public static final String PASSWORD                 = "PASSWORD";
    /** 短信验证 */
    public static final String MOBILEMAC                = "MOBILEMAC";
    /** 短信验证 */
    public static final String RS_MOBILEMAC             = "mobileMac";
    /** TA卡号 */
    public static final String TAACCOUNT                = "TAACCOUNT";
    /** 店铺名称 */
    public static final String SHOPNAME                 = "SHOPNAME";
    /** 主营业务 */
    public static final String MAINBUS                  = "MAINBUS";
    /** 经营人姓名 */
    public static final String USEFNAME                 = "USEFNAME";
    /** 证件号码 */
    public static final String CUSTOMERPID              = "CUSTOMERPID";
    /** 客户号 */
    public static final String CUSTOMERID               = "CUSTOMERID";
    /** 省 */
    public static final String PROVINCE                 = "PROVINCE";
    /** 城市 */
    public static final String CITY                     = "CITY";
    /** 区 */
    public static final String REGION                   = "REGION";
    /** 地址 */
    public static final String ADDRESS                  = "ADDRESS";
    /** 卡号 */
    public static final String CARDNO                   = "CARDNO";
    /** 支行号 */
    public static final String BANKBRANCHID             = "BANKBRANCHID";
    /** 卡类型D借记卡 */
    public static final String CARD_TYPE_D              = "D";
    /** IP */
    public static final String IP                       = "IP";
    /** 经度 */
    public static final String LONGITUDE                = "LONGITUDE";
    /** 纬度 */
    public static final String LATITUDE                 = "LATITUDE";
    /** 身份证号码 */
    public static final String IDNO                     = "IDNO";
    /** 短信验证码的验证标识 */
    public static final String CHECKTAG_0               = "0";
    /** TA卡号 */
    public static final String TA_ACCOUNT               = "TAACCOUNT";
    /** 当前页 */
    public static final String CURR_PAGE                = "CURRPAGE";
    /** 来源 app或web */
    public static final String FROMTYPE                 = "FROMTYPE";
    /** 来源 app */
    public static final String FROMAPP                  = "app";
    /** 来源 web */
    public static final String FROMWEB                  = "web";
    /** 每页条数 */
    public static final int    SIZE_PAGE                = 10;
    /** 是否是最后一条 */
    public static final String ISLAST                   = "isLast";
    /** 返回结果 */
    public static final String RESULTS                  = "results";
    /** 返回结果Bean */
    public static final String RESULT_BEAN              = "resultBean";
    /** 当前日期 */
    public static final String RS_LOCALDATE             = "localDate";
    /** 当前时间 */
    public static final String RS_LOCALTIME             = "localTime";
    /** 订单号 */
    public static final String RS_ORDER_ID              = "orderId";
    /** 支付类型 */
    public static final String RS_PAYTYPE               = "payType";
    /** 账号(驼峰命名) */
    public static final String RS_ACCOUNTNO             = "accountNo";
    /** 账号(全大写) */
    public static final String ACCOUNTNO                = "ACCOUNTNO";
    /** 总计 */
    public static final String RS_AMOUNT                = "amount";
    /** TA账号 */
    public static final String RS_TAACCOUNT             = "taAccount";
    /** 手续费 */
    public static final String RS_FEE                   = "fee";
    /** 手续费2 */
    public static final String RS_FD_FEE                = "fdFee";
    /** 经度 */
    public static final String RS_LONGITUDE             = "longitude";
    /** 维度 */
    public static final String RS_LATITUDE              = "latitude";
    /** 返回信息描述 */
    public static final String RS_MSGTEXT               = "msgText";
    /** 返回编码 */
    public static final String RS_MSGCODE               = "msgCode";
    /** 当前日志号 */
    public static final String RS_LOCALLOGNO            = "localLogno";
    /** 商品号 */
    public static final String RS_MERCHANTID            = "merchantId";
    /** 手机号 */
    public static final String MOBILE                   = "mobile";
    /** 姓名 */
    public static final String USERNAME                 = "userName";
    /** 客户身份证 */
    public static final String RS_CUSTOMERPID           = "customerPid";
    /** 商店名称 */
    public static final String RS_SHOPNAME              = "shopName";
    /** 主要业务 */
    public static final String RS_MAIN_BUS              = "mainBus";
    /** 省份 */
    public static final String RS_PROVINCE              = "province";
    /** 城市 */
    public static final String RS_CITY                  = "city";
    /** 地区*/
    public static final String RS_REGION                = "region";
    /** 地址 */
    public static final String RS_ADDRESS               = "address";
    /** 机构号 */
    public static final String RS_BRANCHID              = "branchid";
    /** 状态 */
    public static final String RS_STATUS                = "status";
    /** 账户名称 */
    public static final String RS_ACCOUNTNANME          = "accountName";
    /** 银行ID */
    public static final String RS_BANKID                = "bankId";
    /** 二维码url */
    public static final String RS_QRCODEURL             = "qrCodeUrl";
    /** 返回结果 */
    public static final String RS_CUSTOMERREGDATE       = "customerRegDate";
    /** 返回结果 */
    public static final String UPD_TYPE                 = "UPDTYPE";
    /** 内容 */
    public static final String CONTENT                  = "CONTENT";
    /** 结算卡修改 */
    public static final String UPD_TYPE_1               = "1";
    /** 密码修改 */
    public static final String UPD_TYPE_2               = "2";
    /** 商户信息修改 */
    public static final String UPD_TYPE_3               = "3";
    /** 用户客户端密码 */
    public static final String PAYPASSWORD              = "PAYPASSWORD";
    /** 用户客户端密码 */
    public static final String RS_PAYPASSWORD           = "payPassword";
    /** 用户客户端密码 */
    public static final String RS_NEW_PAYPASSWORD       = "newPassword";
    /** 归属人姓名 */
    public static final String ACCOUNTNAME              = "ACCOUNTNAME";
    /** 微信注册 */
    public static final String PARAME_REG               = "WxReg";
    /** 微信支付 */
    public static final String PARAME_PAY               = "WxPay";
    /** 微信支付 APP跳转 */
    public static final String PARAME_PAY_APP           = "WxPayApp";
    /** 微信冻结 */
    public static final String PARAME_DJ                = "WxDj";
    /** 微信用户openid */
    public static final String OPENID                   = "OPENID";
    /** 微信用户openid */
    public static final String OPENID_X                 = "openId";
    /** 微信APPID */
    public static final String APPID                    = "APPID";
    /** 微信APPID */
    public static final String APPIDVAL                 = "APPIDVAL";
    /** 微信APPID */
    public static final String TICKET                   = "TICKET";
    /** 微信APPID */
    public static final String TICKETVAL                = "TICKETVAL";
    /** 日志进程号 */
    public static final String LOGKEYALL                = "LOGKEYALL";
    /** 授权码 */
    public static final String ACCESSTOKEN              = "ACCESSTOKEN";
    /** 图片存取地址 */
    public static final String PICURL                   = "picURL";
    /** 文件路径 */
    public static final String FILEDIR                  = "FileDir";
    /** 获取公钥 */
    public static final String DES_KEY                  = "3DES_KEY";
    /** 获取盐值 */
    public static final String DES_YAN                  = "3DES_YAN";
    /** 微信公众号 */
    public static final String PUB_ACCOUNT              = "pubAccount";
    /** 机构号 */
    public static final String BRANCHID                 = "branchId";
    /** 问候语 */
    public static final String FIRSTVAL                 = "firstVal";
    /** 推送内容 */
    public static final String KEYWORDVAL               = "keyword{0}Val";
    /** 备注 */
    public static final String REMARKVAL                = "remarkVal";
    /** 交易推送类型 */
    public static final String WX_MSG_TRADE_TYPE        = "wxMsgTradeType";
    /** 消息个数 */
    public static final String WX_MSG_TEM_CONTENT_COUNT = "wxMsgTemContentCount";
    /** 推送详情URL */
    public static final String PUSH_URL                 = "pushUrl";
    /** 用户ID */
    public static final String TOUSER                   = "touser";
    /** 模板ID */
    public static final String TEMPLATE_ID              = "template_id";
    /** 发送数据 */
    public static final String DATA                     = "data";
    /** 详情url */
    public static final String URL                      = "url";
    /** 需要特殊处理的appuser和feeid(第一版只用于瑞钱包VIP)参数配置KEY */
    public static final String VIPAPPUSER               = "VIPAPPUSER";
    /******************搬迁微信服务常量字段结束*****************/

}
