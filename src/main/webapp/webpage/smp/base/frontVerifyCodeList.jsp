<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="frontVerifyCodeList" checkbox="true" pagination="true" fitColumns="true" title="验证码信息表" actionUrl="frontVerifyCodeController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="ID"  field="id"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="用户名"  field="username"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="手机号"  field="phoneno"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="验证码"  field="validCode"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="生成时间"  field="createTime"  formatter="yyyy-MM-dd"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="是否使用"  field="isuse"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="使用时间"  field="userTime"  formatter="yyyy-MM-dd"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="发送时间"  field="sendTime"  formatter="yyyy-MM-dd"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="发送内容"  field="sendContent"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="是否有效"  field="validstatus"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="待返钱包"  field="type"  queryMode="group"  width="120"></t:dgCol>
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
   <t:dgDelOpt title="删除" url="frontVerifyCodeController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="frontVerifyCodeController.do?goAdd" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="frontVerifyCodeController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="frontVerifyCodeController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="frontVerifyCodeController.do?goUpdate" funname="detail"></t:dgToolBar>
   <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
   <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage//base/frontVerifyCodeList.js"></script>		
 <script type="text/javascript">
 $(document).ready(function(){
 });
 
   
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'frontVerifyCodeController.do?upload', "frontVerifyCodeList");
}

//导出
function ExportXls() {
	JeecgExcelExport("frontVerifyCodeController.do?exportXls","frontVerifyCodeList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("frontVerifyCodeController.do?exportXlsByT","frontVerifyCodeList");
}

 </script>