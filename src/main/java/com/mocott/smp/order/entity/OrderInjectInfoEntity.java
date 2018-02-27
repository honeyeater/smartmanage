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
 * @Description: 注入资金订单表
 * @author onlineGenerator
 * @date 2018-01-23 11:02:53
 * @version V1.0   
 *
 */
@Entity
@Table(name = "order_inject_info", schema = "")
@SuppressWarnings("serial")
public class OrderInjectInfoEntity implements java.io.Serializable {
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
	/**应得利息*/
    @Excel(name="应得利息",width=15)
	private java.lang.Double interest;
	/**首付款金额*/
    @Excel(name="首付款金额",width=15)
	private java.lang.Double firstPay;
	/**首付款注入时间*/
    @Excel(name="首付款注入时间",width=15,format = "yyyy-MM-dd")
	private java.util.Date firstPayTime;
	/**尾款金额*/
    @Excel(name="尾款金额",width=15)
	private java.lang.Double endPay;
	/**尾款注入时间*/
    @Excel(name="尾款注入时间",width=15,format = "yyyy-MM-dd")
	private java.util.Date endPayTime;
	/**首尾款区间时间*/
    @Excel(name="首尾款区间时间",width=15)
	private java.lang.String firstEndInternal;
	/**保存期区间时间*/
    @Excel(name="保存期区间时间",width=15)
	private java.lang.String saveInternal;
	/**利息比例*/
    @Excel(name="利息比例",width=15)
	private java.lang.Double restRate;
	/**手续费*/
    @Excel(name="手续费",width=15)
	private java.lang.Double serviceCharge;
	/**实际利息金额*/
    @Excel(name="实际利息金额",width=15)
	private java.lang.Double interestReal;
	/**等待期开始时间*/
    @Excel(name="等待期开始时间",width=15,format = "yyyy-MM-dd")
	private java.util.Date waitStartTime;
	/**等待期区间时间*/
    @Excel(name="等待期区间时间",width=15)
	private java.lang.String waitInternal;
	/**等待期结束时间*/
    @Excel(name="等待期结束时间",width=15,format = "yyyy-MM-dd")
	private java.util.Date waitEndTime;
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
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  应得利息
	 */
	@Column(name ="INTEREST",nullable=true,scale=3,length=15)
	public java.lang.Double getInterest(){
		return this.interest;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  应得利息
	 */
	public void setInterest(java.lang.Double interest){
		this.interest = interest;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  首付款金额
	 */
	@Column(name ="FIRST_PAY",nullable=true,scale=3,length=15)
	public java.lang.Double getFirstPay(){
		return this.firstPay;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  首付款金额
	 */
	public void setFirstPay(java.lang.Double firstPay){
		this.firstPay = firstPay;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  首付款注入时间
	 */
	@Column(name ="FIRST_PAY_TIME",nullable=true)
	public java.util.Date getFirstPayTime(){
		return this.firstPayTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  首付款注入时间
	 */
	public void setFirstPayTime(java.util.Date firstPayTime){
		this.firstPayTime = firstPayTime;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  尾款金额
	 */
	@Column(name ="END_PAY",nullable=true,scale=3,length=15)
	public java.lang.Double getEndPay(){
		return this.endPay;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  尾款金额
	 */
	public void setEndPay(java.lang.Double endPay){
		this.endPay = endPay;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  尾款注入时间
	 */
	@Column(name ="END_PAY_TIME",nullable=true)
	public java.util.Date getEndPayTime(){
		return this.endPayTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  尾款注入时间
	 */
	public void setEndPayTime(java.util.Date endPayTime){
		this.endPayTime = endPayTime;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  首尾款区间时间
	 */
	@Column(name ="FIRST_END_INTERNAL",nullable=true,length=10)
	public java.lang.String getFirstEndInternal(){
		return this.firstEndInternal;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  首尾款区间时间
	 */
	public void setFirstEndInternal(java.lang.String firstEndInternal){
		this.firstEndInternal = firstEndInternal;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  保存期区间时间
	 */
	@Column(name ="SAVE_INTERNAL",nullable=true,length=10)
	public java.lang.String getSaveInternal(){
		return this.saveInternal;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  保存期区间时间
	 */
	public void setSaveInternal(java.lang.String saveInternal){
		this.saveInternal = saveInternal;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  利息比例
	 */
	@Column(name ="REST_RATE",nullable=true,scale=3,length=15)
	public java.lang.Double getRestRate(){
		return this.restRate;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  利息比例
	 */
	public void setRestRate(java.lang.Double restRate){
		this.restRate = restRate;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  手续费
	 */
	@Column(name ="SERVICE_CHARGE",nullable=true,scale=3,length=15)
	public java.lang.Double getServiceCharge(){
		return this.serviceCharge;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  手续费
	 */
	public void setServiceCharge(java.lang.Double serviceCharge){
		this.serviceCharge = serviceCharge;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  实际利息金额
	 */
	@Column(name ="INTEREST_REAL",nullable=true,scale=3,length=15)
	public java.lang.Double getInterestReal(){
		return this.interestReal;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  实际利息金额
	 */
	public void setInterestReal(java.lang.Double interestReal){
		this.interestReal = interestReal;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  等待期开始时间
	 */
	@Column(name ="WAIT_START_TIME",nullable=true)
	public java.util.Date getWaitStartTime(){
		return this.waitStartTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  等待期开始时间
	 */
	public void setWaitStartTime(java.util.Date waitStartTime){
		this.waitStartTime = waitStartTime;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  等待期区间时间
	 */
	@Column(name ="WAIT_INTERNAL",nullable=true,length=10)
	public java.lang.String getWaitInternal(){
		return this.waitInternal;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  等待期区间时间
	 */
	public void setWaitInternal(java.lang.String waitInternal){
		this.waitInternal = waitInternal;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  等待期结束时间
	 */
	@Column(name ="WAIT_END_TIME",nullable=true)
	public java.util.Date getWaitEndTime(){
		return this.waitEndTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  等待期结束时间
	 */
	public void setWaitEndTime(java.util.Date waitEndTime){
		this.waitEndTime = waitEndTime;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  订单款进度
	 */
	@Column(name ="ORDER_PROGRESS",nullable=true,length=255)
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
