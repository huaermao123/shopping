package com.neusoft.services;


import com.neusoft.dao.DaoException;
import com.neusoft.dao.impl.ProductDaoImpl;
import com.neusoft.entity.Product;

public class ProductService {

	ProductDaoImpl product=new ProductDaoImpl();
	 /**
	  * Ìí¼Ó
	  */
	public int insert(Product  pro)throws DaoException{
			 return product.insert(pro);
	}
	
	 /*
	 * ÐÞ¸Ä
	 */
	public int updatePro(Product pro2) throws DaoException
	{
		return product.updatePro(pro2);
	}
	/*
	 * É¾³ý
	 */
	public int deletePro(Integer cid)throws DaoException{
		return product.deletePro(cid);
	}
	
}
