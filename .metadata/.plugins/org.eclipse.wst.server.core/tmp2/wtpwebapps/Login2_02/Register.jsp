<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<link rel="stylesheet" href="css/Register.css" />
		<script type="text/javascript" src="js/jquery-3.2.1.js" ></script>
		<script>
			$(function(){
				$("input[type='submit']").click(function(){
				   var dd=$("input:first").val();
					    
					 if(dd.length==0||dd==null){
					    alert("您输入有误，请重新输入");
					    return;
					 }
				})
			})
		</script>
	</head>
	<body>
		<div id="_head"><p id="head">欢迎注册</p><p><a href="Login.jsp"><span>已经有账号?</span>请登录 ></a></p></div>
		<form  action="addCons" method="post">
		<div id="table">
		       <div id="biaokaung">
				<div id="tb_01">
					
					<div><span class="pagename">用户名</span><input name="h_name" type="text" placeholder="你的账户名和登录名"/></div>
				</div>
				
				<div id="tb_02">
					
					<div><span class="pagename">设置密码</span><input type="password" placeholder="建议至少使用两种字符组合"/></div>
				</div>
				<div id="tb_03">
					
					<div><span class="pagename">确认密码</span><input name="h_psw" type="password" placeholder="再次输入密码"/></div>
				</div>
				<div id="tb_04">
					<div colspan="2"><input type="submit" value="立即注册"/></div>
						
				</div>
				</div>
			
		</div>	
		</form>		
				
		<div id="foot">
			<div id="ul">
			<ul>
			<li><a href="#">关于我们</a></li>
			<li><a href="#">联系我们</a></li>
			<li><a href="#">人才招聘</a></li>
			<li><a href="#">商家入驻</a></li>
			<li><a href="#">广告服务</a></li>
			<li><a href="#">友情链接</a></li>
		    <li><a href="#">公益活动</a></li>
		    <li><a href="#">English Site1</a></li>
		    <li><a href="#">广告销售</a></li>
			<li><a href="#">友情联系</a></li>
		    <li><a href="#">公益出资</a></li>
		    
			</ul>
			<div>
			<p>Copyright © 2004-2017  本网站 版权所有</p>
			
		</div>
	</body>
</html>
