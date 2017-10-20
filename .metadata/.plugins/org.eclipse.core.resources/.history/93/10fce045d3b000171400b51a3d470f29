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

import com.neusoft.dao.AddressDao;
import com.neusoft.dao.DaoException;
import com.neusoft.entity.*;
import com.neusoft.utils.ConnectionFactory;

public class AddressDaoImpl implements AddressDao {
	
	
	QueryRunner qr = new QueryRunner();
	//添加=================================
	@Override
	public int insertAddr(Address addr) throws DaoException {
		//获取连接
		  Connection conn=ConnectionFactory.getInstance().getConnection();
		   //准备语句
		   String sql="insert into address(province ,city ,area)value(?,?,?)";
		   try {
			  return qr.update(conn,sql,addr.getProvince(),addr.getCity(),addr.getArea());		
		  }catch(SQLException e) {
			  e.printStackTrace();
			    throw new  DaoException("添加出错",e);
		        }finally {
			    DbUtils.closeQuietly(conn);
		    }
			
	}
    //删除================================
	@Override
	public int deleteAddr(Integer id) throws DaoException {
		//获取连接
				Connection conn=ConnectionFactory.getInstance().getConnection();
				       //准备语句
				 String sql="delete from address where id=?";
				     try {
				  		return qr.update(conn,sql,id);		
				  		}catch(SQLException e) {
				  			e.printStackTrace();
				  			throw new  DaoException("删除出错",e);
				  		}finally {
				  			DbUtils.closeQuietly(conn);
				  	}
	}
    //修改===============================
	@Override
	public int updateAddr(Address ads) throws DaoException {
		//获取连接
				Connection conn=ConnectionFactory.getInstance().getConnection();
		       //准备语句
				String sql="update address set province=?,city=?,area=? where id=?";
			     try {
			    	 return qr.update(conn,sql,ads.getProvince(),ads.getCity(),ads.getArea(),ads.getId());
			     }catch(SQLException e) {
			  			e.printStackTrace();
			  			throw new  DaoException("修改出错",e);
			  		}finally {
			  			DbUtils.closeQuietly(conn);
			  		}
	}
 //查询所有的address====================================
	@Override
	public List<Address> getOrderinfoList() throws DaoException {
		//获取连接
				Connection conn=ConnectionFactory.getInstance().getConnection();
		       //准备语句
				String sql="select id,province,city,area from address";
				
				List<Address> list=new  ArrayList<Address>();
				PreparedStatement pst=null;
				ResultSet rs=null;
			     try {
			    	 //step3:获取PreparedStatement,并且去发送sql
					   pst=conn.prepareStatement(sql);
					 //step5:发送sql
						rs=pst.executeQuery();
						//step6:处理返回结果
						while(rs.next()) {
							Address cc=new Address();
							Integer id = rs.getInt(1);
							cc.setId(id);
							String province = rs.getString(2);
							cc.setProvince(province);
							String city = rs.getString(3);
							cc.setCity(city);
							String area = rs.getString(4);
							cc.setArea(area);
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
   //分页查询======================================================
	@Override
	public PageModel<Address> getAddrByPage(int pageNo, int pageSize) throws DaoException {
			PageModel<Address>  model=null;
		
		//获取连接
		Connection conn=ConnectionFactory.getInstance().getConnection();
				
		 //sql
		String totalcount_sql="select count(id) from address";
		//查询总的记录  ScalarHandler:第一行第一列的值
		ResultSetHandler<Long> rsh=new ScalarHandler<Long>();
		try {
			Integer totalcount=qr.query(conn, totalcount_sql, rsh).intValue();
			
			if(totalcount>0) {
				model=new PageModel<Address>();
				model.setTotalcount(totalcount);
				//分页查询
				String sql="select id,province,city,area from address order by id desc limit ?,?";
			    System.out.println(sql);
				Object[] params= {(pageNo-1)*pageSize,pageSize};
				List<Address> pros=qr.query(conn, sql, new BeanListHandler<Address>(Address.class), params);

				model.setDatas(pros);
			   }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new DaoException("分页查询出错。。。",e);
		}finally {
			DbUtils.closeQuietly(conn);
		}
		return model;
	}

}
