/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M17
 * Generated at: 2018-03-23 01:20:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write('\n');

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<title>KIFT</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/overrall.min.css\">\n");
      out.write("<link rel=\"icon\" type=\"image/x-icon\" href=\"css/icon.png\" />\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t");
      out.write("\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\n");
      out.write("\t\t");
      out.write("\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-md-12\">\n");
      out.write("\t\t\t\t<div class=\"titlebox\">\n");
      out.write("\t\t\t\t\t<span class=\"titletext\"><em> 青阳网络文件传输系统 <small><span\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"graytext\">KIFT</span></small></em></span> <span id=\"tb\" class=\"rightbtn\"></span>\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-link rightbtn\" onclick=\"refreshFolderView()\">\n");
      out.write("\t\t\t\t\t\t刷新 <span class=\"glyphicon glyphicon-repeat\" aria-hidden=\"true\"></span>\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<hr />\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t");
      out.write("\n");
      out.write("\n");
      out.write("\t\t");
      out.write("\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-md-12\">\n");
      out.write("\t\t\t\t<p class=\"subtitle\">\n");
      out.write("\t\t\t\t\t文件同步时间：<span id=\"publishTime\"></span>\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t\t<p class=\"subtitle\">\n");
      out.write("\t\t\t\t\tOS：<span id=\"serverOS\"><span class=\"graytext\">加载中...</span></span>\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t\t<div id=\"filetable\" class=\"panel panel-default\">\n");
      out.write("\t\t\t\t\t<!-- Default panel contents -->\n");
      out.write("\t\t\t\t\t<div class=\"panel-heading\">\n");
      out.write("\t\t\t\t\t\t<p class=\"heading\" id=\"parentlistbox\"></p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<table class=\"table table-hover\">\n");
      out.write("\t\t\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t<th onclick=\"checkallfile()\">文件名</th>\n");
      out.write("\t\t\t\t\t\t\t\t<th>创建日期</th>\n");
      out.write("\t\t\t\t\t\t\t\t<th>大小</th>\n");
      out.write("\t\t\t\t\t\t\t\t<th>创建者</th>\n");
      out.write("\t\t\t\t\t\t\t\t<th>操作</th>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t</thead>\n");
      out.write("\t\t\t\t\t\t<tbody id=\"foldertable\"></tbody>\n");
      out.write("\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t");
      out.write("\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t");
      out.write('\n');
      out.write('\n');
      out.write('	');
      out.write("\n");
      out.write("\t<div class=\"modal fade bs-example-modal-sm\" id=\"loginModal\"\n");
      out.write("\t\ttabindex=\"-1\" role=\"dialog\" aria-labelledby=\"loginModelTitle\">\n");
      out.write("\t\t<div class=\"modal-dialog modal-sm\" role=\"document\">\n");
      out.write("\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\n");
      out.write("\t\t\t\t\t\taria-label=\"Close\">\n");
      out.write("\t\t\t\t\t\t<span aria-hidden=\"true\">&times;</span>\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t<h4 class=\"modal-title\" id=\"loginModelTitle\">\n");
      out.write("\t\t\t\t\t\t<span class=\"glyphicon glyphicon-user\"></span> 账户登录\n");
      out.write("\t\t\t\t\t</h4>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t\t\t<form class=\"form-horizontal\">\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\" id=\"accountidbox\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"accountid\" id=\"accountidtitle\"\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"col-sm-3 control-label\">账户：</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-9\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"accountid\"\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"请输入账户……\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\" id=\"accountpwdbox\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"accountpwd\" id=\"accountpwdtitle\"\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"col-sm-3 control-label\">密码：</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-9\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"password\" class=\"form-control\" id=\"accountpwd\"\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"请输入密码……\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div id=\"alertbox\" role=\"alert\"></div>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary\" onclick=\"dologin()\">登录</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t");
      out.write('\n');
      out.write('	');
      out.write("\n");
      out.write("\t<div class=\"modal fade bs-example-modal-sm\" id=\"logoutModal\"\n");
      out.write("\t\ttabindex=\"-1\" role=\"dialog\" aria-labelledby=\"logoutModelTitle\">\n");
      out.write("\t\t<div class=\"modal-dialog modal-sm\" role=\"document\">\n");
      out.write("\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\n");
      out.write("\t\t\t\t\t\taria-label=\"Close\">\n");
      out.write("\t\t\t\t\t\t<span aria-hidden=\"true\">&times;</span>\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t<h4 class=\"modal-title\" id=\"logoutModelTitle\">\n");
      out.write("\t\t\t\t\t\t<span class=\"glyphicon glyphicon-comment\"></span> 注销\n");
      out.write("\t\t\t\t\t</h4>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t\t\t<h5>提示：您确认要注销么？</h5>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-danger\" onclick=\"dologout()\">注销</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t");
      out.write('\n');
      out.write('	');
      out.write("\n");
      out.write("\t<div class=\"modal fade bs-example-modal-sm\" id=\"newFolderModal\"\n");
      out.write("\t\ttabindex=\"-1\" role=\"dialog\" aria-labelledby=\"newFolderlMolderTitle\">\n");
      out.write("\t\t<div class=\"modal-dialog modal-sm\" role=\"document\">\n");
      out.write("\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\n");
      out.write("\t\t\t\t\t\taria-label=\"Close\">\n");
      out.write("\t\t\t\t\t\t<span aria-hidden=\"true\">&times;</span>\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t<h4 class=\"modal-title\" id=\"newFolderlMolderTitle\">\n");
      out.write("\t\t\t\t\t\t<span class=\"glyphicon glyphicon-folder-open\"></span> 新建文件夹\n");
      out.write("\t\t\t\t\t</h4>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t\t\t<form class=\"form-horizontal\">\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\" id=\"foldernamebox\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"folderid\" id=\"foldernametitle\"\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"col-sm-3 control-label\">名称：</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-9\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"foldername\"\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"请输入新文件夹的名称……\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div id=\"folderalert\" role=\"alert\"></div>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary\"\n");
      out.write("\t\t\t\t\t\tonclick=\"createfolder()\">创建</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t");
      out.write('\n');
      out.write('	');
      out.write("\n");
      out.write("\t<div class=\"modal fade bs-example-modal-sm\" id=\"deleteFolderModal\"\n");
      out.write("\t\ttabindex=\"-1\" role=\"dialog\" aria-labelledby=\"deleteFolderModelTitle\">\n");
      out.write("\t\t<div class=\"modal-dialog modal-sm\" role=\"document\">\n");
      out.write("\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\n");
      out.write("\t\t\t\t\t\taria-label=\"Close\">\n");
      out.write("\t\t\t\t\t\t<span aria-hidden=\"true\">&times;</span>\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t<h4 class=\"modal-title\" id=\"deleteFolderModelTitle\">\n");
      out.write("\t\t\t\t\t\t<span class=\"glyphicon glyphicon-comment\"></span> 删除文件夹\n");
      out.write("\t\t\t\t\t</h4>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t\t\t<h5 id=\"deleteFolderMessage\"></h5>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\n");
      out.write("\t\t\t\t\t<span id=\"deleteFolderBox\"></span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t");
      out.write('\n');
      out.write('	');
      out.write("\n");
      out.write("\t<div class=\"modal fade bs-example-modal-sm\" id=\"renameFolderModal\"\n");
      out.write("\t\ttabindex=\"-1\" role=\"dialog\" aria-labelledby=\"renameFolderMolderTitle\">\n");
      out.write("\t\t<div class=\"modal-dialog modal-sm\" role=\"document\">\n");
      out.write("\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\n");
      out.write("\t\t\t\t\t\taria-label=\"Close\">\n");
      out.write("\t\t\t\t\t\t<span aria-hidden=\"true\">&times;</span>\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t<h4 class=\"modal-title\" id=\"renameFolderMolderTitle\">\n");
      out.write("\t\t\t\t\t\t<span class=\"glyphicon glyphicon-wrench\"></span> 重命名文件夹\n");
      out.write("\t\t\t\t\t</h4>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t\t\t<form class=\"form-horizontal\">\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\" id=\"folderrenamebox\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"folderid\" id=\"foldernametitle\"\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"col-sm-3 control-label\">名称：</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-9\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"newfoldername\"\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"请输入文件夹的名称……\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div id=\"newfolderalert\" role=\"alert\"></div>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\n");
      out.write("\t\t\t\t\t<span id=\"renameFolderBox\"></span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t");
      out.write('\n');
      out.write('	');
      out.write("\n");
      out.write("\t<div class=\"modal fade\" id=\"uploadFileModal\" tabindex=\"-1\"\n");
      out.write("\t\trole=\"dialog\" aria-labelledby=\"uploadFileMolderTitle\">\n");
      out.write("\t\t<div class=\"modal-dialog\" role=\"document\">\n");
      out.write("\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\n");
      out.write("\t\t\t\t\t\taria-label=\"Close\">\n");
      out.write("\t\t\t\t\t\t<span aria-hidden=\"true\">&times;</span>\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t<h4 class=\"modal-title\" id=\"uploadFileMolderTitle\">\n");
      out.write("\t\t\t\t\t\t<span class=\"glyphicon glyphicon-cloud-upload\"></span> 上传文件\n");
      out.write("\t\t\t\t\t</h4>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t\t\t<h5>选择文件：<span id=\"selectcount\"></span></h5>\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"filepath\" class=\"form-control\"\n");
      out.write("\t\t\t\t\t\tonclick=\"checkpath()\" onfocus=\"this.blur()\"\n");
      out.write("\t\t\t\t\t\tplaceholder=\"请点击选择要上传的文件……\"> <input type=\"file\"\n");
      out.write("\t\t\t\t\t\tid=\"uploadfile\" style=\"display: none;\" onchange=\"showfilepath()\"\n");
      out.write("\t\t\t\t\t\tmultiple=\"multiple\"> <br />\n");
      out.write("\t\t\t\t\t<h5>\n");
      out.write("\t\t\t\t\t\t上传进度：<span id=\"filecount\"></span>\n");
      out.write("\t\t\t\t\t</h5>\n");
      out.write("\t\t\t\t\t<div class=\"progress\">\n");
      out.write("\t\t\t\t\t\t<div id=\"pros\" class=\"progress-bar\" role=\"progressbar\"\n");
      out.write("\t\t\t\t\t\t\taria-valuenow=\"0\" aria-valuemin=\"0\" aria-valuemax=\"100\"\n");
      out.write("\t\t\t\t\t\t\tstyle=\"width: 0%;\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"sr-only\"></span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<h5>上传状态：</h5>\n");
      out.write("\t\t\t\t\t<div class=\"panel panel-default\">\n");
      out.write("\t\t\t\t\t\t<div class=\"panel-body\">\n");
      out.write("\t\t\t\t\t\t\t<div id=\"uploadstatus\" class=\"uploadstatusbox\"></div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div id=\"uploadFileAlert\" role=\"alert\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\"\n");
      out.write("\t\t\t\t\t\tonclick='abortUpload()'>取消</button>\n");
      out.write("\t\t\t\t\t<button id=\"umbutton\" type='button' class='btn btn-primary'\n");
      out.write("\t\t\t\t\t\tonclick='checkUploadFile()'>开始上传</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t");
      out.write('\n');
      out.write('	');
      out.write("\n");
      out.write("\t<div class=\"modal fade bs-example-modal-sm\" id=\"downloadModal\"\n");
      out.write("\t\ttabindex=\"-1\" role=\"dialog\" aria-labelledby=\"downloadModelTitle\">\n");
      out.write("\t\t<div class=\"modal-dialog modal-sm\" role=\"document\">\n");
      out.write("\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\n");
      out.write("\t\t\t\t\t\taria-label=\"Close\">\n");
      out.write("\t\t\t\t\t\t<span aria-hidden=\"true\">&times;</span>\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t<h4 class=\"modal-title\" id=\"downloadModelTitle\">\n");
      out.write("\t\t\t\t\t\t<span class=\"glyphicon glyphicon-cloud-download\"></span> 下载\n");
      out.write("\t\t\t\t\t</h4>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t\t\t<h5 id=\"downloadFileName\">提示：您确认要下载文件：[]么？</h5>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\n");
      out.write("\t\t\t\t\t<span id=\"downloadFileBox\"></span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t");
      out.write('\n');
      out.write('	');
      out.write("\n");
      out.write("\t<div class=\"modal fade bs-example-modal-sm\" id=\"deleteFileModal\"\n");
      out.write("\t\ttabindex=\"-1\" role=\"dialog\" aria-labelledby=\"deleteFileModelTitle\">\n");
      out.write("\t\t<div class=\"modal-dialog modal-sm\" role=\"document\">\n");
      out.write("\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\n");
      out.write("\t\t\t\t\t\taria-label=\"Close\">\n");
      out.write("\t\t\t\t\t\t<span aria-hidden=\"true\">&times;</span>\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t<h4 class=\"modal-title\" id=\"deleteFileModelTitle\">\n");
      out.write("\t\t\t\t\t\t<span class=\"glyphicon glyphicon-comment\"></span> 删除文件\n");
      out.write("\t\t\t\t\t</h4>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t\t\t<h5 id=\"deleteFileMessage\"></h5>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\n");
      out.write("\t\t\t\t\t<span id=\"deleteFileBox\"></span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t");
      out.write('\n');
      out.write('	');
      out.write("\n");
      out.write("\t<div class=\"modal fade bs-example-modal-sm\" id=\"renameFileModal\"\n");
      out.write("\t\ttabindex=\"-1\" role=\"dialog\" aria-labelledby=\"renameFileMolderTitle\">\n");
      out.write("\t\t<div class=\"modal-dialog modal-sm\" role=\"document\">\n");
      out.write("\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\n");
      out.write("\t\t\t\t\t\taria-label=\"Close\">\n");
      out.write("\t\t\t\t\t\t<span aria-hidden=\"true\">&times;</span>\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t<h4 class=\"modal-title\" id=\"renameFileMolderTitle\">\n");
      out.write("\t\t\t\t\t\t<span class=\"glyphicon glyphicon-wrench\"></span> 重命名文件\n");
      out.write("\t\t\t\t\t</h4>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t\t\t<form class=\"form-horizontal\">\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\" id=\"filerenamebox\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"folderid\" id=\"filenametitle\"\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"col-sm-3 control-label\">名称：</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-9\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"newfilename\"\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"请输入文件的名称……\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div id=\"newFileNamealert\" role=\"alert\"></div>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\n");
      out.write("\t\t\t\t\t<span id=\"renameFileBox\"></span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t");
      out.write("\n");
      out.write("</body>\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/home.min.js\"></script>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
