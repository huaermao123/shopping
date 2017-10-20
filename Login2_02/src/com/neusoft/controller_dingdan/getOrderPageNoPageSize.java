package com.neusoft.controller_dingdan;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.services.getOrderByPageService;

/**
 * Servlet implementation class getOrderPageNoPageSize
 */
@WebServlet("/getOrderPage")
public class getOrderPageNoPageSize extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getOrderPageNoPageSize() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//��ҳ��ѯ
		
				response.setContentType("text/html;charset=\"utf-8\"");
				request.setCharacterEncoding("utf-8");
				getOrderByPageService ff=new getOrderByPageService();
				
				ff.getOrderLogic(request, response);
				
			   request.getRequestDispatcher("getOrderPage?pageNo=1&pageSize=5").forward(request, response);

				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
