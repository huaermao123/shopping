package com.neusoft.services;

import java.util.List;

import com.neusoft.dao.AccountDao;
import com.neusoft.dao.DaoException;
import com.neusoft.dao.DaoFactory;
import com.neusoft.dao.impl.ConsumerDaoImpl;
import com.neusoft.entity.Account;
import com.neusoft.entity.Consumer;

public class ConsumerService {

	ConsumerDaoImpl cons=new ConsumerDaoImpl();
	//ɾ��
	public int deleteConsumer(Integer id) throws DaoException {
	    return cons.deleteConsumer(id);
	}
	//���ӻ�Ա
	public int insertConsumer(Consumer con) throws DaoException {
		return cons.insertConsumer(con);
	}
	//�޸Ļ�Ա���뼰��
	public int updateConsumerAll(Consumer ucon) throws DaoException {
		return cons.updateConsumerAll(ucon);
	}
	//��ѯ���е��û�
	/*public List<Consumer> getConsumerList(int id, String loginname, String password, Long registertime, Long lastlogintime, String ip) throws DaoException {
		return cons.getConsumerList();
	}*/
	public int updateConsumer(Consumer ucon) throws DaoException {
		return cons.updateConsumer(ucon);
	}
	

	 /**
	  * ������¼ҵ���߼���
	  * @param username �û���
	  * @param password ����
	  * @return true:��¼�ɹ� 
	  * */
	public Consumer  doLogin(Consumer mConsumer)   {
		
		
		//��ȡAccountDao��ʵ����
		ConsumerDaoImpl cons=new ConsumerDaoImpl();
		Consumer acc=null;
      
      try {
   	 //�����û����������ѯ�û��Ƿ����
  		 acc=cons.getConsumerList(mConsumer.getLoginname(), mConsumer.getPassword());//(mConsumer.getLoginname(), mConsumer.getPassword());
  		 System.out.println(acc);
  		 if(acc!=null) {
  			 acc.setLastlogintime(System.currentTimeMillis()); 
  			acc.setLastlogintime(System.currentTimeMillis()); 
  			 acc.setIp(mConsumer.getIp());
  			 //�����û����ĵ�¼��ַ�͵�¼ʱ��
  		boolean	dd=cons.update(acc);
  			System.out.println(dd);
  		 }
  		  
      }catch(DaoException e) {
   	   e.printStackTrace();
      }
		return acc;
	}
	
	
}