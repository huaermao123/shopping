package com.neusoft.services;

import com.neusoft.dao.DaoException;
import com.neusoft.dao.impl.AddressDaoImpl;
import com.neusoft.entity.Address;

public class AdderssService {

	AddressDaoImpl adder=new AddressDaoImpl();
	//Ìí¼Ó
	public int insertAddr(Address addr) throws DaoException {
		return adder.insertAddr(addr);
	}
	
	//É¾³ý
	public int deleteAddr(Integer id) throws DaoException {
	    return adder.deleteAddr(id);
	}
	//ÐÞ¸Ä
	public int updateAddr(Address ads) throws DaoException {
		return adder.updateAddr(ads);
	}
	
	
}
