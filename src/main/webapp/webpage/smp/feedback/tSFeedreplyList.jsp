<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="tSFeedreplyList" checkbox="true" pagination="true" fitColumns="true" title="系统意见留言信息表" actionUrl="tSFeedreplyController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="ID"  field="id"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="留言编号"  field="feedbackid"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="序号"  field="serialno"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="反馈内容"  field="replyContent"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="反馈时间"  field="replyTime"  formatter="yyyy-MM-dd"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="反馈人员"  field="replyUsercode"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="通知标志"  field="notifyFlag"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="通知时间"  field="notifyTime"  formatter="yyyy-MM-dd"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="通知内容"  field="notifyContent"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="输入日期"  field="inputtime"  formatter="yyyy-MM-dd"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="插入时间"  field="inserttimeforhis"  formatter="yyyy-MM-dd"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="更新时间"  field="operatetimeforhis"  formatter="yyyy-MM-dd"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="扩展字符字段"  field="vfield1"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="扩展字符字段"  field="vfield2"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="扩展字符字段"  field="vfield3"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="扩展字符字段"  field="vfield4"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="扩展字符字段"  field="vfield5"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="扩展字符字段"  field="vfield6"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="扩展金额字段"  field="nfield1"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="扩展金额字段"  field="nfield2"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="扩展金额字段"  field="nfield3"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="扩展金额字段"  field="nfield4"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="扩展时间字段"  field="dfield1"  formatter="yyyy-MM-dd"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="扩展时间字段"  field="dfield2"  formatter="yyyy-MM-dd"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="扩展时间字段"  field="dfield3"  formatter="yyyy-MM-dd"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="扩展时间字段"  field="dfield4"  formatter="yyyy-MM-dd"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="tSFeedreplyController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="tSFeedreplyController.do?goAdd" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="tSFeedreplyController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="tSFeedreplyController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="tSFeedreplyController.do?goUpdate" funname="detail"></t:dgToolBar>
   <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
   <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage//feedback/tSFeedreplyList.js"></script>		
 <script type="text/javascript">
 $(document).ready(function(){
 });
 
   
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'tSFeedreplyController.do?upload', "tSFeedreplyList");
}

//导出
function ExportXls() {
	JeecgExcelExport("tSFeedreplyController.do?exportXls","tSFeedreplyList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("tSFeedreplyController.do?exportXlsByT","tSFeedreplyList");
}

 </script>