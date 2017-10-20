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


import com.neusoft.entity.PageModel;
import com.neusoft.entity.Product;
import com.neusoft.utils.ConnectionFactory;

public class ProductDaoImpl {

	QueryRunner qr = new QueryRunner();
	
	/*
	 *��ҳ
	 */

	public PageModel<Product> getCatesByPage(int pageNo, int pageSize) throws DaoException {
		// TODO Auto-generated method stub
	
		PageModel<Product>  model=null;
		
		//��ȡ����
		Connection conn=ConnectionFactory.getInstance().getConnection();
				
		 //sql
		String totalcount_sql="select count(cid) from product";
		//��ѯ�ܵļ�¼  ScalarHandler:��һ�е�һ�е�ֵ
		ResultSetHandler<Long> rsh=new ScalarHandler<Long>();
		try {
			Integer totalcount=qr.query(conn, totalcount_sql, rsh).intValue();
			
			if(totalcount>0) {
				model=new PageModel<Product>();
				model.setTotalcount(totalcount);
				//��ҳ��ѯ
				String sql="select id,pname,cid,pno,pic,price,online,pdetail from product   order by cid desc limit ?,?";
			    System.out.println(sql);
				Object[] params= {(pageNo-1)*pageSize,pageSize};
				List<Product> pros=qr.query(conn, sql, new BeanListHandler<Product>(Product.class), params);

				model.setDatas(pros);
			   }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new DaoException("��ҳ��ѯ����������",e);
		}finally {
			DbUtils.closeQuietly(conn);
		}
		return model;
	}
	
	

	
	
	

	/*
	 * ����
	 */
	public int insert(Product  pro)throws DaoException{
		//��ȡ����
  Connection conn=ConnectionFactory.getInstance().getConnection();
   //׼�����
   String sql="insert into Product(pname,cid,pno,pic,price,online,pdetail)value(?,?,?,?,?,?,?)";
   try {
	  return qr.update(conn,sql,pro.getPname(),pro.getCid(),pro.getPno(),pro.getPic(),pro.getPrice(),pro.getOnline(),pro.getPdetail());		
  }catch(SQLException e) {
	  e.printStackTrace();
	    throw new  DaoException("���ӳ���",e);
        }finally {
	    DbUtils.closeQuietly(conn);
    }
	
	  }
   /*
    * �޸�
    */

	public int updatePro(Product pro) throws DaoException{
		//��ȡ����
		Connection conn=ConnectionFactory.getInstance().getConnection();
       //׼�����
		String sql="update product set pname=?,pic=?,price=?,online=?,pdetail=? where cid=?";
	     try {
	    	 return qr.update(conn,sql,pro.getPname(),pro.getPic(),pro.getPrice(),pro.getOnline(),pro.getPdetail(),pro.getCid());
	     }catch(SQLException e) {
	  			e.printStackTrace();
	  			throw new  DaoException("�޸ĳ���",e);
	  		}finally {
	  			DbUtils.closeQuietly(conn);
	  		}
	}
 	
	
	
	
	 /*
	 * ɾ��
	 */
	public int deletePro(Integer cid)throws DaoException{
		//��ȡ����
		Connection conn=ConnectionFactory.getInstance().getConnection();
		       //׼�����
		 String sql="delete from product where cid=?";
		     try {
		  		return qr.update(conn,sql,cid);		
		  		}catch(SQLException e) {
		  			e.printStackTrace();
		  			throw new  DaoException("ɾ������",e);
		  		}finally {
		  			DbUtils.closeQuietly(conn);
		  	}
	}
	/*
	 * ���еĲ�ѯ
	 */
	
	/*
	 * ��ѯ������Ϣ
	 */

	public List<Product> getProductList() throws DaoException {
		// TODO Auto-generated method stub
		//��ȡ����
		Connection conn=ConnectionFactory.getInstance().getConnection();
       //׼�����
		String sql="select id,pname,cid,pno,pic,price,online,pdetail from product";
		
		List<Product> list=new  ArrayList<Product>();
		PreparedStatement pst=null;
		ResultSet rs=null;
	     try {
	    	 //step3:��ȡPreparedStatement,����ȥ����sql
			   pst=conn.prepareStatement(sql);
			 //step5:����sql
				rs=pst.executeQuery();
				//step6:�������ؽ��
				while(rs.next()) {
					Product cc=new Product();
					Integer id = rs.getInt(1);
					cc.setId(id);
					String pname = rs.getString(2);
					cc.setPname(pname);
					Integer cid = rs.getInt(3);
					cc.setCid(cid);
					String pno = rs.getString(4);
					cc.setPno(pno);
					String pic = rs.getString(5);
					cc.setPic(pic);
					Integer price = rs.getInt(6);
					cc.setPrice(price);
					Integer online = rs.getInt(7);
					cc.setOnline(online);
					String pdetail = rs.getString(8);
					cc.setPdetail(pdetail);
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
	
	

	
	
	
