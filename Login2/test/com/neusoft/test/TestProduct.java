package com.neusoft.test;

import java.util.List;
import java.util.UUID;

import com.neusoft.dao.CateDao;
import com.neusoft.dao.DaoFactory;
import com.neusoft.dao.impl.ProductDaoImpl;
import com.neusoft.entity.Cate;
import com.neusoft.entity.PageModel;
import com.neusoft.entity.Product;

public class TestProduct {
	
  public static void main(String[] args) {
	
	  //商品编号表示
	 String dd= UUID.randomUUID().toString();
	 System.out.println(dd);
	  //testInsert();
	  //testUpdate();
	 // del();
	 getxy(); 
	 //getAll();
	  
  }
//添加
  public static void testInsert() {
	  for(int i=1;i<10;i++) {
		  Product pro4=new Product("343",i,"2ggg","url()",44,1,"sfdgsdfg");
			int cc=new ProductDaoImpl().insert(pro4);
			if(cc==1) {
				System.out.println("cuss");
	           }else {
	        	   System.out.println("fial");
	           }
	  }
	 
	
		
  
  }
  //修改 通过cid
  public static void testUpdate() {
		Product  proe=new Product(2,"44r7e","url()",554,1,"fdsafadfads");
		int cc=new ProductDaoImpl().updatePro(proe);
		System.out.println(cc);
		if(cc==1) {
			System.out.println("update");
		}else {
			System.out.println("fail");

		}
  }
  
  
  //删除(通过cid)
 public static void del() {
	 
	 int cc=new ProductDaoImpl().deletePro(360);
	 if(cc!=0) {
		 System.out.println(cc);
	 }else {
		 System.out.println("删除失败");
	 }
 }
 
 
 //查询分页
 public static void  getxy() {
	 PageModel<Product> cd= new ProductDaoImpl().getCatesByPage(1,2);
	 System.out.println(cd);
 }
 //查询
 public static void getAll() {
	  
	  List<Product> dd= new ProductDaoImpl().getProductList();
	  System.out.println(dd);
 }

 
 
}
  
  
  

