<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
      <t:datagrid name="frontUserMemberList" checkbox="true" pagination="true" fitColumns="true" title="会员信息" actionUrl="frontUserMemberController.do?datagrid" idField="id" fit="true" queryMode="group">
          <t:dgCol title="ID"  field="id"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
          <t:dgCol title="用户名"  field="username"  query="true"  queryMode="single"  width="120"></t:dgCol>
          <t:dgCol title="会员级别"  field="userLevel"   query="true"  queryMode="single" replace="普通_1,中级_2,高级_3,VIP_4"  width="120"></t:dgCol>
          <t:dgCol title="账户总值"  field="sumAmount"  queryMode="group"  width="120"></t:dgCol>
          <t:dgCol title="直推人数"  field="introNums"  query="true"  queryMode="group"  width="120"></t:dgCol>
          <t:dgCol title="团队人数"  field="teamNums"  query="true"  queryMode="group"  width="120"></t:dgCol>
          <t:dgCol title="本息钱包"  field="couponWallet"  queryMode="group"  width="120"></t:dgCol>
          <t:dgCol title="直推钱包"  field="introWallet"  queryMode="group"  width="120"></t:dgCol>
          <t:dgCol title="冻结钱包"  field="blockWallet"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
          <t:dgCol title="红包钱包"  field="redWallet"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
          <t:dgCol title="待返钱包"  field="backWallet"  queryMode="group"  width="120"></t:dgCol>
          <t:dgCol title="激活资金"  field="activeCost"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
          <t:dgCol title="总共限额"  field="sumLimit"  queryMode="group"  width="120"></t:dgCol>
          <t:dgCol title="已用限额"  field="useLimit"  queryMode="group"  width="120"></t:dgCol>
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
          <%--<t:dgDelOpt title="删除" url="frontUserMemberController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>--%>
          <%--<t:dgToolBar title="录入" icon="icon-add" url="frontUserMemberController.do?goAdd" funname="add"></t:dgToolBar>--%>
          <t:dgToolBar title="编辑" icon="icon-edit" url="frontUserMemberController.do?goUpdate" funname="update"></t:dgToolBar>
          <%--<t:dgToolBar title="批量删除"  icon="icon-remove" url="frontUserMemberController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>--%>
          <t:dgToolBar title="查看" icon="icon-search" url="frontUserMemberController.do?goUpdate" funname="detail"></t:dgToolBar>
          <%--<t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>--%>
          <%--<t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>--%>
          <%--<t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>--%>
      </t:datagrid>
  </div>
 </div>
 <script src = "webpage/smp/user/frontUserMemberList.js"></script>
 <script type="text/javascript">
 $(document).ready(function(){
 });
 
 </script>