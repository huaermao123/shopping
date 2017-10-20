package com.neusoft.controller_pro;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.services.CateService;
import com.neusoft.services.ProductService;

/**
 * Servlet implementation class delProServlet
 */
@WebServlet("/delPro")
public class delProServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public delProServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=\"utf-8\"");
		request.setCharacterEncoding("utf-8");
	  
		
		//É¾³ýµÄ½Úµã
		

		String delId = request.getParameter("cid");
		System.out.println(delId);
		
		if(delId!=null) {
			Integer dd = Integer.parseInt(delId);
			System.out.println(dd);
			ProductService del_Id=new ProductService();
			int c= del_Id.deletePro(dd);
			
			 request.getRequestDispatcher("getProPage?pageNo=1&pageSize=5").forward(request, response);

		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
