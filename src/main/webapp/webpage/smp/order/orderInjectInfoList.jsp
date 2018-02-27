<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="orderInjectInfoList" checkbox="true" pagination="true" fitColumns="true" title="注入资金订单表" actionUrl="orderInjectInfoController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="ID"  field="id"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="用户名"  field="username"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="订单编号"  field="orderCode"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="订单金额"  field="orderMoney"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="订单状态"  field="orderStatus"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="订单时间"  field="orderTime"  formatter="yyyy-MM-dd"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="应得利息"  field="interest"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="首付款金额"  field="firstPay"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="首付款注入时间"  field="firstPayTime"  formatter="yyyy-MM-dd"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="尾款金额"  field="endPay"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="尾款注入时间"  field="endPayTime"  formatter="yyyy-MM-dd"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="首尾款区间时间"  field="firstEndInternal"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="保存期区间时间"  field="saveInternal"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="利息比例"  field="restRate"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="手续费"  field="serviceCharge"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="实际利息金额"  field="interestReal"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="等待期开始时间"  field="waitStartTime"  formatter="yyyy-MM-dd"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="等待期区间时间"  field="waitInternal"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="等待期结束时间"  field="waitEndTime"  formatter="yyyy-MM-dd"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="订单款进度"  field="orderProgress"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="原因"  field="reason"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="订单总款"  field="orderTotalMoney"  queryMode="group"  width="120"></t:dgCol>
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
   <t:dgDelOpt title="删除" url="orderInjectInfoController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="orderInjectInfoController.do?goAdd" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="orderInjectInfoController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="orderInjectInfoController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="orderInjectInfoController.do?goUpdate" funname="detail"></t:dgToolBar>
   <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
   <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage//order/orderInjectInfoList.js"></script>		
 <script type="text/javascript">
 $(document).ready(function(){
 });
 
   
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'orderInjectInfoController.do?upload', "orderInjectInfoList");
}

//导出
function ExportXls() {
	JeecgExcelExport("orderInjectInfoController.do?exportXls","orderInjectInfoList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("orderInjectInfoController.do?exportXlsByT","orderInjectInfoList");
}

 </script>