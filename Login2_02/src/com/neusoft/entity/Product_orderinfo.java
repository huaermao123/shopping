package com.neusoft.entity;

public class Product_orderinfo {
/*	-- 多对多关系，订单和商品
	create table product_orderinfo(
	orderid     int  ,-- 订单id值引用自orderinfo表中的id
	productid   int ,-- 商品id,值引用,值引用product表中的id
    primary  key(orderid,productid)-- 联合主键
	);*/
	
	private int orderid;
	private int productid;
	public int getOrderid() {
		return orderid;
	}
	@Override
	public String toString() {
		return "Product_orderinfo [orderid=" + orderid + ", productid=" + productid + "]";
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public Product_orderinfo(int orderid, int productid) {
		super();
		this.orderid = orderid;
		this.productid = productid;
	}
	public Product_orderinfo() {}

}
