<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>提出资金订单表</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="div" action="orderDrawInfoController.do?doUpdate" >
			<input id="id" name="id" type="hidden" value="${orderDrawInfoPage.id }"/>
		<fieldset class="step">
			<div class="form">
		      <label class="Validform_label">用户名:</label>
		     	 <input id="username" name="username" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${orderDrawInfoPage.username}'/>
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">订单编号:</label>
		     	 <input id="orderCode" name="orderCode" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${orderDrawInfoPage.orderCode}'/>
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">订单金额:</label>
		     	 <input id="orderMoney" name="orderMoney" type="text" style="width: 150px" class="inputxt"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore"  value='${orderDrawInfoPage.orderMoney}'/>
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">订单状态:</label>
		     	 <input id="orderStatus" name="orderStatus" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${orderDrawInfoPage.orderStatus}'/>
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">订单时间:</label>
					  <input id="orderTime" name="orderTime" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore"   value='<fmt:formatDate value='${orderDrawInfoPage.orderTime}' type="date" pattern="yyyy-MM-dd"/>'/>   
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">提取钱包:</label>
		     	 <input id="drawWallet" name="drawWallet" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${orderDrawInfoPage.drawWallet}'/>
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">提取金额:</label>
		     	 <input id="drawMoney" name="drawMoney" type="text" style="width: 150px" class="inputxt"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore"  value='${orderDrawInfoPage.drawMoney}'/>
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">提取钱包说明:</label>
		     	 <input id="drawDesc" name="drawDesc" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${orderDrawInfoPage.drawDesc}'/>
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">提取开始时间:</label>
					  <input id="drawStartTime" name="drawStartTime" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore"   value='<fmt:formatDate value='${orderDrawInfoPage.drawStartTime}' type="date" pattern="yyyy-MM-dd"/>'/>   
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">提取结束时间:</label>
					  <input id="drawEndTime" name="drawEndTime" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore"   value='<fmt:formatDate value='${orderDrawInfoPage.drawEndTime}' type="date" pattern="yyyy-MM-dd"/>'/>   
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">提取区间:</label>
		     	 <input id="drawInternal" name="drawInternal" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${orderDrawInfoPage.drawInternal}'/>
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">开始打款时间:</label>
					  <input id="payStartTime" name="payStartTime" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore"   value='<fmt:formatDate value='${orderDrawInfoPage.payStartTime}' type="date" pattern="yyyy-MM-dd"/>'/>   
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">确认打款时间:</label>
					  <input id="confirmPayTime" name="confirmPayTime" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore"   value='<fmt:formatDate value='${orderDrawInfoPage.confirmPayTime}' type="date" pattern="yyyy-MM-dd"/>'/>   
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">打款处理人:</label>
		     	 <input id="payUsername" name="payUsername" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${orderDrawInfoPage.payUsername}'/>
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">订单款进度:</label>
		     	 <input id="orderProgress" name="orderProgress" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${orderDrawInfoPage.orderProgress}'/>
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">原因:</label>
		     	 <input id="reason" name="reason" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${orderDrawInfoPage.reason}'/>
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">订单总款:</label>
		     	 <input id="orderTotalMoney" name="orderTotalMoney" type="text" style="width: 150px" class="inputxt"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore"  value='${orderDrawInfoPage.orderTotalMoney}'/>
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">输入日期:</label>
					  <input id="inputtime" name="inputtime" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore"   value='<fmt:formatDate value='${orderDrawInfoPage.inputtime}' type="date" pattern="yyyy-MM-dd"/>'/>   
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">插入时间:</label>
					  <input id="inserttimeforhis" name="inserttimeforhis" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore"   value='<fmt:formatDate value='${orderDrawInfoPage.inserttimeforhis}' type="date" pattern="yyyy-MM-dd"/>'/>   
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">更新时间:</label>
					  <input id="operatetimeforhis" name="operatetimeforhis" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore"   value='<fmt:formatDate value='${orderDrawInfoPage.operatetimeforhis}' type="date" pattern="yyyy-MM-dd"/>'/>   
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">扩展字符字段:</label>
		     	 <input id="vfield1" name="vfield1" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${orderDrawInfoPage.vfield1}'/>
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">扩展字符字段:</label>
		     	 <input id="vfield2" name="vfield2" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${orderDrawInfoPage.vfield2}'/>
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">扩展字符字段:</label>
		     	 <input id="vfield3" name="vfield3" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${orderDrawInfoPage.vfield3}'/>
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">扩展字符字段:</label>
		     	 <input id="vfield4" name="vfield4" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${orderDrawInfoPage.vfield4}'/>
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">扩展字符字段:</label>
		     	 <input id="vfield5" name="vfield5" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${orderDrawInfoPage.vfield5}'/>
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">扩展字符字段:</label>
		     	 <input id="vfield6" name="vfield6" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${orderDrawInfoPage.vfield6}'/>
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">扩展金额字段:</label>
		     	 <input id="nfield1" name="nfield1" type="text" style="width: 150px" class="inputxt"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore"  value='${orderDrawInfoPage.nfield1}'/>
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">扩展金额字段:</label>
		     	 <input id="nfield2" name="nfield2" type="text" style="width: 150px" class="inputxt"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore"  value='${orderDrawInfoPage.nfield2}'/>
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">扩展金额字段:</label>
		     	 <input id="nfield3" name="nfield3" type="text" style="width: 150px" class="inputxt"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore"  value='${orderDrawInfoPage.nfield3}'/>
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">扩展金额字段:</label>
		     	 <input id="nfield4" name="nfield4" type="text" style="width: 150px" class="inputxt"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore"  value='${orderDrawInfoPage.nfield4}'/>
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">扩展时间字段:</label>
					  <input id="dfield1" name="dfield1" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore"   value='<fmt:formatDate value='${orderDrawInfoPage.dfield1}' type="date" pattern="yyyy-MM-dd"/>'/>   
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">扩展时间字段:</label>
					  <input id="dfield2" name="dfield2" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore"   value='<fmt:formatDate value='${orderDrawInfoPage.dfield2}' type="date" pattern="yyyy-MM-dd"/>'/>   
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">扩展时间字段:</label>
					  <input id="dfield3" name="dfield3" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore"   value='<fmt:formatDate value='${orderDrawInfoPage.dfield3}' type="date" pattern="yyyy-MM-dd"/>'/>   
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">扩展时间字段:</label>
					  <input id="dfield4" name="dfield4" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore"   value='<fmt:formatDate value='${orderDrawInfoPage.dfield4}' type="date" pattern="yyyy-MM-dd"/>'/>   
		      <span class="Validform_checktip"></span>
		    </div>
	    </fieldset>
  </t:formvalid>
 </body>
  <script src = "webpage//order/orderDrawInfo.js"></script>		
