package com.neusoft.dao;

import java.util.List;

import com.neusoft.entity.Consumer_addr;

public interface Consumer_addrDao {
       //������ҵ�ַ��Ϣ        
	  	//���
		public int insertAddr(Consumer_addr  addr)throws DaoException;
		//ɾ��
		public int deleteAddr(Integer id)throws DaoException;
		//�޸�
		public int updateAddr(Consumer_addr ads) throws DaoException;
		//��ѯ���е�
		public List<Consumer_addr> getAddrList() throws DaoException;
	    
	
	
	
	
}
