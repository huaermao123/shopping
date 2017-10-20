package com.neusoft.test;

import com.neusoft.dao.AccountDao;
import com.neusoft.dao.DaoFactory;
import com.neusoft.dao.impl.AccountDaoImpl;
import com.neusoft.entity.Account;

public class TestAccount {

	public static void main(String[] args) {
		testLogin();
	}
	
	public static void testLogin() {
		
		//AccountDao accDao=DaoFactory.getInstance("accDao", AccountDao.class);
		AccountDaoImpl accDao=new AccountDaoImpl();
		Account acc=accDao.doLogin("admin", "admin");
		 System.out.println(acc);
		 if(acc!=null) {
			 acc.setLogindate(System.currentTimeMillis());
			 acc.setIp("10.25.151.170");
			boolean dd =accDao.update(acc);
			 System.out.println(dd);
		 }
		
		
		
	}
	
}
