package org.apache.jsp.webpage.smp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class frontUserList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/context/mytags.jsp");
    _jspx_dependants.add("/WEB-INF/tld/easyui.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fdatagrid_0026_005ftitle_005fqueryMode_005fpagination_005fname_005fidField_005ffitColumns_005ffit_005fcheckbox_005factionUrl;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fquery_005ffield_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005fformatter_005ffield_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005freplace_005fqueryMode_005ffield_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005ffield_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fdgFunOpt_0026_005furlfont_005furlclass_005ftitle_005ffunname_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fdatagrid_0026_005ftitle_005fqueryMode_005fpagination_005fname_005fidField_005ffitColumns_005ffit_005fcheckbox_005factionUrl = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fquery_005ffield_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005fformatter_005ffield_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005freplace_005fqueryMode_005ffield_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005ffield_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fdgFunOpt_0026_005furlfont_005furlclass_005ftitle_005ffunname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fdatagrid_0026_005ftitle_005fqueryMode_005fpagination_005fname_005fidField_005ffitColumns_005ffit_005fcheckbox_005factionUrl.release();
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fquery_005ffield_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005fformatter_005ffield_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005freplace_005fqueryMode_005ffield_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005ffield_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fdgFunOpt_0026_005furlfont_005furlclass_005ftitle_005ffunname_005fnobody.release();
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
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_t_005fbase_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"main_typegroup_list\" class=\"easyui-layout\" fit=\"true\">\r\n");
      out.write("    <div region=\"center\" style=\"padding:0px;border:0px\">\r\n");
      out.write("        ");
      if (_jspx_meth_t_005fdatagrid_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div data-options=\"region:'east',\r\n");
      out.write("\ttitle:'mytitle',\r\n");
      out.write("\tcollapsed:true,\r\n");
      out.write("\tsplit:true,\r\n");
      out.write("\tborder:false,\r\n");
      out.write("\tonExpand : function(){\r\n");
      out.write("\t\tli_east = 1;\r\n");
      out.write("\t},\r\n");
      out.write("\tonCollapse : function() {\r\n");
      out.write("\t    li_east = 0;\r\n");
      out.write("\t}\"\r\n");
      out.write("     style=\"width: 400px; overflow: hidden;\" id=\"eastPanel\">\r\n");
      out.write("    <div class=\"easyui-panel\" style=\"padding:0px;border:0px\" fit=\"true\" border=\"false\" id=\"userListpanel\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    $(function() {\r\n");
      out.write("        var li_east = 0;\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    function queryTypeValue(username, realname){\r\n");
      out.write("        var typegroupcode = \"userViews\";\r\n");
      out.write("        var title = '用户关联信息';\r\n");
      out.write("        if(li_east == 0){\r\n");
      out.write("            $('#main_typegroup_list').layout('expand','east');\r\n");
      out.write("        }\r\n");
      out.write("        $('#main_typegroup_list').layout('panel','east').panel('setTitle', title);\r\n");
      out.write("        $('#userListpanel').panel(\"refresh\", \"frontUserRegisterController.do?goUserViews&typegroupcode=\" + typegroupcode+\"&username=\"+username);\r\n");
      out.write("    }\r\n");
      out.write("    function loadSuccess() {\r\n");
      out.write("        $('#main_typegroup_list').layout('panel','east').panel('setTitle', \"\");\r\n");
      out.write("        $('#main_typegroup_list').layout('collapse','east');\r\n");
      out.write("        $('#userListpanel').empty();\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
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

  private boolean _jspx_meth_t_005fbase_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:base
    org.jeecgframework.tag.core.easyui.BaseTag _jspx_th_t_005fbase_005f0 = (org.jeecgframework.tag.core.easyui.BaseTag) _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.get(org.jeecgframework.tag.core.easyui.BaseTag.class);
    _jspx_th_t_005fbase_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fbase_005f0.setParent(null);
    // /webpage/smp/user/frontUserList.jsp(3,0) name = type type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fbase_005f0.setType("jquery,easyui,tools,DatePicker");
    int _jspx_eval_t_005fbase_005f0 = _jspx_th_t_005fbase_005f0.doStartTag();
    if (_jspx_th_t_005fbase_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.reuse(_jspx_th_t_005fbase_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.reuse(_jspx_th_t_005fbase_005f0);
    return false;
  }

  private boolean _jspx_meth_t_005fdatagrid_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:datagrid
    org.jeecgframework.tag.core.easyui.DataGridTag _jspx_th_t_005fdatagrid_005f0 = (org.jeecgframework.tag.core.easyui.DataGridTag) _005fjspx_005ftagPool_005ft_005fdatagrid_0026_005ftitle_005fqueryMode_005fpagination_005fname_005fidField_005ffitColumns_005ffit_005fcheckbox_005factionUrl.get(org.jeecgframework.tag.core.easyui.DataGridTag.class);
    _jspx_th_t_005fdatagrid_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdatagrid_005f0.setParent(null);
    // /webpage/smp/user/frontUserList.jsp(7,8) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdatagrid_005f0.setName("frontUserRegisterList");
    // /webpage/smp/user/frontUserList.jsp(7,8) name = checkbox type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdatagrid_005f0.setCheckbox(true);
    // /webpage/smp/user/frontUserList.jsp(7,8) name = pagination type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdatagrid_005f0.setPagination(true);
    // /webpage/smp/user/frontUserList.jsp(7,8) name = fitColumns type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdatagrid_005f0.setFitColumns(true);
    // /webpage/smp/user/frontUserList.jsp(7,8) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdatagrid_005f0.setTitle("注册用户信息表");
    // /webpage/smp/user/frontUserList.jsp(7,8) name = actionUrl type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdatagrid_005f0.setActionUrl("frontUserRegisterController.do?datagrid");
    // /webpage/smp/user/frontUserList.jsp(7,8) name = idField type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdatagrid_005f0.setIdField("id");
    // /webpage/smp/user/frontUserList.jsp(7,8) name = fit type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdatagrid_005f0.setFit(true);
    // /webpage/smp/user/frontUserList.jsp(7,8) name = queryMode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdatagrid_005f0.setQueryMode("group");
    int _jspx_eval_t_005fdatagrid_005f0 = _jspx_th_t_005fdatagrid_005f0.doStartTag();
    if (_jspx_eval_t_005fdatagrid_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_t_005fdgCol_005f0(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_t_005fdgCol_005f1(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_t_005fdgCol_005f2(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_t_005fdgCol_005f3(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_t_005fdgCol_005f4(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_t_005fdgCol_005f5(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_t_005fdgCol_005f6(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_t_005fdgCol_005f7(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_t_005fdgCol_005f8(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_t_005fdgCol_005f9(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_t_005fdgCol_005f10(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_t_005fdgCol_005f11(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_t_005fdgCol_005f12(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_t_005fdgCol_005f13(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_t_005fdgCol_005f14(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_t_005fdgCol_005f15(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_t_005fdgCol_005f16(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_t_005fdgCol_005f17(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_t_005fdgCol_005f18(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_t_005fdgCol_005f19(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_t_005fdgCol_005f20(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_t_005fdgCol_005f21(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_t_005fdgCol_005f22(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_t_005fdgCol_005f23(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_t_005fdgCol_005f24(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_t_005fdgCol_005f25(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_t_005fdgCol_005f26(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_t_005fdgCol_005f27(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_t_005fdgCol_005f28(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_t_005fdgCol_005f29(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_t_005fdgCol_005f30(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_t_005fdgCol_005f31(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_t_005fdgCol_005f32(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_t_005fdgCol_005f33(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_t_005fdgCol_005f34(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_t_005fdgCol_005f35(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_t_005fdgCol_005f36(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_t_005fdgCol_005f37(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_t_005fdgCol_005f38(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_t_005fdgFunOpt_005f0(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("            ");
        out.write("\r\n");
        out.write("            ");
        out.write("\r\n");
        out.write("            ");
        out.write("\r\n");
        out.write("            ");
        out.write("\r\n");
        out.write("            ");
        out.write("\r\n");
        out.write("            ");
        out.write("\r\n");
        out.write("            ");
        out.write("\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_t_005fdatagrid_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_005fdatagrid_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdatagrid_0026_005ftitle_005fqueryMode_005fpagination_005fname_005fidField_005ffitColumns_005ffit_005fcheckbox_005factionUrl.reuse(_jspx_th_t_005fdatagrid_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdatagrid_0026_005ftitle_005fqueryMode_005fpagination_005fname_005fidField_005ffitColumns_005ffit_005fcheckbox_005factionUrl.reuse(_jspx_th_t_005fdatagrid_005f0);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f0 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/smp/user/frontUserList.jsp(8,12) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f0.setTitle("ID");
    // /webpage/smp/user/frontUserList.jsp(8,12) name = field type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f0.setField("id");
    // /webpage/smp/user/frontUserList.jsp(8,12) name = hidden type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f0.setHidden(true);
    // /webpage/smp/user/frontUserList.jsp(8,12) name = queryMode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f0.setQueryMode("group");
    // /webpage/smp/user/frontUserList.jsp(8,12) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f0.setWidth(new Integer(120));
    int _jspx_eval_t_005fdgCol_005f0 = _jspx_th_t_005fdgCol_005f0.doStartTag();
    if (_jspx_th_t_005fdgCol_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f0);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f1 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fquery_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f1.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/smp/user/frontUserList.jsp(9,12) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f1.setTitle("用户名");
    // /webpage/smp/user/frontUserList.jsp(9,12) name = field type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f1.setField("userName");
    // /webpage/smp/user/frontUserList.jsp(9,12) name = query type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f1.setQuery(true);
    // /webpage/smp/user/frontUserList.jsp(9,12) name = queryMode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f1.setQueryMode("single");
    // /webpage/smp/user/frontUserList.jsp(9,12) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f1.setWidth(new Integer(120));
    int _jspx_eval_t_005fdgCol_005f1 = _jspx_th_t_005fdgCol_005f1.doStartTag();
    if (_jspx_th_t_005fdgCol_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fquery_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fquery_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f1);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f2 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fquery_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f2.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/smp/user/frontUserList.jsp(10,12) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f2.setTitle("手机号");
    // /webpage/smp/user/frontUserList.jsp(10,12) name = field type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f2.setField("phoneno");
    // /webpage/smp/user/frontUserList.jsp(10,12) name = query type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f2.setQuery(true);
    // /webpage/smp/user/frontUserList.jsp(10,12) name = queryMode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f2.setQueryMode("single");
    // /webpage/smp/user/frontUserList.jsp(10,12) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f2.setWidth(new Integer(120));
    int _jspx_eval_t_005fdgCol_005f2 = _jspx_th_t_005fdgCol_005f2.doStartTag();
    if (_jspx_th_t_005fdgCol_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fquery_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fquery_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f2);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f3 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fquery_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f3.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/smp/user/frontUserList.jsp(11,12) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f3.setTitle("身份证号");
    // /webpage/smp/user/frontUserList.jsp(11,12) name = field type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f3.setField("identityNo");
    // /webpage/smp/user/frontUserList.jsp(11,12) name = query type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f3.setQuery(true);
    // /webpage/smp/user/frontUserList.jsp(11,12) name = queryMode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f3.setQueryMode("single");
    // /webpage/smp/user/frontUserList.jsp(11,12) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f3.setWidth(new Integer(120));
    int _jspx_eval_t_005fdgCol_005f3 = _jspx_th_t_005fdgCol_005f3.doStartTag();
    if (_jspx_th_t_005fdgCol_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fquery_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fquery_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f3);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f4 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fquery_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f4.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/smp/user/frontUserList.jsp(12,12) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f4.setTitle("真实姓名");
    // /webpage/smp/user/frontUserList.jsp(12,12) name = field type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f4.setField("realname");
    // /webpage/smp/user/frontUserList.jsp(12,12) name = query type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f4.setQuery(true);
    // /webpage/smp/user/frontUserList.jsp(12,12) name = queryMode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f4.setQueryMode("single");
    // /webpage/smp/user/frontUserList.jsp(12,12) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f4.setWidth(new Integer(120));
    int _jspx_eval_t_005fdgCol_005f4 = _jspx_th_t_005fdgCol_005f4.doStartTag();
    if (_jspx_th_t_005fdgCol_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fquery_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fquery_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f4);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f5 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f5.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/smp/user/frontUserList.jsp(13,12) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f5.setTitle("银行省份");
    // /webpage/smp/user/frontUserList.jsp(13,12) name = field type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f5.setField("province");
    // /webpage/smp/user/frontUserList.jsp(13,12) name = hidden type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f5.setHidden(true);
    // /webpage/smp/user/frontUserList.jsp(13,12) name = queryMode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f5.setQueryMode("group");
    // /webpage/smp/user/frontUserList.jsp(13,12) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f5.setWidth(new Integer(120));
    int _jspx_eval_t_005fdgCol_005f5 = _jspx_th_t_005fdgCol_005f5.doStartTag();
    if (_jspx_th_t_005fdgCol_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f5);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f6 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f6.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/smp/user/frontUserList.jsp(14,12) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f6.setTitle("银行城市");
    // /webpage/smp/user/frontUserList.jsp(14,12) name = field type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f6.setField("city");
    // /webpage/smp/user/frontUserList.jsp(14,12) name = hidden type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f6.setHidden(true);
    // /webpage/smp/user/frontUserList.jsp(14,12) name = queryMode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f6.setQueryMode("group");
    // /webpage/smp/user/frontUserList.jsp(14,12) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f6.setWidth(new Integer(120));
    int _jspx_eval_t_005fdgCol_005f6 = _jspx_th_t_005fdgCol_005f6.doStartTag();
    if (_jspx_th_t_005fdgCol_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f6);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f7 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f7.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/smp/user/frontUserList.jsp(15,12) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f7.setTitle("开户银行代码");
    // /webpage/smp/user/frontUserList.jsp(15,12) name = field type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f7.setField("bankCode");
    // /webpage/smp/user/frontUserList.jsp(15,12) name = hidden type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f7.setHidden(true);
    // /webpage/smp/user/frontUserList.jsp(15,12) name = queryMode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f7.setQueryMode("group");
    // /webpage/smp/user/frontUserList.jsp(15,12) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f7.setWidth(new Integer(120));
    int _jspx_eval_t_005fdgCol_005f7 = _jspx_th_t_005fdgCol_005f7.doStartTag();
    if (_jspx_th_t_005fdgCol_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f7);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f8 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f8.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/smp/user/frontUserList.jsp(16,12) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f8.setTitle("开户银行");
    // /webpage/smp/user/frontUserList.jsp(16,12) name = field type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f8.setField("bankName");
    // /webpage/smp/user/frontUserList.jsp(16,12) name = hidden type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f8.setHidden(true);
    // /webpage/smp/user/frontUserList.jsp(16,12) name = queryMode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f8.setQueryMode("group");
    // /webpage/smp/user/frontUserList.jsp(16,12) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f8.setWidth(new Integer(120));
    int _jspx_eval_t_005fdgCol_005f8 = _jspx_th_t_005fdgCol_005f8.doStartTag();
    if (_jspx_th_t_005fdgCol_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f8);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f9 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f9.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/smp/user/frontUserList.jsp(17,12) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f9.setTitle("银行卡号");
    // /webpage/smp/user/frontUserList.jsp(17,12) name = field type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f9.setField("bankCard");
    // /webpage/smp/user/frontUserList.jsp(17,12) name = hidden type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f9.setHidden(true);
    // /webpage/smp/user/frontUserList.jsp(17,12) name = queryMode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f9.setQueryMode("group");
    // /webpage/smp/user/frontUserList.jsp(17,12) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f9.setWidth(new Integer(120));
    int _jspx_eval_t_005fdgCol_005f9 = _jspx_th_t_005fdgCol_005f9.doStartTag();
    if (_jspx_th_t_005fdgCol_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f9);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f10 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f10.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/smp/user/frontUserList.jsp(18,12) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f10.setTitle("银行详细地址");
    // /webpage/smp/user/frontUserList.jsp(18,12) name = field type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f10.setField("bankAddress");
    // /webpage/smp/user/frontUserList.jsp(18,12) name = hidden type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f10.setHidden(true);
    // /webpage/smp/user/frontUserList.jsp(18,12) name = queryMode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f10.setQueryMode("group");
    // /webpage/smp/user/frontUserList.jsp(18,12) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f10.setWidth(new Integer(120));
    int _jspx_eval_t_005fdgCol_005f10 = _jspx_th_t_005fdgCol_005f10.doStartTag();
    if (_jspx_th_t_005fdgCol_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f10);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f11 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f11.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/smp/user/frontUserList.jsp(19,12) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f11.setTitle("登录密码");
    // /webpage/smp/user/frontUserList.jsp(19,12) name = field type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f11.setField("password");
    // /webpage/smp/user/frontUserList.jsp(19,12) name = hidden type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f11.setHidden(true);
    // /webpage/smp/user/frontUserList.jsp(19,12) name = queryMode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f11.setQueryMode("group");
    // /webpage/smp/user/frontUserList.jsp(19,12) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f11.setWidth(new Integer(120));
    int _jspx_eval_t_005fdgCol_005f11 = _jspx_th_t_005fdgCol_005f11.doStartTag();
    if (_jspx_th_t_005fdgCol_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f11);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f12 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f12.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/smp/user/frontUserList.jsp(20,12) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f12.setTitle("安全密码");
    // /webpage/smp/user/frontUserList.jsp(20,12) name = field type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f12.setField("safePassword");
    // /webpage/smp/user/frontUserList.jsp(20,12) name = hidden type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f12.setHidden(true);
    // /webpage/smp/user/frontUserList.jsp(20,12) name = queryMode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f12.setQueryMode("group");
    // /webpage/smp/user/frontUserList.jsp(20,12) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f12.setWidth(new Integer(120));
    int _jspx_eval_t_005fdgCol_005f12 = _jspx_th_t_005fdgCol_005f12.doStartTag();
    if (_jspx_th_t_005fdgCol_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f12);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f13 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005fformatter_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f13.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/smp/user/frontUserList.jsp(21,12) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f13.setTitle("注册时间");
    // /webpage/smp/user/frontUserList.jsp(21,12) name = field type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f13.setField("registerTime");
    // /webpage/smp/user/frontUserList.jsp(21,12) name = formatter type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f13.setFormatter("yyyy-MM-dd");
    // /webpage/smp/user/frontUserList.jsp(21,12) name = hidden type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f13.setHidden(true);
    // /webpage/smp/user/frontUserList.jsp(21,12) name = queryMode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f13.setQueryMode("group");
    // /webpage/smp/user/frontUserList.jsp(21,12) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f13.setWidth(new Integer(120));
    int _jspx_eval_t_005fdgCol_005f13 = _jspx_th_t_005fdgCol_005f13.doStartTag();
    if (_jspx_th_t_005fdgCol_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005fformatter_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005fformatter_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f13);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f14 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f14.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/smp/user/frontUserList.jsp(22,12) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f14.setTitle("注册IP地址");
    // /webpage/smp/user/frontUserList.jsp(22,12) name = field type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f14.setField("registerIp");
    // /webpage/smp/user/frontUserList.jsp(22,12) name = hidden type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f14.setHidden(true);
    // /webpage/smp/user/frontUserList.jsp(22,12) name = queryMode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f14.setQueryMode("group");
    // /webpage/smp/user/frontUserList.jsp(22,12) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f14.setWidth(new Integer(120));
    int _jspx_eval_t_005fdgCol_005f14 = _jspx_th_t_005fdgCol_005f14.doStartTag();
    if (_jspx_th_t_005fdgCol_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f14);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f15 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f15.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/smp/user/frontUserList.jsp(23,12) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f15.setTitle("联系电话");
    // /webpage/smp/user/frontUserList.jsp(23,12) name = field type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f15.setField("linkerMobile");
    // /webpage/smp/user/frontUserList.jsp(23,12) name = hidden type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f15.setHidden(true);
    // /webpage/smp/user/frontUserList.jsp(23,12) name = queryMode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f15.setQueryMode("single");
    // /webpage/smp/user/frontUserList.jsp(23,12) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f15.setWidth(new Integer(120));
    int _jspx_eval_t_005fdgCol_005f15 = _jspx_th_t_005fdgCol_005f15.doStartTag();
    if (_jspx_th_t_005fdgCol_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f15);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f16(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f16 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f16.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/smp/user/frontUserList.jsp(24,12) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f16.setTitle("居住地址");
    // /webpage/smp/user/frontUserList.jsp(24,12) name = field type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f16.setField("address");
    // /webpage/smp/user/frontUserList.jsp(24,12) name = hidden type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f16.setHidden(true);
    // /webpage/smp/user/frontUserList.jsp(24,12) name = queryMode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f16.setQueryMode("group");
    // /webpage/smp/user/frontUserList.jsp(24,12) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f16.setWidth(new Integer(120));
    int _jspx_eval_t_005fdgCol_005f16 = _jspx_th_t_005fdgCol_005f16.doStartTag();
    if (_jspx_th_t_005fdgCol_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f16);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f17(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f17 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005freplace_005fqueryMode_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f17.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/smp/user/frontUserList.jsp(25,12) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f17.setTitle("是否激活");
    // /webpage/smp/user/frontUserList.jsp(25,12) name = field type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f17.setField("validFlag");
    // /webpage/smp/user/frontUserList.jsp(25,12) name = queryMode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f17.setQueryMode("single");
    // /webpage/smp/user/frontUserList.jsp(25,12) name = replace type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f17.setReplace("是_1,否_0");
    // /webpage/smp/user/frontUserList.jsp(25,12) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f17.setWidth(new Integer(120));
    int _jspx_eval_t_005fdgCol_005f17 = _jspx_th_t_005fdgCol_005f17.doStartTag();
    if (_jspx_th_t_005fdgCol_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005freplace_005fqueryMode_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f17);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005freplace_005fqueryMode_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f17);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f18(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f18 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005fformatter_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f18.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/smp/user/frontUserList.jsp(26,12) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f18.setTitle("激活时间");
    // /webpage/smp/user/frontUserList.jsp(26,12) name = field type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f18.setField("activeTime");
    // /webpage/smp/user/frontUserList.jsp(26,12) name = formatter type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f18.setFormatter("yyyy-MM-dd");
    // /webpage/smp/user/frontUserList.jsp(26,12) name = hidden type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f18.setHidden(true);
    // /webpage/smp/user/frontUserList.jsp(26,12) name = queryMode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f18.setQueryMode("group");
    // /webpage/smp/user/frontUserList.jsp(26,12) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f18.setWidth(new Integer(120));
    int _jspx_eval_t_005fdgCol_005f18 = _jspx_th_t_005fdgCol_005f18.doStartTag();
    if (_jspx_th_t_005fdgCol_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005fformatter_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f18);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005fformatter_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f18);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f19(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f19 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f19.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/smp/user/frontUserList.jsp(27,12) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f19.setTitle("会员级别");
    // /webpage/smp/user/frontUserList.jsp(27,12) name = field type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f19.setField("userLevel");
    // /webpage/smp/user/frontUserList.jsp(27,12) name = hidden type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f19.setHidden(true);
    // /webpage/smp/user/frontUserList.jsp(27,12) name = queryMode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f19.setQueryMode("group");
    // /webpage/smp/user/frontUserList.jsp(27,12) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f19.setWidth(new Integer(120));
    int _jspx_eval_t_005fdgCol_005f19 = _jspx_th_t_005fdgCol_005f19.doStartTag();
    if (_jspx_th_t_005fdgCol_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f19);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f19);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f20(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f20 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fquery_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f20.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/smp/user/frontUserList.jsp(28,12) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f20.setTitle("推荐人用户名");
    // /webpage/smp/user/frontUserList.jsp(28,12) name = field type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f20.setField("introducer");
    // /webpage/smp/user/frontUserList.jsp(28,12) name = query type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f20.setQuery(true);
    // /webpage/smp/user/frontUserList.jsp(28,12) name = queryMode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f20.setQueryMode("single");
    // /webpage/smp/user/frontUserList.jsp(28,12) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f20.setWidth(new Integer(120));
    int _jspx_eval_t_005fdgCol_005f20 = _jspx_th_t_005fdgCol_005f20.doStartTag();
    if (_jspx_th_t_005fdgCol_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fquery_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f20);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fquery_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f20);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f21(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f21 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005fformatter_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f21.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/smp/user/frontUserList.jsp(29,12) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f21.setTitle("输入日期");
    // /webpage/smp/user/frontUserList.jsp(29,12) name = field type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f21.setField("inputtime");
    // /webpage/smp/user/frontUserList.jsp(29,12) name = formatter type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f21.setFormatter("yyyy-MM-dd");
    // /webpage/smp/user/frontUserList.jsp(29,12) name = hidden type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f21.setHidden(true);
    // /webpage/smp/user/frontUserList.jsp(29,12) name = queryMode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f21.setQueryMode("group");
    // /webpage/smp/user/frontUserList.jsp(29,12) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f21.setWidth(new Integer(120));
    int _jspx_eval_t_005fdgCol_005f21 = _jspx_th_t_005fdgCol_005f21.doStartTag();
    if (_jspx_th_t_005fdgCol_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005fformatter_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f21);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005fformatter_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f21);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f22(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f22 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005fformatter_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f22.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/smp/user/frontUserList.jsp(30,12) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f22.setTitle("插入时间");
    // /webpage/smp/user/frontUserList.jsp(30,12) name = field type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f22.setField("inserttimeforhis");
    // /webpage/smp/user/frontUserList.jsp(30,12) name = formatter type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f22.setFormatter("yyyy-MM-dd");
    // /webpage/smp/user/frontUserList.jsp(30,12) name = hidden type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f22.setHidden(true);
    // /webpage/smp/user/frontUserList.jsp(30,12) name = queryMode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f22.setQueryMode("group");
    // /webpage/smp/user/frontUserList.jsp(30,12) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f22.setWidth(new Integer(120));
    int _jspx_eval_t_005fdgCol_005f22 = _jspx_th_t_005fdgCol_005f22.doStartTag();
    if (_jspx_th_t_005fdgCol_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005fformatter_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f22);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005fformatter_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f22);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f23(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f23 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005fformatter_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f23.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/smp/user/frontUserList.jsp(31,12) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f23.setTitle("更新时间");
    // /webpage/smp/user/frontUserList.jsp(31,12) name = field type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f23.setField("operatetimeforhis");
    // /webpage/smp/user/frontUserList.jsp(31,12) name = formatter type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f23.setFormatter("yyyy-MM-dd");
    // /webpage/smp/user/frontUserList.jsp(31,12) name = hidden type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f23.setHidden(true);
    // /webpage/smp/user/frontUserList.jsp(31,12) name = queryMode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f23.setQueryMode("group");
    // /webpage/smp/user/frontUserList.jsp(31,12) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f23.setWidth(new Integer(120));
    int _jspx_eval_t_005fdgCol_005f23 = _jspx_th_t_005fdgCol_005f23.doStartTag();
    if (_jspx_th_t_005fdgCol_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005fformatter_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f23);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005fformatter_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f23);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f24(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f24 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f24.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/smp/user/frontUserList.jsp(32,12) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f24.setTitle("扩展字符字段");
    // /webpage/smp/user/frontUserList.jsp(32,12) name = field type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f24.setField("vfield1");
    // /webpage/smp/user/frontUserList.jsp(32,12) name = hidden type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f24.setHidden(true);
    // /webpage/smp/user/frontUserList.jsp(32,12) name = queryMode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f24.setQueryMode("group");
    // /webpage/smp/user/frontUserList.jsp(32,12) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f24.setWidth(new Integer(120));
    int _jspx_eval_t_005fdgCol_005f24 = _jspx_th_t_005fdgCol_005f24.doStartTag();
    if (_jspx_th_t_005fdgCol_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f24);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f24);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f25(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f25 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f25.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/smp/user/frontUserList.jsp(33,12) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f25.setTitle("扩展字符字段");
    // /webpage/smp/user/frontUserList.jsp(33,12) name = field type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f25.setField("vfield2");
    // /webpage/smp/user/frontUserList.jsp(33,12) name = hidden type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f25.setHidden(true);
    // /webpage/smp/user/frontUserList.jsp(33,12) name = queryMode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f25.setQueryMode("group");
    // /webpage/smp/user/frontUserList.jsp(33,12) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f25.setWidth(new Integer(120));
    int _jspx_eval_t_005fdgCol_005f25 = _jspx_th_t_005fdgCol_005f25.doStartTag();
    if (_jspx_th_t_005fdgCol_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f25);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f25);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f26(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f26 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f26.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/smp/user/frontUserList.jsp(34,12) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f26.setTitle("扩展字符字段");
    // /webpage/smp/user/frontUserList.jsp(34,12) name = field type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f26.setField("vfield3");
    // /webpage/smp/user/frontUserList.jsp(34,12) name = hidden type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f26.setHidden(true);
    // /webpage/smp/user/frontUserList.jsp(34,12) name = queryMode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f26.setQueryMode("group");
    // /webpage/smp/user/frontUserList.jsp(34,12) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f26.setWidth(new Integer(120));
    int _jspx_eval_t_005fdgCol_005f26 = _jspx_th_t_005fdgCol_005f26.doStartTag();
    if (_jspx_th_t_005fdgCol_005f26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f26);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f26);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f27(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f27 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f27.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/smp/user/frontUserList.jsp(35,12) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f27.setTitle("扩展字符字段");
    // /webpage/smp/user/frontUserList.jsp(35,12) name = field type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f27.setField("vfield4");
    // /webpage/smp/user/frontUserList.jsp(35,12) name = hidden type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f27.setHidden(true);
    // /webpage/smp/user/frontUserList.jsp(35,12) name = queryMode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f27.setQueryMode("group");
    // /webpage/smp/user/frontUserList.jsp(35,12) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f27.setWidth(new Integer(120));
    int _jspx_eval_t_005fdgCol_005f27 = _jspx_th_t_005fdgCol_005f27.doStartTag();
    if (_jspx_th_t_005fdgCol_005f27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f27);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f27);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f28(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f28 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f28.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/smp/user/frontUserList.jsp(36,12) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f28.setTitle("扩展字符字段");
    // /webpage/smp/user/frontUserList.jsp(36,12) name = field type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f28.setField("vfield5");
    // /webpage/smp/user/frontUserList.jsp(36,12) name = hidden type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f28.setHidden(true);
    // /webpage/smp/user/frontUserList.jsp(36,12) name = queryMode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f28.setQueryMode("group");
    // /webpage/smp/user/frontUserList.jsp(36,12) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f28.setWidth(new Integer(120));
    int _jspx_eval_t_005fdgCol_005f28 = _jspx_th_t_005fdgCol_005f28.doStartTag();
    if (_jspx_th_t_005fdgCol_005f28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f28);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f28);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f29(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f29 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f29.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/smp/user/frontUserList.jsp(37,12) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f29.setTitle("扩展字符字段");
    // /webpage/smp/user/frontUserList.jsp(37,12) name = field type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f29.setField("vfield6");
    // /webpage/smp/user/frontUserList.jsp(37,12) name = hidden type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f29.setHidden(true);
    // /webpage/smp/user/frontUserList.jsp(37,12) name = queryMode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f29.setQueryMode("group");
    // /webpage/smp/user/frontUserList.jsp(37,12) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f29.setWidth(new Integer(120));
    int _jspx_eval_t_005fdgCol_005f29 = _jspx_th_t_005fdgCol_005f29.doStartTag();
    if (_jspx_th_t_005fdgCol_005f29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f29);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f29);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f30(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f30 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f30.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/smp/user/frontUserList.jsp(38,12) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f30.setTitle("扩展金额字段");
    // /webpage/smp/user/frontUserList.jsp(38,12) name = field type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f30.setField("nfield1");
    // /webpage/smp/user/frontUserList.jsp(38,12) name = hidden type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f30.setHidden(true);
    // /webpage/smp/user/frontUserList.jsp(38,12) name = queryMode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f30.setQueryMode("group");
    // /webpage/smp/user/frontUserList.jsp(38,12) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f30.setWidth(new Integer(120));
    int _jspx_eval_t_005fdgCol_005f30 = _jspx_th_t_005fdgCol_005f30.doStartTag();
    if (_jspx_th_t_005fdgCol_005f30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f30);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f30);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f31(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f31 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f31.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/smp/user/frontUserList.jsp(39,12) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f31.setTitle("扩展金额字段");
    // /webpage/smp/user/frontUserList.jsp(39,12) name = field type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f31.setField("nfield2");
    // /webpage/smp/user/frontUserList.jsp(39,12) name = hidden type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f31.setHidden(true);
    // /webpage/smp/user/frontUserList.jsp(39,12) name = queryMode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f31.setQueryMode("group");
    // /webpage/smp/user/frontUserList.jsp(39,12) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f31.setWidth(new Integer(120));
    int _jspx_eval_t_005fdgCol_005f31 = _jspx_th_t_005fdgCol_005f31.doStartTag();
    if (_jspx_th_t_005fdgCol_005f31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f31);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f31);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f32(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f32 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f32.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/smp/user/frontUserList.jsp(40,12) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f32.setTitle("扩展金额字段");
    // /webpage/smp/user/frontUserList.jsp(40,12) name = field type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f32.setField("nfield3");
    // /webpage/smp/user/frontUserList.jsp(40,12) name = hidden type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f32.setHidden(true);
    // /webpage/smp/user/frontUserList.jsp(40,12) name = queryMode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f32.setQueryMode("group");
    // /webpage/smp/user/frontUserList.jsp(40,12) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f32.setWidth(new Integer(120));
    int _jspx_eval_t_005fdgCol_005f32 = _jspx_th_t_005fdgCol_005f32.doStartTag();
    if (_jspx_th_t_005fdgCol_005f32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f32);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f32);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f33(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f33 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f33.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/smp/user/frontUserList.jsp(41,12) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f33.setTitle("扩展金额字段");
    // /webpage/smp/user/frontUserList.jsp(41,12) name = field type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f33.setField("nfield4");
    // /webpage/smp/user/frontUserList.jsp(41,12) name = hidden type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f33.setHidden(true);
    // /webpage/smp/user/frontUserList.jsp(41,12) name = queryMode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f33.setQueryMode("group");
    // /webpage/smp/user/frontUserList.jsp(41,12) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f33.setWidth(new Integer(120));
    int _jspx_eval_t_005fdgCol_005f33 = _jspx_th_t_005fdgCol_005f33.doStartTag();
    if (_jspx_th_t_005fdgCol_005f33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f33);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f33);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f34(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f34 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005fformatter_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f34.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/smp/user/frontUserList.jsp(42,12) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f34.setTitle("扩展时间字段");
    // /webpage/smp/user/frontUserList.jsp(42,12) name = field type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f34.setField("dfield1");
    // /webpage/smp/user/frontUserList.jsp(42,12) name = formatter type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f34.setFormatter("yyyy-MM-dd");
    // /webpage/smp/user/frontUserList.jsp(42,12) name = hidden type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f34.setHidden(true);
    // /webpage/smp/user/frontUserList.jsp(42,12) name = queryMode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f34.setQueryMode("group");
    // /webpage/smp/user/frontUserList.jsp(42,12) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f34.setWidth(new Integer(120));
    int _jspx_eval_t_005fdgCol_005f34 = _jspx_th_t_005fdgCol_005f34.doStartTag();
    if (_jspx_th_t_005fdgCol_005f34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005fformatter_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f34);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005fformatter_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f34);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f35(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f35 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005fformatter_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f35.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f35.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/smp/user/frontUserList.jsp(43,12) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f35.setTitle("扩展时间字段");
    // /webpage/smp/user/frontUserList.jsp(43,12) name = field type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f35.setField("dfield2");
    // /webpage/smp/user/frontUserList.jsp(43,12) name = formatter type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f35.setFormatter("yyyy-MM-dd");
    // /webpage/smp/user/frontUserList.jsp(43,12) name = hidden type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f35.setHidden(true);
    // /webpage/smp/user/frontUserList.jsp(43,12) name = queryMode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f35.setQueryMode("group");
    // /webpage/smp/user/frontUserList.jsp(43,12) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f35.setWidth(new Integer(120));
    int _jspx_eval_t_005fdgCol_005f35 = _jspx_th_t_005fdgCol_005f35.doStartTag();
    if (_jspx_th_t_005fdgCol_005f35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005fformatter_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f35);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005fformatter_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f35);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f36(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f36 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005fformatter_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f36.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f36.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/smp/user/frontUserList.jsp(44,12) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f36.setTitle("扩展时间字段");
    // /webpage/smp/user/frontUserList.jsp(44,12) name = field type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f36.setField("dfield3");
    // /webpage/smp/user/frontUserList.jsp(44,12) name = formatter type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f36.setFormatter("yyyy-MM-dd");
    // /webpage/smp/user/frontUserList.jsp(44,12) name = hidden type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f36.setHidden(true);
    // /webpage/smp/user/frontUserList.jsp(44,12) name = queryMode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f36.setQueryMode("group");
    // /webpage/smp/user/frontUserList.jsp(44,12) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f36.setWidth(new Integer(120));
    int _jspx_eval_t_005fdgCol_005f36 = _jspx_th_t_005fdgCol_005f36.doStartTag();
    if (_jspx_th_t_005fdgCol_005f36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005fformatter_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f36);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005fformatter_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f36);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f37(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f37 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005fformatter_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f37.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f37.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/smp/user/frontUserList.jsp(45,12) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f37.setTitle("扩展时间字段");
    // /webpage/smp/user/frontUserList.jsp(45,12) name = field type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f37.setField("dfield4");
    // /webpage/smp/user/frontUserList.jsp(45,12) name = formatter type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f37.setFormatter("yyyy-MM-dd");
    // /webpage/smp/user/frontUserList.jsp(45,12) name = hidden type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f37.setHidden(true);
    // /webpage/smp/user/frontUserList.jsp(45,12) name = queryMode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f37.setQueryMode("group");
    // /webpage/smp/user/frontUserList.jsp(45,12) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f37.setWidth(new Integer(120));
    int _jspx_eval_t_005fdgCol_005f37 = _jspx_th_t_005fdgCol_005f37.doStartTag();
    if (_jspx_th_t_005fdgCol_005f37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005fformatter_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f37);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005fqueryMode_005fhidden_005fformatter_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f37);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f38(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f38 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f38.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f38.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/smp/user/frontUserList.jsp(46,12) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f38.setTitle("操作");
    // /webpage/smp/user/frontUserList.jsp(46,12) name = field type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f38.setField("opt");
    // /webpage/smp/user/frontUserList.jsp(46,12) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f38.setWidth(new Integer(100));
    int _jspx_eval_t_005fdgCol_005f38 = _jspx_th_t_005fdgCol_005f38.doStartTag();
    if (_jspx_th_t_005fdgCol_005f38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f38);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f38);
    return false;
  }

  private boolean _jspx_meth_t_005fdgFunOpt_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgFunOpt
    org.jeecgframework.tag.core.easyui.DataGridFunOptTag _jspx_th_t_005fdgFunOpt_005f0 = (org.jeecgframework.tag.core.easyui.DataGridFunOptTag) _005fjspx_005ftagPool_005ft_005fdgFunOpt_0026_005furlfont_005furlclass_005ftitle_005ffunname_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridFunOptTag.class);
    _jspx_th_t_005fdgFunOpt_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgFunOpt_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/smp/user/frontUserList.jsp(47,12) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgFunOpt_005f0.setTitle("信息重置");
    // /webpage/smp/user/frontUserList.jsp(47,12) name = funname type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgFunOpt_005f0.setFunname("queryTypeValue(userName,realname)");
    // /webpage/smp/user/frontUserList.jsp(47,12) name = urlclass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgFunOpt_005f0.setUrlclass("ace_button");
    // /webpage/smp/user/frontUserList.jsp(47,12) name = urlfont type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgFunOpt_005f0.setUrlfont("fa-search");
    int _jspx_eval_t_005fdgFunOpt_005f0 = _jspx_th_t_005fdgFunOpt_005f0.doStartTag();
    if (_jspx_th_t_005fdgFunOpt_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgFunOpt_0026_005furlfont_005furlclass_005ftitle_005ffunname_005fnobody.reuse(_jspx_th_t_005fdgFunOpt_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgFunOpt_0026_005furlfont_005furlclass_005ftitle_005ffunname_005fnobody.reuse(_jspx_th_t_005fdgFunOpt_005f0);
    return false;
  }
}
