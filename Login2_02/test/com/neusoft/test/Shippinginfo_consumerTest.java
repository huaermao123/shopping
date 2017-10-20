package com.neusoft.test;

import java.util.List;

import com.neusoft.dao.impl.Shoppinginfo_consumerDaoImpl;
import com.neusoft.entity.Shoppinginfo_consumer;

public class Shippinginfo_consumerTest {
	
public static void main(String[] args) {
	//insert();
	//del();
	//update();
	//all();
	//aidall();
}
//添加
public static void insert() {
	Shoppinginfo_consumer shop=new Shoppinginfo_consumer(16,"华二达3", 54, 515151515);
	int dd=new Shoppinginfo_consumerDaoImpl().insertShop(shop);
	System.out.println(dd);
}
//删除
public static void del() {
	int dd=new Shoppinginfo_consumerDaoImpl().deleteShop(7);
	System.out.println(dd);
}
//修改
public static void update() {
	Shoppinginfo_consumer sho=new Shoppinginfo_consumer(56,"看的");
	int ddd=new Shoppinginfo_consumerDaoImpl().updateShop(sho);
	System.out.println(ddd);
}
//查询
public static void all() {
	List<Shoppinginfo_consumer>  gg=new Shoppinginfo_consumerDaoImpl().getShopList();
 System.out.println(gg);
}
//查询 aid
public static  void aidall() {
	Shoppinginfo_consumerDaoImpl gg=new Shoppinginfo_consumerDaoImpl();
	Shoppinginfo_consumer j=  gg.doShop(16);
	if(j!=null) {
		Shoppinginfo_consumer jj=new Shoppinginfo_consumer(16,System.currentTimeMillis());
		gg.update(jj);
	}
	
}


}
