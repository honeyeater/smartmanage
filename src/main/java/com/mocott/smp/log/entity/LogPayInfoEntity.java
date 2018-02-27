package com.mocott.smp.log.entity;

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
 * @Description: 支付日志信息表
 * @author onlineGenerator
 * @date 2018-01-23 11:02:39
 * @version V1.0   
 *
 */
@Entity
@Table(name = "log_pay_info", schema = "")
@SuppressWarnings("serial")
public class LogPayInfoEntity implements java.io.Serializable {
	/**ID*/
	private java.lang.String id;
	/**用户名*/
    @Excel(name="用户名",width=15)
	private java.lang.String username;
	/**编号*/
    @Excel(name="编号",width=15)
	private java.lang.String serialno;
	/**订单编号*/
    @Excel(name="订单编号",width=15)
	private java.lang.String orderCode;
	/**支付时间*/
    @Excel(name="支付时间",width=15,format = "yyyy-MM-dd")
	private java.util.Date payTime;
	/**第三方订单号*/
    @Excel(name="第三方订单号",width=15)
	private java.lang.String thirdOrderCode;
	/**支付银行*/
    @Excel(name="支付银行",width=15)
	private java.lang.String payBank;
	/**支付金额*/
    @Excel(name="支付金额",width=15)
	private java.lang.Double payMoney;
	/**应付金额*/
    @Excel(name="应付金额",width=15)
	private java.lang.Double dealMoney;
	/**手续费*/
    @Excel(name="手续费",width=15)
	private java.lang.Double chargeMoney;
	/**支付状态*/
    @Excel(name="支付状态",width=15)
	private java.lang.String payStatus;
	/**商品名称*/
    @Excel(name="商品名称",width=15,format = "yyyy-MM-dd")
	private java.util.Date productName;
	/**支付地址*/
    @Excel(name="支付地址",width=15)
	private java.lang.String payAddress;
	/**回调时间*/
    @Excel(name="回调时间",width=15,format = "yyyy-MM-dd")
	private java.util.Date callTime;
	/**确认时间*/
    @Excel(name="确认时间",width=15,format = "yyyy-MM-dd")
	private java.util.Date confirmPayTime;
	/**打款处理人*/
    @Excel(name="打款处理人",width=15)
	private java.lang.String payUsername;
	/**订单款进度*/
    @Excel(name="订单款进度",width=15)
	private java.lang.String orderProgress;
	/**原因*/
    @Excel(name="原因",width=15)
	private java.lang.String reason;
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
	@Column(name ="ID",nullable=false,length=36)
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
	 *@return: java.lang.String  编号
	 */
	@Column(name ="SERIALNO",nullable=true,length=32)
	public java.lang.String getSerialno(){
		return this.serialno;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  编号
	 */
	public void setSerialno(java.lang.String serialno){
		this.serialno = serialno;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  订单编号
	 */
	@Column(name ="ORDER_CODE",nullable=true,length=40)
	public java.lang.String getOrderCode(){
		return this.orderCode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  订单编号
	 */
	public void setOrderCode(java.lang.String orderCode){
		this.orderCode = orderCode;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  支付时间
	 */
	@Column(name ="PAY_TIME",nullable=true)
	public java.util.Date getPayTime(){
		return this.payTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  支付时间
	 */
	public void setPayTime(java.util.Date payTime){
		this.payTime = payTime;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  第三方订单号
	 */
	@Column(name ="THIRD_ORDER_CODE",nullable=true,length=32)
	public java.lang.String getThirdOrderCode(){
		return this.thirdOrderCode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  第三方订单号
	 */
	public void setThirdOrderCode(java.lang.String thirdOrderCode){
		this.thirdOrderCode = thirdOrderCode;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  支付银行
	 */
	@Column(name ="PAY_BANK",nullable=true,length=32)
	public java.lang.String getPayBank(){
		return this.payBank;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  支付银行
	 */
	public void setPayBank(java.lang.String payBank){
		this.payBank = payBank;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  支付金额
	 */
	@Column(name ="PAY_MONEY",nullable=true,scale=3,length=15)
	public java.lang.Double getPayMoney(){
		return this.payMoney;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  支付金额
	 */
	public void setPayMoney(java.lang.Double payMoney){
		this.payMoney = payMoney;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  应付金额
	 */
	@Column(name ="DEAL_MONEY",nullable=true,scale=3,length=15)
	public java.lang.Double getDealMoney(){
		return this.dealMoney;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  应付金额
	 */
	public void setDealMoney(java.lang.Double dealMoney){
		this.dealMoney = dealMoney;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  手续费
	 */
	@Column(name ="CHARGE_MONEY",nullable=true,scale=3,length=15)
	public java.lang.Double getChargeMoney(){
		return this.chargeMoney;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  手续费
	 */
	public void setChargeMoney(java.lang.Double chargeMoney){
		this.chargeMoney = chargeMoney;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  支付状态
	 */
	@Column(name ="PAY_STATUS",nullable=true)
	public java.lang.String getPayStatus(){
		return this.payStatus;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  支付状态
	 */
	public void setPayStatus(java.lang.String payStatus){
		this.payStatus = payStatus;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  商品名称
	 */
	@Column(name ="PRODUCT_NAME",nullable=true)
	public java.util.Date getProductName(){
		return this.productName;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  商品名称
	 */
	public void setProductName(java.util.Date productName){
		this.productName = productName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  支付地址
	 */
	@Column(name ="PAY_ADDRESS",nullable=true,length=4)
	public java.lang.String getPayAddress(){
		return this.payAddress;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  支付地址
	 */
	public void setPayAddress(java.lang.String payAddress){
		this.payAddress = payAddress;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  回调时间
	 */
	@Column(name ="CALL_TIME",nullable=true)
	public java.util.Date getCallTime(){
		return this.callTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  回调时间
	 */
	public void setCallTime(java.util.Date callTime){
		this.callTime = callTime;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  确认时间
	 */
	@Column(name ="CONFIRM_PAY_TIME",nullable=true)
	public java.util.Date getConfirmPayTime(){
		return this.confirmPayTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  确认时间
	 */
	public void setConfirmPayTime(java.util.Date confirmPayTime){
		this.confirmPayTime = confirmPayTime;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  打款处理人
	 */
	@Column(name ="PAY_USERNAME",nullable=true,length=32)
	public java.lang.String getPayUsername(){
		return this.payUsername;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  打款处理人
	 */
	public void setPayUsername(java.lang.String payUsername){
		this.payUsername = payUsername;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  订单款进度
	 */
	@Column(name ="ORDER_PROGRESS",nullable=true,length=200)
	public java.lang.String getOrderProgress(){
		return this.orderProgress;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  订单款进度
	 */
	public void setOrderProgress(java.lang.String orderProgress){
		this.orderProgress = orderProgress;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  原因
	 */
	@Column(name ="REASON",nullable=true,length=255)
	public java.lang.String getReason(){
		return this.reason;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  原因
	 */
	public void setReason(java.lang.String reason){
		this.reason = reason;
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
