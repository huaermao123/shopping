/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.20
 * Generated at: 2017-10-20 01:45:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.neusoft.entity.PageModel;
import com.neusoft.entity.*;

public final class OrderPool_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/D:/LuoJiSiWei_Shoping/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/Login2_02/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098682290000L));
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1506583284000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("com.neusoft.entity");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.neusoft.entity.PageModel");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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

      out.write("\r\n");
      out.write("     \r\n");
      out.write("     \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t\t<title></title>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/Register.css\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/OrderPool.css\" />\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/jquery-3.2.1.js\" ></script>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t <script>\r\n");
      out.write("        $(function () {\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                url: './region.json',\r\n");
      out.write("                type: 'get',\r\n");
      out.write("                success: function (data) {\r\n");
      out.write("                    console.log(data);\r\n");
      out.write("                    //添加省\r\n");
      out.write("                    var pJson = data.p[\"000000\"];\r\n");
      out.write("                    // console.log(pJson);\r\n");
      out.write("                    var pOption = \"\";\r\n");
      out.write("                    //清空下拉列表\r\n");
      out.write("                    $(\"#p option:eq(0)\").nextAll().remove();\r\n");
      out.write("                    for (var k in pJson) {\r\n");
      out.write("                        pOption += '<option value=\"' + k + '\">' + pJson[k] + '</option>';\r\n");
      out.write("                    }\r\n");
      out.write("                    $(\"#p\").append(pOption);\r\n");
      out.write("                    //添加市\r\n");
      out.write("                    $(\"#p\").change(function () {\r\n");
      out.write("                        var pVal = $(this).val();\r\n");
      out.write("                        //    console.log(pVal);\r\n");
      out.write("                        var cJson = data.c[pVal];\r\n");
      out.write("                        // console.log(cJson);\r\n");
      out.write("                        var cOption = \"\";\r\n");
      out.write("                        //请求下拉框\r\n");
      out.write("                        $(\"#c option:eq(0)\").nextAll().remove();\r\n");
      out.write("                        for (var k in cJson) {\r\n");
      out.write("                            cOption += '<option value=\"' + k + '\">' + cJson[k] +\r\n");
      out.write("                                '</option>';\r\n");
      out.write("                        }\r\n");
      out.write("                        $(\"#c\").append(cOption);\r\n");
      out.write("                    })\r\n");
      out.write("                    //添加县\r\n");
      out.write("                    $(\"#c\").change(function () {\r\n");
      out.write("                        var cVal = $(this).val();\r\n");
      out.write("                        //    console.log(pVal);\r\n");
      out.write("                        var dJson = data.d[cVal];\r\n");
      out.write("                        // console.log(cJson);\r\n");
      out.write("                        var dOption = \"\";\r\n");
      out.write("                        //清除下拉框\r\n");
      out.write("                        $(\"#d option:eq(0)\").nextAll().remove();\r\n");
      out.write("                        for (var k in dJson) {\r\n");
      out.write("                            dOption += '<option value=\"' + k + '\">' + dJson[k] +\r\n");
      out.write("                                '</option>';\r\n");
      out.write("                        }\r\n");
      out.write("                        $(\"#d\").append(dOption);\r\n");
      out.write("                    })\r\n");
      out.write("                }\r\n");
      out.write("            })\r\n");
      out.write("          \r\n");
      out.write("        })\r\n");
      out.write("    </script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t    <form action=\"addOrder\" method=\"post\">\r\n");
      out.write("\t     <div id=\"head\"><p><b>订单信息:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${map.uuid }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</b></p></div>\r\n");
      out.write("\t    \r\n");
      out.write("\t\t <input name=\"orderno\"  hidden=\"hidden\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${map.uuid }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/>\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t     \t<input name=\"ordertime\"  type=\"text\" hidden=\"hidden\" value=\"1062626636\"/>\r\n");
      out.write("\t     \t<input name=\"paytime\"  type=\"text\" hidden=\"hidden\" value=\"188888886636\"/>\r\n");
      out.write("\t     \r\n");
      out.write("\t     <p class=\"tx\">请在<span>18分02秒</span>内提交订单，下单后您另有30分钟的支付时间</p>\r\n");
      out.write("\t     \r\n");
      out.write("\t \r\n");
      out.write("\t     <div id=\"heng_01\">\r\n");
      out.write("\t     \t<p>收货信息</p>\r\n");
      out.write("\t     \t\r\n");
      out.write("\t     \t<div id=\"addr\">\r\n");
      out.write("\t     \t\t<table  id=\"bigtable\" cellpadding=\"0px\" cellspacing=\"30px\">\r\n");
      out.write("\t     \t\t\t<tr>\r\n");
      out.write("\t     \t\t\t\t<td>\r\n");
      out.write("\t     \t\t\t<input name=\"addrinfo\"  type=\"text\" hidden=\"hidden\" value=\"1\"/>\r\n");
      out.write("\t     \t\t\t<table width=\"500px\">\r\n");
      out.write("\t\t\t\t\t\t\t     \t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t     \t\t\t\t<td><img src=\"img/1.png\"/></td>\r\n");
      out.write("\t\t\t\t\t\t\t     \t\t\t\t\t<input name=\"aid\" hidden=\"hidden\" value=\"5\"/>\r\n");
      out.write("\t\t\t\t\t\t\t     \t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t     \t\t\t\t<input name=\"nickname\" hidden=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${namePsw.loginname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("\t\t\t\t\t\t\t     \t\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${namePsw.loginname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t     \t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t     \t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t     \t\t\t\t<td><img src=\"img/2.png\"/></td>\r\n");
      out.write("\t\t\t\t\t\t\t     \t\t  <td> \r\n");
      out.write("\t\t\t\t\t\t\t     \t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t     \t\t\t\t\t<select name=\"p\" id=\"p\">\r\n");
      out.write("\t\t\t\t\t\t             <option value=\"000000\">---省---</option>\r\n");
      out.write("\t\t\t\t\t\t                    <!-- <option value=\"100\">河南省</option>\r\n");
      out.write("\t\t\t\t\t\t                    <option value=\"200\">山西省</option> -->\r\n");
      out.write("\t\t\t\t\t\t                    \r\n");
      out.write("\t\t\t\t\t\t                    \r\n");
      out.write("\t\t\t\t\t\t                </select>\r\n");
      out.write("\t\t\t\t\t\t        <select name=\"c\" id=\"c\">\r\n");
      out.write("\t\t\t\t\t\t            <option value=\"\">---市---</option>\r\n");
      out.write("\t\t\t\t\t\t                    <!-- <option value=\"101\">郑州市</option>\r\n");
      out.write("\t\t\t\t\t\t                    <option value=\"102\">洛阳市</option> -->\r\n");
      out.write("\t\t\t\t\t\t         </select>\r\n");
      out.write("\t\t\t\t\t\t        <select name=\"d\" id=\"d\">\r\n");
      out.write("\t\t\t\t\t\t            <option value=\"\">---县---</option>\r\n");
      out.write("\t\t\t\t\t\t                    <!-- <option value=\"101\">郑州市</option>\r\n");
      out.write("\t\t\t\t\t\t                    <option value=\"102\">洛阳市</option> -->\r\n");
      out.write("\t\t\t\t\t\t        </select>\r\n");
      out.write("\t\t\t\t\t\t\t     \t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t     \t\t\t</tr>\t\r\n");
      out.write("\t\t\t\t\t\t\t     \t\t\t<tr>\t\t\r\n");
      out.write("\t\t\t\t\t\t\t     \t\t\t\t<td><img src=\"img/3.png\"/></td>\r\n");
      out.write("\t\t\t\t\t\t\t     \t\t\t\t<td><input type=\"text\"  placeholder=\"联系电话\"/></td>\r\n");
      out.write("\t\t\t\t\t\t\t     \t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t     \t\t\t<tr>\t\r\n");
      out.write("\t\t\t\t\t\t\t     \t\t\t\t<td><img src=\"img/4.png\"/></td>\r\n");
      out.write("\t\t\t\t\t\t\t     \t\t\t\t<td>收货时间不限</td>\r\n");
      out.write("\t\t\t\t\t\t\t     \t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t     \t\t\t<tr>\t\r\n");
      out.write("\t\t\t\t\t\t\t     \t\t\t\t<td><img src=\"img/4.png\"/></td>\r\n");
      out.write("\t\t\t\t\t\t\t     \t\t\t\t<td>地址详情：<input type=\"text\" value=\"\"/></td>\r\n");
      out.write("\t\t\t\t\t\t\t     \t\t\t</tr>\r\n");
      out.write("\t     \t\t</table>\r\n");
      out.write("\t     \t\t\t\t\t\r\n");
      out.write("\t     \t\t\t\t\t\r\n");
      out.write("\t     \t\t\t\t\t\r\n");
      out.write("\t     \t\t\t\t\r\n");
      out.write("\t     \t\t\t\r\n");
      out.write("\t     \t\t\t\t</td>\r\n");
      out.write("\t     \t\t\t\t</tr>\r\n");
      out.write("\t     \t\t\t\r\n");
      out.write("\t     \t\t\r\n");
      out.write("\t     \t\t\t\r\n");
      out.write("\t     \t\t\t\r\n");
      out.write("\t     \t\t\t\r\n");
      out.write("\t     \t\t\t\r\n");
      out.write("\t     \t\t</table>\r\n");
      out.write("\t     \t\t\r\n");
      out.write("\t     \t\t\r\n");
      out.write("\t     \t\t\r\n");
      out.write("\t     \t</div>\r\n");
      out.write("\t     \t\r\n");
      out.write("\t     </div>\r\n");
      out.write("\t     \r\n");
      out.write("\t     \r\n");
      out.write("\t     \r\n");
      out.write("\t       <div id=\"heng_02\">\r\n");
      out.write("\t       \t<p class=\"zffs\">支付方式</p>\r\n");
      out.write("\t       \t<p id=\"_span\">你需要支付<span>118</span>元</p>\r\n");
      out.write("\t       \t<p id=\"zfxs\"> \r\n");
      out.write("\t       \t\t<input name=\"paystatus\"  type=\"radio\"  value=\"0\"/>在线支付\r\n");
      out.write("\t       \t\t\r\n");
      out.write("\t       \t     <input name=\"paystatus\"   type=\"radio\" value=\"1\"/>货到付款\r\n");
      out.write("\t       \t</p>\r\n");
      out.write("\t     </div>\r\n");
      out.write("\t      <script>\r\n");
      out.write("\t     \t$(function(){\r\n");
      out.write("\t     \t\t\r\n");
      out.write("\t     \t\t\t\r\n");
      out.write("\t     \t\t\tvar dd=$(\"td a[title='取消购买+");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${map.pno}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("']\").click(function(){\r\n");
      out.write("\t     \t\t\t\t\r\n");
      out.write("\t     \t\t\t\r\n");
      out.write("\t     \t\t\t\t\r\n");
      out.write("\t     \t\t\t\t$(\"#sp_order tr:last-child\").detach();\r\n");
      out.write("\t     \t\t\t\t\r\n");
      out.write("\t     \t\t\t\t\r\n");
      out.write("\t     \t\t\t})\r\n");
      out.write("\t     \t\t\t\r\n");
      out.write("\t     \t\t\r\n");
      out.write("\t     \t})\r\n");
      out.write("\t     \t\r\n");
      out.write("\t     </script>\r\n");
      out.write("\t     \r\n");
      out.write("\t     \r\n");
      out.write("\t     \r\n");
      out.write("\t      <div id=\"heng_03\">\r\n");
      out.write("\t      \t<p class=\"ddsp\">订单商品信息</p>\r\n");
      out.write("\t      \t<table id=\"sp_order\" border=\"1px\" width=\"1500px\" style=\"text-align: center;\">\r\n");
      out.write("\t      \t\t<tr>\r\n");
      out.write("\t      \t\t\t<th>商品信息</th>\r\n");
      out.write("\t      \t\t\t<th>商品号</th>\r\n");
      out.write("\t      \t\t\t<th>单价</th>\r\n");
      out.write("\t      \t\t\t<th>数量</th>\r\n");
      out.write("\t      \t\t\t<th>小计</th>\r\n");
      out.write("\t      \t\t\t<th>操作</th>\r\n");
      out.write("\t      \t\t\t  <th>订单备注</th>\r\n");
      out.write("\t      \t\t</tr>\r\n");
      out.write("\t      \t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t      \t\r\n");
      out.write("\t      \t\r\n");
      out.write("\t      \t</table>\r\n");
      out.write("\t      </div>\r\n");
      out.write("\t  \r\n");
      out.write("\t      <div id=\"tj\">\r\n");
      out.write("\t      \t <div class=\"left\">\r\n");
      out.write("\t      \t \t<p>收货状态：xxx 132122xxx1197 天津市河西区东湖XX,收货时间不限</p>\r\n");
      out.write("\t      \t \t<p>支付方式：在线支付</p>\r\n");
      out.write("\t      \t \t\r\n");
      out.write("\t      \t <p><input type=\"checkbox\" checked=\"checked\"/>默认需要发票</p>\r\n");
      out.write("\t      \t <p class=\"time\"><span>请在18分00,内提交订单</span></p>\r\n");
      out.write("\t      \t\r\n");
      out.write("\t      \t\r\n");
      out.write("\t      \t </div>\r\n");
      out.write("\t      \t \r\n");
      out.write("\t      \t <div class=\"right\">\r\n");
      out.write("\t      \t \t<table  width=\"400px\" height=\"300px\">\r\n");
      out.write("\t      \t \t\t<tr>\r\n");
      out.write("\t      \t \t\t\t<td>商品金额</td>\r\n");
      out.write("\t      \t \t\t<input name=\"money\" hidden=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${map.price}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("\t      \t \t\t<input name=\"lasttime\" hidden=\"hidden\" value=\"11848494948545\"/>\r\n");
      out.write("\t      \t \t\t\t\r\n");
      out.write("\t      \t \t\t\t<td>￥");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${map.shuliang}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write('*');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${map.price}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("\t      \t \t\t</tr>\r\n");
      out.write("\t      \t \t\t<tr>\r\n");
      out.write("\t      \t \t\t\t<td>商品运费</td>\r\n");
      out.write("\t      \t \t\t\t<td>￥0</td>\r\n");
      out.write("\t      \t \t\t</tr>\r\n");
      out.write("\t      \t \t\t<tr>\r\n");
      out.write("\t      \t \t\t\t<td>商品优惠券</td>\r\n");
      out.write("\t      \t \t\t\t<td>￥0</td>\r\n");
      out.write("\t      \t \t\t</tr>\r\n");
      out.write("\t      \t \t\t<tr>\r\n");
      out.write("\t      \t \t\t\t<td>活动优惠</td>\r\n");
      out.write("\t      \t \t\t\t<td>￥0</td>\r\n");
      out.write("\t      \t \t\t</tr>\r\n");
      out.write("\t      \t \t</table>\r\n");
      out.write("\t      \t \t<div id=\"daitj\"><p>　　　待提交<b>　　　　　　　　￥");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${map.shuliang}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write('*');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${map.price}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</b></p> </div>\r\n");
      out.write("\t      \t     <input name=\"orderstaus\"  type=\"text\" hidden=\"hidden\" value=\"1\"/>\r\n");
      out.write("\t  \r\n");
      out.write("\t      \t     <div id=\"tjdd\"><input type=\"submit\"  value=\"提交订单\"/></div>\r\n");
      out.write("\t      \t </div>\r\n");
      out.write("\t      \t\r\n");
      out.write("\t      </div>\r\n");
      out.write("\t     </form>\r\n");
      out.write("\t     \r\n");
      out.write("\t\t\t<div id=\"foot\">\r\n");
      out.write("\t\t\t<div id=\"ul\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t<li><a href=\"#\">关于我们</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\">联系我们</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\">人才招聘</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\">商家入驻</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\">广告服务</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\">友情链接</a></li>\r\n");
      out.write("\t\t    <li><a href=\"#\">公益活动</a></li>\r\n");
      out.write("\t\t    <li><a href=\"#\">English Site1</a></li>\r\n");
      out.write("\t\t    <li><a href=\"#\">广告销售</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\">友情联系</a></li>\r\n");
      out.write("\t\t    <li><a href=\"#\">公益出资</a></li>\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t<p>Copyright © 2004-2017  本网站 版权所有</p>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /OrderPool.jsp(197,9) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems("map");
      // /OrderPool.jsp(197,9) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("course");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t      \t\t\t<tr>\r\n");
            out.write("\t      \t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${map.pname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t      \t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${map.pno}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t      \t\t\t<td>￥");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${map.price}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t      \t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${map.shuliang}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t      \t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${map.shuliang}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write('*');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${map.price}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t      \t\t\t<td><a href=\"#\" title=\"取消购买+");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${map.pno}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\">取消购买</a></td>\r\n");
            out.write("\t      \t\t\t<td><input name=\"mask\" type=\"text\"/></td>\r\n");
            out.write("\t      \t\t</tr>\r\n");
            out.write("\t      \t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}