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
 * @Description: 订单日志信息
 * @author onlineGenerator
 * @date 2018-03-04 22:55:37
 * @version V1.0   
 *
 */
@Entity
@Table(name = "log_order_info", schema = "")
@SuppressWarnings("serial")
public class LogOrderInfoEntity implements java.io.Serializable {
	/**ID*/
	private String id;
	/**用户名*/
	@Excel(name="用户名",width=15)
	private String username;
	/**编号*/
	@Excel(name="编号",width=15)
	private String serialno;
	/**订单编号*/
	@Excel(name="订单编号",width=15)
	private String orderCode;
	/**订单金额*/
	@Excel(name="订单金额",width=15)
	private Double orderMoney;
	/**动态奖金*/
	@Excel(name="动态奖金",width=15)
	private Double dynMoney;
	/**其他奖金*/
	@Excel(name="其他奖金",width=15)
	private Double otherMoney;
	/**待返金额*/
	@Excel(name="待返金额",width=15)
	private Double backMoney;
	/**释放钱包*/
	@Excel(name="释放钱包",width=15)
	private Double releaseMoney;
	/**订单时间*/
	@Excel(name="订单时间",width=15,format = "yyyy-MM-dd")
	private java.util.Date orderTime;
	/**订单类型*/
	@Excel(name="订单类型",width=15)
	private String orderType;
	/**备注*/
	@Excel(name="备注",width=15)
	private String remark;
	/**原因*/
	@Excel(name="原因",width=15)
	private String reason;
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
	private String vfield1;
	/**扩展字符字段*/
	@Excel(name="扩展字符字段",width=15)
	private String vfield2;
	/**扩展字符字段*/
	@Excel(name="扩展字符字段",width=15)
	private String vfield3;
	/**扩展字符字段*/
	@Excel(name="扩展字符字段",width=15)
	private String vfield4;
	/**扩展字符字段*/
	@Excel(name="扩展字符字段",width=15)
	private String vfield5;
	/**扩展字符字段*/
	@Excel(name="扩展字符字段",width=15)
	private String vfield6;
	/**扩展金额字段*/
	@Excel(name="扩展金额字段",width=15)
	private Double nfield1;
	/**扩展金额字段*/
	@Excel(name="扩展金额字段",width=15)
	private Double nfield2;
	/**扩展金额字段*/
	@Excel(name="扩展金额字段",width=15)
	private Double nfield3;
	/**扩展金额字段*/
	@Excel(name="扩展金额字段",width=15)
	private Double nfield4;
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
	public String getId(){
		return this.id;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  ID
	 */
	public void setId(String id){
		this.id = id;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  用户名
	 */

	@Column(name ="USERNAME",nullable=true,length=32)
	public String getUsername(){
		return this.username;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  用户名
	 */
	public void setUsername(String username){
		this.username = username;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  编号
	 */

	@Column(name ="SERIALNO",nullable=true,length=32)
	public String getSerialno(){
		return this.serialno;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  编号
	 */
	public void setSerialno(String serialno){
		this.serialno = serialno;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  订单编号
	 */

	@Column(name ="ORDER_CODE",nullable=true,length=40)
	public String getOrderCode(){
		return this.orderCode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  订单编号
	 */
	public void setOrderCode(String orderCode){
		this.orderCode = orderCode;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  订单金额
	 */

	@Column(name ="ORDER_MONEY",nullable=true,scale=3,length=15)
	public Double getOrderMoney(){
		return this.orderMoney;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  订单金额
	 */
	public void setOrderMoney(Double orderMoney){
		this.orderMoney = orderMoney;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  动态奖金
	 */

	@Column(name ="DYN_MONEY",nullable=true,scale=3,length=15)
	public Double getDynMoney(){
		return this.dynMoney;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  动态奖金
	 */
	public void setDynMoney(Double dynMoney){
		this.dynMoney = dynMoney;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  其他奖金
	 */

	@Column(name ="OTHER_MONEY",nullable=true,scale=3,length=15)
	public Double getOtherMoney(){
		return this.otherMoney;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  其他奖金
	 */
	public void setOtherMoney(Double otherMoney){
		this.otherMoney = otherMoney;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  待返金额
	 */

	@Column(name ="BACK_MONEY",nullable=true,scale=3,length=15)
	public Double getBackMoney(){
		return this.backMoney;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  待返金额
	 */
	public void setBackMoney(Double backMoney){
		this.backMoney = backMoney;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  释放钱包
	 */

	@Column(name ="RELEASE_MONEY",nullable=true,scale=3,length=15)
	public Double getReleaseMoney(){
		return this.releaseMoney;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  释放钱包
	 */
	public void setReleaseMoney(Double releaseMoney){
		this.releaseMoney = releaseMoney;
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
	 *@return: java.lang.String  订单类型
	 */

	@Column(name ="ORDER_TYPE",nullable=true,length=4)
	public String getOrderType(){
		return this.orderType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  订单类型
	 */
	public void setOrderType(String orderType){
		this.orderType = orderType;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  备注
	 */

	@Column(name ="REMARK",nullable=true,length=200)
	public String getRemark(){
		return this.remark;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  备注
	 */
	public void setRemark(String remark){
		this.remark = remark;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  原因
	 */

	@Column(name ="REASON",nullable=true,length=255)
	public String getReason(){
		return this.reason;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  原因
	 */
	public void setReason(String reason){
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
	public String getVfield1(){
		return this.vfield1;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  扩展字符字段
	 */
	public void setVfield1(String vfield1){
		this.vfield1 = vfield1;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  扩展字符字段
	 */

	@Column(name ="VFIELD2",nullable=true,length=255)
	public String getVfield2(){
		return this.vfield2;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  扩展字符字段
	 */
	public void setVfield2(String vfield2){
		this.vfield2 = vfield2;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  扩展字符字段
	 */

	@Column(name ="VFIELD3",nullable=true,length=255)
	public String getVfield3(){
		return this.vfield3;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  扩展字符字段
	 */
	public void setVfield3(String vfield3){
		this.vfield3 = vfield3;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  扩展字符字段
	 */

	@Column(name ="VFIELD4",nullable=true,length=255)
	public String getVfield4(){
		return this.vfield4;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  扩展字符字段
	 */
	public void setVfield4(String vfield4){
		this.vfield4 = vfield4;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  扩展字符字段
	 */

	@Column(name ="VFIELD5",nullable=true,length=255)
	public String getVfield5(){
		return this.vfield5;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  扩展字符字段
	 */
	public void setVfield5(String vfield5){
		this.vfield5 = vfield5;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  扩展字符字段
	 */

	@Column(name ="VFIELD6",nullable=true,length=255)
	public String getVfield6(){
		return this.vfield6;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  扩展字符字段
	 */
	public void setVfield6(String vfield6){
		this.vfield6 = vfield6;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  扩展金额字段
	 */

	@Column(name ="NFIELD1",nullable=true,scale=3,length=10)
	public Double getNfield1(){
		return this.nfield1;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  扩展金额字段
	 */
	public void setNfield1(Double nfield1){
		this.nfield1 = nfield1;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  扩展金额字段
	 */

	@Column(name ="NFIELD2",nullable=true,scale=3,length=10)
	public Double getNfield2(){
		return this.nfield2;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  扩展金额字段
	 */
	public void setNfield2(Double nfield2){
		this.nfield2 = nfield2;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  扩展金额字段
	 */

	@Column(name ="NFIELD3",nullable=true,scale=3,length=10)
	public Double getNfield3(){
		return this.nfield3;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  扩展金额字段
	 */
	public void setNfield3(Double nfield3){
		this.nfield3 = nfield3;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  扩展金额字段
	 */

	@Column(name ="NFIELD4",nullable=true,scale=3,length=10)
	public Double getNfield4(){
		return this.nfield4;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  扩展金额字段
	 */
	public void setNfield4(Double nfield4){
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
