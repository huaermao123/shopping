<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page import="java.util.*,com.neusoft.entity.PageModel,com.neusoft.entity.*"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title></title>
		<link rel="stylesheet" href="css/index.css" />    
		<link rel="stylesheet" href="css/gouwuche.css" />
		<script type="text/javascript" src="js/_ll.js" ></script>
		<link rel="stylesheet" href="css/xiala.css" />
	</head>
	<body>
		
		<div id="top">
			<ul>
				<li><a href="AfterIndex.jsp">首页</a></li>
				<li id="denglu"><a href="index.jsp">注销</a></li>
				<li><a href="Register.jsp">管理我的消息</a></li>
				<li><a href="gouwuche.jsp">购物车</a></li>
				<li><a href="#">联系我们</a></li>
			</ul>
		</div>
		
		
		
	    
	    <div id="qpsp">
	    	<p class="_p">全部商品分类</p>
	    </div>
	    
	    
	   <div id="shang_left">
	    	
	    	
	    
	    	<div id="lb_01">
		    <img id="_img" onclick="_ll()" src="img/chu.png" width="30px" height="30px"/><p><a href="#">电脑/笔记本</a></p>
		    </div>
		    
	    	<div id="shop_class" >
	    	<ul>
	    		<li><a href="#">神州计算机</a></li>
	    		<li><a href="#">华硕计算机</a></li>
	    		<li><a href="#">联想计算机</a></li>
	    		<li><a href="#">惠普计算机</a></li>
	    		<li><a href="#">红旗计算机</a></li>
	    		<li><a href="#">苹果计算机</a></li>
	    	</ul>
	    	</div>
	    	
	    	
	    	
	    	
	    	<div id="lb_01">
		    <img id="_img2" onclick="_ll2()" src="img/chu.png" width="30px" height="30px"/><p><a href="#">水果/蔬菜</a></p>
		    </div>
		    
	    	<div id="shop_class2"  >
	    	<ul>
	    		<li><a href="#">苹果</a></li>
	    		<li><a href="#">白菜</a></li>
	    		<li><a href="#">黄瓜</a></li>
	    		<li><a href="#">青菜</a></li>
	    		<li><a href="#">香蕉</a></li>
	    		<li><a href="#">梨</a></li>
	    	</ul>
	    	</div>
	    	
	    </div>
	    
	  
	  
	  
	  
	  
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	
	
		
		
		
		
		
		
		
		
		<form action="" method="post">
		<div id="gwcxx">
			<table border="1px"  style="text-align: center;">
				
				<tr>
				     <td>商品名</td>
					<td>商品编号</td>
					<td>价格</td>
					<td>数量/数字</td>
					<td>操作</td>
					
				</tr>
				<c:forEach items="map" var="course">
				<tr>
					<td>${map.pname}</td>
					<td>${map.pno}</td>
					<td>￥${map.price}</td>
					<td>数量：<input type="text" value="${map.shuliang}" value="${map.shuliang}"/></td>
					<td><input type="submit" value="更新"/></td>
					
				</tr>
				</c:forEach>
				<tr>
					<td>花</td>
					<td>￥233</td>
					<td>数量：<input type="text" placeholder="4" value=""/></td>
					<td><input type="submit" value="更新"/></td>
					
				</tr>
			</table>
			<div id="tj_b"><button>提交订单</button></div>
		</div>
		</form>
	</body>
</html>
