<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	<body>
		<div>
			<p>商品的修改</p>
		</div>
		
		<form action="updatePro" method="post" >
			
			<table border="1px" width="800px"  height="300px">
			
					<tr>
						<td>商品名称</td>
						<td><input name="pname" type="text"/></td>
					</tr>
					<tr>
						<td>所属类别</td>
						<td><input name="scid" type="text"/></td>
					</tr>
					<tr>
						<td>货号</td>
						<td><input  name="pno" type="text"/></td>
					</tr>
					
					<tr>
						<td>上传图片</td>
						<td>
						<label class="control-label">Select File
				<input name="pic" id="input-1" type="file" class="file"/>
				</label>
						</td>
					</tr>
					
					<tr>
						<td>商品价格</td>
						<td><input  name="sprice" type="text"/></td>
					</tr>
					<tr>
						<td>是否上线</td>
						<td><input  type="radio" name="sonline" value="1"/>上线
						<input  type="radio" name="sonline" value="2"/>下线
						</td>
					</tr>
					
					<tr>
						<td>商品详情</td>
						<td><textarea name="pdetail" id="editor1" name="editor1" value="商品的描述"></textarea></td>
					</tr>
					<tr>
						<td colspan="2" ><button>提交</button></td>
					</tr>
				
				
				
			</table>
		</form>
	</body>
</html>
