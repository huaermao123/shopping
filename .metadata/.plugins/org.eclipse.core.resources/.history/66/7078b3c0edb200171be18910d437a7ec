<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page import="java.util.*,com.neusoft.entity.PageModel,com.neusoft.entity.Product"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<link rel="stylesheet" href="css/NewPage.css" />
		
	</head>
	<body>
		<form action="updateServlet" method="post">
		<div style="margin-left: 50px; padding-bottom: 10px;">
		    
			<div style="width: 50px;background-color:#aaa;line-height: 30px;height: 30px; border: 1px solid #aaa; box-shadow:0px,5px,10px red ; text-align: center;border-radius: 10px;"><a href="addPro.jsp">添加</a></div>
		</div>
		<table  style="text-align: center;" border="1px" width="100%" height="30px">
			<tr>
				<td colspan="7">商品表</td>
			</tr>
			<tr>
				<td>商品id</td>
				<td>货号</td>
				<td>商品图片</td>
				<td>商品价格</td>
				<td>上线 /下线</td>
			    <td>商品详情</td>
			    <td>操作</td>
			</tr>
			 <%
			 Object obj3=request.getAttribute("cates");
			 if(obj3!=null)
			 {
	        	  PageModel<Product> pageModel=(PageModel<Product>)obj3;
	        	  for(int i=0;i<pageModel.getDatas().size();i++){
	        		  
	        		  %>
	      			<tr>
	      		
	      				<td name="cid"><%=pageModel.getDatas().get(i).getCid() %></td>
	      				<td><%=pageModel.getDatas().get(i).getPno() %></td>
	      				<td><%=pageModel.getDatas().get(i).getPic() %></td>
	      				<td><%=pageModel.getDatas().get(i).getPrice() %></td>
	      				<td><%=pageModel.getDatas().get(i).getOnline() %></td>
	      			    <td><%=pageModel.getDatas().get(i).getPdetail() %></td>
	      				<td><a href="updatePro.jsp">修改</a>
	      					
	      				<a onclick="javascript:window.location.href='delPro?cid=<%=pageModel.getDatas().get(i).getCid() %>'">删除</a></td>
	      			</tr>
	      			 <%  
	        		  
	        		  
	        	  }
			 
			 %>
	
          
		</table>
		
		<div id="page">
		
			共<%=pageModel.getTotalcount() %>条记录&nbsp;<%=pageModel.getPageNo() %>/<%=pageModel.getTotalPageSize() %>页&nbsp;&nbsp;
			<a href="getProPage?pageNo=1&pageSize=5">首页</a>
			<a href="getProPage?pageNo=<%=pageModel.getPageNo()-1==0?pageModel.getPageNo():pageModel.getPageNo()-1%>&pageSize=5">下页</a>
			<a href="getProPage?pageNo=<%=pageModel.getPageNo()+1==pageModel.getTotalPageSize()+1?pageModel.getTotalPageSize():pageModel.getPageNo()+1 %>&pageSize=5">上页</a>
		    <a href="getProPage?pageNo=<%=pageModel.getTotalPageSize() %>&pageSize=5">尾页</a>&nbsp;&nbsp;
			第&nbsp;<select onChange="if(this.value==this.options[this.options.selectedIndex].value){location='getProPage?&pageNo='+this.value+'&pageSize=5'}">
				
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
