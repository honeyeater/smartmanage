package org.apache.jsp.webpage.smp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class frontUserRegister_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/context/mytags.jsp");
    _jspx_dependants.add("/WEB-INF/tld/easyui.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
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

      out.write('\r');
      out.write('\n');
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>用户注册</title>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <!--bootstrape-->\r\n");
      out.write("    <link href=\"plug-in/bootstrap3/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"plug-in/bootstrap3/validate/css/bootstrapValidator.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"plug-in/webfront/css/common.css\" rel=\"stylesheet\">\r\n");
      out.write("    <script src=\"plug-in/ace/assets/js/jquery-2.0.3.min.js\"></script>\r\n");
      out.write("    <script src=\"plug-in/bootstrap3/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"plug-in/bootstrap3/validate/js/bootstrapValidator.js\"></script>\r\n");
      out.write("    <script src=\"plug-in/bootstrap3/validate/js/language/zh_CN.js\"></script>\r\n");
      out.write("    <style>\r\n");
      out.write("        body {\r\n");
      out.write("            background: white;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"header\">\r\n");
      out.write("        <div class=\"navbar navbar-inverse\">\r\n");
      out.write("            <div class=\"container col-lg-4 col-lg-offset-4\">\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\" style=\"color: white\"><strong>欢迎注册金润智能理财系统</strong></a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <form class=\"form-horizontal required-validate form-signin\"\r\n");
      out.write("              onsubmit=\"return validateCallback(this)\">\r\n");
      out.write("            <input id=\"id\" name=\"id\" type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${frontUserRegisterPage.id }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label class=\"col-lg-2 col-lg-offset-2 control-label\" for=\"introducer\">推荐人:</label>\r\n");
      out.write("                <div class=\"col-lg-4\">\r\n");
      out.write("                    <input id=\"introducer\" name=\"introducer\" type=\"text\" class=\"form-control\" ignore=\"ignore\"/>\r\n");
      out.write("                    <span class=\"Validform_checktip\"></span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label class=\"col-lg-2 col-lg-offset-2 control-label\" for=\"userName\">用户名:</label>\r\n");
      out.write("                <div class=\"col-lg-4\">\r\n");
      out.write("                    <input id=\"userName\" name=\"userName\" type=\"text\" class=\"form-control\" ignore=\"ignore\"/>\r\n");
      out.write("                    <span class=\"Validform_checktip\"></span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label class=\"col-lg-2 col-lg-offset-2 control-label\" for=\"phoneno\">手机号:</label>\r\n");
      out.write("                <div class=\"col-lg-4\">\r\n");
      out.write("                    <input id=\"phoneno\" name=\"phoneno\" type=\"text\" class=\"form-control\" ignore=\"ignore\" placeholder=\"手机号\"\r\n");
      out.write("                           data-bv-notempty/>\r\n");
      out.write("                    <span class=\"Validform_checktip\"></span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label class=\"col-lg-2 col-lg-offset-2 control-label\" for=\"identityNo\">身份证号:</label>\r\n");
      out.write("                <div class=\"col-lg-4\">\r\n");
      out.write("                    <input id=\"identityNo\" name=\"identityNo\" type=\"text\"  class=\"form-control\" ignore=\"ignore\" placeholder=\"身份证号\"\r\n");
      out.write("                           required />\r\n");
      out.write("                    <span class=\"Validform_checktip\"></span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label class=\"col-lg-2 col-lg-offset-2 control-label\" for=\"realname\">真实姓名:</label>\r\n");
      out.write("                <div class=\"col-lg-4\">\r\n");
      out.write("                    <input id=\"realname\" name=\"realname\" type=\"text\"  class=\"form-control\" ignore=\"ignore\" placeholder=\"真实姓名\"/>\r\n");
      out.write("                    <span class=\"Validform_checktip\"></span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label class=\"col-lg-2 col-lg-offset-2 control-label\" for=\"province\">银行省份:</label>\r\n");
      out.write("                <div class=\"col-lg-4\">\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                    <select class=\"form-control\" id=\"province\" name=\"province\">\r\n");
      out.write("                        <option>省份</option>\r\n");
      out.write("                        <option>上海市</option>\r\n");
      out.write("                        <option>北京市</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label class=\"col-lg-2 col-lg-offset-2 control-label\" for=\"city\">银行城市:</label>\r\n");
      out.write("                <div class=\"col-lg-4\">\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                    <select class=\"form-control\" id=\"city\" name=\"city\">\r\n");
      out.write("                        <option>城市</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label class=\"col-lg-2 col-lg-offset-2 control-label\" for=\"bankCode\">开户银行:</label>\r\n");
      out.write("                <div class=\"col-lg-4\">\r\n");
      out.write("                    <select id=\"bankCode\" name=\"bankCode\" class=\"form-control\">\r\n");
      out.write("                        <option>银行</option>\r\n");
      out.write("                        <option>人民银行</option>\r\n");
      out.write("                        <option>银行</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label class=\"col-lg-2 col-lg-offset-2 control-label\" for=\"bankCard\">银行卡号:</label>\r\n");
      out.write("                <div class=\"col-lg-4\">\r\n");
      out.write("                    <input id=\"bankCard\" name=\"bankCard\" type=\"text\"  class=\"form-control\" ignore=\"ignore\"/>\r\n");
      out.write("                    <span class=\"Validform_checktip\"></span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label class=\"col-lg-2 col-lg-offset-2 control-label\" for=\"bankAddress\">银行详细地址:</label>\r\n");
      out.write("                <div class=\"col-lg-4\">\r\n");
      out.write("                    <input id=\"bankAddress\" name=\"bankAddress\" type=\"text\"  class=\"form-control\"\r\n");
      out.write("                           ignore=\"ignore\"/>\r\n");
      out.write("                    <span class=\"Validform_checktip\"></span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label class=\"col-lg-2 col-lg-offset-2 control-label\" for=\"password\">登录密码:</label>\r\n");
      out.write("                <div class=\"col-lg-4\">\r\n");
      out.write("                    <input id=\"password\" name=\"password\" type=\"text\"  class=\"form-control\" ignore=\"ignore\"/>\r\n");
      out.write("                    <span class=\"Validform_checktip\"></span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label class=\"col-lg-2 col-lg-offset-2 control-label\" for=\"safePassword\">安全密码:</label>\r\n");
      out.write("                <div class=\"col-lg-4\">\r\n");
      out.write("                    <input id=\"safePassword\" name=\"safePassword\" type=\"text\"  class=\"form-control\"\r\n");
      out.write("                           ignore=\"ignore\"/>\r\n");
      out.write("                    <span class=\"Validform_checktip\"></span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label class=\"col-lg-2 col-lg-offset-2 control-label\" for=\"validCode\">验证码:</label>\r\n");
      out.write("                <div class=\"col-lg-4\">\r\n");
      out.write("                    <input id=\"validCode\" name=\"validCode\" type=\"text\"  class=\"form-control\"\r\n");
      out.write("                           ignore=\"ignore\"/>\r\n");
      out.write("                    <span class=\"Validform_checktip\"></span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label class=\"col-lg-2 col-lg-offset-2 control-label\" for=\"phoneValidCode\">手机验证码:</label>\r\n");
      out.write("                <div class=\"col-lg-4\">\r\n");
      out.write("                    <input id=\"phoneValidCode\" name=\"phoneValidCode\" type=\"text\"  class=\"form-control\" ignore=\"ignore\"/>\r\n");
      out.write("                    <span class=\"Validform_checktip\"></span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <div class=\"col-lg-offset-4 col-lg-4\">\r\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary btn-lg btn-block\">注册</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<script src=\"webpage/smp/user/frontUserRegister.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    $(function() {\r\n");
      out.write("        // validate form\r\n");
      out.write("        $(\"form.required-validate\").each(function() {\r\n");
      out.write("            var $form = $(this);\r\n");
      out.write("            $form.bootstrapValidator();\r\n");
      out.write("            // 修复bootstrap validator重复向服务端提交bug\r\n");
      out.write("            $form.on('success.form.bv', function(e) {\r\n");
      out.write("                // Prevent form submission\r\n");
      out.write("                e.preventDefault();\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    function validateCallback(form, callback, confirmMsg) {\r\n");
      out.write("        var $form = $(form);\r\n");
      out.write("\r\n");
      out.write("        var data = $form.data('bootstrapValidator');\r\n");
      out.write("        alert(data);\r\n");
      out.write("        if (data) {\r\n");
      out.write("            // 修复记忆的组件不验证\r\n");
      out.write("            data.validate();\r\n");
      out.write("            if (!data.isValid()) {\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("\t");
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
}
