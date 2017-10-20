package com.neusoft.dao;

import java.util.List;

import com.neusoft.entity.Account;
import com.neusoft.entity.Shoppinginfo_consumer;

public interface Shoppinginfo_consumerDao {

  	    //添加
		public int insertShop(Shoppinginfo_consumer  shop)throws DaoException;
		//删除
		public int deleteShop(Integer id)throws DaoException;
		//修改
		public int updateShop(Shoppinginfo_consumer sho) throws DaoException;
		//查询所有的
		public List<Shoppinginfo_consumer> getShopList() throws DaoException;
	    //通过aid查询
		public Shoppinginfo_consumer doShop(int aid) throws DaoException;
		
		/**
		 * 修改登录Ip及时间
		 * */

		public boolean update(Shoppinginfo_consumer time)throws DaoException;
	
	
	
	
	
}
