package com.mocott.smp.user.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.lang.String;
import java.lang.Double;
import java.lang.Integer;
import java.math.BigDecimal;
import javax.xml.soap.Text;
import java.sql.Blob;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.SequenceGenerator;
import org.jeecgframework.poi.excel.annotation.Excel;

/**   
 * @Title: Entity
 * @Description: 注册用户信息表
 * @author onlineGenerator
 * @date 2018-01-23 11:02:16
 * @version V1.0   
 *
 */
@Entity
@Table(name = "front_user_register", schema = "")
@SuppressWarnings("serial")
public class FrontUserRegisterEntity implements java.io.Serializable {
	/**ID*/
	private java.lang.String id;
	/**用户名*/
    @Excel(name="用户名",width=15)
	private java.lang.String userName;
	/**手机号*/
    @Excel(name="手机号",width=15)
	private java.lang.String phoneno;
	/**身份证号*/
    @Excel(name="身份证号",width=15)
	private java.lang.String identityNo;
	/**真实姓名*/
    @Excel(name="真实姓名",width=15)
	private java.lang.String realname;
	/**银行省份*/
    @Excel(name="银行省份",width=15)
	private java.lang.String province;
	/**银行城市*/
    @Excel(name="银行城市",width=15)
	private java.lang.String city;
	/**开户银行代码*/
    @Excel(name="开户银行",width=15)
	private java.lang.String bankCode;
	/**开户银行*/
	private java.lang.String bankName;
	/**银行卡号*/
    @Excel(name="银行卡号",width=15)
	private java.lang.String bankCard;
	/**银行详细地址*/
    @Excel(name="银行详细地址",width=15)
	private java.lang.String bankAddress;
	/**登录密码*/
	private java.lang.String password;
	/**安全密码*/
	private java.lang.String safePassword;
	/**注册时间*/
    @Excel(name="注册时间",width=15,format = "yyyy-MM-dd")
	private java.util.Date registerTime;
	/**注册IP地址*/
	private java.lang.String registerIp;
	/**联系电话*/
	private java.lang.String linkerMobile;
	/**居住地址*/
	private java.lang.String address;
	/**是否激活*/
    @Excel(name="是否激活",width=15)
	private java.lang.String validFlag;
	/**激活时间*/
	private java.util.Date activeTime;
	/**会员级别*/
	private java.lang.String userLevel;
	/**推荐人用户名*/
    @Excel(name="推荐人用户名",width=15)
	private java.lang.String introducer;
	/**输入日期*/
	private java.util.Date inputtime;
	/**插入时间*/
	private java.util.Date inserttimeforhis;
	/**更新时间*/
	private java.util.Date operatetimeforhis;
	/**扩展字符字段*/
	private java.lang.String vfield1;
	/**扩展字符字段*/
	private java.lang.String vfield2;
	/**扩展字符字段*/
	private java.lang.String vfield3;
	/**扩展字符字段*/
	private java.lang.String vfield4;
	/**扩展字符字段*/
	private java.lang.String vfield5;
	/**扩展字符字段*/
	private java.lang.String vfield6;
	/**扩展金额字段*/
	private java.lang.Double nfield1;
	/**扩展金额字段*/
	private java.lang.Double nfield2;
	/**扩展金额字段*/
	private java.lang.Double nfield3;
	/**扩展金额字段*/
	private java.lang.Double nfield4;
	/**扩展时间字段*/
	private java.util.Date dfield1;
	/**扩展时间字段*/
	private java.util.Date dfield2;
	/**扩展时间字段*/
	private java.util.Date dfield3;
	/**扩展时间字段*/
	private java.util.Date dfield4;
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  ID
	 */
	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
	@Column(name ="ID",nullable=false,length=32)
	public java.lang.String getId(){
		return this.id;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  ID
	 */
	public void setId(java.lang.String id){
		this.id = id;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  用户名
	 */
	@Column(name ="USERNAME",nullable=true,length=32)
	public java.lang.String getUserName(){
		return this.userName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  用户名
	 */
	public void setUserName(java.lang.String userName){
		this.userName = userName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  手机号
	 */
	@Column(name ="PHONENO",nullable=true,length=40)
	public java.lang.String getPhoneno(){
		return this.phoneno;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  手机号
	 */
	public void setPhoneno(java.lang.String phoneno){
		this.phoneno = phoneno;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  身份证号
	 */
	@Column(name ="IDENTITY_NO",nullable=true,length=32)
	public java.lang.String getIdentityNo(){
		return this.identityNo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  身份证号
	 */
	public void setIdentityNo(java.lang.String identityNo){
		this.identityNo = identityNo;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  真实姓名
	 */
	@Column(name ="REALNAME",nullable=true,length=100)
	public java.lang.String getRealname(){
		return this.realname;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  真实姓名
	 */
	public void setRealname(java.lang.String realname){
		this.realname = realname;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  银行省份
	 */
	@Column(name ="PROVINCE",nullable=true,length=64)
	public java.lang.String getProvince(){
		return this.province;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  银行省份
	 */
	public void setProvince(java.lang.String province){
		this.province = province;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  银行城市
	 */
	@Column(name ="CITY",nullable=true,length=64)
	public java.lang.String getCity(){
		return this.city;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  银行城市
	 */
	public void setCity(java.lang.String city){
		this.city = city;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  开户银行代码
	 */
	@Column(name ="BANK_CODE",nullable=true,length=20)
	public java.lang.String getBankCode(){
		return this.bankCode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  开户银行代码
	 */
	public void setBankCode(java.lang.String bankCode){
		this.bankCode = bankCode;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  开户银行
	 */
	@Column(name ="BANK_NAME",nullable=true,length=200)
	public java.lang.String getBankName(){
		return this.bankName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  开户银行
	 */
	public void setBankName(java.lang.String bankName){
		this.bankName = bankName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  银行卡号
	 */
	@Column(name ="BANK_CARD",nullable=true,length=32)
	public java.lang.String getBankCard(){
		return this.bankCard;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  银行卡号
	 */
	public void setBankCard(java.lang.String bankCard){
		this.bankCard = bankCard;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  银行详细地址
	 */
	@Column(name ="BANK_ADDRESS",nullable=true,length=200)
	public java.lang.String getBankAddress(){
		return this.bankAddress;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  银行详细地址
	 */
	public void setBankAddress(java.lang.String bankAddress){
		this.bankAddress = bankAddress;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  登录密码
	 */
	@Column(name ="PASSWORD",nullable=true,length=100)
	public java.lang.String getPassword(){
		return this.password;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  登录密码
	 */
	public void setPassword(java.lang.String password){
		this.password = password;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  安全密码
	 */
	@Column(name ="SAFE_PASSWORD",nullable=true,length=100)
	public java.lang.String getSafePassword(){
		return this.safePassword;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  安全密码
	 */
	public void setSafePassword(java.lang.String safePassword){
		this.safePassword = safePassword;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  注册时间
	 */
	@Column(name ="REGISTER_TIME",nullable=true)
	public java.util.Date getRegisterTime(){
		return this.registerTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  注册时间
	 */
	public void setRegisterTime(java.util.Date registerTime){
		this.registerTime = registerTime;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  注册IP地址
	 */
	@Column(name ="REGISTER_IP",nullable=true,length=32)
	public java.lang.String getRegisterIp(){
		return this.registerIp;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  注册IP地址
	 */
	public void setRegisterIp(java.lang.String registerIp){
		this.registerIp = registerIp;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  联系电话
	 */
	@Column(name ="LINKER_MOBILE",nullable=true,length=20)
	public java.lang.String getLinkerMobile(){
		return this.linkerMobile;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  联系电话
	 */
	public void setLinkerMobile(java.lang.String linkerMobile){
		this.linkerMobile = linkerMobile;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  居住地址
	 */
	@Column(name ="ADDRESS",nullable=true,length=200)
	public java.lang.String getAddress(){
		return this.address;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  居住地址
	 */
	public void setAddress(java.lang.String address){
		this.address = address;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  是否激活
	 */
	@Column(name ="VALID_FLAG",nullable=true,length=4)
	public java.lang.String getValidFlag(){
		return this.validFlag;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  是否激活
	 */
	public void setValidFlag(java.lang.String validFlag){
		this.validFlag = validFlag;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  激活时间
	 */
	@Column(name ="ACTIVE_TIME",nullable=true)
	public java.util.Date getActiveTime(){
		return this.activeTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  激活时间
	 */
	public void setActiveTime(java.util.Date activeTime){
		this.activeTime = activeTime;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  会员级别
	 */
	@Column(name ="USER_LEVEL",nullable=true,length=4)
	public java.lang.String getUserLevel(){
		return this.userLevel;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  会员级别
	 */
	public void setUserLevel(java.lang.String userLevel){
		this.userLevel = userLevel;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  推荐人用户名
	 */
	@Column(name ="INTRODUCER",nullable=true,length=32)
	public java.lang.String getIntroducer(){
		return this.introducer;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  推荐人用户名
	 */
	public void setIntroducer(java.lang.String introducer){
		this.introducer = introducer;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  输入日期
	 */
	@Column(name ="INPUTTIME",nullable=true)
	public java.util.Date getInputtime(){
		return this.inputtime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  输入日期
	 */
	public void setInputtime(java.util.Date inputtime){
		this.inputtime = inputtime;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  插入时间
	 */
	@Column(name ="INSERTTIMEFORHIS",nullable=true)
	public java.util.Date getInserttimeforhis(){
		return this.inserttimeforhis;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  插入时间
	 */
	public void setInserttimeforhis(java.util.Date inserttimeforhis){
		this.inserttimeforhis = inserttimeforhis;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  更新时间
	 */
	@Column(name ="OPERATETIMEFORHIS",nullable=true)
	public java.util.Date getOperatetimeforhis(){
		return this.operatetimeforhis;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  更新时间
	 */
	public void setOperatetimeforhis(java.util.Date operatetimeforhis){
		this.operatetimeforhis = operatetimeforhis;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  扩展字符字段
	 */
	@Column(name ="VFIELD1",nullable=true,length=255)
	public java.lang.String getVfield1(){
		return this.vfield1;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  扩展字符字段
	 */
	public void setVfield1(java.lang.String vfield1){
		this.vfield1 = vfield1;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  扩展字符字段
	 */
	@Column(name ="VFIELD2",nullable=true,length=255)
	public java.lang.String getVfield2(){
		return this.vfield2;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  扩展字符字段
	 */
	public void setVfield2(java.lang.String vfield2){
		this.vfield2 = vfield2;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  扩展字符字段
	 */
	@Column(name ="VFIELD3",nullable=true,length=255)
	public java.lang.String getVfield3(){
		return this.vfield3;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  扩展字符字段
	 */
	public void setVfield3(java.lang.String vfield3){
		this.vfield3 = vfield3;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  扩展字符字段
	 */
	@Column(name ="VFIELD4",nullable=true,length=255)
	public java.lang.String getVfield4(){
		return this.vfield4;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  扩展字符字段
	 */
	public void setVfield4(java.lang.String vfield4){
		this.vfield4 = vfield4;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  扩展字符字段
	 */
	@Column(name ="VFIELD5",nullable=true,length=255)
	public java.lang.String getVfield5(){
		return this.vfield5;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  扩展字符字段
	 */
	public void setVfield5(java.lang.String vfield5){
		this.vfield5 = vfield5;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  扩展字符字段
	 */
	@Column(name ="VFIELD6",nullable=true,length=255)
	public java.lang.String getVfield6(){
		return this.vfield6;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  扩展字符字段
	 */
	public void setVfield6(java.lang.String vfield6){
		this.vfield6 = vfield6;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  扩展金额字段
	 */
	@Column(name ="NFIELD1",nullable=true,scale=3,length=10)
	public java.lang.Double getNfield1(){
		return this.nfield1;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  扩展金额字段
	 */
	public void setNfield1(java.lang.Double nfield1){
		this.nfield1 = nfield1;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  扩展金额字段
	 */
	@Column(name ="NFIELD2",nullable=true,scale=3,length=10)
	public java.lang.Double getNfield2(){
		return this.nfield2;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  扩展金额字段
	 */
	public void setNfield2(java.lang.Double nfield2){
		this.nfield2 = nfield2;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  扩展金额字段
	 */
	@Column(name ="NFIELD3",nullable=true,scale=3,length=10)
	public java.lang.Double getNfield3(){
		return this.nfield3;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  扩展金额字段
	 */
	public void setNfield3(java.lang.Double nfield3){
		this.nfield3 = nfield3;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  扩展金额字段
	 */
	@Column(name ="NFIELD4",nullable=true,scale=3,length=10)
	public java.lang.Double getNfield4(){
		return this.nfield4;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  扩展金额字段
	 */
	public void setNfield4(java.lang.Double nfield4){
		this.nfield4 = nfield4;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  扩展时间字段
	 */
	@Column(name ="DFIELD1",nullable=true)
	public java.util.Date getDfield1(){
		return this.dfield1;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  扩展时间字段
	 */
	public void setDfield1(java.util.Date dfield1){
		this.dfield1 = dfield1;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  扩展时间字段
	 */
	@Column(name ="DFIELD2",nullable=true)
	public java.util.Date getDfield2(){
		return this.dfield2;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  扩展时间字段
	 */
	public void setDfield2(java.util.Date dfield2){
		this.dfield2 = dfield2;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  扩展时间字段
	 */
	@Column(name ="DFIELD3",nullable=true)
	public java.util.Date getDfield3(){
		return this.dfield3;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  扩展时间字段
	 */
	public void setDfield3(java.util.Date dfield3){
		this.dfield3 = dfield3;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  扩展时间字段
	 */
	@Column(name ="DFIELD4",nullable=true)
	public java.util.Date getDfield4(){
		return this.dfield4;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  扩展时间字段
	 */
	public void setDfield4(java.util.Date dfield4){
		this.dfield4 = dfield4;
	}
}
