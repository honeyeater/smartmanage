<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="tSUserquestionList" checkbox="true" pagination="true" fitColumns="true" title="系统常见问题信息表" actionUrl="tSUserquestionController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="ID"  field="id"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="问题标题"  field="questionTitle"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="问题公告内容"  field="questionContent"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="问题类型"  field="questionType"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="问题授权级别"  field="questionLevel"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="阅读期限"  field="questionTerm"  formatter="yyyy-MM-dd"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="创建者"  field="createUser"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="创建时间"  field="createTime"  formatter="yyyy-MM-dd"  queryMode="group"  width="120"></t:dgCol>
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
   <t:dgDelOpt title="删除" url="tSUserquestionController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="tSUserquestionController.do?goAdd" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="tSUserquestionController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="tSUserquestionController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="tSUserquestionController.do?goUpdate" funname="detail"></t:dgToolBar>
   <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
   <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage//notice/tSUserquestionList.js"></script>		
 <script type="text/javascript">
 $(document).ready(function(){
 });
 
   
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'tSUserquestionController.do?upload', "tSUserquestionList");
}

//导出
function ExportXls() {
	JeecgExcelExport("tSUserquestionController.do?exportXls","tSUserquestionList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("tSUserquestionController.do?exportXlsByT","tSUserquestionList");
}

 </script>