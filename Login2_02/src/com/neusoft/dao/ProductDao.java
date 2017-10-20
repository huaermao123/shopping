package com.neusoft.dao;

import java.util.List;

import com.neusoft.entity.Cate;
import com.neusoft.entity.PageModel;
import com.neusoft.entity.Product;

public interface ProductDao {
	
	
	
	
	/**
	 * 
	 * @param pro
	 * @return
	 * @throws ��ҳ��ѯ
	 */
	
	public PageModel<Cate>  getproductByPage(int pageNo,int pageSize) throws DaoException;
	

	
	
	
	
	
	
	
	/*
	 * ���
	 * ��Ʒ��
	 *
	 * */
	public int insert(Product  pro)throws DaoException;
	
	
	/*
	 * ɾ��
	 */
	public int deletePro(Integer cid)throws DaoException;
	
	/*
	 * �޸�
	*/
	public int updatePro(Product pro) throws DaoException;
	
	
	/*
	 * ��ѯ���е�
	 */
	public List<Product> getProductList() throws DaoException; 
}
