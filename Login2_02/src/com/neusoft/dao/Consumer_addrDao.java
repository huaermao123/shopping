package com.neusoft.dao;

import java.util.List;

import com.neusoft.entity.Consumer_addr;

public interface Consumer_addrDao {
       //这是买家地址信息        
	  	//添加
		public int insertAddr(Consumer_addr  addr)throws DaoException;
		//删除
		public int deleteAddr(Integer id)throws DaoException;
		//修改
		public int updateAddr(Consumer_addr ads) throws DaoException;
		//查询所有的
		public List<Consumer_addr> getAddrList() throws DaoException;
	    
	
	
	
	
}
