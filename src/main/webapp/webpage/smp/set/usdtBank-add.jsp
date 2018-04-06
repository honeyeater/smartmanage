<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>usdt_bank</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="div" action="usdtBankController.do?doAdd" >
			<input id="id" name="id" type="hidden" value="${usdtBankPage.id }">
			<input id="inserttimeforhis" name="inserttimeforhis" type="hidden" value="${usdtBankPage.inserttimeforhis }">
			<input id="operatetimeforhis" name="operatetimeforhis" type="hidden" value="${usdtBankPage.operatetimeforhis }">
			<input id="vfield3" name="vfield3" type="hidden" value="${usdtBankPage.vfield3 }">
			<input id="vfield4" name="vfield4" type="hidden" value="${usdtBankPage.vfield4 }">
			<input id="vfield5" name="vfield5" type="hidden" value="${usdtBankPage.vfield5 }">
			<input id="vfield6" name="vfield6" type="hidden" value="${usdtBankPage.vfield6 }">
			<input id="nfield1" name="nfield1" type="hidden" value="${usdtBankPage.nfield1 }">
			<input id="nfield2" name="nfield2" type="hidden" value="${usdtBankPage.nfield2 }">
			<input id="nfield3" name="nfield3" type="hidden" value="${usdtBankPage.nfield3 }">
			<input id="nfield4" name="nfield4" type="hidden" value="${usdtBankPage.nfield4 }">
			<input id="dfield1" name="dfield1" type="hidden" value="${usdtBankPage.dfield1 }">
			<input id="dfield2" name="dfield2" type="hidden" value="${usdtBankPage.dfield2 }">
			<input id="dfield3" name="dfield3" type="hidden" value="${usdtBankPage.dfield3 }">
			<input id="dfield4" name="dfield4" type="hidden" value="${usdtBankPage.dfield4 }">
		<fieldset class="step">
			<div class="form">
		      <label class="Validform_label">收款人开户行:</label>
                <input id="bankname" name="bankname" type="text" style="width: 150px" class="inputxt"  datatype="*"  ignore="checked" />
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">收款人账号:</label>
				<input id="accountno" name="accountno" type="text" style="width: 150px" class="inputxt"  datatype="n"  ignore="checked" />
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">收款人:</label>
                <input id="accountname" name="accountname" type="text" style="width: 150px" class="inputxt"  datatype="*"  ignore="checked" />
		      <span class="Validform_checktip"></span>
		    </div>
            <div class="form">
                <label class="Validform_label">支付宝账号:</label>
                <input id="vfield1" name="vfield1" type="text" style="width: 150px" class="inputxt"  datatype="n"  ignore="checked" />
                <span class="Validform_checktip"></span>
            </div>
            <div class="form">
                <label class="Validform_label">支付宝名称:</label>
                <input id="vfield2" name="vfield2" type="text" style="width: 150px" class="inputxt"  datatype="*"  ignore="checked" />
                <span class="Validform_checktip"></span>
            </div>
			<div class="form">
		      <label class="Validform_label">状态:</label>
                <t:dictSelect field="status" type="list"  datatype="*"  typeGroupCode="yOn"   defaultVal="${usdtBankPage.status}" hasLabel="false"  title="状态"></t:dictSelect>
		      <span class="Validform_checktip"></span>
		    </div>
			<%--<div class="form">--%>
		      <%--<label class="Validform_label">输入日期:</label>--%>
                <%--<input id="inputtime" name="inputtime" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  datatype="*"  ignore="checked" />--%>
		      <%--<span class="Validform_checktip"></span>--%>
		    <%--</div>--%>
	    </fieldset>
  </t:formvalid>
 </body>
<script src = "webpage/smp/set/usdtBank.js"></script>
	