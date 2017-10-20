package com.neusoft.test;

import java.util.List;
import java.util.UUID;

import com.neusoft.dao.impl.OrderinfoDaoImpl;
import com.neusoft.entity.Orderinfo;
import com.neusoft.entity.PageModel;

public class testOrderinfo {
 public static void main(String[] args) {
	 add();
	 //del();
	 //xiu();
	 //aAll();
	 
	 String uuid = UUID.randomUUID().toString().replaceAll("-", "");
	 System.out.println(uuid);
	 //ordXy();
}
 //添加
 public static void add() {
	 Orderinfo order=new Orderinfo("1251dfad56165",1,2,System.currentTimeMillis(),System.currentTimeMillis(),3,"我需尽快到达");
		int  ord=new OrderinfoDaoImpl().insertOrd(order);
		System.out.println(ord);	
}
 //删除
 public static void del() {
	 
		int  ord=new OrderinfoDaoImpl().deleteOrd(1);
		System.out.println(ord);	
}
 //修改
 public static void xiu() {
	 Orderinfo pro=new Orderinfo(3,"125fad1dfafdfd56165",1,2,System.currentTimeMillis(),System.currentTimeMillis(),3,"我需尽快到达");

		int  ord=new OrderinfoDaoImpl().updateOrd(pro);
		System.out.println(ord);	
}
 //查询所有的
 
 public static void aAll() {
		List<Orderinfo>  oAll=new OrderinfoDaoImpl().getOrderinfoList();
		System.out.println(oAll);	
}
 //查询分页
 public static void ordXy() {
	 
		PageModel<Orderinfo> Pagelist=new OrderinfoDaoImpl().getproductByPage(1, 1);
		System.out.println(Pagelist);	
}
}
