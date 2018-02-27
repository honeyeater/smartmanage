<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>注册用户信息表</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
 </head>
 <body>
 <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="div" action="frontUserRegisterController.do?doUpdate" >
     <input id="id" name="id" type="hidden" value="${frontUserRegisterPage.id }"/>
     <input id="province" name="province" type="hidden" value="${frontUserRegisterPage.province }"/>
     <input id="city" name="city" type="hidden" value="${frontUserRegisterPage.city }"/>
     <input id="bankCode" name="bankCode" type="hidden" value="${frontUserRegisterPage.bankCode }"/>
     <input id="bankName" name="bankName" type="hidden" value="${frontUserRegisterPage.bankName }"/>
     <input id="bankCard" name="bankCard" type="hidden" value="${frontUserRegisterPage.bankCard }"/>
     <input id="bankAddress" name="bankAddress" type="hidden" value="${frontUserRegisterPage.bankAddress }"/>
     <input id="password" name="password" type="hidden" value="${frontUserRegisterPage.password }"/>
     <input id="safePassword" name="safePassword" type="hidden" value="${frontUserRegisterPage.safePassword }"/>
     <input id="registerTime" name="registerTime" type="hidden" value="${frontUserRegisterPage.registerTime }"/>
     <input id="registerIp" name="registerIp" type="hidden" value="${frontUserRegisterPage.registerIp }"/>
     <input id="address" name="address" type="hidden" value="${frontUserRegisterPage.address }"/>
     <input id="activeTime" name="activeTime" type="hidden" value="${frontUserRegisterPage.activeTime }"/>
     <input id="userLevel" name="userLevel" type="hidden" value="${frontUserRegisterPage.userLevel }"/>
     <input id="inputtime" name="inputtime" type="hidden" value="${frontUserRegisterPage.inputtime }"/>
     <input id="inserttimeforhis" name="inserttimeforhis" type="hidden" value="${frontUserRegisterPage.inserttimeforhis }"/>
     <input id="operatetimeforhis" name="operatetimeforhis" type="hidden" value="${frontUserRegisterPage.operatetimeforhis }"/>
     <input id="vfield1" name="vfield1" type="hidden" value="${frontUserRegisterPage.vfield1 }"/>
     <input id="vfield2" name="vfield2" type="hidden" value="${frontUserRegisterPage.vfield2 }"/>
     <input id="vfield3" name="vfield3" type="hidden" value="${frontUserRegisterPage.vfield3 }"/>
     <input id="vfield4" name="vfield4" type="hidden" value="${frontUserRegisterPage.vfield4 }"/>
     <input id="vfield5" name="vfield5" type="hidden" value="${frontUserRegisterPage.vfield5 }"/>
     <input id="vfield6" name="vfield6" type="hidden" value="${frontUserRegisterPage.vfield6 }"/>
     <input id="nfield1" name="nfield1" type="hidden" value="${frontUserRegisterPage.nfield1 }"/>
     <input id="nfield2" name="nfield2" type="hidden" value="${frontUserRegisterPage.nfield2 }"/>
     <input id="nfield3" name="nfield3" type="hidden" value="${frontUserRegisterPage.nfield3 }"/>
     <input id="nfield4" name="nfield4" type="hidden" value="${frontUserRegisterPage.nfield4 }"/>
     <input id="dfield1" name="dfield1" type="hidden" value="${frontUserRegisterPage.dfield1 }"/>
     <input id="dfield2" name="dfield2" type="hidden" value="${frontUserRegisterPage.dfield2 }"/>
     <input id="dfield3" name="dfield3" type="hidden" value="${frontUserRegisterPage.dfield3 }"/>
     <input id="dfield4" name="dfield4" type="hidden" value="${frontUserRegisterPage.dfield4 }"/>
     <input id="linkerMobile" name="linkerMobile" type="hidden" value='${frontUserRegisterPage.linkerMobile}'/>

     <fieldset class="step">
         <div class="form">
             <label class="Validform_label">用户名:</label>
             <input id="userName" name="userName" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${frontUserRegisterPage.userName}' readonly/>
             <span class="Validform_checktip"></span>
         </div>
         <div class="form">
             <label class="Validform_label">手机号:</label>
             <input id="phoneno" name="phoneno" type="text" style="width: 150px" class="inputxt"  datatype="m"  ignore="checked"  value='${frontUserRegisterPage.phoneno}'/>
             <span class="Validform_checktip"></span>
         </div>
         <div class="form">
             <label class="Validform_label">身份证号:</label>
             <input id="identityNo" name="identityNo" type="text" style="width: 150px" class="inputxt"  datatype="*"  ignore="checked"  value='${frontUserRegisterPage.identityNo}'/>
             <span class="Validform_checktip"></span>
         </div>
         <div class="form">
             <label class="Validform_label">真实姓名:</label>
             <input id="realname" name="realname" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${frontUserRegisterPage.realname}'/>
             <span class="Validform_checktip"></span>
         </div>
         <div class="form">
             <label class="Validform_label">是否激活:</label>
             <t:dictSelect field="validFlag" type="list"  datatype="*"   typeGroupCode="yOn"  defaultVal="${frontUserRegisterPage.validFlag}" hasLabel="false"  title="是否激活"></t:dictSelect>
             <span class="Validform_checktip"></span>
         </div>
         <div class="form">
             <label class="Validform_label">推荐人用户名:</label>
             <input id="introducer" name="introducer" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${frontUserRegisterPage.introducer}' readonly/>
             <span class="Validform_checktip"></span>
         </div>
     </fieldset>
 </t:formvalid>
 </body>
  <script src = "webpage/smp/user/frontUserRegister.js"></script>
