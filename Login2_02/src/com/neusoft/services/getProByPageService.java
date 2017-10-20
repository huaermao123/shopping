package com.neusoft.services;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.dao.DaoException;
import com.neusoft.dao.impl.ProductDaoImpl;
import com.neusoft.entity.PageModel;
import com.neusoft.entity.Product;

public class getProByPageService {

	
	/**
	 * ��ѯҵ���߼�
	 * */
	public void getProLogic(HttpServletRequest request,HttpServletResponse response) throws DaoException,ServletException,IOException{
		
		
		String pageNo=request.getParameter("pageNo");
		String pageSize=request.getParameter("pageSize");
		try {
			int _pageNo=Integer.parseInt(pageNo);
			int _pageSize=Integer.parseInt(pageSize);
			
			PageModel<Product>  cates=new ProductDaoImpl().getCatesByPage(_pageNo,_pageSize);
			if(cates!=null) {
				int totalPageSize= (cates.getTotalcount()%_pageSize==0?cates.getTotalcount()/_pageSize:cates.getTotalcount()/_pageSize+1);
				cates.setTotalPageSize(totalPageSize);
				cates.setPageNo(_pageNo);
			}
			
			request.setAttribute("cates", cates);
			request.getRequestDispatcher("new_shangping.jsp").forward(request, response);
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
}
}
