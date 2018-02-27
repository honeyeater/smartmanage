<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
      <font color="red">**参数配置代码请勿调整</font>
      <t:datagrid name="tSConfigcodeList" checkbox="true" pagination="true" fitColumns="true" title="配置信息表" actionUrl="tSConfigcodeController.do?datagrid" idField="id" fit="true" queryMode="group">
          <t:dgCol title="ID"  field="id"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
          <t:dgCol title="参数配置名称"  field="configName"  queryMode="single"  width="40" query="true"></t:dgCol>
          <t:dgCol title="参数配置代码"  field="configCode"  queryMode="single"  width="40" query="true"></t:dgCol>
          <t:dgCol title="参数配置值"  field="configValue"  queryMode="group"  width="40"></t:dgCol>
          <t:dgCol title="状态"  field="status"  queryMode="group" replace="有效_1,无效_0" width="10"></t:dgCol>
          <t:dgCol title="标志"  field="comFlag"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
          <t:dgCol title="标志代码"  field="comCode"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
          <t:dgCol title="标志级别"  field="comLevel"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
          <t:dgCol title="备注"  field="remark"  queryMode="group"  width="120"></t:dgCol>
          <t:dgCol title="输入日期"  field="inputtime"  formatter="yyyy-MM-dd hh:mm:ss"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
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
          <t:dgDelOpt title="删除" url="tSConfigcodeController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
          <t:dgToolBar title="录入" icon="icon-add" url="tSConfigcodeController.do?goAdd" funname="add"></t:dgToolBar>
          <t:dgToolBar title="编辑" icon="icon-edit" url="tSConfigcodeController.do?goUpdate" funname="update"></t:dgToolBar>
          <t:dgToolBar title="批量删除"  icon="icon-remove" url="tSConfigcodeController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
          <%--<t:dgToolBar title="查看" icon="icon-search" url="tSConfigcodeController.do?goUpdate" funname="detail"></t:dgToolBar>--%>
          <%--<t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>--%>
          <%--<t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>--%>
          <%--<t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>--%>

      </t:datagrid>

  </div>
</div>
 <script src = "webpage/smp/base/tSConfigcodeList.js"></script>
 <script type="text/javascript">
 $(document).ready(function(){
 });

 </script>