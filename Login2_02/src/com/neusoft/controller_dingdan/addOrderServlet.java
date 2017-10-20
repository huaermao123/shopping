package com.neusoft.controller_dingdan;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.entity.Orderinfo;
import com.neusoft.entity.Shoppinginfo_consumer;
import com.neusoft.services.OrderinfoService;
import com.neusoft.services.Shoppinginfo_consServices;

/**
 * Servlet implementation class addOrderServlet
 */
@WebServlet("/addOrder")
public class addOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addOrderServlet() {
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
		
		 String   orderno=request.getParameter("orderno");
		 
		 String   paystatus1=  request.getParameter("paystatus");
		 Integer paystatus =Integer.parseInt(paystatus1); 
		 
		 String   orderstaus1=  request.getParameter("orderstaus");
		  Integer orderstaus=Integer.parseInt(orderstaus1);
          //��������ʱ��
		 String   ordertime1=  request.getParameter("ordertime");
		 Long ordertime=Long.parseLong(ordertime1);
		 //֧��ʱ��
		 String    paytime1=  request.getParameter("paytime");
		   Long paytime=Long.parseLong(paytime1);
		 
		String   addrinfo1=  request.getParameter("addrinfo");
		 Integer addrinfo=Integer.parseInt(addrinfo1);
		 
		 
		 String   mask=  request.getParameter("mask");
		//ʱ��
		 System.out.println(ordertime1);
		 System.out.println(paytime1);
     
		 //��ҵ�acount_consumer���е�id=============
		 
		/* String aid1=request.getParameter("aid");
		 Integer aid=Integer.parseInt(aid1);
		 String  nickname=request.getParameter("nickname"); 
	     String money1=request.getParameter("money");
	     double money= Integer.parseInt(money1);
         
	     //������ѵ�ʱ��
	     String lasttime1=request.getParameter("lastttime");
	     Long lasttime=Long.parseLong(lasttime1);
	    		  
		 System.out.println(aid1);   
		 System.out.println(nickname);   
		 System.out.println(money1);   
		 System.out.println(lasttime1);   
           
		 
		 Shoppinginfo_consServices   sho= new Shoppinginfo_consServices();
	    Shoppinginfo_consumer shop=new Shoppinginfo_consumer(aid,nickname, money, lasttime);
	    
	    sho.insertShop(shop);*/
		
	    
	    
		 //�������
		   System.out.println(orderno);
		   //���ʽ
		   System.out.println(paystatus1);
		 //�Ƿ񸶿�
		 System.out.println(orderstaus1);
	     //��ַ
		 System.out.println(addrinfo);
		 //��ע
		  System.out.println(mask);

		  
		  
		 OrderinfoService  ord=	new OrderinfoService();
		 Orderinfo xi_ord= new Orderinfo(orderno,orderstaus,paystatus,ordertime,paytime,addrinfo,mask);
		 ord.insertOrd(xi_ord);
		 //==========������Ʒ�����Ķ���
		 
		 
		 
		 
		 
		 
		 
		 
		 
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