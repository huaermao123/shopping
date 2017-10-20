<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page import="java.util.*,com.neusoft.entity.PageModel,com.neusoft.entity.*"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<link rel="stylesheet" href="css/Register.css" />
		<link rel="stylesheet" href="css/OrderPool.css" />
		<script type="text/javascript" src="js/jquery-3.2.1.js" ></script>
		
		
		
		 <script>
        $(function () {
            $.ajax({
                url: './region.json',
                type: 'get',
                success: function (data) {
                    console.log(data);
                    //添加省
                    var pJson = data.p["000000"];
                    // console.log(pJson);
                    var pOption = "";
                    //清空下拉列表
                    $("#p option:eq(0)").nextAll().remove();
                    for (var k in pJson) {
                        pOption += '<option value="' + k + '">' + pJson[k] + '</option>';
                    }
                    $("#p").append(pOption);
                    //添加市
                    $("#p").change(function () {
                        var pVal = $(this).val();
                        //    console.log(pVal);
                        var cJson = data.c[pVal];
                        // console.log(cJson);
                        var cOption = "";
                        //请求下拉框
                        $("#c option:eq(0)").nextAll().remove();
                        for (var k in cJson) {
                            cOption += '<option value="' + k + '">' + cJson[k] +
                                '</option>';
                        }
                        $("#c").append(cOption);
                    })
                    //添加县
                    $("#c").change(function () {
                        var cVal = $(this).val();
                        //    console.log(pVal);
                        var dJson = data.d[cVal];
                        // console.log(cJson);
                        var dOption = "";
                        //清除下拉框
                        $("#d option:eq(0)").nextAll().remove();
                        for (var k in dJson) {
                            dOption += '<option value="' + k + '">' + dJson[k] +
                                '</option>';
                        }
                        $("#d").append(dOption);
                    })
                }
            })
          
        })
    </script>
	</head>
	<body>
	    <form action="addOrder" method="post">
	     <div id="head"><p><b>订单信息:${map.uuid }</b></p></div>
	    
		 <input name="orderno"  hidden="hidden" type="text" value="${map.uuid }"/>		
		
	     	<input name="ordertime"  type="text" hidden="hidden" value="1062626636"/>
	     	<input name="paytime"  type="text" hidden="hidden" value="188888886636"/>
	     
	     <p class="tx">请在<span>18分02秒</span>内提交订单，下单后您另有30分钟的支付时间</p>
	     
	 
	     <div id="heng_01">
	     	<p>收货信息</p>
	     	
	     	<div id="addr">
	     		<table  id="bigtable" cellpadding="0px" cellspacing="30px">
	     			<tr>
	     				<td>
	     			<input name="addrinfo"  type="text" hidden="hidden" value="1"/>
	     			<table width="500px">
							     			<tr>
							     				<td><img src="img/1.png"/></td>
							     					<input name="aid" hidden="hidden" value="5"/>
							     				
							     				<input name="nickname" hidden="hidden" value="${namePsw.loginname}"/>
							     				<td>${namePsw.loginname}</td>
							     			</tr>
							     			<tr>
							     				<td><img src="img/2.png"/></td>
							     		  <td> 
							     					
							     					<select name="p" id="p">
						             <option value="000000">---省---</option>
						                    <!-- <option value="100">河南省</option>
						                    <option value="200">山西省</option> -->
						                    
						                    
						                </select>
						        <select name="c" id="c">
						            <option value="">---市---</option>
						                    <!-- <option value="101">郑州市</option>
						                    <option value="102">洛阳市</option> -->
						         </select>
						        <select name="d" id="d">
						            <option value="">---县---</option>
						                    <!-- <option value="101">郑州市</option>
						                    <option value="102">洛阳市</option> -->
						        </select>
							     			</td>
							     			</tr>	
							     			<tr>		
							     				<td><img src="img/3.png"/></td>
							     				<td><input type="text"  placeholder="联系电话"/></td>
							     			</tr>
							     			<tr>	
							     				<td><img src="img/4.png"/></td>
							     				<td>收货时间不限</td>
							     			</tr>
							     			<tr>	
							     				<td><img src="img/4.png"/></td>
							     				<td>地址详情：<input type="text" value=""/></td>
							     			</tr>
	     		</table>
	     					
	     					
	     					
	     				
	     			
	     				</td>
	     				</tr>
	     			
	     		
	     			
	     			
	     			
	     			
	     		</table>
	     		
	     		
	     		
	     	</div>
	     	
	     </div>
	     
	     
	     
	       <div id="heng_02">
	       	<p class="zffs">支付方式</p>
	       	<p id="_span">你需要支付<span>118</span>元</p>
	       	<p id="zfxs"> 
	       		<input name="paystatus"  type="radio"  value="0"/>在线支付
	       		
	       	     <input name="paystatus"   type="radio" value="1"/>货到付款
	       	</p>
	     </div>
	      <script>
	     	$(function(){
	     		
	     			
	     			var dd=$("td a[title='取消购买+${map.pno}']").click(function(){
	     				
	     			
	     				
	     				$("#sp_order tr:last-child").detach();
	     				
	     				
	     			})
	     			
	     		
	     	})
	     	
	     </script>
	     
	     
	     
	      <div id="heng_03">
	      	<p class="ddsp">订单商品信息</p>
	      	<table id="sp_order" border="1px" width="1500px" style="text-align: center;">
	      		<tr>
	      			<th>商品信息</th>
	      			<th>商品号</th>
	      			<th>单价</th>
	      			<th>数量</th>
	      			<th>小计</th>
	      			<th>操作</th>
	      			  <th>订单备注</th>
	      		</tr>
	      		<c:forEach items="map" var="course">
	      			<tr>
	      			<td>${map.pname}</td>
	      			<td>${map.pno}</td>
	      			<td>￥${map.price}</td>
	      			<td>${map.shuliang}</td>
	      			<td>${map.shuliang}*${map.price}</td>
	      			<td><a href="#" title="取消购买+${map.pno}">取消购买</a></td>
	      			<td><input name="mask" type="text"/></td>
	      		</tr>
	      		</c:forEach>
	      	
	      	
	      	</table>
	      </div>
	  
	      <div id="tj">
	      	 <div class="left">
	      	 	<p>收货状态：xxx 132122xxx1197 天津市河西区东湖XX,收货时间不限</p>
	      	 	<p>支付方式：在线支付</p>
	      	 	
	      	 <p><input type="checkbox" checked="checked"/>默认需要发票</p>
	      	 <p class="time"><span>请在18分00,内提交订单</span></p>
	      	
	      	
	      	 </div>
	      	 
	      	 <div class="right">
	      	 	<table  width="400px" height="300px">
	      	 		<tr>
	      	 			<td>商品金额</td>
	      	 		<input name="money" hidden="hidden" value="${map.price}"/>
	      	 		<input name="lasttime" hidden="hidden" value="11848494948545"/>
	      	 			
	      	 			<td>￥${map.shuliang}*${map.price}</td>
	      	 		</tr>
	      	 		<tr>
	      	 			<td>商品运费</td>
	      	 			<td>￥0</td>
	      	 		</tr>
	      	 		<tr>
	      	 			<td>商品优惠券</td>
	      	 			<td>￥0</td>
	      	 		</tr>
	      	 		<tr>
	      	 			<td>活动优惠</td>
	      	 			<td>￥0</td>
	      	 		</tr>
	      	 	</table>
	      	 	<div id="daitj"><p>　　　待提交<b>　　　　　　　　￥${map.shuliang}*${map.price}</b></p> </div>
	      	     <input name="orderstaus"  type="text" hidden="hidden" value="1"/>
	  
	      	     <div id="tjdd"><input type="submit"  value="提交订单"/></div>
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
