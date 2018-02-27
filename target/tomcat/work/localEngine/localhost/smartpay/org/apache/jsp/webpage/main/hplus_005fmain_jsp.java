package org.apache.jsp.webpage.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class hplus_005fmain_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fmenu_0026_005fstyle_005fmenuFun_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fmenu_0026_005fstyle_005fmenuFun_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fmenu_0026_005fstyle_005fmenuFun_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.release();
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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta name=\"renderer\" content=\"webkit\">\r\n");
      out.write("\r\n");
      out.write("    <title>");
      if (_jspx_meth_t_005fmutiLang_005f0(_jspx_page_context))
        return;
      out.write("</title>\r\n");
      out.write("\r\n");
      out.write("    <meta name=\"keywords\" content=\"金润智能理财平台\">\r\n");
      out.write("    <meta name=\"description\" content=\"金润智能理财平台\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"images/favicon.ico\">\r\n");
      out.write("    <link href=\"plug-in-ui/hplus/css/bootstrap.min.css?v=3.3.6\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"plug-in-ui/hplus/css/font-awesome.min.css?v=4.4.0\" rel=\"stylesheet\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"plug-in/ace/assets/css/font-awesome.min.css\" />\r\n");
      out.write("    <!--[if IE 7]>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"plug-in/ace/assets/css/font-awesome-ie7.min.css\" />\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("    <!-- Sweet Alert -->\r\n");
      out.write("    <link href=\"plug-in-ui/hplus/css/plugins/sweetalert/sweetalert.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"plug-in-ui/hplus/css/animate.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"plug-in-ui/hplus/css/style.css?v=4.1.0\" rel=\"stylesheet\">\r\n");
      out.write("    <!--右键菜单-->\r\n");
      out.write("    <link href=\"plug-in/hplus/smartMenu.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"fixed-sidebar full-height-layout gray-bg\" style=\"overflow:hidden\">\r\n");
      out.write("<div id=\"wrapper\">\r\n");
      out.write("    <!--左侧导航开始-->\r\n");
      out.write("    <nav class=\"navbar-default navbar-static-side\" role=\"navigation\" style=\"z-index: 1991;\">\r\n");
      out.write("        <div class=\"nav-close\"><i class=\"fa fa-times-circle\"></i>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"sidebar-collapse\">\r\n");
      out.write("            <ul class=\"nav\" id=\"side-menu\">\r\n");
      out.write("                <li class=\"nav-header\">\r\n");
      out.write("                    <div class=\"dropdown profile-element\">\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                                <span><img alt=\"image\" width=\"180\" height=\"61\" src=\"plug-in/login/images/trade3-icon.png\" /></span>\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"logo-element\">SMP\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                ");
      if (_jspx_meth_t_005fmenu_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <!--左侧导航结束-->\r\n");
      out.write("    <!--右侧部分开始-->\r\n");
      out.write("    <div id=\"page-wrapper\" class=\"gray-bg dashbard-1\">\r\n");
      out.write("        <div class=\"row border-bottom\">\r\n");
      out.write("            <nav class=\"navbar navbar-static-top\" role=\"navigation\" style=\"margin-bottom: 0\">\r\n");
      out.write("                <div class=\"navbar-header\" style=\"height: 60px;\"><a class=\"navbar-minimalize minimalize-styl-2 btn btn-primary \" href=\"#\"><i class=\"fa fa-bars\"></i> </a>\r\n");
      out.write("                    <form role=\"search\" class=\"navbar-form-custom\" method=\"post\" action=\"search_results.html\">\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <input type=\"text\" placeholder=\"欢迎使用SMP交易平台\" class=\"form-control\" name=\"top-search\" id=\"top-search\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                <ul class=\"nav navbar-top-links navbar-right\">\r\n");
      out.write("                <!-- update-start--Author: chenj Date:20160812 for: TASK #1269 【ace h+】风格无用的右上角功能隐藏，暂时注释掉 -->\r\n");
      out.write("                   ");
      out.write("\r\n");
      out.write("                    <!-- update-end--Author: chenj Date:20160812 for: TASK #1269 【ace h+】风格无用的右上角功能隐藏，暂时注释掉 -->\r\n");
      out.write("                    \r\n");
      out.write("                    <!-- //update-start--Author: chenj Date:20160726 for: TASK #1207 [改造]h+风格下，去掉logo下面的内容，迁移位置到右上角，主题位置 -->\r\n");
      out.write("                    \r\n");
      out.write("                    <li class=\"dropdown\" onfocus=\"bindFrameClick()\">\r\n");
      out.write("                    \t<a class=\"dropdown-toggle count-info\" data-toggle=\"dropdown\" href=\"#\">\r\n");
      out.write("                                <span ><strong class=\"font-bold\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userName }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</strong></span>\r\n");
      out.write("                                <span >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${roleName }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("<b class=\"caret\"></b></span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <ul class=\"dropdown-menu dropdown-alerts\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"javascript:add('");
      if (_jspx_meth_t_005fmutiLang_005f1(_jspx_page_context))
        return;
      out.write("','userController.do?changepassword','',550,200)\">\r\n");
      out.write("                                    ");
      if (_jspx_meth_t_005fmutiLang_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li><a href=\"javascript:openwindow('");
      if (_jspx_meth_t_005fmutiLang_005f3(_jspx_page_context))
        return;
      out.write("','userController.do?userinfo')\">");
      if (_jspx_meth_t_005fmutiLang_005f4(_jspx_page_context))
        return;
      out.write("</a></li>\r\n");
      out.write("                            <li><a href=\"javascript:openwindow('");
      if (_jspx_meth_t_005fmutiLang_005f5(_jspx_page_context))
        return;
      out.write("','tSSmsController.do?getSysInfos')\">");
      if (_jspx_meth_t_005fmutiLang_005f6(_jspx_page_context))
        return;
      out.write("</a></li>\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                            <li><a href=\"javascript:clearLocalstorage()\">");
      if (_jspx_meth_t_005fmutiLang_005f7(_jspx_page_context))
        return;
      out.write("</a></li>\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                            <!-- update-start--Author: chenj Date:20160812 for: TASK #1269 【ace h+】风格无用的右上角功能隐藏，暂时注释掉 -->\r\n");
      out.write("                            <!-- <li><a href=\"http://yun.jeecg.org\" target=\"_blank\">云应用中心</li> -->\r\n");
      out.write("                           <!--  <li class=\"divider\"></li>\r\n");
      out.write("                            <li><a href=\"javascript:logout()\">注销</a></li> -->\r\n");
      out.write("                            <!-- update-end--Author: chenj Date:20160812 for: TASK #1269 【ace h+】风格无用的右上角功能隐藏，暂时注释掉 -->\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <!-- //update-end--Author: chenj Date:20160726 for: TASK #1207 [改造]h+风格下，去掉logo下面的内容，迁移位置到右上角，主题位置 -->\r\n");
      out.write("                    \r\n");
      out.write("                     \r\n");
      out.write("                    <li class=\"dropdown hidden-xs\">\r\n");
      out.write("                        <a class=\"right-sidebar-toggle\" aria-expanded=\"false\">\r\n");
      out.write("                            <i class=\"fa fa-tasks\"></i> 主题\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                   <!-- //update-begin--Author: chenj Date:20160729 for: TASK #1207 [改造]h+风格下，修改 退出 按钮的位置 -->\r\n");
      out.write("                      <li class=\"dropdown\">\r\n");
      out.write("                     <a href=\"javascript:logout()\" class=\"roll-nav roll-right J_tabExit\"><i class=\"fa fa fa-sign-out\"></i> 退出</a>\r\n");
      out.write("                     </li>\r\n");
      out.write("                     <!-- //update-end--Author: chenj Date:20160729 for: TASK #1207 [改造]h+风格下，修改 退出 按钮的位置 -->\r\n");
      out.write("                </ul>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row content-tabs\">\r\n");
      out.write("            <button class=\"roll-nav roll-left J_tabLeft\"><i class=\"fa fa-backward\"></i>\r\n");
      out.write("            </button>\r\n");
      out.write("            <nav class=\"page-tabs J_menuTabs\">\r\n");
      out.write("                <div class=\"page-tabs-content\">\r\n");
      out.write("                    <a href=\"javascript:;\" class=\"active J_menuTab\" data-id=\"loginController.do?hplushome\">首页</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("            <button class=\"roll-nav roll-right J_tabRight\"><i class=\"fa fa-forward\"></i>\r\n");
      out.write("            </button>\r\n");
      out.write("            <div class=\"btn-group roll-nav roll-right\">\r\n");
      out.write("                <button class=\"dropdown J_tabClose\" data-toggle=\"dropdown\">关闭操作<span class=\"caret\"></span>\r\n");
      out.write("\r\n");
      out.write("                </button>\r\n");
      out.write("                <ul role=\"menu\" class=\"dropdown-menu dropdown-menu-right\">\r\n");
      out.write("                    <li class=\"J_tabShowActive\"><a>定位当前选项卡</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"divider\"></li>\r\n");
      out.write("                    <li class=\"J_tabCloseAll\"><a>关闭全部选项卡</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"J_tabCloseOther\"><a>关闭其他选项卡</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!--\r\n");
      out.write("            <a href=\"javascript:logout()\" class=\"roll-nav roll-right J_tabExit\"><i class=\"fa fa fa-sign-out\"></i> 退出</a>\r\n");
      out.write("             -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- update-begin--Author:zhoujf  Date:20170710 for：TASK #2003 【UI改进】列表加载慢的时候会出现白板  -->\r\n");
      out.write("        <style type=\"text/css\">  \r\n");
      out.write("\t\t<!--  \r\n");
      out.write("\t\t.proccess{display:none;background-color:#f2f2f2;border:0px solid;border-color:#009900;height:100%;line-height:600px;width:100%;text-align:center;margin:100px;position:absolute;top:0;left:0;}\r\n");
      out.write("\t\t.proccess b{vertical-align:middle;background:url(plug-in/layer/skin/default/loading-0.gif) no-repeat 0 center;padding-left:55px;display:inline-block;}  \r\n");
      out.write("\t\t-->  \r\n");
      out.write("\t\t</style> \r\n");
      out.write("        <div class=\"row J_mainContent\" id=\"content-main\" style=\"margin-left:-13px;\">\r\n");
      out.write("            <div class=\"proccess\" id=\"panelloadingDiv\"><b>&nbsp;</b></div> \r\n");
      out.write("            <iframe class=\"J_iframe\" name=\"iframe0\" width=\"100%\" height=\"100%\" src=\"loginController.do?hplushome\" frameborder=\"0\" data-id=\"loginController.do?hplushome\" seamless></iframe>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- update-end--Author:zhoujf  Date:20170710 for：TASK #2003 【UI改进】列表加载慢的时候会出现白板  -->\r\n");
      out.write("        <!-- update-begin--Author:xuelin  Date:20170611 for：TASK #2100 【列表样式美化】【样式专题】Jeecg平台任务 --1下面这条线，变明朗点--------------------  -->\r\n");
      out.write("        <div class=\"footer\" style=\"border-top:none;\">\r\n");
      out.write("            <div class=\"pull-right\">&copy; ");
      if (_jspx_meth_t_005fmutiLang_005f8(_jspx_page_context))
        return;
      out.write(" <a href=\"http://www.goldspay.org/\" target=\"_blank\">smartpay</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>        \r\n");
      out.write("\t\t<!-- update-end--Author:xuelin  Date:20170611 for：TASK #2100 【列表样式美化】【样式专题】Jeecg平台任务 --1下面这条线，变明朗点----------------------  -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--右侧部分结束-->\r\n");
      out.write("    <!--右侧边栏开始-->\r\n");
      out.write("    <div id=\"right-sidebar\">\r\n");
      out.write("        <div class=\"sidebar-container\">\r\n");
      out.write("\r\n");
      out.write("            <ul class=\"nav nav-tabs navs-3\">\r\n");
      out.write("\r\n");
      out.write("                <li class=\"active\">\r\n");
      out.write("                    <a data-toggle=\"tab\" href=\"#tab-1\">\r\n");
      out.write("                        <i class=\"fa fa-gear\"></i> 主题\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("               <li class=\"\"><a data-toggle=\"tab\" href=\"#tab-2\">\r\n");
      out.write("                   <i class=\"fa fa-comments-o\" aria-hidden=\"true\"></i>通知\r\n");
      out.write("                </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li><a data-toggle=\"tab\" href=\"#tab-3\">\r\n");
      out.write("                    <i class=\"fa fa-info-circle\" aria-hidden=\"true\"></i>公告\r\n");
      out.write("                </a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"tab-content\">\r\n");
      out.write("                <div id=\"tab-1\" class=\"tab-pane active\">\r\n");
      out.write("                    <div class=\"sidebar-title\">\r\n");
      out.write("                        <h3> <i class=\"fa fa-comments-o\"></i> 主题设置</h3>\r\n");
      out.write("                        <small><i class=\"fa fa-tim\"></i> 你可以从这里选择和预览主题的布局和样式，这些设置会被保存在本地，下次打开的时候会直接应用这些设置。</small>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"skin-setttings\">\r\n");
      out.write("                        <div class=\"title\">主题设置</div>\r\n");
      out.write("                        <div class=\"setings-item\">\r\n");
      out.write("                            <span>收起左侧菜单</span>\r\n");
      out.write("                            <div class=\"switch\">\r\n");
      out.write("                                <div class=\"onoffswitch\">\r\n");
      out.write("                                    <input type=\"checkbox\" name=\"collapsemenu\" class=\"onoffswitch-checkbox\" id=\"collapsemenu\">\r\n");
      out.write("                                    <label class=\"onoffswitch-label\" for=\"collapsemenu\">\r\n");
      out.write("                                        <span class=\"onoffswitch-inner\"></span>\r\n");
      out.write("                                        <span class=\"onoffswitch-switch\"></span>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"setings-item\">\r\n");
      out.write("                            <span>固定顶部</span>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"switch\">\r\n");
      out.write("                                <div class=\"onoffswitch\">\r\n");
      out.write("                                    <input type=\"checkbox\" name=\"fixednavbar\" class=\"onoffswitch-checkbox\" id=\"fixednavbar\">\r\n");
      out.write("                                    <label class=\"onoffswitch-label\" for=\"fixednavbar\">\r\n");
      out.write("                                        <span class=\"onoffswitch-inner\"></span>\r\n");
      out.write("                                        <span class=\"onoffswitch-switch\"></span>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"setings-item\">\r\n");
      out.write("                                <span>\r\n");
      out.write("                        固定宽度\r\n");
      out.write("                    </span>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"switch\">\r\n");
      out.write("                                <div class=\"onoffswitch\">\r\n");
      out.write("                                    <input type=\"checkbox\" name=\"boxedlayout\" class=\"onoffswitch-checkbox\" id=\"boxedlayout\">\r\n");
      out.write("                                    <label class=\"onoffswitch-label\" for=\"boxedlayout\">\r\n");
      out.write("                                        <span class=\"onoffswitch-inner\"></span>\r\n");
      out.write("                                        <span class=\"onoffswitch-switch\"></span>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"title\">皮肤选择</div>\r\n");
      out.write("                        <div class=\"setings-item default-skin nb\">\r\n");
      out.write("                                <span class=\"skin-name \">\r\n");
      out.write("                         <a href=\"#\" class=\"s-skin-0\">\r\n");
      out.write("                             默认皮肤\r\n");
      out.write("                         </a>\r\n");
      out.write("                    </span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"setings-item blue-skin nb\">\r\n");
      out.write("                                <span class=\"skin-name \">\r\n");
      out.write("                        <a href=\"#\" class=\"s-skin-1\">\r\n");
      out.write("                            蓝色主题\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"setings-item yellow-skin nb\">\r\n");
      out.write("                                <span class=\"skin-name \">\r\n");
      out.write("                        <a href=\"#\" class=\"s-skin-3\">\r\n");
      out.write("                            黄色/紫色主题\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"tab-2\" class=\"tab-pane\">\r\n");
      out.write("                    <div class=\"sidebar-title\">\r\n");
      out.write("                        <h3> <i class=\"fa fa-comments-o\"></i> 最新通知<small id=\"messageCount\"><i class=\"fa fa-tim\"></i> 您当前有0条未读通知</small></h3>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <ul class=\"sidebar-list\">\r\n");
      out.write("                        <li id=\"messageContent\">\r\n");
      out.write("\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"javascript:goAllMessage();\" id=\"messageFooter\">\r\n");
      out.write("                                查看全部\r\n");
      out.write("                                <i class=\"icon-arrow-right\"></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"tab-3\" class=\"tab-pane\">\r\n");
      out.write("                    <div class=\"sidebar-title\">\r\n");
      out.write("                        <h3> <i class=\"fa fa-cube\"></i> 最新公告<small id=\"noticeCount\"><i class=\"fa fa-tim\"></i> 您当前有0个公告</small></h3>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <ul class=\"sidebar-list\">\r\n");
      out.write("                        <li id=\"noticeContent\">\r\n");
      out.write("\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"javascript:goAllNotice();\" id=\"noticeFooter\">\r\n");
      out.write("                                查看所有公告\r\n");
      out.write("                                <i class=\"icon-arrow-right\"></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--右侧边栏结束-->\r\n");
      out.write("    <!--mini聊天窗口开始-->\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <!--mini聊天窗口结束-->\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- 全局js -->\r\n");
      out.write("<script src=\"plug-in-ui/hplus/js/jquery.min.js?v=2.1.4\"></script>\r\n");
      out.write("<script src=\"plug-in-ui/hplus/js/bootstrap.min.js?v=3.3.6\"></script>\r\n");
      out.write("<script src=\"plug-in-ui/hplus/js/plugins/metisMenu/jquery.metisMenu.js\"></script>\r\n");
      out.write("<script src=\"plug-in-ui/hplus/js/plugins/slimscroll/jquery.slimscroll.min.js\"></script>\r\n");
      out.write("<script src=\"plug-in-ui/hplus/js/plugins/layer/layer.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- 自定义js -->\r\n");
      out.write("<script src=\"plug-in-ui/hplus/js/hplus.js?v=4.1.0\"></script>\r\n");
      out.write("<!--右键菜单-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/hplus/jquery-smartMenu.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/hplus/contabs.js\"></script>\r\n");
      if (_jspx_meth_t_005fbase_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!-- 第三方插件 -->\r\n");
      out.write("<script src=\"plug-in-ui/hplus/js/plugins/pace/pace.min.js\"></script>\r\n");
      out.write("<!-- Sweet alert -->\r\n");
      out.write("<script src=\"plug-in-ui/hplus/js/plugins/sweetalert/sweetalert.min.js\"></script>\r\n");
      out.write("<script src=\"plug-in/jquery-plugs/storage/jquery.storageapi.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- 弹出TAB -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/hplus/hplus-tab.js\"></script>\r\n");
      out.write("<!-- 在线聊天 -->\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"content/chat/layui/css/layui.css\">\r\n");
      out.write("<script>\r\n");
      out.write("    function logout(){\r\n");
      out.write("        /*bootbox.confirm(\"<\", function(result) {\r\n");
      out.write("            if(result)\r\n");
      out.write("                location.href=\"loginController.do?logout\";\r\n");
      out.write("        });*/\r\n");
      out.write("        /*swal({\r\n");
      out.write("            title: \"您确定要注销吗？\",\r\n");
      out.write("            text: \"注销后需要重新登录！\",\r\n");
      out.write("            type: \"warning\",\r\n");
      out.write("            showCancelButton: true,\r\n");
      out.write("            confirmButtonColor: \"#DD6B55\",\r\n");
      out.write("            confirmButtonText: \"确定\",\r\n");
      out.write("            cancelButtonText: \"取消\",\r\n");
      out.write("            closeOnConfirm: false,\r\n");
      out.write("            closeOnCancel: true\r\n");
      out.write("        },\r\n");
      out.write("        function (isConfirm) {\r\n");
      out.write("            if (isConfirm) {\r\n");
      out.write("                //swal(\"注销成功！\", \"您已经成功注销。\", \"success\");\r\n");
      out.write("                location.href=\"loginController.do?logout\";\r\n");
      out.write("            } else {\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("        });*/\r\n");
      out.write("        layer.confirm('您确定要注销吗？', {\r\n");
      out.write("            btn: ['确定','取消'], //按钮\r\n");
      out.write("            shade: false //不显示遮罩\r\n");
      out.write("        }, function(){\r\n");
      out.write("            location.href=\"loginController.do?logout\";\r\n");
      out.write("        }, function(){\r\n");
      out.write("            return;\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("    function clearLocalstorage(){\r\n");
      out.write("        var storage=$.localStorage;\r\n");
      out.write("        if(!storage)\r\n");
      out.write("            storage=$.cookieStorage;\r\n");
      out.write("        storage.removeAll();\r\n");
      out.write("        //bootbox.alert( \"浏览器缓存清除成功!\");\r\n");
      out.write("        layer.msg(\"浏览器缓存清除成功!\");\r\n");
      out.write("    }\r\n");
      out.write("    function toJeecgYun(){\r\n");
      out.write("    \twindow.open(\"http://yun.jeecg.org\",\"_blank\");\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    $(document).ready(function(){\r\n");
      out.write("        //加载公告\r\n");
      out.write("        var url = \"noticeController.do?getNoticeList\";\r\n");
      out.write("        jQuery.ajax({\r\n");
      out.write("            url:url,\r\n");
      out.write("            type:\"GET\",\r\n");
      out.write("            dataType:\"JSON\",\r\n");
      out.write("            async: false,\r\n");
      out.write("            success:function(data){\r\n");
      out.write("                if(data.success){\r\n");
      out.write("                    var noticeList = data.attributes.noticeList;\r\n");
      out.write("                    var noticeCount = data.obj;\r\n");
      out.write("                    //加载公告条数\r\n");
      out.write("                    if(noticeCount>99){\r\n");
      out.write("                        $(\"#noticeCount\").html(\"99+\");\r\n");
      out.write("                    }else{\r\n");
      out.write("                        $(\"#noticeCount\").html(noticeCount);\r\n");
      out.write("                    }\r\n");
      out.write("                    //加载公告提示\r\n");
      out.write("                    var noticeTip = \"\";\r\n");
      out.write("                    noticeTip += \"<i class='icon-warning-sign'></i>\";\r\n");
      out.write("                    noticeTip += noticeCount+\" \"+data.attributes.tip;\r\n");
      out.write("                    $(\"#noticeTip\").html(noticeTip);\r\n");
      out.write("\r\n");
      out.write("                    //加载公告条目\r\n");
      out.write("                    var noticeContent = \"\";\r\n");
      out.write("                    if(noticeList.length > 0){\r\n");
      out.write("                        for(var i=0;i<noticeList.length;i++){\r\n");
      out.write("                            noticeContent +=\"<li><a href='javascript:goNotice(&quot;\"+noticeList[i].id+\"&quot;)' \";\r\n");
      out.write("                            noticeContent +=\"style='word-break:keep-all;white-space:nowrap;overflow:hidden;text-overflow:ellipsis;'>\";\r\n");
      out.write("                            noticeContent +=\"<i class='btn btn-xs btn-primary fa fa-user'></i>\";\r\n");
      out.write("                            noticeContent +=\"&nbsp;\"+noticeList[i].noticeTitle + \"</a></li></ul></li>\";\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                    //alert(noticeContent);\r\n");
      out.write("                    $(\"#noticeContent\").html(noticeContent);\r\n");
      out.write("\r\n");
      out.write("                    //加载公告底部文字\r\n");
      out.write("                    var noticeSeeAll = data.attributes.seeAll +\"<i class='ace-icon fa fa-arrow-right'></i>\";\r\n");
      out.write("                    $(\"#noticeFooter\").html(noticeSeeAll);\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        //加载消息\r\n");
      out.write("        var url = \"tSSmsController.do?getMessageList\";\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            url:url,\r\n");
      out.write("            type:\"GET\",\r\n");
      out.write("            dataType:\"JSON\",\r\n");
      out.write("            async: false,\r\n");
      out.write("            success:function(data){\r\n");
      out.write("                if(data.success){\r\n");
      out.write("                    var messageList = data.attributes.messageList;\r\n");
      out.write("                    var messageCount = data.obj;\r\n");
      out.write("                    //加载消息条数\r\n");
      out.write("                    if(messageCount>99){\r\n");
      out.write("                        $(\"#messageCount\").html(\"99+\");\r\n");
      out.write("                    }else{\r\n");
      out.write("                        $(\"#messageCount\").html(messageCount);\r\n");
      out.write("                    }\r\n");
      out.write("                    //加载消息tip提示\r\n");
      out.write("                    var messageTip = \"\";\r\n");
      out.write("                    messageTip += \"<i class='ace-icon fa fa-envelope-o'></i>\";\r\n");
      out.write("                    messageTip += messageCount+\" \"+data.attributes.tip;\r\n");
      out.write("                    $(\"#messageTip\").html(messageTip);\r\n");
      out.write("\r\n");
      out.write("                    //加载消息条目（有限）\r\n");
      out.write("                    var messageContent = \"\";\r\n");
      out.write("                    if(messageList.length > 0){\r\n");
      out.write("                        for(var i=0;i<messageList.length;i++){\r\n");
      out.write("                            messageContent +=\"<li><a href='javascript:goMessage(&quot;\"+messageList[i].id+\"&quot;)' class='clearfix'>\";\r\n");
      out.write("                            messageContent +=\"<img src='plug-in/ace/avatars/avatar3.png' class='msg-photo' alt='Alex’s Avatar' />\";\r\n");
      out.write("                            messageContent +=\"<span class='msg-body'><span class='msg-title'>\";\r\n");
      out.write("                            messageContent +=\"<span class='blue'>\"+messageList[i].esSender+\":</span>\";\r\n");
      out.write("                            messageContent += messageList[i].esTitle + \"</span>\";\r\n");
      out.write("                            messageContent +=\"<span class='msg-time'><i class='ace-icon fa fa-clock-o'></i><span>\"+messageList[i].esSendtimeTxt+\"</span></span>\";\r\n");
      out.write("                            messageContent +=\"</span></a><input id='\"+messageList[i].id+\"_title' type='hidden' value='\"+messageList[i].esTitle+\"'>\";\r\n");
      out.write("                            messageContent +=\"<input id='\"+messageList[i].id+\"_status' type='hidden' value='\"+messageList[i].esStatus+\"'>\";\r\n");
      out.write("                            messageContent +=\"<input id='\"+messageList[i].id+\"_content' type='hidden' value='\"+messageList[i].esContent+\"'></li>\";\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                    $(\"#messageContent\").html(messageContent);\r\n");
      out.write("\r\n");
      out.write("                    //加载消息底部文字\r\n");
      out.write("                    var messageSeeAll = data.attributes.seeAll +\"<i class='ace-icon fa fa-arrow-right'></i>\";\r\n");
      out.write("                    $(\"#messageFooter\").html(messageSeeAll);\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    function goAllNotice(){\r\n");
      out.write("        var addurl = \"noticeController.do?noticeList\";\r\n");
      out.write("        createdetailwindow(\"公告\", addurl, 800, 400);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function goNotice(id){\r\n");
      out.write("        var addurl = \"noticeController.do?goNotice&id=\"+id;\r\n");
      out.write("        createdetailwindow(\"通知公告详情\", addurl, 750, 600);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function goAllMessage(){\r\n");
      out.write("        var addurl = \"tSSmsController.do?getSysInfos\";\r\n");
      out.write("        createdetailwindow(\"通知\", addurl, 800, 400);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function goMessage(id){\r\n");
      out.write("        var title = $(\"#\"+id+\"_title\").val();\r\n");
      out.write("        var content = $(\"#\"+id+\"_content\").val();\r\n");
      out.write("        $(\"#msgId\").val(id);\r\n");
      out.write("        $(\"#msgTitle\").html(title);\r\n");
      out.write("        $(\"#msgContent\").html(content);\r\n");
      out.write("        var status = $(\"#\"+id+\"_status\").val();\r\n");
      out.write("        if(status==1){\r\n");
      out.write("            $(\"#msgStatus\").html(\"未读\");\r\n");
      out.write("        }else{\r\n");
      out.write("            $(\"#msgStatus\").html(\"已读\");\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        $('.theme-popover-mask').fadeIn(100);\r\n");
      out.write("        $('.theme-popover').slideDown(200);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function readMessage(){\r\n");
      out.write("        var msgId = $(\"#msgId\").val();\r\n");
      out.write("        var url = \"tSSmsController.do?readMessage\";\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            url:url,\r\n");
      out.write("            type:\"GET\",\r\n");
      out.write("            dataType:\"JSON\",\r\n");
      out.write("            data:{\r\n");
      out.write("                messageId:msgId\r\n");
      out.write("            },\r\n");
      out.write("            success:function(data){\r\n");
      out.write("                if(data.success){\r\n");
      out.write("                    $(\"#msgStatus\").html(\"已读\");\r\n");
      out.write("                    $(\"#\"+msgId+\"_status\").val('2');\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    //个人信息弹出层回缩\r\n");
      out.write("    function frameBodyClick(){ \r\n");
      out.write("\t\t$(\".count-info\").attr(\"aria-expanded\",\"false\").parent().removeClass(\"open\");\r\n");
      out.write("\t}\r\n");
      out.write("    //新增iframe中绑定click事件回调父级函数\r\n");
      out.write("    function bindFrameClick(){\r\n");
      out.write("    \t$(\".J_iframe\").contents().find(\"body\").attr(\"onclick\", \"parent.frameBodyClick()\"); \r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
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

  private boolean _jspx_meth_t_005fmutiLang_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f0 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f0.setParent(null);
    // /webpage/main/hplus_main.jsp(17,11) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f0.setLangKey("jeect.platform");
    int _jspx_eval_t_005fmutiLang_005f0 = _jspx_th_t_005fmutiLang_005f0.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f0);
    return false;
  }

  private boolean _jspx_meth_t_005fmenu_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:menu
    org.jeecgframework.tag.core.easyui.MenuTag _jspx_th_t_005fmenu_005f0 = (org.jeecgframework.tag.core.easyui.MenuTag) _005fjspx_005ftagPool_005ft_005fmenu_0026_005fstyle_005fmenuFun_005fnobody.get(org.jeecgframework.tag.core.easyui.MenuTag.class);
    _jspx_th_t_005fmenu_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmenu_005f0.setParent(null);
    // /webpage/main/hplus_main.jsp(77,16) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmenu_005f0.setStyle("hplus");
    // /webpage/main/hplus_main.jsp(77,16) name = menuFun type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmenu_005f0.setMenuFun((java.util.Map) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${menuMap}", java.util.Map.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_t_005fmenu_005f0 = _jspx_th_t_005fmenu_005f0.doStartTag();
    if (_jspx_th_t_005fmenu_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmenu_0026_005fstyle_005fmenuFun_005fnobody.reuse(_jspx_th_t_005fmenu_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmenu_0026_005fstyle_005fmenuFun_005fnobody.reuse(_jspx_th_t_005fmenu_005f0);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f1 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f1.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f1.setParent(null);
    // /webpage/main/hplus_main.jsp(156,57) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f1.setLangKey("common.change.password");
    int _jspx_eval_t_005fmutiLang_005f1 = _jspx_th_t_005fmutiLang_005f1.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f1);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f2 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f2.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f2.setParent(null);
    // /webpage/main/hplus_main.jsp(157,36) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f2.setLangKey("common.change.password");
    int _jspx_eval_t_005fmutiLang_005f2 = _jspx_th_t_005fmutiLang_005f2.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f2);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f3 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f3.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f3.setParent(null);
    // /webpage/main/hplus_main.jsp(160,64) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f3.setLangKey("common.profile");
    int _jspx_eval_t_005fmutiLang_005f3 = _jspx_th_t_005fmutiLang_005f3.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f3);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f4 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f4.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f4.setParent(null);
    // /webpage/main/hplus_main.jsp(160,135) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f4.setLangKey("common.profile");
    int _jspx_eval_t_005fmutiLang_005f4 = _jspx_th_t_005fmutiLang_005f4.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f4);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f5 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f5.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f5.setParent(null);
    // /webpage/main/hplus_main.jsp(161,64) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f5.setLangKey("common.ssms.getSysInfos");
    int _jspx_eval_t_005fmutiLang_005f5 = _jspx_th_t_005fmutiLang_005f5.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f5);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f6 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f6.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f6.setParent(null);
    // /webpage/main/hplus_main.jsp(161,148) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f6.setLangKey("common.ssms.getSysInfos");
    int _jspx_eval_t_005fmutiLang_005f6 = _jspx_th_t_005fmutiLang_005f6.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f6);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f7 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f7.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f7.setParent(null);
    // /webpage/main/hplus_main.jsp(165,73) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f7.setLangKey("common.clear.localstorage");
    int _jspx_eval_t_005fmutiLang_005f7 = _jspx_th_t_005fmutiLang_005f7.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f7);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f8 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f8.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f8.setParent(null);
    // /webpage/main/hplus_main.jsp(233,43) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f8.setLangKey("system.version.number");
    int _jspx_eval_t_005fmutiLang_005f8 = _jspx_th_t_005fmutiLang_005f8.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f8);
    return false;
  }

  private boolean _jspx_meth_t_005fbase_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:base
    org.jeecgframework.tag.core.easyui.BaseTag _jspx_th_t_005fbase_005f0 = (org.jeecgframework.tag.core.easyui.BaseTag) _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.get(org.jeecgframework.tag.core.easyui.BaseTag.class);
    _jspx_th_t_005fbase_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fbase_005f0.setParent(null);
    // /webpage/main/hplus_main.jsp(478,0) name = type type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fbase_005f0.setType("tools");
    int _jspx_eval_t_005fbase_005f0 = _jspx_th_t_005fbase_005f0.doStartTag();
    if (_jspx_th_t_005fbase_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.reuse(_jspx_th_t_005fbase_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.reuse(_jspx_th_t_005fbase_005f0);
    return false;
  }
}
