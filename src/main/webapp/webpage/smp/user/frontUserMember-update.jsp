<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>会员信息表</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
 </head>
 <body>
 <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="div" action="frontUserMemberController.do?doUpdate" >
     <input id="id" name="id" type="hidden" value="${frontUserMemberPage.id }"/>
     <input id="blockWallet" name="blockWallet" type="hidden" value="${frontUserMemberPage.blockWallet }"/>
     <input id="redWallet" name="redWallet" type="hidden" value="${frontUserMemberPage.redWallet }"/>
     <input id="activeCost" name="activeCost" type="hidden" value="${frontUserMemberPage.activeCost }"/>
     <input id="inputtime" name="inputtime" type="hidden" value="${frontUserMemberPage.inputtime }"/>
     <input id="inserttimeforhis" name="inserttimeforhis" type="hidden" value="${frontUserMemberPage.inserttimeforhis }"/>
     <input id="operatetimeforhis" name="operatetimeforhis" type="hidden" value="${frontUserMemberPage.operatetimeforhis }"/>
     <input id="vfield1" name="vfield1" type="hidden" value="${frontUserMemberPage.vfield1 }"/>
     <input id="vfield2" name="vfield2" type="hidden" value="${frontUserMemberPage.vfield2 }"/>
     <input id="vfield3" name="vfield3" type="hidden" value="${frontUserMemberPage.vfield3 }"/>
     <input id="vfield4" name="vfield4" type="hidden" value="${frontUserMemberPage.vfield4 }"/>
     <input id="vfield5" name="vfield5" type="hidden" value="${frontUserMemberPage.vfield5 }"/>
     <input id="vfield6" name="vfield6" type="hidden" value="${frontUserMemberPage.vfield6 }"/>
     <input id="nfield1" name="nfield1" type="hidden" value="${frontUserMemberPage.nfield1 }"/>
     <input id="nfield2" name="nfield2" type="hidden" value="${frontUserMemberPage.nfield2 }"/>
     <input id="nfield3" name="nfield3" type="hidden" value="${frontUserMemberPage.nfield3 }"/>
     <input id="nfield4" name="nfield4" type="hidden" value="${frontUserMemberPage.nfield4 }"/>
     <input id="dfield1" name="dfield1" type="hidden" value="${frontUserMemberPage.dfield1 }"/>
     <input id="dfield2" name="dfield2" type="hidden" value="${frontUserMemberPage.dfield2 }"/>
     <input id="dfield3" name="dfield3" type="hidden" value="${frontUserMemberPage.dfield3 }"/>
     <input id="dfield4" name="dfield4" type="hidden" value="${frontUserMemberPage.dfield4 }"/>
     <fieldset class="step">
         <div class="form">
             <label class="Validform_label">用户名:</label>
             <input id="username" name="username" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${frontUserMemberPage.username}' readonly/>
             <span class="Validform_checktip"></span>
         </div>
         <div class="form">
             <label class="Validform_label">会员级别:</label>
             <t:dictSelect field="userLevel" type="list"  datatype="*"   typeGroupCode="userLevel"  defaultVal="${frontUserMemberPage.userLevel}" hasLabel="false"  title="会员级别"></t:dictSelect>
             <span class="Validform_checktip"></span>
         </div>
         <div class="form">
             <label class="Validform_label">账户总值:</label>
             <input id="sumAmount" name="sumAmount" type="text" style="width: 150px" class="inputxt"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore"  value='${frontUserMemberPage.sumAmount}' readonly/>
             <span class="Validform_checktip"></span>
         </div>
         <div class="form">
             <label class="Validform_label">直推人数:</label>
             <input id="introNums" name="introNums" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${frontUserMemberPage.introNums}' readonly/>
             <span class="Validform_checktip"></span>
         </div>
         <div class="form">
             <label class="Validform_label">团队人数:</label>
             <input id="teamNums" name="teamNums" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${frontUserMemberPage.teamNums}' readonly/>
             <span class="Validform_checktip"></span>
         </div>
         <div class="form">
             <label class="Validform_label">本息钱包:</label>
             <input id="couponWallet" name="couponWallet" type="text" style="width: 150px" class="inputxt"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore"  value='${frontUserMemberPage.couponWallet}' readonly/>
             <span class="Validform_checktip"></span>
         </div>
         <div class="form">
             <label class="Validform_label">直推钱包:</label>
             <input id="introWallet" name="introWallet" type="text" style="width: 150px" class="inputxt"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore"  value='${frontUserMemberPage.introWallet}'/>
             <span class="Validform_checktip"></span>
         </div>
         <div class="form">
             <label class="Validform_label">待返钱包:</label>
             <input id="backWallet" name="backWallet" type="text" style="width: 150px" class="inputxt"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore"  value='${frontUserMemberPage.backWallet}' readonly/>
             <span class="Validform_checktip"></span>
         </div>
         <div class="form">
             <label class="Validform_label">总共限额:</label>
             <input id="sumLimit" name="sumLimit" type="text" style="width: 150px" class="inputxt"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore"  value='${frontUserMemberPage.sumLimit}' />
             <span class="Validform_checktip"></span>
         </div>
         <div class="form">
             <label class="Validform_label">已用限额:</label>
             <input id="useLimit" name="useLimit" type="text" style="width: 150px" class="inputxt"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore"  value='${frontUserMemberPage.useLimit}' readonly/>
             <span class="Validform_checktip"></span>
         </div>
     </fieldset>
 </t:formvalid>
 </body>
  <script src = "webpage//user/frontUserMember.js"></script>		
