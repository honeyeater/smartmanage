<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>USDT价格</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="div" action="usdtPriceController.do?doAdd" >
			<input id="id" name="id" type="hidden" value="${usdtPricePage.id }">
			<input id="currencyType" name="currencyType" type="hidden" value="${usdtPricePage.currencyType }">
			<input id="inputtime" name="inputtime" type="hidden" value="${usdtPricePage.inputtime }">
			<input id="inserttimeforhis" name="inserttimeforhis" type="hidden" value="${usdtPricePage.inserttimeforhis }">
			<input id="operatetimeforhis" name="operatetimeforhis" type="hidden" value="${usdtPricePage.operatetimeforhis }">
			<input id="vfield1" name="vfield1" type="hidden" value="${usdtPricePage.vfield1 }">
			<input id="vfield2" name="vfield2" type="hidden" value="${usdtPricePage.vfield2 }">
			<input id="vfield3" name="vfield3" type="hidden" value="${usdtPricePage.vfield3 }">
			<input id="vfield4" name="vfield4" type="hidden" value="${usdtPricePage.vfield4 }">
			<input id="vfield5" name="vfield5" type="hidden" value="${usdtPricePage.vfield5 }">
			<input id="vfield6" name="vfield6" type="hidden" value="${usdtPricePage.vfield6 }">
			<input id="nfield2" name="nfield2" type="hidden" value="${usdtPricePage.nfield2 }">
			<input id="nfield3" name="nfield3" type="hidden" value="${usdtPricePage.nfield3 }">
			<input id="nfield4" name="nfield4" type="hidden" value="${usdtPricePage.nfield4 }">
			<input id="dfield1" name="dfield1" type="hidden" value="${usdtPricePage.dfield1 }">
			<input id="dfield2" name="dfield2" type="hidden" value="${usdtPricePage.dfield2 }">
			<input id="dfield3" name="dfield3" type="hidden" value="${usdtPricePage.dfield3 }">
			<input id="dfield4" name="dfield4" type="hidden" value="${usdtPricePage.dfield4 }">
		<fieldset class="step">
			<div class="form">
		      <label class="Validform_label">生成日期:</label>
				<input id="createTime" name="createTime" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})" datatype="*"  ignore="checked" />
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">买入价格:</label>
                <input id="price" name="price" type="text" style="width: 150px" class="inputxt"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore" />
		      <span class="Validform_checktip"></span>
		    </div>
            <div class="form">
                <label class="Validform_label">卖出价格:</label>
                <input id="nfield1" name="nfield1" type="text" style="width: 150px" class="inputxt"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore" />
                <span class="Validform_checktip"></span>
            </div>
			<div class="form">
		      <label class="Validform_label">数量:</label>
                <input id="num" name="num" type="text" style="width: 150px" class="inputxt"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore" />
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">状态:</label>
					<t:dictSelect field="status" type="list"  datatype="*"  typeGroupCode="yOn"   defaultVal="${usdtPricePage.status}" hasLabel="false"  title="状态"></t:dictSelect>
		      <span class="Validform_checktip"></span>
		    </div>

	    </fieldset>
  </t:formvalid>
 </body>
  <script src = "webpage/smp/trade/usdtPrice.js"></script>
	