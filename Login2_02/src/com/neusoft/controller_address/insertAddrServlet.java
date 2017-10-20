package com.neusoft.controller_address;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.entity.Address;
import com.neusoft.services.AdderssService;

/**
 * Servlet implementation class insertAddrServlet
 */
@WebServlet("/insertAddr")
public class insertAddrServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public insertAddrServlet() {
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
        
		
		String pri=request.getParameter("address1");
		String city=request.getParameter("address2");
		String area=request.getParameter("address3");
		System.out.println(pri+city+area);
		if(pri!=null&&city!=null&&area!=null) {
			
			  AdderssService address=new AdderssService();
			  Address addr=new Address(pri,city,area);
			 int getaddr=address.insertAddr(addr);
			request.getRequestDispatcher("getAddrPage?pageNo=1&pageSize=5").forward(request, response);
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
