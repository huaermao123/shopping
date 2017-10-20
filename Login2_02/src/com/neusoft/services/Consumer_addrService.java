package com.neusoft.services;

import com.neusoft.dao.DaoException;
import com.neusoft.dao.impl.Consumer_addrDaoImpl;
import com.neusoft.entity.Consumer_addr;

public class Consumer_addrService {
  
	
	Consumer_addrDaoImpl caddr= new Consumer_addrDaoImpl();
	
	//添加用户的地址
	public int insertAddr(Consumer_addr addr) throws DaoException {
	      return caddr.insertAddr(addr);
	 }
	
	
}
