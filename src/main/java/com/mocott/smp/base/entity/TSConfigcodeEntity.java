package com.mocott.smp.base.entity;

import org.hibernate.annotations.GenericGenerator;
import org.jeecgframework.poi.excel.annotation.Excel;

import javax.persistence.*;
import java.util.Date;

/**   
 * @Title: Entity
 * @Description: t_s_configcode
 * @author onlineGenerator
 * @date 2018-02-15 15:27:55
 * @version V1.0   
 *
 */
@Entity
@Table(name = "t_s_configcode", schema = "")
@SuppressWarnings("serial")
public class TSConfigcodeEntity implements java.io.Serializable {
	/**ID*/
	private String id;
	/**参数配置代码*/
    @Excel(name="参数配置代码",width=15)
	private String configCode;
	/**参数配置名称*/
    @Excel(name="参数配置名称",width=15)
	private String configName;
	/**参数配置值*/
    @Excel(name="参数配置值",width=15)
	private String configValue;
	/**状态*/
    @Excel(name="状态",width=15)
	private String status;
	/**标志*/
    @Excel(name="标志",width=15)
	private String comFlag;
	/**标志代码*/
    @Excel(name="标志代码",width=15)
	private String comCode;
	/**标志级别*/
    @Excel(name="标志级别",width=15)
	private String comLevel;
	/**备注*/
    @Excel(name="备注",width=15)
	private String remark;
	/**输入日期*/
    @Excel(name="输入日期",width=15,format = "yyyy-MM-dd")
	private Date inputtime;
	/**插入时间*/
    @Excel(name="插入时间",width=15,format = "yyyy-MM-dd")
	private Date inserttimeforhis;
	/**更新时间*/
    @Excel(name="更新时间",width=15,format = "yyyy-MM-dd")
	private Date operatetimeforhis;
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
	private Date dfield1;
	/**扩展时间字段*/
    @Excel(name="扩展时间字段",width=15,format = "yyyy-MM-dd")
	private Date dfield2;
	/**扩展时间字段*/
    @Excel(name="扩展时间字段",width=15,format = "yyyy-MM-dd")
	private Date dfield3;
	/**扩展时间字段*/
    @Excel(name="扩展时间字段",width=15,format = "yyyy-MM-dd")
	private Date dfield4;

	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  ID
	 */
	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
	@Column(name ="ID",nullable=false,length=32)
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
	 *@return: java.lang.String  参数配置代码
	 */
	@Column(name ="CONFIG_CODE",nullable=true,length=40)
	public String getConfigCode(){
		return this.configCode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  参数配置代码
	 */
	public void setConfigCode(String configCode){
		this.configCode = configCode;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  参数配置名称
	 */
	@Column(name ="CONFIG_NAME",nullable=true,length=40)
	public String getConfigName(){
		return this.configName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  参数配置名称
	 */
	public void setConfigName(String configName){
		this.configName = configName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  参数配置值
	 */
	@Column(name ="CONFIG_VALUE",nullable=true,length=40)
	public String getConfigValue(){
		return this.configValue;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  参数配置值
	 */
	public void setConfigValue(String configValue){
		this.configValue = configValue;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  状态
	 */
	@Column(name ="STATUS",nullable=true,length=40)
	public String getStatus(){
		return this.status;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  状态
	 */
	public void setStatus(String status){
		this.status = status;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  标志
	 */
	@Column(name ="COM_FLAG",nullable=true,length=40)
	public String getComFlag(){
		return this.comFlag;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  标志
	 */
	public void setComFlag(String comFlag){
		this.comFlag = comFlag;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  标志代码
	 */
	@Column(name ="COM_CODE",nullable=true,length=40)
	public String getComCode(){
		return this.comCode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  标志代码
	 */
	public void setComCode(String comCode){
		this.comCode = comCode;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  标志级别
	 */
	@Column(name ="COM_LEVEL",nullable=true,length=40)
	public String getComLevel(){
		return this.comLevel;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  标志级别
	 */
	public void setComLevel(String comLevel){
		this.comLevel = comLevel;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  备注
	 */
	@Column(name ="REMARK",nullable=true,length=255)
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
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  输入日期
	 */
	@Column(name ="INPUTTIME",nullable=true)
	public Date getInputtime(){
		return this.inputtime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  输入日期
	 */
	public void setInputtime(Date inputtime){
		this.inputtime = inputtime;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  插入时间
	 */
	@Column(name ="INSERTTIMEFORHIS",nullable=true)
	public Date getInserttimeforhis(){
		return this.inserttimeforhis;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  插入时间
	 */
	public void setInserttimeforhis(Date inserttimeforhis){
		this.inserttimeforhis = inserttimeforhis;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  更新时间
	 */
	@Column(name ="OPERATETIMEFORHIS",nullable=true)
	public Date getOperatetimeforhis(){
		return this.operatetimeforhis;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  更新时间
	 */
	public void setOperatetimeforhis(Date operatetimeforhis){
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
	public Date getDfield1(){
		return this.dfield1;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  扩展时间字段
	 */
	public void setDfield1(Date dfield1){
		this.dfield1 = dfield1;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  扩展时间字段
	 */
	@Column(name ="DFIELD2",nullable=true)
	public Date getDfield2(){
		return this.dfield2;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  扩展时间字段
	 */
	public void setDfield2(Date dfield2){
		this.dfield2 = dfield2;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  扩展时间字段
	 */
	@Column(name ="DFIELD3",nullable=true)
	public Date getDfield3(){
		return this.dfield3;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  扩展时间字段
	 */
	public void setDfield3(Date dfield3){
		this.dfield3 = dfield3;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  扩展时间字段
	 */
	@Column(name ="DFIELD4",nullable=true)
	public Date getDfield4(){
		return this.dfield4;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  扩展时间字段
	 */
	public void setDfield4(Date dfield4){
		this.dfield4 = dfield4;
	}
}
