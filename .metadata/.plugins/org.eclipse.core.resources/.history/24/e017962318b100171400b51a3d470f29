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
		
		
		  String bid0 = request.getParameter("bid1");
		  System.out.println(bid0);
		  ConsumerService del_Id=new ConsumerService();
		   Integer bid1 = Integer.parseInt(bid0);
			System.out.println(bid1);
		
			String hname = request.getParameter("hname");
			System.out.println(hname);
			String hpsw = request.getParameter("hpsw");
			System.out.println(hpsw);
			if(hname!=null&&!hname.equals("")&&hpsw!=null&&!hpsw.equals("")) {
				Consumer ucon=new Consumer(bid1,hname,hpsw);
			    del_Id.updateConsumerAll(ucon);
			  request.getRequestDispatcher("getConsPage?pageNo=1&pageSize=5").forward(request, response);
		
			}else {
				request.setAttribute("bid1", bid1);
				request.getRequestDispatcher("updateCon.jsp").forward(request, response);

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
