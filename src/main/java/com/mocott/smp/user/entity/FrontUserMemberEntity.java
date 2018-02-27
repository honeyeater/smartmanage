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
 * @Description: 会员信息表
 * @author onlineGenerator
 * @date 2018-01-23 11:02:03
 * @version V1.0   
 *
 */
@Entity
@Table(name = "front_user_member", schema = "")
@SuppressWarnings("serial")
public class FrontUserMemberEntity implements java.io.Serializable {
	/**ID*/
	private java.lang.String id;
	/**用户名*/
    @Excel(name="用户名",width=15)
	private java.lang.String username;
	/**会员级别*/
    @Excel(name="会员级别",width=15)
	private java.lang.String userLevel;
	/**账户总值*/
    @Excel(name="账户总值",width=15)
	private java.lang.Double sumAmount;
	/**直推人数*/
    @Excel(name="直推人数",width=15)
	private java.lang.String introNums;
	/**团队人数*/
    @Excel(name="团队人数",width=15)
	private java.lang.String teamNums;
	/**本息钱包*/
    @Excel(name="本息钱包",width=15)
	private java.lang.Double couponWallet;
	/**直推钱包*/
    @Excel(name="直推钱包",width=15)
	private java.lang.Double introWallet;
	/**冻结钱包*/
    @Excel(name="冻结钱包",width=15)
	private java.lang.Double blockWallet;
	/**红包钱包*/
    @Excel(name="红包钱包",width=15)
	private java.lang.Double redWallet;
	/**待返钱包*/
    @Excel(name="待返钱包",width=15)
	private java.lang.Double backWallet;
	/**激活资金*/
    @Excel(name="激活资金",width=15)
	private java.lang.Double activeCost;
	/**总共限额*/
    @Excel(name="总共限额",width=15)
	private java.lang.Double sumLimit;
	/**已用限额*/
    @Excel(name="已用限额",width=15)
	private java.lang.Double useLimit;
	/**输入日期*/
    @Excel(name="输入日期",width=15,format = "yyyy-MM-dd")
	private java.util.Date inputtime;
	/**插入时间*/
    @Excel(name="插入时间",width=15,format = "yyyy-MM-dd")
	private java.util.Date inserttimeforhis;
	/**更新时间*/
    @Excel(name="更新时间",width=15,format = "yyyy-MM-dd")
	private java.util.Date operatetimeforhis;
	/**扩展字符字段*/
    @Excel(name="扩展字符字段",width=15)
	private java.lang.String vfield1;
	/**扩展字符字段*/
    @Excel(name="扩展字符字段",width=15)
	private java.lang.String vfield2;
	/**扩展字符字段*/
    @Excel(name="扩展字符字段",width=15)
	private java.lang.String vfield3;
	/**扩展字符字段*/
    @Excel(name="扩展字符字段",width=15)
	private java.lang.String vfield4;
	/**扩展字符字段*/
    @Excel(name="扩展字符字段",width=15)
	private java.lang.String vfield5;
	/**扩展字符字段*/
    @Excel(name="扩展字符字段",width=15)
	private java.lang.String vfield6;
	/**扩展金额字段*/
    @Excel(name="扩展金额字段",width=15)
	private java.lang.Double nfield1;
	/**扩展金额字段*/
    @Excel(name="扩展金额字段",width=15)
	private java.lang.Double nfield2;
	/**扩展金额字段*/
    @Excel(name="扩展金额字段",width=15)
	private java.lang.Double nfield3;
	/**扩展金额字段*/
    @Excel(name="扩展金额字段",width=15)
	private java.lang.Double nfield4;
	/**扩展时间字段*/
    @Excel(name="扩展时间字段",width=15,format = "yyyy-MM-dd")
	private java.util.Date dfield1;
	/**扩展时间字段*/
    @Excel(name="扩展时间字段",width=15,format = "yyyy-MM-dd")
	private java.util.Date dfield2;
	/**扩展时间字段*/
    @Excel(name="扩展时间字段",width=15,format = "yyyy-MM-dd")
	private java.util.Date dfield3;
	/**扩展时间字段*/
    @Excel(name="扩展时间字段",width=15,format = "yyyy-MM-dd")
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
	public java.lang.String getUsername(){
		return this.username;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  用户名
	 */
	public void setUsername(java.lang.String username){
		this.username = username;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  会员级别
	 */
	@Column(name ="USER_LEVEL",nullable=true,length=40)
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
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  账户总值
	 */
	@Column(name ="SUM_AMOUNT",nullable=true,scale=3,length=14)
	public java.lang.Double getSumAmount(){
		return this.sumAmount;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  账户总值
	 */
	public void setSumAmount(java.lang.Double sumAmount){
		this.sumAmount = sumAmount;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  直推人数
	 */
	@Column(name ="INTRO_NUMS",nullable=true,length=4)
	public java.lang.String getIntroNums(){
		return this.introNums;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  直推人数
	 */
	public void setIntroNums(java.lang.String introNums){
		this.introNums = introNums;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  团队人数
	 */
	@Column(name ="TEAM_NUMS",nullable=true,length=4)
	public java.lang.String getTeamNums(){
		return this.teamNums;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  团队人数
	 */
	public void setTeamNums(java.lang.String teamNums){
		this.teamNums = teamNums;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  本息钱包
	 */
	@Column(name ="COUPON_WALLET",nullable=true,scale=3,length=14)
	public java.lang.Double getCouponWallet(){
		return this.couponWallet;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  本息钱包
	 */
	public void setCouponWallet(java.lang.Double couponWallet){
		this.couponWallet = couponWallet;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  直推钱包
	 */
	@Column(name ="INTRO_WALLET",nullable=true,scale=3,length=14)
	public java.lang.Double getIntroWallet(){
		return this.introWallet;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  直推钱包
	 */
	public void setIntroWallet(java.lang.Double introWallet){
		this.introWallet = introWallet;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  冻结钱包
	 */
	@Column(name ="BLOCK_WALLET",nullable=true,scale=3,length=14)
	public java.lang.Double getBlockWallet(){
		return this.blockWallet;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  冻结钱包
	 */
	public void setBlockWallet(java.lang.Double blockWallet){
		this.blockWallet = blockWallet;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  红包钱包
	 */
	@Column(name ="RED_WALLET",nullable=true,scale=3,length=14)
	public java.lang.Double getRedWallet(){
		return this.redWallet;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  红包钱包
	 */
	public void setRedWallet(java.lang.Double redWallet){
		this.redWallet = redWallet;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  待返钱包
	 */
	@Column(name ="BACK_WALLET",nullable=true,scale=3,length=14)
	public java.lang.Double getBackWallet(){
		return this.backWallet;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  待返钱包
	 */
	public void setBackWallet(java.lang.Double backWallet){
		this.backWallet = backWallet;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  激活资金
	 */
	@Column(name ="ACTIVE_COST",nullable=true,scale=3,length=14)
	public java.lang.Double getActiveCost(){
		return this.activeCost;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  激活资金
	 */
	public void setActiveCost(java.lang.Double activeCost){
		this.activeCost = activeCost;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  总共限额
	 */
	@Column(name ="SUM_LIMIT",nullable=true,scale=3,length=14)
	public java.lang.Double getSumLimit(){
		return this.sumLimit;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  总共限额
	 */
	public void setSumLimit(java.lang.Double sumLimit){
		this.sumLimit = sumLimit;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  已用限额
	 */
	@Column(name ="USE_LIMIT",nullable=true,scale=3,length=14)
	public java.lang.Double getUseLimit(){
		return this.useLimit;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  已用限额
	 */
	public void setUseLimit(java.lang.Double useLimit){
		this.useLimit = useLimit;
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
