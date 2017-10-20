package com.neusoft.services;

import com.neusoft.dao.DaoException;
import com.neusoft.dao.impl.ConsumerDaoImpl;
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
		
}
