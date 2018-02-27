package org.apache.jsp.webpage.webmain;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class hindex_005fmain_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"x-ua-compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\"\r\n");
      out.write("          content=\"width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no\">\r\n");
      out.write("    <meta name=\"renderer\" content=\"webkit\">\r\n");
      out.write("    <title>理财社区</title>\r\n");
      out.write("    <meta name=\"keywords\" content=\"理财\">\r\n");
      out.write("    <meta name=\"description\" content=\"一家专门从事理财的交易网站\">\r\n");
      out.write("    <!--bootstrape-->\r\n");
      out.write("    <link href=\"plug-in/bootstrap3/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"plug-in/webfront/css/common.css\" rel=\"stylesheet\">\r\n");
      out.write("    <script src=\"plug-in/ace/assets/js/jquery-2.0.3.min.js\"></script>\r\n");
      out.write("    <script src=\"plug-in/bootstrap3/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <style>\r\n");
      out.write("        @media (min-width: 768px) {\r\n");
      out.write("            body {\r\n");
      out.write("                padding-top: 82px;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!--页面头部导航-->\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("    <nav class=\"navbar navbar-default navbar-fixed-top\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"navbar-header\">\r\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\"\r\n");
      out.write("                        data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\r\n");
      out.write("                    <span class=\"sr-only\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\" style=\"font-size: 28px;\">理财社区</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                    <li class=\"active\"><a href=\"#\">首页</a></li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" aria-labelledby=\"personmanager\" data-toggle=\"dropdown\"\r\n");
      out.write("                           role=\"button\" aria-expanded=\"true\" aria-haspopup=\"true\">个人管理</a>\r\n");
      out.write("                        <ul class=\"dropdown-menu dropdown-menu-left\">\r\n");
      out.write("                            <li><a href=\"http://www.baidu.com\">个人资料</a></li>\r\n");
      out.write("                            <li><a href=\"http://www.sina.com.cn\">修改密码</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li><a href=\"#\">会员中心</a></li>\r\n");
      out.write("                    <li><a href=\"#\">财务管理</a></li>\r\n");
      out.write("                    <li><a href=\"#\">市场管理</a></li>\r\n");
      out.write("                    <li><a href=\"#\">公告留言</a></li>\r\n");
      out.write("                    <li><a href=\"#\">常见问题</a></li>\r\n");
      out.write("                    <li><a href=\"#\" onclick=\"logout();\">安全退出</a></li>\r\n");
      out.write("                    <li><a href=\"#\">HELLO</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"content\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\" style=\"padding-top: 10px;color: white\">\r\n");
      out.write("            <div class=\"col-lg-4\">\r\n");
      out.write("                <div class=\"col-sm-4 col-xs-4\" style=\"text-align: center\">\r\n");
      out.write("                    <a href=\"https://www.vipzftaab.com/index/provideList/\"><img class=\"img-circle navImg\"\r\n");
      out.write("                                                                                src=\"https://www.vipzftaab.com//t/images/navImg/7.png\"></a>\r\n");
      out.write("                    <h5><strong>注资列表</strong></h5>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-sm-4 col-xs-4\" style=\"text-align: center\">\r\n");
      out.write("                    <a href=\"https://www.vipzftaab.com/index/acceptList/\"><img class=\"img-circle navImg\"\r\n");
      out.write("                                                                               src=\"https://www.vipzftaab.com//t/images/navImg/6.png\"></a>\r\n");
      out.write("                    <h5><strong>提现列表</strong></h5>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-sm-4 col-xs-4\" style=\"text-align: center\">\r\n");
      out.write("                    <a href=\"https://www.vipzftaab.com/index/logList/\"><img class=\"img-circle navImg\"\r\n");
      out.write("                                                                            src=\"https://www.vipzftaab.com//t/images/navImg/2.png\"></a>\r\n");
      out.write("                    <h5><strong>财务明细</strong></h5>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-lg-4\">\r\n");
      out.write("                <div class=\"col-sm-4 col-xs-4\" style=\"text-align: center\">\r\n");
      out.write("                    <a href=\"https://www.vipzftaab.com/index/register/\"><img class=\"img-circle navImg\"\r\n");
      out.write("                                                                             src=\"https://www.vipzftaab.com//t/images/navImg/3.png\"></a>\r\n");
      out.write("                    <h5><strong>注册会员</strong></h5>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-sm-4 col-xs-4\" style=\"text-align: center\">\r\n");
      out.write("                    <a href=\"https://www.vipzftaab.com/index/dList/\"><img class=\"img-circle navImg\"\r\n");
      out.write("                                                                          src=\"https://www.vipzftaab.com//t/images/navImg/4.png\"></a>\r\n");
      out.write("                    <h5><strong>推荐列表</strong></h5>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-sm-4 col-xs-4\" style=\"text-align: center\">\r\n");
      out.write("                    <a href=\"https://www.vipzftaab.com/index/teamList/\"><img class=\"img-circle navImg\"\r\n");
      out.write("                                                                             src=\"https://www.vipzftaab.com//t/images/navImg/9.png\"></a>\r\n");
      out.write("                    <h5><strong>团队业绩</strong></h5>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-lg-4\">\r\n");
      out.write("                <div class=\"col-sm-4 col-xs-4\" style=\"text-align: center\">\r\n");
      out.write("                    <a href=\"https://www.vipzftaab.com/index/codeList/\"><img class=\"img-circle navImg\"\r\n");
      out.write("                                                                             src=\"https://www.vipzftaab.com//t/images/navImg/1.png\"></a>\r\n");
      out.write("                    <h5><strong>激活码管理</strong></h5>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-sm-4 col-xs-4\" style=\"text-align: center\">\r\n");
      out.write("                    <a href=\"https://www.vipzftaab.com/index/sendMsg/\"><img class=\"img-circle navImg\"\r\n");
      out.write("                                                                            src=\"https://www.vipzftaab.com//t/images/navImg/5.png\"></a>\r\n");
      out.write("                    <h5><strong>问题反馈</strong></h5>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-sm-4 col-xs-4\" style=\"text-align: center\">\r\n");
      out.write("                    <a href=\"https://www.vipzftaab.com/index/adList/\"><img class=\"img-circle navImg\"\r\n");
      out.write("                                                                           src=\"https://www.vipzftaab.com//t/images/navImg/8.png\"></a>\r\n");
      out.write("                    <h5><strong>新闻公告</strong></h5>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-sm-4 col-xs-4\" style=\"text-align: center\">\r\n");
      out.write("                    <a href=\"frontUserRegisterController.do?register\"><img class=\"img-circle navImg\"\r\n");
      out.write("                                                                           src=\"https://www.vipzftaab.com//t/images/navImg/8.png\"></a>\r\n");
      out.write("                    <h5><strong>用户注册</strong></h5>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"process\" id=\"panelloadingDiv\"><b>&nbsp;</b></div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <ol class=\"breadcrumb\" id=\"navtitle\">\r\n");
      out.write("                <li>1</li>\r\n");
      out.write("                <li>1</li>\r\n");
      out.write("                <li>1</li>\r\n");
      out.write("            </ol>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"myManu\">\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"copyright\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-sm-12\">\r\n");
      out.write("                <p>Copyright © 2017 Smartpay.com All Rights Reversed.</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script src=\"plug-in-ui/hplus/js/plugins/layer/layer.min.js\"></script>\r\n");
      out.write("<!-- 第三方插件 -->\r\n");
      out.write("<script src=\"plug-in-ui/hplus/js/plugins/pace/pace.min.js\"></script>\r\n");
      out.write("<!-- Sweet alert -->\r\n");
      out.write("<script src=\"plug-in-ui/hplus/js/plugins/sweetalert/sweetalert.min.js\"></script>\r\n");
      out.write("<script src=\"plug-in/jquery-plugs/storage/jquery.storageapi.min.js\"></script>\r\n");
      out.write("<!-- 弹出TAB -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/hplus/hplus-tab.js\"></script>\r\n");
      out.write("<!-- 在线聊天 -->\r\n");
      out.write("<script>\r\n");
      out.write("    function logout(){\r\n");
      out.write("        layer.confirm('您确定要退出登录吗？', {\r\n");
      out.write("            btn: ['确定','取消'], //按钮\r\n");
      out.write("            shade: false //不显示遮罩\r\n");
      out.write("        }, function(){\r\n");
      out.write("            location.href=\"userLoginController.do?logout\";\r\n");
      out.write("        }, function(){\r\n");
      out.write("            return;\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
