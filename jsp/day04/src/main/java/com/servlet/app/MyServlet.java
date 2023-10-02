package com.servlet.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MybatisConfig;

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
		HashMap<String,String> result = new HashMap<>();
		int infoNumber =0;
		HashMap<String,String> dataMap = new HashMap<>();
		dataMap.put("infoName", request.getParameter("infoName"));
		dataMap.put("infoAge", request.getParameter("infoAge"));
		dataMap.put("infoGender", request.getParameter("infoGender"));

		SqlSession sqlSession = MybatisConfig.getSqlSessionFactory().openSession(true);//openSession true는 커밋이 저절로 된다는 
		
		System.out.println(infoNumber);
		sqlSession.insert("info.insert",dataMap);
		if((Integer)sqlSession.selectOne("info.getCount")>0) {
			infoNumber= sqlSession.selectOne("info.getSequence");
			sqlSession.delete("info.delete",infoNumber-1);
		}
		
		request.setAttribute("infoName",result.get("info_name"));
		request.setAttribute("infoAge",result.get("info_age"));
		request.setAttribute("infoGender",result.get("info_gender"));
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
