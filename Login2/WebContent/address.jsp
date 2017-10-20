<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
 <%@page import="java.util.*,com.neusoft.entity.PageModel,com.neusoft.entity.*"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<html>
	<head>
		<meta charset="utf-8" />
		<title></title>
		<link rel="stylesheet" href="css/NewPage.css" />
	</head>
	<body>
		<form action="insertAddr" method="post">
		<div style="margin-left: 50px; padding-bottom: 10px;">
		  
			省份：<input type="text" name="address1"/>
			城市：<input type="text" name="address2"/>
			区/县：<input type="text" name="address3"/>
			<button>添加</button>
		</div>
		<table  style="text-align: center;" border="1px" width="100%" height="30px">
			<tr>
				<td>地址id</td>
				<td>省份</td>
				<td>城市</td>
				<td>区/县</td>
				<td>操作</td>
			</tr>
			 <%
			 Object obj4=request.getAttribute("cates");
			 if(obj4!=null)
			 {
	        	  PageModel<Address> pageModel=(PageModel<Address>)obj4;
	        	  for(int i=0;i<pageModel.getDatas().size();i++){
	        		  
	        		  %>
			
			<tr>
				<td name="adid"><%=pageModel.getDatas().get(i).getId()%></td>
				<td><%=pageModel.getDatas().get(i).getProvince()%></td>
				<td><%=pageModel.getDatas().get(i).getCity()%></td>
				<td><%=pageModel.getDatas().get(i).getArea()%></td>
				<td><a onclick="javascript:window.location.href='updateAddr?adid=<%=pageModel.getDatas().get(i).getId() %>'">修改</a>
					
				<a onclick="javascript:window.location.href='delAddr?adid=<%=pageModel.getDatas().get(i).getId() %>'">删除</a></td>
			</tr>
					 <%  
	        	  }  
	        		  
	        	  
			 
			 %>
		</table>
		<div id="page">
		
			共<%=pageModel.getTotalcount() %>条记录&nbsp;<%=pageModel.getPageNo() %>/<%=pageModel.getTotalPageSize() %>页&nbsp;&nbsp;
			<a href="getAddrPage?pageNo=1&pageSize=5">首页</a>
			<a href="getAddrPage?pageNo=<%=pageModel.getPageNo()-1==0?pageModel.getPageNo():pageModel.getPageNo()-1%>&pageSize=5">下页</a>
			<a href="getAddrPage?pageNo=<%=pageModel.getPageNo()+1==pageModel.getTotalPageSize()+1?pageModel.getTotalPageSize():pageModel.getPageNo()+1 %>&pageSize=5">上页</a>
		    <a href="getAddrPage?pageNo=<%=pageModel.getTotalPageSize() %>&pageSize=5">尾页</a>&nbsp;&nbsp;
			第&nbsp;<select onChange="if(this.value==this.options[this.options.selectedIndex].value){location='getAddrPage?&pageNo='+this.value+'&pageSize=5'}">
				
				<% 
				if(pageModel!=null){
		        	   int _totalPageSize=pageModel.getTotalPageSize();
		        	   for(int i=0;i<_totalPageSize;i++){
		        		   
		        		   if(pageModel.getPageNo()==(i+1)){%>
	        		    	
		        		    <option value="<%=i+1 %>" selected="selected"><%=(i+1)%></option>
		        		  <%  }else{%>
		        			  <option value="<%=i+1 %>" ><%=(i+1)%></option>
		        		  <%}
		        	   }
		        	   
				}
				
				
				%>
				
			</select>&nbsp;页
		</div>
		</div>
		
		
		
	  <%}%>
		
		
		
		</form>
	</body>
</html>
