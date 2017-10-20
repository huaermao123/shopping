package com.neusoft.dao;

import java.util.List;

import com.neusoft.entity.Rule;

public interface RuleDao {

	   /*
	   * ����
	   */
		public int insert(Rule  rule)throws DaoException;
		
		/**
		 * ɾ�� ���ڵ�
		 */
		public int deleteRuleDao(Integer id)throws DaoException;
		
		
		/**
		 * �޸�
		 */
		public int updateCate(Rule cate)throws DaoException;

		/**
		 * ��ѯ���е�
		 */
		public List<Rule> getRuleList()throws DaoException;
		
	
}