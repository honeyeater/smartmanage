<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>交易信息</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="div" action="usdtTradeController.do?doUpdate" >
			<input id="id" name="id" type="hidden" value="${usdtTradePage.id }"/>
			<input id="currencyType" name="currencyType" type="hidden" value="${usdtTradePage.currencyType }"/>
			<input id="inserttimeforhis" name="inserttimeforhis" type="hidden" value="${usdtTradePage.inserttimeforhis }"/>
			<input id="operatetimeforhis" name="operatetimeforhis" type="hidden" value="${usdtTradePage.operatetimeforhis }"/>
			<input id="vfield1" name="vfield1" type="hidden" value="${usdtTradePage.vfield1 }"/>
			<input id="vfield2" name="vfield2" type="hidden" value="${usdtTradePage.vfield2 }"/>
			<input id="vfield3" name="vfield3" type="hidden" value="${usdtTradePage.vfield3 }"/>
			<input id="vfield4" name="vfield4" type="hidden" value="${usdtTradePage.vfield4 }"/>
			<input id="vfield5" name="vfield5" type="hidden" value="${usdtTradePage.vfield5 }"/>
			<input id="vfield6" name="vfield6" type="hidden" value="${usdtTradePage.vfield6 }"/>
			<input id="nfield1" name="nfield1" type="hidden" value="${usdtTradePage.nfield1 }"/>
			<input id="nfield2" name="nfield2" type="hidden" value="${usdtTradePage.nfield2 }"/>
			<input id="nfield3" name="nfield3" type="hidden" value="${usdtTradePage.nfield3 }"/>
			<input id="nfield4" name="nfield4" type="hidden" value="${usdtTradePage.nfield4 }"/>
			<input id="dfield1" name="dfield1" type="hidden" value="${usdtTradePage.dfield1 }"/>
			<input id="dfield2" name="dfield2" type="hidden" value="${usdtTradePage.dfield2 }"/>
			<input id="dfield3" name="dfield3" type="hidden" value="${usdtTradePage.dfield3 }"/>
			<input id="dfield4" name="dfield4" type="hidden" value="${usdtTradePage.dfield4 }"/>
		<fieldset class="step">
			<div class="form">
		      <label class="Validform_label">用户名:</label>
		     	 <input id="username" name="username" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${usdtTradePage.username}'/>
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">交易编号:</label>
		     	 <input id="tradeNo" name="tradeNo" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${usdtTradePage.tradeNo}'/>
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">价格:</label>
		     	 <input id="price" name="price" type="text" style="width: 150px" class="inputxt"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore"  value='${usdtTradePage.price}'/>
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">数量:</label>
		     	 <input id="num" name="num" type="text" style="width: 150px" class="inputxt"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore"  value='${usdtTradePage.num}'/>
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">金额:</label>
		     	 <input id="money" name="money" type="text" style="width: 150px" class="inputxt"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore"  value='${usdtTradePage.money}'/>
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">手续费比例:</label>
		     	 <input id="feeRate" name="feeRate" type="text" style="width: 150px" class="inputxt"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore"  value='${usdtTradePage.feeRate}'/>
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">费用:</label>
		     	 <input id="fee" name="fee" type="text" style="width: 150px" class="inputxt"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore"  value='${usdtTradePage.fee}'/>
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">总金额:</label>
		     	 <input id="sumAmount" name="sumAmount" type="text" style="width: 150px" class="inputxt"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore"  value='${usdtTradePage.sumAmount}'/>
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">交易类型:</label>
		     	 <input id="tradeType" name="tradeType" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${usdtTradePage.tradeType}'/>
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">状态:</label>
		     	 <input id="status" name="status" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${usdtTradePage.status}'/>
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">提出地址:</label>
		     	 <input id="drawUrl" name="drawUrl" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${usdtTradePage.drawUrl}'/>
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">输入日期:</label>
					  <input id="inputtime" name="inputtime" type="text" style="width: 150px"  class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"  ignore="ignore"  value='<fmt:formatDate value='${usdtTradePage.inputtime}' type="date" pattern="yyyy-MM-dd hh:mm:ss"/>'/>
		      <span class="Validform_checktip"></span>
		    </div>
	    </fieldset>
  </t:formvalid>
 </body>
  <script src = "webpage//deal/usdtTrade.js"></script>		
