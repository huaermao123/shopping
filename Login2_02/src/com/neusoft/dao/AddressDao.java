package com.neusoft.dao;

import java.util.List;

import com.neusoft.entity.Address;
import com.neusoft.entity.PageModel;

public interface AddressDao {
  
	/**
	 * 地址表，供客户选择
	 */
	
	
	//添加
	public int insertAddr(Address  addr)throws DaoException;
	
	//删除
	public int deleteAddr(Integer id)throws DaoException;
	//修改
	public int updateAddr(Address ads) throws DaoException;
	
	//查询所有的
	public List<Address> getOrderinfoList() throws DaoException;
	
	/**
	 * 
	 * @param pro
	 * @return
	 * @throws 分页查询
	 */
	
	public PageModel<Address>  getAddrByPage(int pageNo,int pageSize) throws DaoException;

	
}

