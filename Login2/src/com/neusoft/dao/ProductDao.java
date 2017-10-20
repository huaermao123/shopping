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
	 * @throws 分页查询
	 */
	
	public PageModel<Cate>  getproductByPage(int pageNo,int pageSize) throws DaoException;
	

	
	
	
	
	
	
	
	/*
	 * 添加
	 * 商品表
	 *
	 * */
	public int insert(Product  pro)throws DaoException;
	
	
	/*
	 * 删除
	 */
	public int deletePro(Integer cid)throws DaoException;
	
	/*
	 * 修改
	*/
	public int updatePro(Product pro) throws DaoException;
	
	
	/*
	 * 查询所有的
	 */
	public List<Product> getProductList() throws DaoException; 
}
