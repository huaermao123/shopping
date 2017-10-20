package com.neusoft.controller_gwc;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class gouwucheServlet
 */
@WebServlet("/gwcServlet")
public class gouwucheServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public gouwucheServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	    
		 //jsp中获取值==================
		String pname=request.getParameter("pname");
	    String price1=request.getParameter("price");
	    String shuliang=request.getParameter("shuliang");
	    String pno=request.getParameter("pno");
	   
	    //System.out.println(pname);
	    //System.out.println(price1);
	    //System.out.println(shuliang);

	      String uuid = UUID.randomUUID().toString().replaceAll("-", "");
	      //System.out.println(uuid);
	  //数量
	    Integer shu=Integer.getInteger(shuliang);
	  //价格  
	    Double price = Double.parseDouble(price1);
                     
	    Map map = new HashMap();
	    map.put("pname", pname);
	    map.put("price", price);
	    map.put("shuliang", shuliang);
	    map.put("pno",pno);
	    map.put("uuid", uuid);
	   // request.setAttribute("map",map );
	    
		
		//创建一回话域
		HttpSession session=request.getSession();
	
	      session.setAttribute("map", map);
	  
	      
	     //储存
	    //Object map2 =session.getAttribute("map");
	            
	    
	     
	  
	   request.getRequestDispatcher("gwc.jsp").forward(request, response);
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
