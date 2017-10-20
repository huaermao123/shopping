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
 //����
	QueryRunner qr = new QueryRunner();
	@Override
	public int insert(Rule rule) throws DaoException {
		//��ȡ����
		  Connection conn=ConnectionFactory.getInstance().getConnection();
		   //׼�����
		   String sql="insert into rule(pid,size)value(?,?)";
		   try {
			  return qr.update(conn,sql,rule.getPid(),rule.getSize());		
		  }catch(SQLException e) {
			  e.printStackTrace();
			    throw new  DaoException("���ӳ���",e);
		        }finally {
			    DbUtils.closeQuietly(conn);
		    }
	}
//ɾ��
	@Override
	public int deleteRuleDao(Integer id) throws DaoException {
		//��ȡ����
		Connection conn=ConnectionFactory.getInstance().getConnection();
		       //׼�����
		 String sql="delete from rule where id=?";
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
	public int updateCate(Rule cate) throws DaoException {
		//��ȡ����
		Connection conn=ConnectionFactory.getInstance().getConnection();
       //׼�����
		String sql="update rule set pid=?,size=? where id=?";
	     try {
	    	 return qr.update(conn,sql,cate.getPid(),cate.getSize(),cate.getId());
	     }catch(SQLException e) {
	  			e.printStackTrace();
	  			throw new  DaoException("�޸ĳ���",e);
	  		}finally {
	  			DbUtils.closeQuietly(conn);
	  		}
	}
 //��ѯ����
	@Override
	public List<Rule> getRuleList() throws DaoException {
		//��ȡ����
		Connection conn=ConnectionFactory.getInstance().getConnection();
       //׼�����
		String sql="select id,pid,size from rule";
		
		List<Rule> list=new  ArrayList<Rule>();
		PreparedStatement pst=null;
		ResultSet rs=null;
	     try {
	    	 //step3:��ȡPreparedStatement,����ȥ����sql
			   pst=conn.prepareStatement(sql);
			 //step5:����sql
				rs=pst.executeQuery();
				//step6:�������ؽ��
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
	  			throw new  DaoException("��ѯ����",e);
	  		}finally {
	  			DbUtils.closeQuietly(conn);
	  		}
	     return list;
	}

}