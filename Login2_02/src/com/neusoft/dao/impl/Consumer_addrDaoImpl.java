package com.neusoft.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;

import com.neusoft.dao.Consumer_addrDao;
import com.neusoft.dao.DaoException;
import com.neusoft.entity.Address;
import com.neusoft.entity.Consumer_addr;
import com.neusoft.utils.ConnectionFactory;

public class Consumer_addrDaoImpl implements Consumer_addrDao {

	QueryRunner qr = new QueryRunner();
	//添加
	@Override
	public int insertAddr(Consumer_addr addr) throws DaoException {
		//获取连接
		  Connection conn=ConnectionFactory.getInstance().getConnection();
		   //准备语句
		   String sql="insert into consumer_addr(name,addr,phone,provice,city,area,adder)value(?,?,?,?,?,?,?)";
		  try {
			  return qr.update(conn,sql,addr.getName(),addr.getAddr(),addr.getPhone(),addr.getProvice(),addr.getCity(),addr.getArea(),addr.getAdder());		
		  }catch(SQLException e) {
			  e.printStackTrace();
			    throw new  DaoException("添加出错",e);
		        }finally {
			    DbUtils.closeQuietly(conn);
		    }
	}
     //删除
	@Override
	public int deleteAddr(Integer id) throws DaoException {
		//获取连接
		Connection conn=ConnectionFactory.getInstance().getConnection();
		       //准备语句
		 String sql="delete from consumer_addr where id=?";
		     try {
		  		return qr.update(conn,sql,id);		
		  		}catch(SQLException e) {
		  			e.printStackTrace();
		  			throw new  DaoException("删除出错",e);
		  		}finally {
		  			DbUtils.closeQuietly(conn);
		  	}
	}
  //修改
	@Override
	public int updateAddr(Consumer_addr ads) throws DaoException {
		//获取连接
		Connection conn=ConnectionFactory.getInstance().getConnection();
       //准备语句
		String sql="update consumer_addr set name=?,addr=?,phone=?,provice=?,city=?,area=?,adder=?where id=?";
	     try {
	    	 return qr.update(conn,sql,ads.getName(),ads.getAddr(),ads.getPhone(),ads.getProvice(),ads.getCity(),ads.getArea(),ads.getAdder(),ads.getId());
	     }catch(SQLException e) {
	  			e.printStackTrace();
	  			throw new  DaoException("修改出错",e);
	  		}finally {
	  			DbUtils.closeQuietly(conn);
	  		}
	}
   // 查询所有的
	@Override
	public List<Consumer_addr> getAddrList() throws DaoException {
		//获取连接
		Connection conn=ConnectionFactory.getInstance().getConnection();
       //准备语句
		String sql="select id,name,addr,phone,provice,city,area,adder from consumer_addr";
		
		List<Consumer_addr> list=new  ArrayList<Consumer_addr>();
		PreparedStatement pst=null;
		ResultSet rs=null;
	     try {
	    	 //step3:获取PreparedStatement,并且去发送sql
			   pst=conn.prepareStatement(sql);
			 //step5:发送sql
				rs=pst.executeQuery();
				//step6:处理返回结果
				while(rs.next()) {
					Consumer_addr cc=new Consumer_addr();
					
					Integer id = rs.getInt(1);
					cc.setId(id);
					String name = rs.getString(2);
					cc.setName(name);
					String provice = rs.getString(3);
					cc.setProvice(provice);
					String addr = rs.getString(4);
					cc.setAddr(addr);
					String phone = rs.getString(5);
					cc.setPhone(phone);
					String city = rs.getString(6);
					cc.setCity(city);
					String area = rs.getString(7);
					cc.setArea(area);
					String adder = rs.getString(8);
					cc.setAdder(adder);
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
