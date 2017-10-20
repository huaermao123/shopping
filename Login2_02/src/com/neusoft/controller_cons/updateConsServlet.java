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
 * Servlet implementation class updateConsServlet
 */
@WebServlet("/updateConsServlet")
public class updateConsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateConsServlet() {
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
		
		
		  String name1= request.getParameter("name1");
		  System.out.println(name1);
		  request.setAttribute("name1", name1);
		  ConsumerService Cons=new ConsumerService();
		  // Integer name1 = Integer.parseInt(name0);
			//System.out.println(name0);
		
			
		    String hpsw = request.getParameter("hpsw");
			System.out.println(hpsw);
			if(hpsw!=null&&!hpsw.equals("")) {
			Consumer ucon=new Consumer(name1,hpsw);
			Cons.updateConsumer(ucon);
			  request.getRequestDispatcher("Login.jsp").forward(request, response);
		    return;
			}else {
				request.setAttribute("name1", name1);
				request.getRequestDispatcher("xiugaimima.jsp").forward(request, response);

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
