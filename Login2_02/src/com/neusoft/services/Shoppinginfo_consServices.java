package com.neusoft.services;

import com.neusoft.dao.DaoException;
import com.neusoft.dao.impl.Shoppinginfo_consumerDaoImpl;
import com.neusoft.entity.Shoppinginfo_consumer;

public class Shoppinginfo_consServices {
	      
	Shoppinginfo_consumerDaoImpl dd=  new Shoppinginfo_consumerDaoImpl();  
	public int insertShop(Shoppinginfo_consumer shop) throws DaoException {
          return dd.insertShop(shop);
	}
}
