package com.neusoft.services;


import com.neusoft.dao.DaoException;
import com.neusoft.dao.impl.ProductDaoImpl;
import com.neusoft.entity.Product;

public class ProductService {

	ProductDaoImpl product=new ProductDaoImpl();
	 /**
	  * ���
	  */
	public int insert(Product  pro)throws DaoException{
			 return product.insert(pro);
	}
	
	 /*
	 * �޸�
	 */
	public int updatePro(Product pro2) throws DaoException
	{
		return product.updatePro(pro2);
	}
	/*
	 * ɾ��
	 */
	public int deletePro(Integer cid)throws DaoException{
		return product.deletePro(cid);
	}
	
}
