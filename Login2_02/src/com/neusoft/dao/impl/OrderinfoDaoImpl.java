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
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.neusoft.dao.DaoException;
import com.neusoft.dao.OrderinfoDao;

import com.neusoft.entity.Orderinfo;
import com.neusoft.entity.PageModel;
import com.neusoft.utils.ConnectionFactory;

public class OrderinfoDaoImpl implements OrderinfoDao {

	QueryRunner qr = new QueryRunner();
	//���
	@Override
	public int insertOrd(Orderinfo order) throws DaoException {
		//��ȡ����
		  Connection conn=ConnectionFactory.getInstance().getConnection();
		   //׼�����
		   String sql="insert into orderinfo(orderno,orderstatus,paystatus,ordertime,paytime,addrinfo,mask)value(?,?,?,?,?,?,?)";
		   try {
			  return qr.update(conn,sql,order.getOrderno(),order.getOrderstatus(),order.getPaystatus(),order.getOrdertime(),order.getPaytime(),
					  order.getAddrinfo(),order.getMask());		
		  }catch(SQLException e) {
			  e.printStackTrace();
			    throw new  DaoException("��ӳ���",e);
		        }finally {
			    DbUtils.closeQuietly(conn);
		    }
	}
   //ɾ��
	@Override
	public int deleteOrd(Integer id) throws DaoException {
		//��ȡ����
		Connection conn=ConnectionFactory.getInstance().getConnection();
		       //׼�����
		 String sql="delete from orderinfo where id=?";
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
	public int updateOrd(Orderinfo pro) throws DaoException {
		//��ȡ����
		Connection conn=ConnectionFactory.getInstance().getConnection();
       //׼�����
		String sql="update orderinfo set orderno=?,orderstatus=?,paystatus=?,ordertime=?,paytime=?,addrinfo=?,mask=? where id=?";
	     try {
	    	 return qr.update(conn,sql,pro.getOrderno(),pro.getOrderstatus(),pro.getPaystatus(),pro.getOrdertime(),pro.getPaytime(),
	    			 pro.getAddrinfo(),pro.getMask(),pro.getId());
	     }catch(SQLException e) {
	  			e.printStackTrace();
	  			throw new  DaoException("�޸ĳ���",e);
	  		}finally {
	  			DbUtils.closeQuietly(conn);
	  		}
	}
  //��ѯȫ����
	@Override
	public List<Orderinfo> getOrderinfoList() throws DaoException {
		//��ȡ����
		Connection conn=ConnectionFactory.getInstance().getConnection();
       //׼�����
		String sql="select id,orderno,orderstatus,paystatus,ordertime,paytime,addrinfo,mask from orderinfo";
		
		List<Orderinfo> list=new  ArrayList<Orderinfo>();
		PreparedStatement pst=null;
		ResultSet rs=null;
	     try {
	    	 //step3:��ȡPreparedStatement,����ȥ����sql
			   pst=conn.prepareStatement(sql);
			 //step5:����sql
				rs=pst.executeQuery();
				//step6:�����ؽ��
				while(rs.next()) {
					Orderinfo cc=new Orderinfo();
					Integer id = rs.getInt(1);
					cc.setId(id);
					String orderno= rs.getString(2);
					cc.setOrderno(orderno);
					Integer orderstatus = rs.getInt(3);
					cc.setOrderstatus  (orderstatus);
					Integer paystatus = rs.getInt(4);
					cc.setPaystatus(paystatus);
					Long ordertime=rs.getLong(5);
					cc.setOrdertime(ordertime);
					Long paytime=rs.getLong(6);
					cc.setPaytime(paytime);
					Integer addrinfo = rs.getInt(7);
					cc.setAddrinfo(addrinfo);
					String mask= rs.getString(2);
					cc.setMask(mask);
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
  //��ѯ��ҳ
	@Override
	public PageModel<Orderinfo> getproductByPage(int pageNo, int pageSize) throws DaoException {
       PageModel<Orderinfo>  model=null;
		
		//��ȡ����
		Connection conn=ConnectionFactory.getInstance().getConnection();
				
		 //sql
		String totalcount_sql="select count(id) from orderinfo";
		//��ѯ�ܵļ�¼  ScalarHandler:��һ�е�һ�е�ֵ
		ResultSetHandler<Long> rsh=new ScalarHandler<Long>();
		try {
			Integer totalcount=qr.query(conn, totalcount_sql, rsh).intValue();
			
			if(totalcount>0) {
				model=new PageModel<Orderinfo>();
				model.setTotalcount(totalcount);
				//��ҳ��ѯ
				String sql="select id,orderno,orderstatus,paystatus,ordertime,paytime,addrinfo,mask from orderinfo order by id desc limit ?,?";
			    System.out.println(sql);
				Object[] params= {(pageNo-1)*pageSize,pageSize};
				List<Orderinfo> pros=qr.query(conn, sql, new BeanListHandler<Orderinfo>(Orderinfo.class), params);

				model.setDatas(pros);
			   }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new DaoException("��ҳ��ѯ��������",e);
		}finally {
			DbUtils.closeQuietly(conn);
		}
		return model;
	}
	
	
	
	
	
}


