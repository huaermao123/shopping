package com.neusoft.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.neusoft.dao.ConsumerDao;
import com.neusoft.entity.*;
import com.neusoft.dao.DaoException;

import com.neusoft.utils.ConnectionFactory;

public class ConsumerDaoImpl implements ConsumerDao{

   /**
    * 会员
    *  添加*/
	QueryRunner qr = new QueryRunner();

	public int insertConsumer(Consumer con) throws DaoException {
		//获取连接
		Connection conn=ConnectionFactory.getInstance().getConnection();
    //准备语句
   String sql="insert into account_consumer(loginname,password)value(?,?)";
			try {
				return qr.update(conn,sql,con.getLoginname(),con.getPassword());		
			}catch(SQLException e) {
				e.printStackTrace();
				throw new  DaoException("添加出错",e);
			}finally {
				DbUtils.closeQuietly(conn);
			}	
}

	/**
	 * 删除id
	 */


	public int deleteConsumer(Integer id) throws DaoException {

		//获取连接
		Connection conn=ConnectionFactory.getInstance().getConnection();
       //准备语句
          String sql="delete from account_consumer where id=?";
          try {
        	  
  			return qr.update(conn,sql,id);		
  		}catch(SQLException e) {
  			e.printStackTrace();
  			throw new  DaoException("删除出错",e);
  		}finally {
  			DbUtils.closeQuietly(conn);
  		}
	}
	/*
	 * 修改id 用户名与密码
	 */
	
	public int updateConsumerAll(Consumer ucon) throws DaoException {
		//获取连接
		Connection conn=ConnectionFactory.getInstance().getConnection();
       //准备语句
		String sql="update account_consumer set loginname=?, password=? where id=? ";
	     try {
	    	 return qr.update(conn,sql,ucon.getLoginname(),ucon.getPassword(),ucon.getId());
	     }catch(SQLException e) {
	  			e.printStackTrace();
	  			throw new  DaoException("修改出错",e);
	  		}finally {
	  			DbUtils.closeQuietly(conn);
	  		}
	}
	
	
	/*
	 * 修改id
	 */
	
	public int updateConsumer(Consumer ucon) throws DaoException {
		//获取连接
		Connection conn=ConnectionFactory.getInstance().getConnection();
       //准备语句
		String sql="update account_consumer set  password=? where loginname=? ";
	     try {
	    	 return qr.update(conn,sql,ucon.getLoginname(),ucon.getLoginname());
	     }catch(SQLException e) {
	  			e.printStackTrace();
	  			throw new  DaoException("修改出错",e);
	  		}finally {
	  			DbUtils.closeQuietly(conn);
	  		}
	}
	/*
	 * 改用户名
	 *
	 */
	

@Override
public int updateLoginname(String loginname, int id) throws DaoException {
	//获取连接
			Connection conn=ConnectionFactory.getInstance().getConnection();
	       //准备语句
			String sql="update account_consumer set  loginname=? where id=? ";
		     try {
		    	 return qr.update(conn,sql,loginname,id);
		     }catch(SQLException e) {
		  			e.printStackTrace();
		  			throw new  DaoException("修改出错",e);
		  		}finally {
		  			DbUtils.closeQuietly(conn);
		  		}
}

	
	/*
	 * 查询所有
	 */



	public Consumer getConsumerList(String loginname, String password) throws DaoException {
		// TODO Auto-generated method stub
		//System.out.println(loginname1);
		//System.out.println(password1);
		       //获取连接
				Connection conn=ConnectionFactory.getInstance().getConnection();
		       //准备语句
				String sql="select id,loginname,password,registertime,lastlogintime,ip from account_consumer where loginname=? and password=? ";
				//System.out.println(sql);
				Consumer cons=null;
				
			     try {
			    	 ResultSetHandler<Consumer> rsh=new BeanHandler<Consumer>(Consumer.class);
					 //System.out.println(loginname1+password1);
			    	 Object[] objs= {loginname,password};
			    	 try {
						cons=qr.query(conn,sql,rsh,objs);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
						
					
			     }finally {
			  			DbUtils.closeQuietly(conn);
			  		}
			     return cons;
	}

	
	
	
	 /*
	  * 分页查询
	  */
	
	
	public PageModel<Consumer> getCatesByPage(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		
			PageModel<Consumer>  model=null;
			
			//获取连接
			Connection conn=ConnectionFactory.getInstance().getConnection();
					
			 //sql
			String totalcount_sql="select count(id) from account_consumer";
			//查询总的记录  ScalarHandler:第一行第一列的值
			ResultSetHandler<Long> rsh=new ScalarHandler<Long>();
			try {
				Integer totalcount=qr.query(conn, totalcount_sql, rsh).intValue();
				
				if(totalcount>0) {
					model=new PageModel<Consumer>();
					model.setTotalcount(totalcount);
					//分页查询
					String sql="select id,loginname,password,registertime,lastlogintime,ip from account_consumer order by id desc limit ?,?";
				    Object[] params= {(pageNo-1)*pageSize,pageSize};
					List<Consumer> msgs=qr.query(conn, sql, new BeanListHandler<Consumer>(Consumer.class), params);
				 
					model.setDatas(msgs);
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
	



	
	
	
	
	
	
@Override
public int updateConsumer(ConsumerDao ucon) throws DaoException {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public int insertConsumer(ConsumerDao con) throws DaoException {
	// TODO Auto-generated method stub
	return 0;
}
//新修改ip  registertime  lastlogintime


@Override
public boolean update(Consumer acc) throws DaoException {
	//获取连接
			Connection conn=ConnectionFactory.getInstance().getConnection();
			
			//sql语句
			String sql="update account_consumer set registertime=?,lastlogintime=?,ip=? where id=?";
			
			try {
				int count=qr.update(conn, sql,acc.getRegistertime(),acc.getLastlogintime(),acc.getIp(),acc.getId());
			     if(count>0) {
			    	 return true;
			     }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new DaoException("登录信息修改失败");
			}finally {
				DbUtils.closeQuietly(conn);
			}
			
			return false;
		}

	
	
}
