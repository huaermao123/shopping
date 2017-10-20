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
	//删除
	public int deleteConsumer(Integer id) throws DaoException {
	    return cons.deleteConsumer(id);
	}
	//添加会员
	public int insertConsumer(Consumer con) throws DaoException {
		return cons.insertConsumer(con);
	}
	//修改会员密码及名
	public int updateConsumerAll(Consumer ucon) throws DaoException {
		return cons.updateConsumerAll(ucon);
	}
	//查询所有的用户
	/*public List<Consumer> getConsumerList(int id, String loginname, String password, Long registertime, Long lastlogintime, String ip) throws DaoException {
		return cons.getConsumerList();
	}*/
	public int updateConsumer(Consumer ucon) throws DaoException {
		return cons.updateConsumer(ucon);
	}
	

	 /**
	  * 处理登录业务逻辑。
	  * @param username 用户名
	  * @param password 密码
	  * @return true:登录成功 
	  * */
	public Consumer  doLogin(Consumer mConsumer)   {
		
		
		//获取AccountDao的实现类
		ConsumerDaoImpl cons=new ConsumerDaoImpl();
		Consumer acc=null;
      
      try {
   	 //根据用户名、密码查询用户是否存在
  		 acc=cons.getConsumerList(mConsumer.getLoginname(), mConsumer.getPassword());//(mConsumer.getLoginname(), mConsumer.getPassword());
  		 System.out.println(acc);
  		 if(acc!=null) {
  			 acc.setLastlogintime(System.currentTimeMillis()); 
  			acc.setLastlogintime(System.currentTimeMillis()); 
  			 acc.setIp(mConsumer.getIp());
  			 //更新用户最后的登录地址和登录时间
  		boolean	dd=cons.update(acc);
  			System.out.println(dd);
  		 }
  		  
      }catch(DaoException e) {
   	   e.printStackTrace();
      }
		return acc;
	}
	
	
}
