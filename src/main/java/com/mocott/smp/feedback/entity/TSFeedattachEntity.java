package com.mocott.smp.feedback.entity;

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
 * @Description: 系统意见留言附件表
 * @author onlineGenerator
 * @date 2018-01-23 11:01:47
 * @version V1.0   
 *
 */
@Entity
@Table(name = "t_s_feedattach", schema = "")
@SuppressWarnings("serial")
public class TSFeedattachEntity implements java.io.Serializable {
	/**ID*/
	private java.lang.String id;
	/**留言编号*/
    @Excel(name="留言编号",width=15)
	private java.lang.String feedbackid;
	/**序号*/
    @Excel(name="序号",width=15)
	private java.lang.String serialno;
	/**文件名称*/
    @Excel(name="文件名称",width=15)
	private java.lang.String filename;
	/**文件路径*/
    @Excel(name="文件路径",width=15)
	private java.lang.String filepath;
	/**上传时间*/
    @Excel(name="上传时间",width=15,format = "yyyy-MM-dd")
	private java.util.Date uploadtime;
	/**文件大小*/
    @Excel(name="文件大小",width=15)
	private java.lang.String filesize;
	/**文件类型*/
    @Excel(name="文件类型",width=15)
	private java.lang.String filetype;
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
	 *@return: java.lang.String  留言编号
	 */
	@Column(name ="FEEDBACKID",nullable=true,length=40)
	public java.lang.String getFeedbackid(){
		return this.feedbackid;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  留言编号
	 */
	public void setFeedbackid(java.lang.String feedbackid){
		this.feedbackid = feedbackid;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  序号
	 */
	@Column(name ="SERIALNO",nullable=true,length=32)
	public java.lang.String getSerialno(){
		return this.serialno;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  序号
	 */
	public void setSerialno(java.lang.String serialno){
		this.serialno = serialno;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  文件名称
	 */
	@Column(name ="FILENAME",nullable=true,length=100)
	public java.lang.String getFilename(){
		return this.filename;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  文件名称
	 */
	public void setFilename(java.lang.String filename){
		this.filename = filename;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  文件路径
	 */
	@Column(name ="FILEPATH",nullable=true,length=200)
	public java.lang.String getFilepath(){
		return this.filepath;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  文件路径
	 */
	public void setFilepath(java.lang.String filepath){
		this.filepath = filepath;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  上传时间
	 */
	@Column(name ="UPLOADTIME",nullable=true)
	public java.util.Date getUploadtime(){
		return this.uploadtime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  上传时间
	 */
	public void setUploadtime(java.util.Date uploadtime){
		this.uploadtime = uploadtime;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  文件大小
	 */
	@Column(name ="FILESIZE",nullable=true,length=20)
	public java.lang.String getFilesize(){
		return this.filesize;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  文件大小
	 */
	public void setFilesize(java.lang.String filesize){
		this.filesize = filesize;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  文件类型
	 */
	@Column(name ="FILETYPE",nullable=true,length=20)
	public java.lang.String getFiletype(){
		return this.filetype;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  文件类型
	 */
	public void setFiletype(java.lang.String filetype){
		this.filetype = filetype;
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
