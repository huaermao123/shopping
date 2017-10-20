package com.neusoft.dao;

import java.util.List;

import com.neusoft.entity.Address;
import com.neusoft.entity.PageModel;

public interface AddressDao {
  
	/**
	 * ��ַ�����ͻ�ѡ��
	 */
	
	
	//���
	public int insertAddr(Address  addr)throws DaoException;
	
	//ɾ��
	public int deleteAddr(Integer id)throws DaoException;
	//�޸�
	public int updateAddr(Address ads) throws DaoException;
	
	//��ѯ���е�
	public List<Address> getOrderinfoList() throws DaoException;
	
	/**
	 * 
	 * @param pro
	 * @return
	 * @throws ��ҳ��ѯ
	 */
	
	public PageModel<Address>  getAddrByPage(int pageNo,int pageSize) throws DaoException;

	
}

