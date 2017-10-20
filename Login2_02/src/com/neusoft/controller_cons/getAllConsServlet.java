package com.neusoft.controller_cons;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.neusoft.entity.Consumer;
import com.neusoft.services.ConsumerService;

/**
 * Servlet implementation class getAllConsServlet
 */
@WebServlet("/getAllCons")
public class getAllConsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getAllConsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unused")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		 response.setContentType("text/html;charset=\"utf-8\"");
	     request.setCharacterEncoding("utf-8");
	     PrintWriter pw = response.getWriter();
	     String loginname=request.getParameter("name");
	     String password= request.getParameter("psw");
		 if(loginname==null||loginname.equals(""))
	  	   {
			 pw.append("<script>alert(\"�û�������Ϊ��\")</script>");
			    request.getRequestDispatcher("Login.jsp").forward(request, response); 

			 return;
	  	   }
	  	   if(password==null||password.equals(""))
	  		
	  	   {
	  		 
	  		 pw.append("<script>alert(\"���벻��Ϊ��\")</script>");
			 request.getRequestDispatcher("Login.jsp").forward(request, response); 
	  		   return;
	  	   }
	    
	  	
 			
	                            
	     Consumer namePsw= new Consumer(loginname,password,request.getRemoteAddr());
	    
	     if(namePsw!=null) {
	    	 ConsumerService   cc=new ConsumerService();
		     cc.doLogin(namePsw);
		      System.out.println(namePsw);
		  	//����һ�ػ���
				HttpSession session=request.getSession();
				session.setAttribute("namePsw", namePsw);
		     
		     request.getRequestDispatcher("AfterIndex.jsp").forward(request, response); 
	     
	     }else{
	    	 pw.append("<script>alert(\"�Բ���,��¼ʧ��!\")</script>");
			    //request.getRequestDispatcher("Login.jsp").forward(request, response); 

	  		 //return;
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