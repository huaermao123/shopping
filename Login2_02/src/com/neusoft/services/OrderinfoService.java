package com.neusoft.services;

import com.neusoft.dao.DaoException;
import com.neusoft.dao.impl.OrderinfoDaoImpl;
import com.neusoft.entity.Orderinfo;

public class OrderinfoService {

	OrderinfoDaoImpl Order= new OrderinfoDaoImpl();
	//¶©µ¥É¾³ý
	public int deleteOrd(Integer id) throws DaoException {
		return Order.deleteOrd(id);
	}
	
	public int insertOrd(Orderinfo order) throws DaoException {
		return Order.insertOrd(order);
	}
	
	
	
	
}
