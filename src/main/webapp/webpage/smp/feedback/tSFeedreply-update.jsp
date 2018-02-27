<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>系统意见留言信息表</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="div" action="tSFeedreplyController.do?doUpdate" >
			<input id="id" name="id" type="hidden" value="${tSFeedreplyPage.id }"/>
		<fieldset class="step">
			<div class="form">
		      <label class="Validform_label">留言编号:</label>
		     	 <input id="feedbackid" name="feedbackid" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${tSFeedreplyPage.feedbackid}'/>
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">序号:</label>
		     	 <input id="serialno" name="serialno" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${tSFeedreplyPage.serialno}'/>
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">反馈内容:</label>
			    <textarea id="replyContent" style="width:600px;" class="inputxt" rows="6" name="replyContent"  ignore="ignore" >${tSFeedreplyPage.replyContent}</textarea>
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">反馈时间:</label>
					  <input id="replyTime" name="replyTime" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore"   value='<fmt:formatDate value='${tSFeedreplyPage.replyTime}' type="date" pattern="yyyy-MM-dd"/>'/>   
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">反馈人员:</label>
		     	 <input id="replyUsercode" name="replyUsercode" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${tSFeedreplyPage.replyUsercode}'/>
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">通知标志:</label>
		     	 <input id="notifyFlag" name="notifyFlag" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${tSFeedreplyPage.notifyFlag}'/>
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">通知时间:</label>
					  <input id="notifyTime" name="notifyTime" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore"   value='<fmt:formatDate value='${tSFeedreplyPage.notifyTime}' type="date" pattern="yyyy-MM-dd"/>'/>   
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">通知内容:</label>
		     	 <input id="notifyContent" name="notifyContent" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${tSFeedreplyPage.notifyContent}'/>
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">输入日期:</label>
					  <input id="inputtime" name="inputtime" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore"   value='<fmt:formatDate value='${tSFeedreplyPage.inputtime}' type="date" pattern="yyyy-MM-dd"/>'/>   
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">插入时间:</label>
					  <input id="inserttimeforhis" name="inserttimeforhis" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore"   value='<fmt:formatDate value='${tSFeedreplyPage.inserttimeforhis}' type="date" pattern="yyyy-MM-dd"/>'/>   
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">更新时间:</label>
					  <input id="operatetimeforhis" name="operatetimeforhis" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore"   value='<fmt:formatDate value='${tSFeedreplyPage.operatetimeforhis}' type="date" pattern="yyyy-MM-dd"/>'/>   
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">扩展字符字段:</label>
		     	 <input id="vfield1" name="vfield1" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${tSFeedreplyPage.vfield1}'/>
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">扩展字符字段:</label>
		     	 <input id="vfield2" name="vfield2" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${tSFeedreplyPage.vfield2}'/>
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">扩展字符字段:</label>
		     	 <input id="vfield3" name="vfield3" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${tSFeedreplyPage.vfield3}'/>
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">扩展字符字段:</label>
		     	 <input id="vfield4" name="vfield4" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${tSFeedreplyPage.vfield4}'/>
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">扩展字符字段:</label>
		     	 <input id="vfield5" name="vfield5" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${tSFeedreplyPage.vfield5}'/>
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">扩展字符字段:</label>
		     	 <input id="vfield6" name="vfield6" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${tSFeedreplyPage.vfield6}'/>
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">扩展金额字段:</label>
		     	 <input id="nfield1" name="nfield1" type="text" style="width: 150px" class="inputxt"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore"  value='${tSFeedreplyPage.nfield1}'/>
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">扩展金额字段:</label>
		     	 <input id="nfield2" name="nfield2" type="text" style="width: 150px" class="inputxt"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore"  value='${tSFeedreplyPage.nfield2}'/>
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">扩展金额字段:</label>
		     	 <input id="nfield3" name="nfield3" type="text" style="width: 150px" class="inputxt"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore"  value='${tSFeedreplyPage.nfield3}'/>
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">扩展金额字段:</label>
		     	 <input id="nfield4" name="nfield4" type="text" style="width: 150px" class="inputxt"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore"  value='${tSFeedreplyPage.nfield4}'/>
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">扩展时间字段:</label>
					  <input id="dfield1" name="dfield1" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore"   value='<fmt:formatDate value='${tSFeedreplyPage.dfield1}' type="date" pattern="yyyy-MM-dd"/>'/>   
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">扩展时间字段:</label>
					  <input id="dfield2" name="dfield2" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore"   value='<fmt:formatDate value='${tSFeedreplyPage.dfield2}' type="date" pattern="yyyy-MM-dd"/>'/>   
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">扩展时间字段:</label>
					  <input id="dfield3" name="dfield3" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore"   value='<fmt:formatDate value='${tSFeedreplyPage.dfield3}' type="date" pattern="yyyy-MM-dd"/>'/>   
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">扩展时间字段:</label>
					  <input id="dfield4" name="dfield4" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore"   value='<fmt:formatDate value='${tSFeedreplyPage.dfield4}' type="date" pattern="yyyy-MM-dd"/>'/>   
		      <span class="Validform_checktip"></span>
		    </div>
	    </fieldset>
  </t:formvalid>
 </body>
  <script src = "webpage//feedback/tSFeedreply.js"></script>		
