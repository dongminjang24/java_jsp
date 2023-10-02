package com.servlet.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */ 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
//		System.out.println(request.getParameter("userName"));
//		response.setContentType("text/html; charset=utf-8");
//		PrintWriter out	 =response.getWriter();
//		out.println("<h2>" + request.getParameter("userName")+"님 환영합니다.</h2>");
//		out.close();
//		request.getRequestDispatcher("").forward(request, response);//그전에 전달한 데이터를 초기화시키지 않고,지금처럼 전달받은 이름을 전달할게 있을 때는 초기화하지않
//		response.sendRedirect("");//초기화시키고 다음으로 넘어가는 개인정보와 관련된 페이지에서는 그렇게 하는게 좋음 
		// 포워드 방식은 request객체를 그대로 화며까지 전달한다.
		// redirect방식은 : request객체를 초기화한 후 화면으로 이동한다.
	request.setAttribute("userName", request.getParameter("userName"));
	request.setAttribute("userAge", Integer.valueOf(request.getParameter("userAge"))-1 );
	request.setAttribute("userGender", request.getParameter("userGender") );
	request.getRequestDispatcher("index.jsp").forward(request, response);// 시작점이 webContents
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
