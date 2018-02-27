package org.apache.jsp.webpage.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class hplushome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\r\n");
      out.write("    <!--360浏览器优先以webkit内核解析-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <title>理财平台</title>\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"images/favicon.ico\">\r\n");
      out.write("    <link href=\"plug-in-ui/hplus/css/bootstrap.min.css?v=3.3.6\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"plug-in-ui/hplus/css/font-awesome.css?v=4.4.0\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <link href=\"plug-in-ui/hplus/css/animate.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"plug-in-ui/hplus/css/style.css?v=4.1.0\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"gray-bg\">\r\n");
      out.write("<div class=\"row  border-bottom white-bg dashboard-header\">\r\n");
      out.write("    <div class=\"col-sm-12\">\r\n");
      out.write("        <blockquote class=\"text-warning\" style=\"font-size:14px\">欢迎使用管理平台\r\n");
      out.write("        </blockquote>\r\n");
      out.write("        <hr>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"col-sm-8\" style=\"padding: 0px 20px;\">\r\n");
      out.write("        <h2>智能理财管理平台</h2>\r\n");
      out.write("        <p>JEECG是一款基于代码生成器的J2EE快速开发平台，开源界“小普元”超越传统商业企业级开发平台。引领新的开发模式(Online Coding模式(自定义表单)->代码生成器模式->手工MERGE智能开发)， 可以帮助解决Java项目60%的重复工作，让开发更多关注业务逻辑。既能快速提高开发效率，帮助公司节省人力成本，同时又不失灵活性。她可以用于所有的Web应用程序，如:<b>MIS</b>，<b>CRM</b>，<b>OA</b>，<b>ERP</b>，<b>CMS</b>，<b>网站后台</b>，<b>微信管家</b>，等等，当然，您也可以对她进行深度定制，以做出更强系统。</p>\r\n");
      out.write("        <p>\r\n");
      out.write("            <b>当前版本：</b>v_1.7.1\r\n");
      out.write("        </p>\r\n");
      out.write("        <p>\r\n");
      out.write("            <span class=\"label label-warning\">智能     &nbsp; | &nbsp; 快捷  &nbsp;| &nbsp; &nbsp;方便&nbsp;&nbsp;</span>\r\n");
      out.write("        </p>\r\n");
      out.write("        <br>\r\n");
      out.write("        <p>\r\n");
      out.write("            <a class=\"btn btn-white btn-bitbucket\" href=\"#\" target=\"_blank\">\r\n");
      out.write("                <i class=\"fa fa-qq\"> </i> 联系我们\r\n");
      out.write("            </a>\r\n");
      out.write("            <a class=\"btn btn-white btn-bitbucket\" href=\"#\" target=\"_blank\">\r\n");
      out.write("                <i class=\"fa fa-home\"></i> 官方微博\r\n");
      out.write("            </a>\r\n");
      out.write("        </p>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-sm-4\">\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- 全局js -->\r\n");
      out.write("<script src=\"plug-in-ui/hplus/js/jquery.min.js?v=2.1.4\"></script>\r\n");
      out.write("<script src=\"plug-in-ui/hplus/js/bootstrap.min.js?v=3.3.6\"></script>\r\n");
      out.write("<script src=\"plug-in-ui/hplus/js/plugins/layer/layer.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- 自定义js -->\r\n");
      out.write("<script src=\"plug-in-ui/hplus/js/content.js\"></script>\r\n");
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
