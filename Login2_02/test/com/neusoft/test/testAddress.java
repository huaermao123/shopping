package com.neusoft.test;

import java.util.List;

import com.neusoft.dao.impl.AddressDaoImpl;

import com.neusoft.entity.Address;
import com.neusoft.entity.PageModel;


public class testAddress {
	public static void main(String[] args) {
		add();
		//del();
		//xg();
		//addAll();
		//getxy();
	}
	//添加
	public static void add() {
		Address addr=new Address("重庆市","重庆市","秀山县");
		int o=new AddressDaoImpl().insertAddr(addr);
		System.out.println(o);
	}
	//删除
	public static void del() {
		int p=new AddressDaoImpl().deleteAddr(2);
		System.out.println(p);
	}
	//修改
	public static void xg() {
		Address addr=new Address(3,"重庆市","重庆市","涪陵区");
		System.out.println(addr);
		int d=new AddressDaoImpl().updateAddr(addr);
		System.out.println(d);
	}
	//查询
	public static void addAll() {
		List<Address> d=new AddressDaoImpl().getOrderinfoList();
		System.out.println(d);
	}
	 //查询分页
	 public static void  getxy() {
		 PageModel<Address> cd= new AddressDaoImpl().getAddrByPage(1, 2);
		 System.out.println(cd);
	 }
	
}
