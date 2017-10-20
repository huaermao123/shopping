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

	//增加
	@Override
	public int insert(Product_orderinfo poder) throws DaoException {
		//获取连接
		  Connection conn=ConnectionFactory.getInstance().getConnection();
		   //准备语句
		   String sql="insert into product_orderinfo(orderid,productid)value(?,?)";
		   try {
			  return qr.update(conn,sql,poder.getOrderid(),poder.getProductid());		
		  }catch(SQLException e) {
			  e.printStackTrace();
			    throw new  DaoException("添加出错",e);
		        }finally {
			    DbUtils.closeQuietly(conn);
		    }
			
	}
   //删除
	@Override
	public int deleteP_orderDao(Integer orderid) throws DaoException {
		//获取连接
		Connection conn=ConnectionFactory.getInstance().getConnection();
		       //准备语句
		 String sql="delete from product_orderinfo where orderid=?";
		     try {
		  		return qr.update(conn,sql,orderid);		
		  		}catch(SQLException e) {
		  			e.printStackTrace();
		  			throw new  DaoException("删除出错",e);
		  		}finally {
		  			DbUtils.closeQuietly(conn);
		  	}
	}
  //修改
	@Override
	public int updateP_order(Product_orderinfo por) throws DaoException {
		//获取连接
		Connection conn=ConnectionFactory.getInstance().getConnection();
       //准备语句
		String sql="update product_orderinfo set orderid=?  where productid=?";
	     try {
	    	 return qr.update(conn,sql,por.getOrderid(),por.getProductid());
	     }catch(SQLException e) {
	  			e.printStackTrace();
	  			throw new  DaoException("修改出错",e);
	  		}finally {
	  			DbUtils.closeQuietly(conn);
	  		}
	}
   //查询所有的
	@Override
	public List<Product_orderinfo> getP_orderList() throws DaoException {
		 //获取连接
		Connection conn=ConnectionFactory.getInstance().getConnection();
       //准备语句
		String sql="select orderid,productid from product_orderinfo";
		
		List<Product_orderinfo> list=new  ArrayList<Product_orderinfo>();
		PreparedStatement pst=null;
		ResultSet rs=null;
	     try {
	    	 //step3:获取PreparedStatement,并且去发送sql
			   pst=conn.prepareStatement(sql);
			 //step5:发送sql
				rs=pst.executeQuery();
				//step6:处理返回结果
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
	  			throw new  DaoException("查询出错",e);
	  		}finally {
	  			DbUtils.closeQuietly(conn);
	  		}
	     return list;
	}

}
