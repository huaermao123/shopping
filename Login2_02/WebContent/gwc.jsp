<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page import="java.util.*,com.neusoft.entity.PageModel,com.neusoft.entity.*"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<script type="text/javascript" src="js/jquery-3.2.1.js" ></script>
	</head>
	<style>
		input{
			text-align: center;
			width: 50px;
		}
		#but{
		    margin: auto;
		    width: 200px;
		    height: 30px;
	       border-radius:10px ;
		    border: 1px solid red;
		    margin-top: 50px;
		}
		button{
		    margin: auto;
		    width: 200px;
		    height: 50px;
		    background-color: red;
		    border: 1px solid red;
		 box-shadow: 0px 3px 3px red;
		 border-radius:10px ;
		 color: white;
		 font-size: 20px;
		}
	</style>
	
	
	<script>
		$(function(){
			$("input[type='submit']").click(function(){
				
				
				var d=$("#shuliang").val()
			
				if(d==null||d.length==0){
					alert("不能为空");
				}else{
				alert("是是否更新数量："+d);	
				}
				
				
			})
		})
		
	</script>
	<body>
	<form action="OrderPool.jsp" method="post">
		<table border="1px"  style="text-align: center; width: 100%;">
				
				<input type="text" hidden="hidden" value="${map.uuid }"/>
				<tr>
					<td>商品名</td>
					<td>编号</td>
					<td>价格</td>
					<td>数量/数字</td>
					<td>操作</td>
					
				</tr>
				
				
				<c:forEach items="map" var="course">
				<tr>
					<td>${map.pname}</td>
					<td>${map.pno}</td>
					<td>￥${map.price}</td>
					<td>数量：<input id="shuliang" type="text" value="${map.shuliang}" value="${map.shuliang}"/></td>
					<td><input type="submit" value="更新"/></td>
					
				</tr>
				</c:forEach>
			
		
			</table>
			
			<div id="but"><button>提交订单</button></div>
			</form>
	</body>
</html>
