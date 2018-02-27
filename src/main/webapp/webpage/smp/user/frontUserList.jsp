<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>

<div id="main_typegroup_list" class="easyui-layout" fit="true">
    <div region="center" style="padding:0px;border:0px">
        <t:datagrid name="frontUserRegisterList" checkbox="true" pagination="true" fitColumns="true" title="注册用户信息表" actionUrl="frontUserRegisterController.do?datagrid" idField="id" fit="true" queryMode="group">
            <t:dgCol title="ID"  field="id"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
            <t:dgCol title="用户名"  field="userName"  query="true"  queryMode="single"  width="120"></t:dgCol>
            <t:dgCol title="手机号"  field="phoneno"  query="true"  queryMode="single"  width="120"></t:dgCol>
            <t:dgCol title="身份证号"  field="identityNo"  query="true"  queryMode="single"  width="120"></t:dgCol>
            <t:dgCol title="真实姓名"  field="realname"  query="true"  queryMode="single"  width="120"></t:dgCol>
            <t:dgCol title="银行省份"  field="province"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
            <t:dgCol title="银行城市"  field="city"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
            <t:dgCol title="开户银行代码"  field="bankCode"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
            <t:dgCol title="开户银行"  field="bankName"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
            <t:dgCol title="银行卡号"  field="bankCard"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
            <t:dgCol title="银行详细地址"  field="bankAddress"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
            <t:dgCol title="登录密码"  field="password"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
            <t:dgCol title="安全密码"  field="safePassword"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
            <t:dgCol title="注册时间"  field="registerTime"  formatter="yyyy-MM-dd"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
            <t:dgCol title="注册IP地址"  field="registerIp"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
            <t:dgCol title="联系电话"  field="linkerMobile"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
            <t:dgCol title="居住地址"  field="address"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
            <t:dgCol title="是否激活"  field="validFlag"  queryMode="single"  replace="是_1,否_0" width="120"></t:dgCol>
            <t:dgCol title="激活时间"  field="activeTime"  formatter="yyyy-MM-dd"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
            <t:dgCol title="会员级别"  field="userLevel"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
            <t:dgCol title="推荐人用户名"  field="introducer"  query="true"  queryMode="single"  width="120"></t:dgCol>
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
            <t:dgFunOpt title="信息重置" funname="queryTypeValue(userName,realname)" urlclass="ace_button"  urlfont="fa-search"/>

            <%--<t:dgToolBar title="录入" icon="icon-add" url="frontUserRegisterController.do?goAdd" funname="add"></t:dgToolBar>--%>
            <%--<t:dgToolBar title="编辑" icon="icon-edit" url="frontUserRegisterController.do?goUpdate" funname="update"></t:dgToolBar>--%>
            <%--<t:dgToolBar title="批量删除"  icon="icon-remove" url="frontUserRegisterController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>--%>
            <%--<t:dgToolBar title="查看" icon="icon-search" url="frontUserRegisterController.do?goUpdate" funname="detail"></t:dgToolBar>--%>
            <%--<t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>--%>
            <%--<t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>--%>
            <%--<t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>--%>
        </t:datagrid>
    </div>
</div>

<div data-options="region:'east',
	title:'mytitle',
	collapsed:true,
	split:true,
	border:false,
	onExpand : function(){
		li_east = 1;
	},
	onCollapse : function() {
	    li_east = 0;
	}"
     style="width: 400px; overflow: hidden;" id="eastPanel">
    <div class="easyui-panel" style="padding:0px;border:0px" fit="true" border="false" id="userListpanel"></div>
</div>

<script type="text/javascript">
    $(function() {
        var li_east = 0;
    });

    function queryTypeValue(username, realname){
        var typegroupcode = "userViews";
        var title = '用户关联信息';
        if(li_east == 0){
            $('#main_typegroup_list').layout('expand','east');
        }
        $('#main_typegroup_list').layout('panel','east').panel('setTitle', title);
        $('#userListpanel').panel("refresh", "frontUserRegisterController.do?goUserViews&typegroupcode=" + typegroupcode+"&username="+username);
    }
    function loadSuccess() {
        $('#main_typegroup_list').layout('panel','east').panel('setTitle', "");
        $('#main_typegroup_list').layout('collapse','east');
        $('#userListpanel').empty();
    }
</script>
