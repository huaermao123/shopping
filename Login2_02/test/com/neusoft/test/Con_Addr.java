package com.neusoft.test;

import java.util.List;

import com.neusoft.dao.impl.Consumer_addrDaoImpl;
import com.neusoft.entity.Consumer_addr;

public class Con_Addr {
  public static void main(String[] args) {
	 //testInsert();
	  //del();
	  //testUpdate();
	  all();
}
  public static void testInsert() {
	  Consumer_addrDaoImpl cc=new Consumer_addrDaoImpl();
	  Consumer_addr addr=new Consumer_addr("华二毛","重庆市酉阳县。。。","13212201197","重庆市","重庆市","重庆市", "156115");
	int cd = cc.insertAddr(addr);
	  System.out.println(cd);
  }
  public static void del() {
	  Consumer_addrDaoImpl cc=new Consumer_addrDaoImpl();
	  //Consumer_addr addr=new Consumer_addr("华二毛","重庆市酉阳县。。。","13212201197","重庆市","重庆市","重庆市", "156115");
	int cd = cc.deleteAddr(1);
	  System.out.println(cd);
  }
  
  public static void testUpdate() {
	  Consumer_addrDaoImpl cc=new Consumer_addrDaoImpl();
	  Consumer_addr ads=new Consumer_addr(2,"华2213","重庆市酉阳县52","13212201197","重庆市","重庆市","重庆市","156115");
	  int cd = cc.updateAddr(ads);
	  System.out.println(cd);
  }
  
  public static void all() {
	  Consumer_addrDaoImpl cc=new Consumer_addrDaoImpl();
	  List<Consumer_addr> cd = cc.getAddrList();
	  System.out.println(cd);
  }
  
}
