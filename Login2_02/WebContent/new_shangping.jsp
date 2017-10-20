<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page import="java.util.*,com.neusoft.entity.PageModel,com.neusoft.entity.Product"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<link rel="stylesheet" href="css/new_shangping.css" />
		<link rel="stylesheet" href="css/NewPage.css" />
		
		
			<link rel="stylesheet" href="css/app.css" />
		<link rel="stylesheet" href="css/demo.css" />
		<link rel="stylesheet" href="css/normalize.css" />
	</head>
	<body>
		<p id="he_p"><b>新品展示</b></p>
		<div class="slider">

	<div class="slider-img" >
		<ul class="slider-img-ul">
			<li><img src="images/digua.jpg"></li>
			<li><img src="images/banala.jpg"></li>
			<li><img src="images/timg.jpg"></li>
			<li><img src="images/huanggua.jpg"></li>
			<li><img src="images/liulian.jpg"></li>
			<li><img src="images/80.jpg"></li>
			<li><img src="images/huanggua.jpg"></li>
		</ul>
	</div>
</div>
		
	<script src="js/jquery-1.11.0.min.js" type="text/javascript"></script>
<script type="text/javascript" src="js/xSlider.js"></script>	
		
		
		
		<form action="gwcServlet" method="post">
		<div id="big_div">
		 <%
			 Object obj3=request.getAttribute("cates");
			 if(obj3!=null)
			 {
	        	  PageModel<Product> pageModel=(PageModel<Product>)obj3;
	        	  for(int i=0;i<pageModel.getDatas().size();i++){
	        		  
	        		  %>
			<div class="div_1">
			<input hidden="hidden" value="<%=pageModel.getDatas().get(i).getCid() %>"/>
				<div class="img"><img src="img/<%=pageModel.getDatas().get(i).getPic() %>"/></div>
				<p><%=pageModel.getDatas().get(i).getPname() %></p></br>
			   <input name="pname" hidden="hidden" value="<%=pageModel.getDatas().get(i).getPname() %>"/>
				
				<span hidden="hidden">详情：<%=pageModel.getDatas().get(i).getPdetail() %></span>
				<input hidden="hidden" value="<%=pageModel.getDatas().get(i).getOnline() %>"/>该上商品已经上线
				<input  name="pno" hidden="hidden" value="<%=pageModel.getDatas().get(i).getPno() %>"/>
				<p>￥<%=pageModel.getDatas().get(i).getPrice() %></p>
				<input name="price" hidden="hidden" value="<%=pageModel.getDatas().get(i).getPrice() %>"/>
				<p class="shuliang"><span>数量</span><input name="shuliang" type="text"/><button>购买</button></p>
			</div>
			
					 <%  
	        		  
	        	  }  
	        	  
			 
			 %>
				
			
		
		</div>
		
		
		
		<div id="page">
		
			共<%=pageModel.getTotalcount() %>条记录&nbsp;<%=pageModel.getPageNo() %>/<%=pageModel.getTotalPageSize() %>页&nbsp;&nbsp;
			<a href="getProPage?pageNo=1&pageSize=7">首页</a>
			<a href="getProPage?pageNo=<%=pageModel.getPageNo()-1==0?pageModel.getPageNo():pageModel.getPageNo()-1%>&pageSize=7">下页</a>
			<a href="getProPage?pageNo=<%=pageModel.getPageNo()+1==pageModel.getTotalPageSize()+1?pageModel.getTotalPageSize():pageModel.getPageNo()+1 %>&pageSize=7">上页</a>
		    <a href="getProPage?pageNo=<%=pageModel.getTotalPageSize() %>&pageSize=7">尾页</a>&nbsp;&nbsp;
			第&nbsp;<select onChange="if(this.value==this.options[this.options.selectedIndex].value){location='getProPage?&pageNo='+this.value+'&pageSize=7'}">
				
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