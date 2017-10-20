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
import com.neusoft.dao.RuleDao;
import com.neusoft.entity.Address;
import com.neusoft.entity.Rule;
import com.neusoft.utils.ConnectionFactory;

public class RuleDaoImpl implements  RuleDao{
 //增加
	QueryRunner qr = new QueryRunner();
	@Override
	public int insert(Rule rule) throws DaoException {
		//获取连接
		  Connection conn=ConnectionFactory.getInstance().getConnection();
		   //准备语句
		   String sql="insert into rule(pid,size)value(?,?)";
		   try {
			  return qr.update(conn,sql,rule.getPid(),rule.getSize());		
		  }catch(SQLException e) {
			  e.printStackTrace();
			    throw new  DaoException("添加出错",e);
		        }finally {
			    DbUtils.closeQuietly(conn);
		    }
	}
//删除
	@Override
	public int deleteRuleDao(Integer id) throws DaoException {
		//获取连接
		Connection conn=ConnectionFactory.getInstance().getConnection();
		       //准备语句
		 String sql="delete from rule where id=?";
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
	public int updateCate(Rule cate) throws DaoException {
		//获取连接
		Connection conn=ConnectionFactory.getInstance().getConnection();
       //准备语句
		String sql="update rule set pid=?,size=? where id=?";
	     try {
	    	 return qr.update(conn,sql,cate.getPid(),cate.getSize(),cate.getId());
	     }catch(SQLException e) {
	  			e.printStackTrace();
	  			throw new  DaoException("修改出错",e);
	  		}finally {
	  			DbUtils.closeQuietly(conn);
	  		}
	}
 //查询所有
	@Override
	public List<Rule> getRuleList() throws DaoException {
		//获取连接
		Connection conn=ConnectionFactory.getInstance().getConnection();
       //准备语句
		String sql="select id,pid,size from rule";
		
		List<Rule> list=new  ArrayList<Rule>();
		PreparedStatement pst=null;
		ResultSet rs=null;
	     try {
	    	 //step3:获取PreparedStatement,并且去发送sql
			   pst=conn.prepareStatement(sql);
			 //step5:发送sql
				rs=pst.executeQuery();
				//step6:处理返回结果
				while(rs.next()) {
					Rule cc=new Rule();
					Integer id = rs.getInt(1);
					cc.setId(id);
					Integer pid = rs.getInt(2);
					cc.setPid(pid);
					String size = rs.getString(3);
					cc.setSize(size);
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
