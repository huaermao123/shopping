package com.neusoft.test;

import com.neusoft.dao.impl.Product_orderinfoDaoImpl;
import com.neusoft.entity.Product_orderinfo;

public class Test_P {
public static void main(String[] args) {
	//insert();
	//del();
	//xg();
	all();
}
//Ìí¼Ó
public static void insert() {
	
		Product_orderinfo	poder=new Product_orderinfo(9,8);
		
		System.out.println(new  Product_orderinfoDaoImpl().insert(poder));
	
}
//É¾³ý
public static void del() {
	System.out.println(new  Product_orderinfoDaoImpl().deleteP_orderDao(4));
}
//ÐÞ¸Ä
public static void xg() {
	
	Product_orderinfo	por=new Product_orderinfo(9,8);
	
	System.out.println(new  Product_orderinfoDaoImpl().updateP_order(por));

}
//²éÑ¯
public static void all() {
	System.out.println(new  Product_orderinfoDaoImpl().getP_orderList());
}

}
