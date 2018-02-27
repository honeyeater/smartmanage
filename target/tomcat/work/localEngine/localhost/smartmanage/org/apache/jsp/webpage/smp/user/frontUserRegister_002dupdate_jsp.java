package org.apache.jsp.webpage.smp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class frontUserRegister_002dupdate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005flayout_005fformid_005fdialog_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftype_005ftitle_005fhasLabel_005ffield_005fdefaultVal_005fdatatype_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005flayout_005fformid_005fdialog_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftype_005ftitle_005fhasLabel_005ffield_005fdefaultVal_005fdatatype_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005flayout_005fformid_005fdialog_005faction.release();
    _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftype_005ftitle_005fhasLabel_005ffield_005fdefaultVal_005fdatatype_005fnobody.release();
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
      out.write(" <head>\r\n");
      out.write("  <title>注册用户信息表</title>\r\n");
      out.write("  ");
      if (_jspx_meth_t_005fbase_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write(" </head>\r\n");
      out.write(" <body>\r\n");
      out.write(" ");
      if (_jspx_meth_t_005fformvalid_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write(" </body>\r\n");
      out.write("  <script src = \"webpage/smp/user/frontUserRegister.js\"></script>\r\n");
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
    // /webpage/smp/user/frontUserRegister-update.jsp(7,2) name = type type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fbase_005f0.setType("jquery,easyui,tools,DatePicker");
    int _jspx_eval_t_005fbase_005f0 = _jspx_th_t_005fbase_005f0.doStartTag();
    if (_jspx_th_t_005fbase_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.reuse(_jspx_th_t_005fbase_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.reuse(_jspx_th_t_005fbase_005f0);
    return false;
  }

  private boolean _jspx_meth_t_005fformvalid_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:formvalid
    org.jeecgframework.tag.core.easyui.FormValidationTag _jspx_th_t_005fformvalid_005f0 = (org.jeecgframework.tag.core.easyui.FormValidationTag) _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005flayout_005fformid_005fdialog_005faction.get(org.jeecgframework.tag.core.easyui.FormValidationTag.class);
    _jspx_th_t_005fformvalid_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fformvalid_005f0.setParent(null);
    // /webpage/smp/user/frontUserRegister-update.jsp(10,1) name = formid type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setFormid("formobj");
    // /webpage/smp/user/frontUserRegister-update.jsp(10,1) name = dialog type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setDialog(true);
    // /webpage/smp/user/frontUserRegister-update.jsp(10,1) name = usePlugin type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setUsePlugin("password");
    // /webpage/smp/user/frontUserRegister-update.jsp(10,1) name = layout type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setLayout("div");
    // /webpage/smp/user/frontUserRegister-update.jsp(10,1) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setAction("frontUserRegisterController.do?doUpdate");
    int _jspx_eval_t_005fformvalid_005f0 = _jspx_th_t_005fformvalid_005f0.doStartTag();
    if (_jspx_eval_t_005fformvalid_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("     <input id=\"id\" name=\"id\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${frontUserRegisterPage.id }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("     <input id=\"province\" name=\"province\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${frontUserRegisterPage.province }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("     <input id=\"city\" name=\"city\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${frontUserRegisterPage.city }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("     <input id=\"bankCode\" name=\"bankCode\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${frontUserRegisterPage.bankCode }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("     <input id=\"bankName\" name=\"bankName\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${frontUserRegisterPage.bankName }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("     <input id=\"bankCard\" name=\"bankCard\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${frontUserRegisterPage.bankCard }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("     <input id=\"bankAddress\" name=\"bankAddress\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${frontUserRegisterPage.bankAddress }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("     <input id=\"password\" name=\"password\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${frontUserRegisterPage.password }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("     <input id=\"safePassword\" name=\"safePassword\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${frontUserRegisterPage.safePassword }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("     <input id=\"registerTime\" name=\"registerTime\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${frontUserRegisterPage.registerTime }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("     <input id=\"registerIp\" name=\"registerIp\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${frontUserRegisterPage.registerIp }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("     <input id=\"address\" name=\"address\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${frontUserRegisterPage.address }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("     <input id=\"activeTime\" name=\"activeTime\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${frontUserRegisterPage.activeTime }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("     <input id=\"userLevel\" name=\"userLevel\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${frontUserRegisterPage.userLevel }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("     <input id=\"inputtime\" name=\"inputtime\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${frontUserRegisterPage.inputtime }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("     <input id=\"inserttimeforhis\" name=\"inserttimeforhis\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${frontUserRegisterPage.inserttimeforhis }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("     <input id=\"operatetimeforhis\" name=\"operatetimeforhis\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${frontUserRegisterPage.operatetimeforhis }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("     <input id=\"vfield1\" name=\"vfield1\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${frontUserRegisterPage.vfield1 }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("     <input id=\"vfield2\" name=\"vfield2\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${frontUserRegisterPage.vfield2 }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("     <input id=\"vfield3\" name=\"vfield3\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${frontUserRegisterPage.vfield3 }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("     <input id=\"vfield4\" name=\"vfield4\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${frontUserRegisterPage.vfield4 }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("     <input id=\"vfield5\" name=\"vfield5\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${frontUserRegisterPage.vfield5 }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("     <input id=\"vfield6\" name=\"vfield6\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${frontUserRegisterPage.vfield6 }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("     <input id=\"nfield1\" name=\"nfield1\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${frontUserRegisterPage.nfield1 }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("     <input id=\"nfield2\" name=\"nfield2\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${frontUserRegisterPage.nfield2 }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("     <input id=\"nfield3\" name=\"nfield3\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${frontUserRegisterPage.nfield3 }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("     <input id=\"nfield4\" name=\"nfield4\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${frontUserRegisterPage.nfield4 }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("     <input id=\"dfield1\" name=\"dfield1\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${frontUserRegisterPage.dfield1 }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("     <input id=\"dfield2\" name=\"dfield2\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${frontUserRegisterPage.dfield2 }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("     <input id=\"dfield3\" name=\"dfield3\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${frontUserRegisterPage.dfield3 }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("     <input id=\"dfield4\" name=\"dfield4\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${frontUserRegisterPage.dfield4 }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("     <input id=\"linkerMobile\" name=\"linkerMobile\" type=\"hidden\" value='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${frontUserRegisterPage.linkerMobile}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("'/>\r\n");
        out.write("\r\n");
        out.write("     <fieldset class=\"step\">\r\n");
        out.write("         <div class=\"form\">\r\n");
        out.write("             <label class=\"Validform_label\">用户名:</label>\r\n");
        out.write("             <input id=\"userName\" name=\"userName\" type=\"text\" style=\"width: 150px\" class=\"inputxt\"  ignore=\"ignore\"  value='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${frontUserRegisterPage.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("' readonly/>\r\n");
        out.write("             <span class=\"Validform_checktip\"></span>\r\n");
        out.write("         </div>\r\n");
        out.write("         <div class=\"form\">\r\n");
        out.write("             <label class=\"Validform_label\">手机号:</label>\r\n");
        out.write("             <input id=\"phoneno\" name=\"phoneno\" type=\"text\" style=\"width: 150px\" class=\"inputxt\"  datatype=\"m\"  ignore=\"checked\"  value='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${frontUserRegisterPage.phoneno}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("'/>\r\n");
        out.write("             <span class=\"Validform_checktip\"></span>\r\n");
        out.write("         </div>\r\n");
        out.write("         <div class=\"form\">\r\n");
        out.write("             <label class=\"Validform_label\">身份证号:</label>\r\n");
        out.write("             <input id=\"identityNo\" name=\"identityNo\" type=\"text\" style=\"width: 150px\" class=\"inputxt\"  datatype=\"*\"  ignore=\"checked\"  value='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${frontUserRegisterPage.identityNo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("'/>\r\n");
        out.write("             <span class=\"Validform_checktip\"></span>\r\n");
        out.write("         </div>\r\n");
        out.write("         <div class=\"form\">\r\n");
        out.write("             <label class=\"Validform_label\">真实姓名:</label>\r\n");
        out.write("             <input id=\"realname\" name=\"realname\" type=\"text\" style=\"width: 150px\" class=\"inputxt\"  ignore=\"ignore\"  value='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${frontUserRegisterPage.realname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("'/>\r\n");
        out.write("             <span class=\"Validform_checktip\"></span>\r\n");
        out.write("         </div>\r\n");
        out.write("         <div class=\"form\">\r\n");
        out.write("             <label class=\"Validform_label\">是否激活:</label>\r\n");
        out.write("             ");
        if (_jspx_meth_t_005fdictSelect_005f0(_jspx_th_t_005fformvalid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("             <span class=\"Validform_checktip\"></span>\r\n");
        out.write("         </div>\r\n");
        out.write("         <div class=\"form\">\r\n");
        out.write("             <label class=\"Validform_label\">推荐人用户名:</label>\r\n");
        out.write("             <input id=\"introducer\" name=\"introducer\" type=\"text\" style=\"width: 150px\" class=\"inputxt\"  ignore=\"ignore\"  value='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${frontUserRegisterPage.introducer}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("' readonly/>\r\n");
        out.write("             <span class=\"Validform_checktip\"></span>\r\n");
        out.write("         </div>\r\n");
        out.write("     </fieldset>\r\n");
        out.write(" ");
        int evalDoAfterBody = _jspx_th_t_005fformvalid_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_005fformvalid_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005flayout_005fformid_005fdialog_005faction.reuse(_jspx_th_t_005fformvalid_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005flayout_005fformid_005fdialog_005faction.reuse(_jspx_th_t_005fformvalid_005f0);
    return false;
  }

  private boolean _jspx_meth_t_005fdictSelect_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fformvalid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dictSelect
    org.jeecgframework.tag.core.easyui.DictSelectTag _jspx_th_t_005fdictSelect_005f0 = (org.jeecgframework.tag.core.easyui.DictSelectTag) _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftype_005ftitle_005fhasLabel_005ffield_005fdefaultVal_005fdatatype_005fnobody.get(org.jeecgframework.tag.core.easyui.DictSelectTag.class);
    _jspx_th_t_005fdictSelect_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdictSelect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fformvalid_005f0);
    // /webpage/smp/user/frontUserRegister-update.jsp(67,13) name = field type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f0.setField("validFlag");
    // /webpage/smp/user/frontUserRegister-update.jsp(67,13) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f0.setType("list");
    // /webpage/smp/user/frontUserRegister-update.jsp(67,13) name = datatype type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f0.setDatatype("*");
    // /webpage/smp/user/frontUserRegister-update.jsp(67,13) name = typeGroupCode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f0.setTypeGroupCode("yOn");
    // /webpage/smp/user/frontUserRegister-update.jsp(67,13) name = defaultVal type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f0.setDefaultVal((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${frontUserRegisterPage.validFlag}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /webpage/smp/user/frontUserRegister-update.jsp(67,13) name = hasLabel type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f0.setHasLabel(false);
    // /webpage/smp/user/frontUserRegister-update.jsp(67,13) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f0.setTitle("是否激活");
    int _jspx_eval_t_005fdictSelect_005f0 = _jspx_th_t_005fdictSelect_005f0.doStartTag();
    if (_jspx_th_t_005fdictSelect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftype_005ftitle_005fhasLabel_005ffield_005fdefaultVal_005fdatatype_005fnobody.reuse(_jspx_th_t_005fdictSelect_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftype_005ftitle_005fhasLabel_005ffield_005fdefaultVal_005fdatatype_005fnobody.reuse(_jspx_th_t_005fdictSelect_005f0);
    return false;
  }
}
