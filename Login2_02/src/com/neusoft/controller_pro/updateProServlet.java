package com.neusoft.controller_pro;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.entity.Product;
import com.neusoft.services.ProductService;

/**
 * Servlet implementation class updateProServlet
 */
@WebServlet("/updatePro")
public class updateProServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateProServlet() {
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
		
		String pname= request.getParameter("pname");
		
		String scid= request.getParameter("scid");
		int cid=Integer.parseInt(scid);
		String pno=request.getParameter("pno");
		String pic= request.getParameter("pic");
		String sprice= request.getParameter("sprice");
        int  price=Integer.parseInt(sprice);
		String sonline= request.getParameter("sonline");
		 int  online=Integer.parseInt(sonline);
		 String pdetail= request.getParameter("pdetail");
		 System.out.println(pname);
		 System.out.println(scid);
		 System.out.println(pno);
		 System.out.println(pic);
		 System.out.println(sprice);
		 System.out.println(pdetail);
		 
			 Product addP=new Product(pname,cid,pno,pic,price,online,pdetail);
			 ProductService exepro=new ProductService();
			 exepro.updatePro(addP);
	 		 request.getRequestDispatcher("getProPage?pageNo=1&pageSize=5").forward(request, response);
 
	
 		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
