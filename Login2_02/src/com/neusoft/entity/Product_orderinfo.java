package com.neusoft.entity;

public class Product_orderinfo {
/*	-- ��Զ��ϵ����������Ʒ
	create table product_orderinfo(
	orderid     int  ,-- ����idֵ������orderinfo���е�id
	productid   int ,-- ��Ʒid,ֵ����,ֵ����product���е�id
    primary  key(orderid,productid)-- ��������
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