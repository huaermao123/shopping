package com.neusoft.controller_cons;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.entity.Consumer;
import com.neusoft.services.ConsumerService;

/**
 * Servlet implementation class addConsServlet
 */
@WebServlet("/addCons")
public class addConsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addConsServlet() {
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
		
	   /*
	      String logintime=request.getParameter("");
	     Long time1=Long.parseLong("logintime");
	     String lasttime= request.getParameter("");
	     Long las_time=Long.parseLong("lasttime");
	     String  ip=request.getParameter("");
	     */
	    /* String id_=request.getParameter("id0");
	     System.out.println(id_);
	     
	     Integer id0 = Integer.parseInt(id_);
	     System.out.println(id0);*/
	     
	     
	     ConsumerService Cons=  new ConsumerService();
	     String huiyuanname=request.getParameter("h_name");
	    
	     String huiyuanpsw=request.getParameter("h_psw");
	    
	     
	     
	   
	    
	     Consumer sCons= new Consumer(huiyuanname,huiyuanpsw);
	    Cons.insertConsumer(sCons);
	    request.getRequestDispatcher("Login.jsp").forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}