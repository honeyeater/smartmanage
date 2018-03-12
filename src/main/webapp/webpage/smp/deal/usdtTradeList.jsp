<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="usdtTradeList" checkbox="true" pagination="true" fitColumns="true" title="交易信息" actionUrl="usdtTradeController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="ID"  field="id"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="用户名"  field="username"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="交易编号"  field="tradeNo"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="货币类型"  field="currencyType"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="价格"  field="price"  queryMode="group"  width="60"></t:dgCol>
   <t:dgCol title="数量"  field="num"  queryMode="group"  width="60"></t:dgCol>
   <t:dgCol title="金额"  field="money"  queryMode="group"  width="60"></t:dgCol>
   <t:dgCol title="手续费比例"  field="feeRate"  queryMode="group"  width="60"></t:dgCol>
   <t:dgCol title="手续费"  field="fee"  queryMode="group"  width="60"></t:dgCol>
   <t:dgCol title="总金额"  field="sumAmount" hidden="true" queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="交易类型"  field="tradeType"  queryMode="single" replace="买入_1,卖出_2" width="80" query="true" ></t:dgCol>
   <t:dgCol title="状态"  field="status"  queryMode="single"  width="80" query="true" replace="待审核_0,审核通过_1,审核不通过_-1"></t:dgCol>
   <t:dgCol title="提出地址"  field="drawUrl"  queryMode="group"  width="80"></t:dgCol>
   <t:dgCol title="输入日期"  field="inputtime"  formatter="yyyy-MM-dd hh:mm:ss"  queryMode="group"  width="120"></t:dgCol>
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
      <t:dgConfOpt title="通过" exp="status#eq#0" url="usdtTradeController.do?auditpass&id={id}&ispass=1" urlclass="ace_button" message="确认审核通过"  urlfont="fa-check"/>
      <t:dgConfOpt title="不通过" exp="status#eq#0" url="usdtTradeController.do?auditunpass&id={id}&ispass=0" urlclass="ace_button" message="确认审核不通过"  urlfont="fa-close"/>
      <%--<t:dgDelOpt title="删除" url="usdtTradeController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>--%>
   <%--<t:dgToolBar title="录入" icon="icon-add" url="usdtTradeController.do?goAdd" funname="add"></t:dgToolBar>--%>

      <%--<t:dgToolBar title="编辑" icon="icon-edit" url="usdtTradeController.do?goUpdate" funname="update"></t:dgToolBar>--%>
   <%--<t:dgToolBar title="批量删除"  icon="icon-remove" url="usdtTradeController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>--%>
   <t:dgToolBar title="查看" icon="icon-search" url="usdtTradeController.do?goUpdate" funname="detail"></t:dgToolBar>
   <%--<t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>--%>
   <%--<t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>--%>
   <%--<t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>--%>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage//deal/usdtTradeList.js"></script>		
 <script type="text/javascript">
 $(document).ready(function(){
 });
 
   
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'usdtTradeController.do?upload', "usdtTradeList");
}

//导出
function ExportXls() {
	JeecgExcelExport("usdtTradeController.do?exportXls","usdtTradeList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("usdtTradeController.do?exportXlsByT","usdtTradeList");
}

 </script>