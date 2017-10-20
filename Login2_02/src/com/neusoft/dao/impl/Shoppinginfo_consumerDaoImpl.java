package com.neusoft.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.neusoft.dao.DaoException;
import com.neusoft.dao.Shoppinginfo_consumerDao;
import com.neusoft.entity.Account;
import com.neusoft.entity.Address;
import com.neusoft.entity.Shoppinginfo_consumer;
import com.neusoft.utils.ConnectionFactory;

public class Shoppinginfo_consumerDaoImpl implements Shoppinginfo_consumerDao {
	  //����
	QueryRunner qr = new QueryRunner();

	@Override
	public int insertShop(Shoppinginfo_consumer shop) throws DaoException {
		//��ȡ����
		  Connection conn=ConnectionFactory.getInstance().getConnection();
		//׼�����
		   String sql="insert into shoppinginfo_consumer(aid,nickname,money,lasttime )value(?,?,?,?)";
		   try {
			  return qr.update(conn,sql,shop.getAid(),shop.getNickname(),shop.getMoney(),shop.getLasttime());		
		  }catch(SQLException e) {
			  e.printStackTrace();
			    throw new  DaoException("���ӳ���",e);
		        }finally {
			    DbUtils.closeQuietly(conn);
		    }
	}
	//ɾ��

	@Override
	public int deleteShop(Integer id) throws DaoException {
		//��ȡ����
		Connection conn=ConnectionFactory.getInstance().getConnection();
		       //׼�����
		 String sql="delete from shoppinginfo_consumer where aid=?";
		     try {
		  		return qr.update(conn,sql,id);		
		  		}catch(SQLException e) {
		  			e.printStackTrace();
		  			throw new  DaoException("ɾ������",e);
		  		}finally {
		  			DbUtils.closeQuietly(conn);
		  	}
	}
	
    //�޸�
	@Override
	public int updateShop(Shoppinginfo_consumer sho) throws DaoException {
		//��ȡ����
		Connection conn=ConnectionFactory.getInstance().getConnection();
       //׼�����
		String sql="update shoppinginfo_consumer set nickname=? where aid=?";
	     try {
	    	 return qr.update(conn,sql,sho.getNickname(),sho.getAid());
	     }catch(SQLException e) {
	  			e.printStackTrace();
	  			throw new  DaoException("�޸ĳ���",e);
	  		}finally {
	  			DbUtils.closeQuietly(conn);
	  		}
	}

	
	@Override
	public List<Shoppinginfo_consumer> getShopList() throws DaoException {
		 //��ȡ����
		Connection conn=ConnectionFactory.getInstance().getConnection();
       //׼�����
		String sql="select id,aid,nickname,money,lasttime from shoppinginfo_consumer";
		
		List<Shoppinginfo_consumer> list=new  ArrayList<Shoppinginfo_consumer>();
		PreparedStatement pst=null;
		ResultSet rs=null;
	     try {
	    	 //step3:��ȡPreparedStatement,����ȥ����sql
			   pst=conn.prepareStatement(sql);
			 //step5:����sql
				rs=pst.executeQuery();
				//step6:�������ؽ��
				while(rs.next()) {
					Shoppinginfo_consumer cc=new Shoppinginfo_consumer();
					Integer id = rs.getInt(1);
					cc.setId(id);
					Integer aid = rs.getInt(2);
					cc.setId(aid);
					String nickname = rs.getString(3);
					cc.setNickname(nickname);
					Integer money = rs.getInt(4);
					cc.setMoney(money);
					Long lasttime = rs.getLong(5);
					cc.setLasttime(lasttime);
					list.add(cc);
					}
	    	 System.out.println(list);
	  		}catch(SQLException e) {
	  			e.printStackTrace();
	  			throw new  DaoException("��ѯ����",e);
	  		}finally {
	  			DbUtils.closeQuietly(conn);
	  		}
	     return list;
	}

	//��ѯaid
	@Override
	public Shoppinginfo_consumer doShop(int aid) throws DaoException {
		Shoppinginfo_consumer shopaid=null;
		//��ȡ����
		Connection conn=ConnectionFactory.getInstance().getConnection();
		
		//sql���
		String sql="select id,aid,nickname,money,lasttime from shoppinginfo_consumer where aid=?";
		//
		ResultSetHandler<Shoppinginfo_consumer> rsh=new BeanHandler<Shoppinginfo_consumer>(Shoppinginfo_consumer.class);
		Object[] params= {aid};
		try {
			 shopaid=qr.query(conn, sql, rsh, params);
			System.out.println(shopaid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new DaoException("�û�����������󣬵�¼ʧ��");
		}finally {
			
			DbUtils.closeQuietly(conn);
		}
		
		
		
		return shopaid;
	}

	@Override
	public boolean update(Shoppinginfo_consumer time) throws DaoException {

		//��ȡ����
		Connection conn=ConnectionFactory.getInstance().getConnection();
		
		//sql���
		String sql="update shoppinginfo_consumer set lasttime=? where id=?";
		
		try {
			int count=qr.update(conn, sql, time.getLasttime(),time.getId());
		     if(count>0) {
		    	 return true;
		     }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new DaoException("��¼��Ϣ�޸�ʧ��");
		}finally {
			DbUtils.closeQuietly(conn);
		}
		
		return false;
	}
	

	
}