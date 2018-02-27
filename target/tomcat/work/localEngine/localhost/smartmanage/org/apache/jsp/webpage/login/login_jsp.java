package org.apache.jsp.webpage.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.jeecgframework.core.util.SysThemesUtil;
import org.jeecgframework.core.enums.SysThemesEnum;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/context/mytags.jsp");
    _jspx_dependants.add("/WEB-INF/tld/easyui.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;

      out.write('\r');
      out.write('\n');
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /context/mytags.jsp(9,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("webRoot");
      // /context/mytags.jsp(9,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(basePath);
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      out.write('\r');
      out.write('\n');

    session.setAttribute("lang","zh-cn");
    SysThemesEnum sysTheme = SysThemesUtil.getSysTheme(request);
    String lhgdialogTheme = SysThemesUtil.getLhgdialogTheme(sysTheme);

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\r\n");
      out.write("    <meta charset=\"utf-8\" />\r\n");
      out.write("    <title>");
      if (_jspx_meth_t_005fmutiLang_005f0(_jspx_page_context))
        return;
      out.write("</title>\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"images/favicon.ico\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0\" />\r\n");
      out.write("    <!-- bootstrap & fontawesome -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"plug-in/ace/css/bootstrap.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"plug-in/ace/css/font-awesome.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"plug-in/accordion/css/accordion.css\">\r\n");
      out.write("    <!-- text fonts -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"plug-in/ace/css/ace-fonts.css\" />\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"plug-in/ace/css/jquery-ui.css\" />\r\n");
      out.write("    <!-- ace styles -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"plug-in/ace/css/ace.css\" class=\"ace-main-stylesheet\" id=\"main-ace-style\" />\r\n");
      out.write("    <!--[if lte IE 9]>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"plug-in/ace/css/ace-part2.css\" class=\"ace-main-stylesheet\" />\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("\r\n");
      out.write("    <!--[if lte IE 9]>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"plug-in/ace/css/ace-ie.css\" />\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("    <!-- ace settings handler -->\r\n");
      out.write("    <script src=\"plug-in/ace/js/ace-extra.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("\r\n");
      out.write("    <!--[if lte IE 8]>\r\n");
      out.write("    <script src=\"plug-in/ace/js/html5shiv.js\"></script>\r\n");
      out.write("    <script src=\"plug-in/ace/js/respond.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"login-layout light-login\">\r\n");
      out.write("<div class=\"main-container\">\r\n");
      out.write("    <div class=\"main-content\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-sm-10 col-sm-offset-1\">\r\n");
      out.write("                <div class=\"login-container\">\r\n");
      out.write("                    <div class=\"center\">\r\n");
      out.write("                        <h1 id=\"id-text2\" class=\"grey\">\r\n");
      out.write("                            <i class=\"ace-icon fa fa-leaf blue\"></i>\r\n");
      out.write("                            智能理财平台管理系统\r\n");
      out.write("                        </h1>\r\n");
      out.write("                        <h4 class=\"blue\" id=\"id-company-text\">www.smartpay.org</h4>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"space-6\"></div>\r\n");
      out.write("                    <div class=\"position-relative\">\r\n");
      out.write("                        <div id=\"login-box\" class=\"login-box visible widget-box no-border\">\r\n");
      out.write("                            <div class=\"widget-body\">\r\n");
      out.write("                                <!--update-begin--Author:zhangliang  Date:20170628 for：TASK #2116 【性能问题】优化登录逻辑---------------------->\r\n");
      out.write("                                <form id=\"loinForm\" class=\"form-horizontal\"    method=\"post\">\r\n");
      out.write("                                    <!--update-end--Author:zhangliang  Date:20170628 for：TASK #2116 【性能问题】优化登录逻辑---------------------->\r\n");
      out.write("                                    <!-- add-begin--Author:zhoujf  Date:20170602 for:单点登录 -->\r\n");
      out.write("                                    <input type=\"hidden\" id=\"ReturnURL\"  name=\"ReturnURL\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ReturnURL }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("                                    <!-- add-end--Author:zhoujf  Date:20170602 for:单点登录 -->\r\n");
      out.write("                                    <div class=\"widget-main\">\r\n");
      out.write("                                        <h4 class=\"header blue lighter bigger\">\r\n");
      out.write("                                            <i class=\"ace-icon fa fa-coffee green\"></i>\r\n");
      out.write("                                            用户登录\r\n");
      out.write("                                        </h4>\r\n");
      out.write("                                        <div class=\"space-6\"></div>\r\n");
      out.write("                                        <label class=\"block clearfix\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"block input-icon input-icon-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- update-start--Author:yugwu  Date:20170901 for:TASK #2324 【改进】登录记住用户名不起作用---- -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\"  name=\"userName\" iscookie=\"true\" class=\"form-control\" placeholder=\"请输入用户名\"  id=\"userName\" value=\"admin\"/>\r\n");
      out.write("                                    <!-- update-end--Author:yugwu  Date:20170901 for:TASK #2324 【改进】登录记住用户名不起作用---- -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"ace-icon fa fa-user\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("                                        </label>\r\n");
      out.write("                                        <label class=\"block clearfix\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"block input-icon input-icon-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"password\" name=\"password\" class=\"form-control\" placeholder=\"请输入密码\" id=\"password\" value=\"123456\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"ace-icon fa fa-lock\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("                                        </label>\r\n");
      out.write("                                        <label class=\"block clearfix\">\r\n");
      out.write("                                            <div class=\"input-group\">\r\n");
      out.write("                                                <input type=\"text\" style=\"width:150px\" name=\"randCode\" class=\"form-control\" placeholder=\"请输入验证码\"  id=\"randCode\"/>\r\n");
      out.write("                                                <span class=\"input-group-addon\" style=\"padding: 0px;\"><img id=\"randCodeImage\" src=\"randCodeImage\"  /></span>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </label>\r\n");
      out.write("                                        <div class=\"space\"></div>\r\n");
      out.write("                                        <div class=\"clearfix\">\r\n");
      out.write("                                            <label class=\"inline\">\r\n");
      out.write("                                                <input type=\"checkbox\" class=\"ace\" id=\"on_off\"  name=\"remember\" value=\"yes\"/>\r\n");
      out.write("                                                <span class=\"lbl\">记住用户名</span>\r\n");
      out.write("                                            </label>\r\n");
      out.write("                                            <button type=\"button\" id=\"but_login\"  onclick=\"checkUser()\" class=\"width-35 pull-right btn btn-sm btn-primary\">\r\n");
      out.write("                                                <i class=\"ace-icon fa fa-key\"></i>\r\n");
      out.write("                                                <span class=\"bigger-110\" >登录</span>\r\n");
      out.write("                                            </button>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"space-4\"></div>\r\n");
      out.write("                                        <div class=\"align-center alert alert-danger alert-dismissible\" role=\"alert\" id=\"errMsgContiner\">\r\n");
      out.write("                                            <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("                                            <div id=\"showErrMsg\"></div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"toolbar clearfix\">\r\n");
      out.write("                                        <div style=\"float: right;\">\r\n");
      out.write("                                            <a href=\"#\"  class=\"forgot-password-link\">\r\n");
      out.write("                                                ");
      out.write("\r\n");
      out.write("                                                ");
      out.write("\r\n");
      out.write("                                                ");
      out.write("\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"center\"><h5 class=\"blue\" id=\"id-company-text\">&copy; SMP版权所有 V_1.2.1</h5></div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"navbar-fixed-top align-right\" style=\"display: none;\">\r\n");
      out.write("                            <br />\r\n");
      out.write("                            &nbsp;\r\n");
      out.write("                            <a id=\"btn-login-dark\" class=\"blue\" href=\"#\" onclick=\"darkStyle()\">Dark</a>\r\n");
      out.write("                            &nbsp;\r\n");
      out.write("                            <span class=\"blue\">/</span>\r\n");
      out.write("                            &nbsp;\r\n");
      out.write("                            <a id=\"btn-login-blur\" class=\"blue\" href=\"#\" onclick=\"blurStyle()\">Blur</a>\r\n");
      out.write("                            &nbsp;\r\n");
      out.write("                            <span class=\"blue\">/</span>\r\n");
      out.write("                            &nbsp;\r\n");
      out.write("                            <a id=\"btn-login-light\" class=\"blue\" href=\"#\" onclick=\"lightStyle()\">Light</a>\r\n");
      out.write("                            &nbsp; &nbsp; &nbsp;\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/jquery/jquery-1.8.3.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/jquery/jquery.cookie.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/mutiLang/en.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/mutiLang/zh-cn.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/login/js/jquery.tipsy.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/login/js/iphone.check.js\"></script>\r\n");
      out.write("<!-- add-begin--Author:gengjiajia  Date:20160727 for:TASK #1217 【IE兼容】jeecg h+首页兼容性问题,不兼容的浏览器直接切换套shortcut风格 -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/login/js/login.js\"></script>\r\n");
      out.write("<!-- add-end--Author:gengjiajia  Date:20160727 for:TASK #1217 【IE兼容】jeecg h+首页兼容性问题,不兼容的浏览器直接切换套shortcut风格 -->\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    $(function(){\r\n");
      out.write("        optErrMsg();\r\n");
      out.write("        blurStyle();\r\n");
      out.write("    });\r\n");
      out.write("    $(\"#errMsgContiner\").hide();\r\n");
      out.write("    function optErrMsg(){\r\n");
      out.write("        $(\"#showErrMsg\").html('');\r\n");
      out.write("        $(\"#errMsgContiner\").hide();\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    //输入验证码，回车登录\r\n");
      out.write("    $(document).keydown(function(e){\r\n");
      out.write("        if(e.keyCode == 13) {\r\n");
      out.write("\r\n");
      out.write("            setTimeout(\"$('#but_login').click()\",\"100\");\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    //验证用户信息\r\n");
      out.write("    function checkUser(){\r\n");
      out.write("        if(!validForm()){\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("        newLogin();\r\n");
      out.write("    }\r\n");
      out.write("    //表单验证\r\n");
      out.write("    function validForm(){\r\n");
      out.write("        if($.trim($(\"#userName\").val()).length==0){\r\n");
      out.write("            showErrorMsg(\"请输入用户名\");\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        if($.trim($(\"#password\").val()).length==0){\r\n");
      out.write("            showErrorMsg(\"请输入密码\");\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        if($.trim($(\"#randCode\").val()).length==0){\r\n");
      out.write("            showErrorMsg(\"请输入验证码\");\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("        return true;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    //登录处理函数\r\n");
      out.write("    function newLogin(orgId) {\r\n");
      out.write("        setCookie();\r\n");
      out.write("\r\n");
      out.write("        var actionurl=\"loginController.do?login\";//提交路径\r\n");
      out.write("        var checkurl=\"loginController.do?checkuser\";//验证路径\r\n");
      out.write("\r\n");
      out.write("        var formData = new Object();\r\n");
      out.write("        var data=$(\":input\").each(function() {\r\n");
      out.write("            formData[this.name] =$(\"#\"+this.name ).val();\r\n");
      out.write("        });\r\n");
      out.write("        formData['orgId'] = orgId ? orgId : \"\";\r\n");
      out.write("        //语言\r\n");
      out.write("        formData['langCode']=$(\"#langCode\").val();\r\n");
      out.write("        formData['langCode'] = $(\"#langCode option:selected\").val();\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            async : false,\r\n");
      out.write("            cache : false,\r\n");
      out.write("            type : 'POST',\r\n");
      out.write("            url : checkurl,// 请求的action路径\r\n");
      out.write("            data : formData,\r\n");
      out.write("            error : function() {// 请求失败处理函数\r\n");
      out.write("            },\r\n");
      out.write("            success : function(data) {\r\n");
      out.write("                var d = $.parseJSON(data);\r\n");
      out.write("                if (d.success) {\r\n");
      out.write("                    if (d.attributes.orgNum > 1) {\r\n");
      out.write("                        //用户拥有多个部门，需选择部门进行登录\r\n");
      out.write("                        var title, okButton;\r\n");
      out.write("                        if($(\"#langCode\").val() == 'en') {\r\n");
      out.write("                            title = \"Please select Org\";\r\n");
      out.write("                            okButton = \"Ok\";\r\n");
      out.write("                        } else {\r\n");
      out.write("                            title = \"请选择组织机构\";\r\n");
      out.write("                            okButton = \"确定\";\r\n");
      out.write("                        }\r\n");
      out.write("                        $.dialog({\r\n");
      out.write("                            id: 'LHG1976D',\r\n");
      out.write("                            title: title,\r\n");
      out.write("                            max: false,\r\n");
      out.write("                            min: false,\r\n");
      out.write("                            drag: false,\r\n");
      out.write("                            resize: false,\r\n");
      out.write("                            content: 'url:userController.do?userOrgSelect&userId=' + d.attributes.user.id,\r\n");
      out.write("                            lock:true,\r\n");
      out.write("                            button : [ {\r\n");
      out.write("                                name : okButton,\r\n");
      out.write("                                focus : true,\r\n");
      out.write("                                callback : function() {\r\n");
      out.write("                                    iframe = this.iframe.contentWindow;\r\n");
      out.write("                                    var orgId = $('#orgId', iframe.document).val();\r\n");
      out.write("\r\n");
      out.write("                                    formData['orgId'] = orgId ? orgId : \"\";\r\n");
      out.write("                                    $.ajax({\r\n");
      out.write("                                        async : false,\r\n");
      out.write("                                        cache : false,\r\n");
      out.write("                                        type : 'POST',\r\n");
      out.write("                                        url : 'loginController.do?changeDefaultOrg',// 请求的action路径\r\n");
      out.write("                                        data : formData,\r\n");
      out.write("                                        error : function() {// 请求失败处理函数\r\n");
      out.write("                                        },\r\n");
      out.write("                                        success : function(data) {\r\n");
      out.write("                                            window.location.href = actionurl;\r\n");
      out.write("                                        }\r\n");
      out.write("                                    });\r\n");
      out.write("\r\n");
      out.write("                                    this.close();\r\n");
      out.write("                                    return false;\r\n");
      out.write("                                }\r\n");
      out.write("                            }],\r\n");
      out.write("                            close: function(){\r\n");
      out.write("                                setTimeout(\"window.location.href='\"+actionurl+\"'\", 10);\r\n");
      out.write("                            }\r\n");
      out.write("                        });\r\n");
      out.write("                    } else {\r\n");
      out.write("                        window.location.href = actionurl;\r\n");
      out.write("                    }\r\n");
      out.write("                } else {\r\n");
      out.write("                    showErrorMsg(d.msg);\r\n");
      out.write("\r\n");
      out.write("                    if(d.msg === \"用户名或密码错误\" || d.msg === \"验证码错误\")\r\n");
      out.write("                        reloadRandCodeImage();\r\n");
      out.write("\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("    //登录提示消息显示\r\n");
      out.write("    function showErrorMsg(msg){\r\n");
      out.write("        $(\"#errMsgContiner\").show();\r\n");
      out.write("        $(\"#showErrMsg\").html(msg);\r\n");
      out.write("        window.setTimeout(optErrMsg,3000);\r\n");
      out.write("    }\r\n");
      out.write("    /**\r\n");
      out.write("     * 刷新验证码\r\n");
      out.write("     */\r\n");
      out.write("    $('#randCodeImage').click(function(){\r\n");
      out.write("        reloadRandCodeImage();\r\n");
      out.write("    });\r\n");
      out.write("    function reloadRandCodeImage() {\r\n");
      out.write("        var date = new Date();\r\n");
      out.write("        var img = document.getElementById(\"randCodeImage\");\r\n");
      out.write("        img.src='randCodeImage?a=' + date.getTime();\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function darkStyle(){\r\n");
      out.write("        $('body').attr('class', 'login-layout');\r\n");
      out.write("        $('#id-text2').attr('class', 'red');\r\n");
      out.write("        $('#id-company-text').attr('class', 'blue');\r\n");
      out.write("        e.preventDefault();\r\n");
      out.write("    }\r\n");
      out.write("    function lightStyle(){\r\n");
      out.write("        $('body').attr('class', 'login-layout light-login');\r\n");
      out.write("        $('#id-text2').attr('class', 'grey');\r\n");
      out.write("        $('#id-company-text').attr('class', 'blue');\r\n");
      out.write("\r\n");
      out.write("        e.preventDefault();\r\n");
      out.write("    }\r\n");
      out.write("    function blurStyle(){\r\n");
      out.write("        $('body').attr('class', 'login-layout blur-login');\r\n");
      out.write("        $('#id-text2').attr('class', 'white');\r\n");
      out.write("        $('#id-company-text').attr('class', 'light-blue');\r\n");
      out.write("\r\n");
      out.write("//    e.preventDefault();\r\n");
      out.write("    }\r\n");
      out.write("    //设置cookie\r\n");
      out.write("    function setCookie()\r\n");
      out.write("    {\r\n");
      out.write("\r\n");
      out.write("        if ($('#on_off').attr(\"checked\")) {\r\n");
      out.write("\r\n");
      out.write("            $(\"input[iscookie='true']\").each(function() {\r\n");
      out.write("                $.cookie(this.name, $(\"#\"+this.name).val(), \"/\",24);\r\n");
      out.write("                $.cookie(\"COOKIE_NAME\",\"true\", \"/\",24);\r\n");
      out.write("            });\r\n");
      out.write("        } else {\r\n");
      out.write("            $(\"input[iscookie='true']\").each(function() {\r\n");
      out.write("                $.cookie(this.name,null);\r\n");
      out.write("                $.cookie(\"COOKIE_NAME\",null);\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    //读取cookie\r\n");
      out.write("    function getCookie()\r\n");
      out.write("    {\r\n");
      out.write("        var COOKIE_NAME=$.cookie(\"COOKIE_NAME\");\r\n");
      out.write("        if (COOKIE_NAME !=null) {\r\n");
      out.write("            $(\"input[iscookie='true']\").each(function() {\r\n");
      out.write("                $($(\"#\"+this.name).val( $.cookie(this.name)));\r\n");
      out.write("                if(\"admin\" == $.cookie(this.name)) {\r\n");
      out.write("                    $(\"#randCode\").focus();\r\n");
      out.write("                } else {\r\n");
      out.write("                    $(\"#password\").val(\"\");\r\n");
      out.write("                    $(\"#password\").focus();\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("            $(\"#on_off\").attr(\"checked\", true);\r\n");
      out.write("            $(\"#on_off\").val(\"1\");\r\n");
      out.write("        }\r\n");
      out.write("        else\r\n");
      out.write("        {\r\n");
      out.write("            $(\"#on_off\").attr(\"checked\", false);\r\n");
      out.write("            $(\"#on_off\").val(\"0\");\r\n");
      out.write("            $(\"#randCode\").focus();\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.print(lhgdialogTheme );
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_t_005fmutiLang_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f0 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f0.setParent(null);
    // /webpage/login/login.jsp(14,11) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f0.setLangKey("jeect.platform");
    int _jspx_eval_t_005fmutiLang_005f0 = _jspx_th_t_005fmutiLang_005f0.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f0);
    return false;
  }
}
