package com.servlet.app;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MybatisConfig;


public class MyServlet extends HttpServlet {
       
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request,response);
	}
	
	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		HashMap<String,String> result = new HashMap<>();
		SqlSession sqlSession = MybatisConfig.getSqlSessionFactory().openSession(true);//openSession true는 커밋이 저절로 된다는 

		result.put("member_id", request.getParameter("id"));
		result.put("member_password1", request.getParameter("password1"));
		result.put("member_password2", request.getParameter("password2"));
		result.put("member_phone_number", request.getParameter("phone_number"));
		result.put("member_email", request.getParameter("email"));
		result.put("member_job", request.getParameter("job"));
		result.put("member_age", request.getParameter("age"));
		result.put("member_info", request.getParameter("info"));

	

		
		String [] arr = request.getParameterValues("hobby");
		
		String data="";
		for(String string :arr) {
			data += string + " ";
		}
		result.put("member_hobby", data);


		
		if(request.getParameter("password1").equals(request.getParameter("password2"))) {
			sqlSession.insert("join.insert",result);
			request.getRequestDispatcher("MemeberList.jsp").forward(request, response);// 시작점이 webContents


			
		}else {
			request.setAttribute("msg", "패스워드가 일치하지 않습니다.");
			RequestDispatcher dis =request.getRequestDispatcher("LoginError.jsp");
			dis.forward(request,response);
			
		}
		
		
		
		
	}

}
