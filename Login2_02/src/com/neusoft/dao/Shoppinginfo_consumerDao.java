package com.neusoft.dao;

import java.util.List;

import com.neusoft.entity.Account;
import com.neusoft.entity.Shoppinginfo_consumer;

public interface Shoppinginfo_consumerDao {

  	    //����
		public int insertShop(Shoppinginfo_consumer  shop)throws DaoException;
		//ɾ��
		public int deleteShop(Integer id)throws DaoException;
		//�޸�
		public int updateShop(Shoppinginfo_consumer sho) throws DaoException;
		//��ѯ���е�
		public List<Shoppinginfo_consumer> getShopList() throws DaoException;
	    //ͨ��aid��ѯ
		public Shoppinginfo_consumer doShop(int aid) throws DaoException;
		
		/**
		 * �޸ĵ�¼Ip��ʱ��
		 * */

		public boolean update(Shoppinginfo_consumer time)throws DaoException;
	
	
	
	
	
}