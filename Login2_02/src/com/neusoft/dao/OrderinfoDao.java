package com.neusoft.dao;


import java.util.List;

import com.neusoft.entity.Orderinfo;
import com.neusoft.entity.PageModel;




public interface OrderinfoDao {
//-- ������=====
	
	//���
	public int insertOrd(Orderinfo  order)throws DaoException;
	
	//ɾ��
	public int deleteOrd(Integer id)throws DaoException;
	//�޸�
	public int updateOrd(Orderinfo pro) throws DaoException;
	
	//��ѯ���е�
	public List<Orderinfo> getOrderinfoList() throws DaoException;
	
	/**
	 * 
	 * @param pro
	 * @return
	 * @throws ��ҳ��ѯ
	 */
	
	public PageModel<Orderinfo>  getproductByPage(int pageNo,int pageSize) throws DaoException;

	
}
