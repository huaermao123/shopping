package com.neusoft.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;

import com.neusoft.dao.DaoException;
import com.neusoft.dao.Product_orderinfoDao;
import com.neusoft.entity.Address;
import com.neusoft.entity.Product_orderinfo;
import com.neusoft.utils.ConnectionFactory;

public class Product_orderinfoDaoImpl implements Product_orderinfoDao {

	QueryRunner qr = new QueryRunner();

	//����
	@Override
	public int insert(Product_orderinfo poder) throws DaoException {
		//��ȡ����
		  Connection conn=ConnectionFactory.getInstance().getConnection();
		   //׼�����
		   String sql="insert into product_orderinfo(orderid,productid)value(?,?)";
		   try {
			  return qr.update(conn,sql,poder.getOrderid(),poder.getProductid());		
		  }catch(SQLException e) {
			  e.printStackTrace();
			    throw new  DaoException("��ӳ���",e);
		        }finally {
			    DbUtils.closeQuietly(conn);
		    }
			
	}
   //ɾ��
	@Override
	public int deleteP_orderDao(Integer orderid) throws DaoException {
		//��ȡ����
		Connection conn=ConnectionFactory.getInstance().getConnection();
		       //׼�����
		 String sql="delete from product_orderinfo where orderid=?";
		     try {
		  		return qr.update(conn,sql,orderid);		
		  		}catch(SQLException e) {
		  			e.printStackTrace();
		  			throw new  DaoException("ɾ������",e);
		  		}finally {
		  			DbUtils.closeQuietly(conn);
		  	}
	}
  //�޸�
	@Override
	public int updateP_order(Product_orderinfo por) throws DaoException {
		//��ȡ����
		Connection conn=ConnectionFactory.getInstance().getConnection();
       //׼�����
		String sql="update product_orderinfo set orderid=?  where productid=?";
	     try {
	    	 return qr.update(conn,sql,por.getOrderid(),por.getProductid());
	     }catch(SQLException e) {
	  			e.printStackTrace();
	  			throw new  DaoException("�޸ĳ���",e);
	  		}finally {
	  			DbUtils.closeQuietly(conn);
	  		}
	}
   //��ѯ���е�
	@Override
	public List<Product_orderinfo> getP_orderList() throws DaoException {
		 //��ȡ����
		Connection conn=ConnectionFactory.getInstance().getConnection();
       //׼�����
		String sql="select orderid,productid from product_orderinfo";
		
		List<Product_orderinfo> list=new  ArrayList<Product_orderinfo>();
		PreparedStatement pst=null;
		ResultSet rs=null;
	     try {
	    	 //step3:��ȡPreparedStatement,����ȥ����sql
			   pst=conn.prepareStatement(sql);
			 //step5:����sql
				rs=pst.executeQuery();
				//step6:�����ؽ��
				while(rs.next()) {
					Product_orderinfo cc=new Product_orderinfo();
					Integer orderid = rs.getInt(1);
					cc.setOrderid(orderid);
					Integer productid = rs.getInt(2);
					cc.setProductid(productid);
					
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

}
