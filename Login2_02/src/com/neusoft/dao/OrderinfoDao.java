package com.neusoft.dao;


import java.util.List;

import com.neusoft.entity.Orderinfo;
import com.neusoft.entity.PageModel;




public interface OrderinfoDao {
//-- 订单表=====
	
	//添加
	public int insertOrd(Orderinfo  order)throws DaoException;
	
	//删除
	public int deleteOrd(Integer id)throws DaoException;
	//修改
	public int updateOrd(Orderinfo pro) throws DaoException;
	
	//查询所有的
	public List<Orderinfo> getOrderinfoList() throws DaoException;
	
	/**
	 * 
	 * @param pro
	 * @return
	 * @throws 分页查询
	 */
	
	public PageModel<Orderinfo>  getproductByPage(int pageNo,int pageSize) throws DaoException;

	
}
