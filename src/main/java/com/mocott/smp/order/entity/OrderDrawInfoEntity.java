package com.mocott.smp.order.entity;

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
 * @Description: 提出资金订单表
 * @author onlineGenerator
 * @date 2018-01-23 11:02:48
 * @version V1.0   
 *
 */
@Entity
@Table(name = "order_draw_info", schema = "")
@SuppressWarnings("serial")
public class OrderDrawInfoEntity implements java.io.Serializable {
	/**ID*/
	private java.lang.String id;
	/**用户名*/
    @Excel(name="用户名",width=15)
	private java.lang.String username;
	/**订单编号*/
    @Excel(name="订单编号",width=15)
	private java.lang.String orderCode;
	/**订单金额*/
    @Excel(name="订单金额",width=15)
	private java.lang.Double orderMoney;
	/**订单状态*/
    @Excel(name="订单状态",width=15)
	private java.lang.String orderStatus;
	/**订单时间*/
    @Excel(name="订单时间",width=15,format = "yyyy-MM-dd")
	private java.util.Date orderTime;
	/**提取钱包*/
    @Excel(name="提取钱包",width=15)
	private java.lang.String drawWallet;
	/**提取金额*/
    @Excel(name="提取金额",width=15)
	private java.lang.Double drawMoney;
	/**提取钱包说明*/
    @Excel(name="提取钱包说明",width=15)
	private java.lang.String drawDesc;
	/**提取开始时间*/
    @Excel(name="提取开始时间",width=15,format = "yyyy-MM-dd")
	private java.util.Date drawStartTime;
	/**提取结束时间*/
    @Excel(name="提取结束时间",width=15,format = "yyyy-MM-dd")
	private java.util.Date drawEndTime;
	/**提取区间*/
    @Excel(name="提取区间",width=15)
	private java.lang.String drawInternal;
	/**开始打款时间*/
    @Excel(name="开始打款时间",width=15,format = "yyyy-MM-dd")
	private java.util.Date payStartTime;
	/**确认打款时间*/
    @Excel(name="确认打款时间",width=15,format = "yyyy-MM-dd")
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
	/**订单总款*/
    @Excel(name="订单总款",width=15)
	private java.lang.Double orderTotalMoney;
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
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  订单金额
	 */
	@Column(name ="ORDER_MONEY",nullable=true,scale=3,length=15)
	public java.lang.Double getOrderMoney(){
		return this.orderMoney;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  订单金额
	 */
	public void setOrderMoney(java.lang.Double orderMoney){
		this.orderMoney = orderMoney;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  订单状态
	 */
	@Column(name ="ORDER_STATUS",nullable=true,length=20)
	public java.lang.String getOrderStatus(){
		return this.orderStatus;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  订单状态
	 */
	public void setOrderStatus(java.lang.String orderStatus){
		this.orderStatus = orderStatus;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  订单时间
	 */
	@Column(name ="ORDER_TIME",nullable=true)
	public java.util.Date getOrderTime(){
		return this.orderTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  订单时间
	 */
	public void setOrderTime(java.util.Date orderTime){
		this.orderTime = orderTime;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  提取钱包
	 */
	@Column(name ="DRAW_WALLET",nullable=true,length=30)
	public java.lang.String getDrawWallet(){
		return this.drawWallet;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  提取钱包
	 */
	public void setDrawWallet(java.lang.String drawWallet){
		this.drawWallet = drawWallet;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  提取金额
	 */
	@Column(name ="DRAW_MONEY",nullable=true,scale=3,length=15)
	public java.lang.Double getDrawMoney(){
		return this.drawMoney;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  提取金额
	 */
	public void setDrawMoney(java.lang.Double drawMoney){
		this.drawMoney = drawMoney;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  提取钱包说明
	 */
	@Column(name ="DRAW_DESC",nullable=true,length=200)
	public java.lang.String getDrawDesc(){
		return this.drawDesc;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  提取钱包说明
	 */
	public void setDrawDesc(java.lang.String drawDesc){
		this.drawDesc = drawDesc;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  提取开始时间
	 */
	@Column(name ="DRAW_START_TIME",nullable=true)
	public java.util.Date getDrawStartTime(){
		return this.drawStartTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  提取开始时间
	 */
	public void setDrawStartTime(java.util.Date drawStartTime){
		this.drawStartTime = drawStartTime;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  提取结束时间
	 */
	@Column(name ="DRAW_END_TIME",nullable=true)
	public java.util.Date getDrawEndTime(){
		return this.drawEndTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  提取结束时间
	 */
	public void setDrawEndTime(java.util.Date drawEndTime){
		this.drawEndTime = drawEndTime;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  提取区间
	 */
	@Column(name ="DRAW_INTERNAL",nullable=true,length=10)
	public java.lang.String getDrawInternal(){
		return this.drawInternal;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  提取区间
	 */
	public void setDrawInternal(java.lang.String drawInternal){
		this.drawInternal = drawInternal;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  开始打款时间
	 */
	@Column(name ="PAY_START_TIME",nullable=true)
	public java.util.Date getPayStartTime(){
		return this.payStartTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  开始打款时间
	 */
	public void setPayStartTime(java.util.Date payStartTime){
		this.payStartTime = payStartTime;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  确认打款时间
	 */
	@Column(name ="CONFIRM_PAY_TIME",nullable=true)
	public java.util.Date getConfirmPayTime(){
		return this.confirmPayTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  确认打款时间
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
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  订单总款
	 */
	@Column(name ="ORDER_TOTAL_MONEY",nullable=true,scale=3,length=15)
	public java.lang.Double getOrderTotalMoney(){
		return this.orderTotalMoney;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  订单总款
	 */
	public void setOrderTotalMoney(java.lang.Double orderTotalMoney){
		this.orderTotalMoney = orderTotalMoney;
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
