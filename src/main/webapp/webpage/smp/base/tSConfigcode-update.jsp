<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>配置信息表</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
 </head>
 <body>
 <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="div" action="tSConfigcodeController.do?doUpdate" >
     <input id="id" name="id" type="hidden" value="${tSConfigcodePage.id }"/>
     <input id="comFlag" name="comFlag" type="hidden" value="${tSConfigcodePage.comFlag }"/>
     <input id="comCode" name="comCode" type="hidden" value="${tSConfigcodePage.comCode }"/>
     <input id="comLevel" name="comLevel" type="hidden" value="${tSConfigcodePage.comLevel }"/>
     <input id="inputtime" name="inputtime" type="hidden" value="${tSConfigcodePage.inputtime }"/>
     <input id="inserttimeforhis" name="inserttimeforhis" type="hidden" value="${tSConfigcodePage.inserttimeforhis }"/>
     <input id="operatetimeforhis" name="operatetimeforhis" type="hidden" value="${tSConfigcodePage.operatetimeforhis }"/>
     <input id="vfield1" name="vfield1" type="hidden" value="${tSConfigcodePage.vfield1 }"/>
     <input id="vfield2" name="vfield2" type="hidden" value="${tSConfigcodePage.vfield2 }"/>
     <input id="vfield3" name="vfield3" type="hidden" value="${tSConfigcodePage.vfield3 }"/>
     <input id="vfield4" name="vfield4" type="hidden" value="${tSConfigcodePage.vfield4 }"/>
     <input id="vfield5" name="vfield5" type="hidden" value="${tSConfigcodePage.vfield5 }"/>
     <input id="vfield6" name="vfield6" type="hidden" value="${tSConfigcodePage.vfield6 }"/>
     <input id="nfield1" name="nfield1" type="hidden" value="${tSConfigcodePage.nfield1 }"/>
     <input id="nfield2" name="nfield2" type="hidden" value="${tSConfigcodePage.nfield2 }"/>
     <input id="nfield3" name="nfield3" type="hidden" value="${tSConfigcodePage.nfield3 }"/>
     <input id="nfield4" name="nfield4" type="hidden" value="${tSConfigcodePage.nfield4 }"/>
     <input id="dfield1" name="dfield1" type="hidden" value="${tSConfigcodePage.dfield1 }"/>
     <input id="dfield2" name="dfield2" type="hidden" value="${tSConfigcodePage.dfield2 }"/>
     <input id="dfield3" name="dfield3" type="hidden" value="${tSConfigcodePage.dfield3 }"/>
     <input id="dfield4" name="dfield4" type="hidden" value="${tSConfigcodePage.dfield4 }"/>
     <fieldset class="step">
         <div class="form">
             <label class="Validform_label">参数配置名称:</label>
             <input id="configName" name="configName" type="text" style="width: 150px" class="inputxt"  datatype="*"  ignore="checked"  value='${tSConfigcodePage.configName}'/>
             <span class="Validform_checktip"></span>
         </div>
         <div class="form">
             <label class="Validform_label">参数配置代码:</label>
             <input id="configCode" name="configCode" type="text" style="width: 150px" class="inputxt"  datatype="*"  ignore="checked"  value='${tSConfigcodePage.configCode}'/>
             <span class="Validform_checktip"></span>
         </div>
         <div class="form">
             <label class="Validform_label">参数配置值:</label>
             <input id="configValue" name="configValue" type="text" style="width: 150px" class="inputxt"  datatype="*"  ignore="checked"  value='${tSConfigcodePage.configValue}'/>
             <span class="Validform_checktip"></span>
         </div>
         <div class="form">
             <label class="Validform_label">状态:</label>
             <t:dictSelect field="status" type="list"  datatype="*"   typeGroupCode="validType"  defaultVal="${tSConfigcodePage.status}" hasLabel="false"  title="状态"></t:dictSelect>
             <span class="Validform_checktip"></span>
         </div>
         <div class="form">
             <label class="Validform_label">备注:</label>
             <input id="remark" name="remark" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${tSConfigcodePage.remark}'/>
             <span class="Validform_checktip"></span>
         </div>
     </fieldset>
 </t:formvalid>
 </body>
 <script src = "webpage/smp/base/tSConfigcode.js"></script>
