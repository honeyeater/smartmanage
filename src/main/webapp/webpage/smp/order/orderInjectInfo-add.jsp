<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>注入资金订单表</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="div" action="orderInjectInfoController.do?doAdd" >
			<input id="id" name="id" type="hidden" value="${orderInjectInfoPage.id }">
		<fieldset class="step">
			<div class="form">
		      <label class="Validform_label">用户名:</label>
					     	 <input id="username" name="username" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">订单编号:</label>
					     	 <input id="orderCode" name="orderCode" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">订单金额:</label>
					     	 <input id="orderMoney" name="orderMoney" type="text" style="width: 150px" class="inputxt"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore" />
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">订单状态:</label>
					     	 <input id="orderStatus" name="orderStatus" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">订单时间:</label>
					  <input id="orderTime" name="orderTime" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore" />
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">应得利息:</label>
					     	 <input id="interest" name="interest" type="text" style="width: 150px" class="inputxt"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore" />
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">首付款金额:</label>
					     	 <input id="firstPay" name="firstPay" type="text" style="width: 150px" class="inputxt"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore" />
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">首付款注入时间:</label>
					  <input id="firstPayTime" name="firstPayTime" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore" />
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">尾款金额:</label>
					     	 <input id="endPay" name="endPay" type="text" style="width: 150px" class="inputxt"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore" />
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">尾款注入时间:</label>
					  <input id="endPayTime" name="endPayTime" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore" />
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">首尾款区间时间:</label>
					     	 <input id="firstEndInternal" name="firstEndInternal" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">保存期区间时间:</label>
					     	 <input id="saveInternal" name="saveInternal" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">利息比例:</label>
					     	 <input id="restRate" name="restRate" type="text" style="width: 150px" class="inputxt"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore" />
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">手续费:</label>
					     	 <input id="serviceCharge" name="serviceCharge" type="text" style="width: 150px" class="inputxt"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore" />
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">实际利息金额:</label>
					     	 <input id="interestReal" name="interestReal" type="text" style="width: 150px" class="inputxt"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore" />
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">等待期开始时间:</label>
					  <input id="waitStartTime" name="waitStartTime" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore" />
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">等待期区间时间:</label>
					     	 <input id="waitInternal" name="waitInternal" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">等待期结束时间:</label>
					  <input id="waitEndTime" name="waitEndTime" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore" />
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">订单款进度:</label>
					     	 <input id="orderProgress" name="orderProgress" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">原因:</label>
					     	 <input id="reason" name="reason" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">订单总款:</label>
					     	 <input id="orderTotalMoney" name="orderTotalMoney" type="text" style="width: 150px" class="inputxt"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore" />
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">输入日期:</label>
					  <input id="inputtime" name="inputtime" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore" />
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">插入时间:</label>
					  <input id="inserttimeforhis" name="inserttimeforhis" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore" />
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">更新时间:</label>
					  <input id="operatetimeforhis" name="operatetimeforhis" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore" />
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">扩展字符字段:</label>
					     	 <input id="vfield1" name="vfield1" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">扩展字符字段:</label>
					     	 <input id="vfield2" name="vfield2" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">扩展字符字段:</label>
					     	 <input id="vfield3" name="vfield3" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">扩展字符字段:</label>
					     	 <input id="vfield4" name="vfield4" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">扩展字符字段:</label>
					     	 <input id="vfield5" name="vfield5" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">扩展字符字段:</label>
					     	 <input id="vfield6" name="vfield6" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">扩展金额字段:</label>
					     	 <input id="nfield1" name="nfield1" type="text" style="width: 150px" class="inputxt"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore" />
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">扩展金额字段:</label>
					     	 <input id="nfield2" name="nfield2" type="text" style="width: 150px" class="inputxt"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore" />
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">扩展金额字段:</label>
					     	 <input id="nfield3" name="nfield3" type="text" style="width: 150px" class="inputxt"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore" />
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">扩展金额字段:</label>
					     	 <input id="nfield4" name="nfield4" type="text" style="width: 150px" class="inputxt"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore" />
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">扩展时间字段:</label>
					  <input id="dfield1" name="dfield1" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore" />
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">扩展时间字段:</label>
					  <input id="dfield2" name="dfield2" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore" />
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">扩展时间字段:</label>
					  <input id="dfield3" name="dfield3" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore" />
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">扩展时间字段:</label>
					  <input id="dfield4" name="dfield4" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore" />
		      <span class="Validform_checktip"></span>
		    </div>
	    </fieldset>
  </t:formvalid>
 </body>
  <script src = "webpage//order/orderInjectInfo.js"></script>	
	