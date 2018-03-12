<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="frontStorageActivatecodeList" checkbox="true" pagination="true" fitColumns="true" title="验证码" actionUrl="frontStorageActivatecodeController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="ID"  field="id"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="用户名"  field="username"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="激活码"  field="activieCode"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="生成时间"  field="generateTime"  formatter="yyyy-MM-dd hh:mm:ss"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="使用时间"  field="useTime"  formatter="yyyy-MM-dd hh:mm:ss"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="使用人"  field="userUsername"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="是否使用"  field="isuse"  queryMode="group" replace="是_1,否_0" width="120"></t:dgCol>
   <t:dgCol title="是否有效"  field="validstatus"  queryMode="group" replace="是_1,否_0" width="120"></t:dgCol>
   <t:dgCol title="激活码类型"  field="activieType"  queryMode="single" replace="普通1.5W_1,中级50W_2" width="120"></t:dgCol>
   <t:dgCol title="输入日期"  field="inputtime"  formatter="yyyy-MM-dd"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="插入时间"  field="inserttimeforhis"  formatter="yyyy-MM-dd"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="更新时间"  field="operatetimeforhis"  formatter="yyyy-MM-dd"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="扩展字符字段"  field="vfield1"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="扩展字符字段"  field="vfield2"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="扩展字符字段"  field="vfield3"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="扩展字符字段"  field="vfield4"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="扩展字符字段"  field="vfield5"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="扩展字符字段"  field="vfield6"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="扩展金额字段"  field="nfield1"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="扩展金额字段"  field="nfield2"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="扩展金额字段"  field="nfield3"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="扩展金额字段"  field="nfield4"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="扩展时间字段"  field="dfield1"  formatter="yyyy-MM-dd"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="扩展时间字段"  field="dfield2"  formatter="yyyy-MM-dd"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="扩展时间字段"  field="dfield3"  formatter="yyyy-MM-dd"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="扩展时间字段"  field="dfield4"  formatter="yyyy-MM-dd"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="frontStorageActivatecodeController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="frontStorageActivatecodeController.do?goAdd" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="frontStorageActivatecodeController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量生成" icon="icon-edit" url="frontStorageActivatecodeController.do?goBatchGenerate" funname="add"></t:dgToolBar>
      <t:dgToolBar title="批量删除"  icon="icon-remove" url="frontStorageActivatecodeController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <%--<t:dgToolBar title="查看" icon="icon-search" url="frontStorageActivatecodeController.do?goUpdate" funname="detail"></t:dgToolBar>--%>
   <%--<t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>--%>
   <%--<t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>--%>
   <%--<t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>--%>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage/smp/activate/frontStorageActivatecodeList.js"></script>
 <script type="text/javascript">
 $(document).ready(function(){
 });


 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'frontStorageActivatecodeController.do?upload', "frontStorageActivatecodeList");
}

//导出
function ExportXls() {
	JeecgExcelExport("frontStorageActivatecodeController.do?exportXls","frontStorageActivatecodeList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("frontStorageActivatecodeController.do?exportXlsByT","frontStorageActivatecodeList");
}

 </script>