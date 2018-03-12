<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>激活码批量生成</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="div" action="frontStorageActivatecodeController.do?doBatchGenerate" >
			<input id="id" name="id" type="hidden" value="${frontStorageActivatecodePage.id }">
			<input id="username" name="username" type="hidden" value="${frontStorageActivatecodePage.username }">
			<input id="inputtime" name="inputtime" type="hidden" value="${frontStorageActivatecodePage.inputtime }">
			<input id="inserttimeforhis" name="inserttimeforhis" type="hidden" value="${frontStorageActivatecodePage.inserttimeforhis }">
			<input id="operatetimeforhis" name="operatetimeforhis" type="hidden" value="${frontStorageActivatecodePage.operatetimeforhis }">
			<input id="vfield1" name="vfield1" type="hidden" value="${frontStorageActivatecodePage.vfield1 }">
			<input id="vfield2" name="vfield2" type="hidden" value="${frontStorageActivatecodePage.vfield2 }">
			<input id="vfield3" name="vfield3" type="hidden" value="${frontStorageActivatecodePage.vfield3 }">
			<input id="vfield4" name="vfield4" type="hidden" value="${frontStorageActivatecodePage.vfield4 }">
			<input id="vfield5" name="vfield5" type="hidden" value="${frontStorageActivatecodePage.vfield5 }">
			<input id="vfield6" name="vfield6" type="hidden" value="${frontStorageActivatecodePage.vfield6 }">
			<input id="nfield1" name="nfield1" type="hidden" value="${frontStorageActivatecodePage.nfield1 }">
			<input id="nfield2" name="nfield2" type="hidden" value="${frontStorageActivatecodePage.nfield2 }">
			<input id="nfield3" name="nfield3" type="hidden" value="${frontStorageActivatecodePage.nfield3 }">
			<input id="nfield4" name="nfield4" type="hidden" value="${frontStorageActivatecodePage.nfield4 }">
			<input id="dfield1" name="dfield1" type="hidden" value="${frontStorageActivatecodePage.dfield1 }">
			<input id="dfield2" name="dfield2" type="hidden" value="${frontStorageActivatecodePage.dfield2 }">
			<input id="dfield3" name="dfield3" type="hidden" value="${frontStorageActivatecodePage.dfield3 }">
			<input id="dfield4" name="dfield4" type="hidden" value="${frontStorageActivatecodePage.dfield4 }">
		<fieldset class="step">
			<div class="form">
		      <label class="Validform_label">数量:</label>
                <input id="activieCode" name="activieCode" type="text" style="width: 150px" class="inputxt"  datatype="n"  ignore="checked" />
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">激活码类型:</label>
                <t:dictSelect field="activieType" type="list"  datatype="*"  typeGroupCode="actype"   defaultVal="${frontStorageActivatecodePage.activieType}" hasLabel="false"  title="激活码类型"></t:dictSelect>
		      <span class="Validform_checktip"></span>
		    </div>
	    </fieldset>
  </t:formvalid>
 </body>
  <script src = "webpage/smp/activate/frontStorageActivatecode.js"></script>
	