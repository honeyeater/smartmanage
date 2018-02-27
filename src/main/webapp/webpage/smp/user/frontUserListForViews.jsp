<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="/context/mytags.jsp" %>

<div class="easyui-layout" fit="true">
    <input type="hidden" name="userName" value="${userName}">
    <div region="center" style="padding:0px;border:0px">
        <t:datagrid name="typeValueList" title="common.type.list"
                    actionUrl="frontUserRegisterController.do?typeGrid&typegroupcode=${typegroupcode}" idField="id"
                    queryMode="group">
        <t:dgCol title="common.code" field="id" hidden="true"></t:dgCol>
        <t:dgCol title="信息名称" field="typename"></t:dgCol>
        <t:dgCol title="信息表" field="typecode"></t:dgCol>
        <t:dgCol title="common.operation" field="opt"></t:dgCol>
        <!-- 	//update-begin--Author:zhangjq  Date:20160904 for：1332 【系统图标统一调整】讲{系统管理模块}{在线开发}的链接按钮，改成ace风格 -->
        <t:dgFunOpt title="重置" funname="resetUserInfo(typecode, typename)" urlclass="ace_button" urlfont="fa-refresh"></t:dgFunOpt>
        <!-- 	//update-begin--Author:zhangjq  Date:20160904 for：1332 【系统图标统一调整】讲{系统管理模块}{在线开发}的链接按钮，改成ace风格 -->
        <%--<t:dgToolBar title="common.add.param" langArg="common.type" icon="icon-add" url="systemController.do?addorupdateType&typegroupid=${typegroupid}" funname="add"></t:dgToolBar>--%>
        <%--<t:dgToolBar title="common.edit.param" langArg="common.type" icon="icon-edit" url="systemController.do?addorupdateType&typegroupid=${typegroupid}" funname="update"></t:dgToolBar>--%>
        </t:datagrid>
    </div>
</div>
<script>
    function resetUserInfo(typecode, typename) {
        $.dialog.confirm('确定重置'+typename, function(){
            $.post("cgFormHeadController.do?resetUserView",
                {typecode : typecode},
                function(data){
                    var d = $.parseJSON(data);
                    if (d.success) {
                        tip(d.msg);
                    }else{
                        tip(d.msg);
                    }
                });
        }, function(){
        }).zindex();
    }
</script>

