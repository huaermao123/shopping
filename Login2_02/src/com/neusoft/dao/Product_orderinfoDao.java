package com.neusoft.dao;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;

import com.neusoft.entity.Product_orderinfo;

public interface Product_orderinfoDao {
	
	
	  /**
	   * ����
	   */
		public int insert(Product_orderinfo  poder)throws DaoException;
		
		/**
		 * ɾ�� 
		 */
		public int deleteP_orderDao(Integer orderid)throws DaoException;
		
		
		/**
		 * �޸�
		 */
		public int updateP_order(Product_orderinfo por)throws DaoException;

		/**
		 * ��ѯ���е�
		 */
		public List<Product_orderinfo> getP_orderList()throws DaoException;
		
}