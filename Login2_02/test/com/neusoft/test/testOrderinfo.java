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
 //���
 public static void add() {
	 Orderinfo order=new Orderinfo("1251dfad56165",1,2,System.currentTimeMillis(),System.currentTimeMillis(),3,"���辡�쵽��");
		int  ord=new OrderinfoDaoImpl().insertOrd(order);
		System.out.println(ord);	
}
 //ɾ��
 public static void del() {
	 
		int  ord=new OrderinfoDaoImpl().deleteOrd(1);
		System.out.println(ord);	
}
 //�޸�
 public static void xiu() {
	 Orderinfo pro=new Orderinfo(3,"125fad1dfafdfd56165",1,2,System.currentTimeMillis(),System.currentTimeMillis(),3,"���辡�쵽��");

		int  ord=new OrderinfoDaoImpl().updateOrd(pro);
		System.out.println(ord);	
}
 //��ѯ���е�
 
 public static void aAll() {
		List<Orderinfo>  oAll=new OrderinfoDaoImpl().getOrderinfoList();
		System.out.println(oAll);	
}
 //��ѯ��ҳ
 public static void ordXy() {
	 
		PageModel<Orderinfo> Pagelist=new OrderinfoDaoImpl().getproductByPage(1, 1);
		System.out.println(Pagelist);	
}
}
