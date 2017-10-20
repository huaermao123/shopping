package com.neusoft.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.entity.Cate;
import com.neusoft.services.CateService;

/**
 * Servlet implementation class GetAllServlet
 */
@WebServlet("/GetAllServlet")
public class GetAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetAllServlet() {
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
	//查询所有================	
		CateService  sCate2=new CateService();
	    List<Cate>  ddlist=sCate2.getCateList(); 
	     System.out.println(ddlist);
	     request.setAttribute("ddlist", ddlist);
		    //request.getRequestDispatcher("xiugai.jsp").forward(request, response);
		    request.getRequestDispatcher("Class2.jsp").forward(request, response);
		//添加========================
		   /*
		    * 获取值input(cname)、select(pid)
		    */
			
			String cname= request.getParameter("cate_id2");
			String spid2= request.getParameter("ss2");
		/* */
			
	        // System.out.println(cname);
	        // System.out.println(spid2);
	        
		  	/*
		  	 * 调用添加方法
		  	 */
		  
		   if(cname==null){
				   return;   
			}else{
				  
					   
			   
		   
		   
		    if(spid2!=null&&!spid2.equals("")&&cname!=null&&!cname.equals("")) {
			    int pid=Integer.parseInt(spid2);
			    
		    	  Cate cate=new Cate(pid,cname,pid);
		    	  int cus=sCate2.insert(cate);
		  	      
				
		   }
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
