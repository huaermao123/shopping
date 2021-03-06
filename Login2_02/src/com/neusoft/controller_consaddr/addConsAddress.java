package com.neusoft.controller_consaddr;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.entity.Consumer;
import com.neusoft.entity.Consumer_addr;
import com.neusoft.services.Consumer_addrService;

/**
 * Servlet implementation class addConsAddress
 */
@WebServlet("/addConsAddr")
public class addConsAddress extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addConsAddress() {
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
		String  name=request.getParameter("name");
		String  addr=request.getParameter("addr");
		String phone=request.getParameter("phone");
		String provice=request.getParameter("p");
		String city=request.getParameter("c");
		String area=request.getParameter("d");
		String  adder=request.getParameter("adder");
		System.out.println(name+addr+phone);
		System.out.println(phone+provice+city);
		System.out.println(adder);

		Consumer_addrService dd= new Consumer_addrService();
		Consumer_addr conss=new Consumer_addr(name,addr,phone,provice,city,area,adder);
        dd.insertAddr(conss);
         
         request.getRequestDispatcher("AfterIndex.jsp").forward(request, response);
		
		
		
		
		
	   
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
