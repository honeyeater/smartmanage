<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="/context/mytags.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>用户注册</title>
    <%--<t:base type="jquery,easyui,tools,DatePicker"></t:base>--%>
    <!--bootstrape-->
    <link href="plug-in/bootstrap3/css/bootstrap.min.css" rel="stylesheet">
    <link href="plug-in/bootstrap3/validate/css/bootstrapValidator.min.css" rel="stylesheet">
    <link href="plug-in/webfront/css/common.css" rel="stylesheet">
    <script src="plug-in/ace/assets/js/jquery-2.0.3.min.js"></script>
    <script src="plug-in/bootstrap3/js/bootstrap.min.js"></script>
    <script src="plug-in/bootstrap3/validate/js/bootstrapValidator.js"></script>
    <script src="plug-in/bootstrap3/validate/js/language/zh_CN.js"></script>
    <style>
        body {
            background: white;
        }
    </style>
</head>
<body>
    <div class="header">
        <div class="navbar navbar-inverse">
            <div class="container col-lg-4 col-lg-offset-4">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#" style="color: white"><strong>欢迎注册金润智能理财系统</strong></a>
                </div>
            </div>
        </div>
    </div>
    <div class="container">
        <form class="form-horizontal required-validate form-signin"
              onsubmit="return validateCallback(this)">
            <input id="id" name="id" type="hidden" value="${frontUserRegisterPage.id }">
            <div class="form-group">
                <label class="col-lg-2 col-lg-offset-2 control-label" for="introducer">推荐人:</label>
                <div class="col-lg-4">
                    <input id="introducer" name="introducer" type="text" class="form-control" ignore="ignore"/>
                    <span class="Validform_checktip"></span>
                </div>
            </div>
            <div class="form-group">
                <label class="col-lg-2 col-lg-offset-2 control-label" for="userName">用户名:</label>
                <div class="col-lg-4">
                    <input id="userName" name="userName" type="text" class="form-control" ignore="ignore"/>
                    <span class="Validform_checktip"></span>
                </div>
            </div>
            <div class="form-group">
                <label class="col-lg-2 col-lg-offset-2 control-label" for="phoneno">手机号:</label>
                <div class="col-lg-4">
                    <input id="phoneno" name="phoneno" type="text" class="form-control" ignore="ignore" placeholder="手机号"
                           data-bv-notempty/>
                    <span class="Validform_checktip"></span>
                </div>
            </div>
            <div class="form-group">
                <label class="col-lg-2 col-lg-offset-2 control-label" for="identityNo">身份证号:</label>
                <div class="col-lg-4">
                    <input id="identityNo" name="identityNo" type="text"  class="form-control" ignore="ignore" placeholder="身份证号"
                           required />
                    <span class="Validform_checktip"></span>
                </div>
            </div>
            <div class="form-group">
                <label class="col-lg-2 col-lg-offset-2 control-label" for="realname">真实姓名:</label>
                <div class="col-lg-4">
                    <input id="realname" name="realname" type="text"  class="form-control" ignore="ignore" placeholder="真实姓名"/>
                    <span class="Validform_checktip"></span>
                </div>
            </div>
            <div class="form-group">
                <label class="col-lg-2 col-lg-offset-2 control-label" for="province">银行省份:</label>
                <div class="col-lg-4">
                    <%--<input id="province" name="province" type="text"  class="form-control" ignore="ignore"/>--%>
                    <%--<span class="Validform_checktip"></span>--%>
                    <select class="form-control" id="province" name="province">
                        <option>省份</option>
                        <option>上海市</option>
                        <option>北京市</option>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <label class="col-lg-2 col-lg-offset-2 control-label" for="city">银行城市:</label>
                <div class="col-lg-4">
                    <%--<input id="city" name="city" type="text"  class="form-control" ignore="ignore"/>--%>
                    <%--<span class="Validform_checktip"></span>--%>
                    <select class="form-control" id="city" name="city">
                        <option>城市</option>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <label class="col-lg-2 col-lg-offset-2 control-label" for="bankCode">开户银行:</label>
                <div class="col-lg-4">
                    <select id="bankCode" name="bankCode" class="form-control">
                        <option>银行</option>
                        <option>人民银行</option>
                        <option>银行</option>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <label class="col-lg-2 col-lg-offset-2 control-label" for="bankCard">银行卡号:</label>
                <div class="col-lg-4">
                    <input id="bankCard" name="bankCard" type="text"  class="form-control" ignore="ignore"/>
                    <span class="Validform_checktip"></span>
                </div>
            </div>
            <div class="form-group">
                <label class="col-lg-2 col-lg-offset-2 control-label" for="bankAddress">银行详细地址:</label>
                <div class="col-lg-4">
                    <input id="bankAddress" name="bankAddress" type="text"  class="form-control"
                           ignore="ignore"/>
                    <span class="Validform_checktip"></span>
                </div>
            </div>
            <div class="form-group">
                <label class="col-lg-2 col-lg-offset-2 control-label" for="password">登录密码:</label>
                <div class="col-lg-4">
                    <input id="password" name="password" type="text"  class="form-control" ignore="ignore"/>
                    <span class="Validform_checktip"></span>
                </div>
            </div>
            <div class="form-group">
                <label class="col-lg-2 col-lg-offset-2 control-label" for="safePassword">安全密码:</label>
                <div class="col-lg-4">
                    <input id="safePassword" name="safePassword" type="text"  class="form-control"
                           ignore="ignore"/>
                    <span class="Validform_checktip"></span>
                </div>
            </div>
            <div class="form-group">
                <label class="col-lg-2 col-lg-offset-2 control-label" for="validCode">验证码:</label>
                <div class="col-lg-4">
                    <input id="validCode" name="validCode" type="text"  class="form-control"
                           ignore="ignore"/>
                    <span class="Validform_checktip"></span>
                </div>
            </div>
            <div class="form-group">
                <label class="col-lg-2 col-lg-offset-2 control-label" for="phoneValidCode">手机验证码:</label>
                <div class="col-lg-4">
                    <input id="phoneValidCode" name="phoneValidCode" type="text"  class="form-control" ignore="ignore"/>
                    <span class="Validform_checktip"></span>
                </div>
            </div>
            <div class="form-group">
                <div class="col-lg-offset-4 col-lg-4">
                    <button type="submit" class="btn btn-primary btn-lg btn-block">注册</button>
                </div>
            </div>
        </form>
    </div>


</body>
<script src="webpage/smp/user/frontUserRegister.js"></script>
<script>
    $(function() {
        // validate form
        $("form.required-validate").each(function() {
            var $form = $(this);
            $form.bootstrapValidator();
            // 修复bootstrap validator重复向服务端提交bug
            $form.on('success.form.bv', function(e) {
                // Prevent form submission
                e.preventDefault();
            });
        });
    });

    function validateCallback(form, callback, confirmMsg) {
        var $form = $(form);

        var data = $form.data('bootstrapValidator');
        alert(data);
        if (data) {
            // 修复记忆的组件不验证
            data.validate();
            if (!data.isValid()) {
                return false;
            }
        }

        return false;
    }
</script>
	