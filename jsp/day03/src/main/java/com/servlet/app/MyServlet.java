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
//		HashMap<String,String> result = new HashMap<>();
		HashMap<String,Object> resultMap =new HashMap<>();
		HashMap<String,String> dataMap = new HashMap<>();
		int infoNumber =0 ,infoAge =0;
		String infoName =null,infoGender = null;
		dataMap.put("infoName", request.getParameter("infoName"));
		dataMap.put("infoAge", request.getParameter("infoAge"));
		dataMap.put("infoGender", request.getParameter("infoGender"));

		SqlSession sqlSession = MybatisConfig.getSqlSessionFactory().openSession(true);//openSession true는 커밋이 저절로 된다는 
		sqlSession.insert("info.insert",dataMap);
		infoNumber= sqlSession.selectOne("info.getSequence");
		resultMap = sqlSession.selectOne("info.selectInfo",infoNumber);
		infoName = (String)resultMap.get("info_name");
		infoAge = (Integer)resultMap.get("info_age");
		infoGender = (String)resultMap.get("info_gender");
//		infoNumber= sqlSession.selectOne("info.getSequence");
//		result = sqlSession.selectOne("info.selectInfo",infoNumber);
		//mapper에서 esultType을 map으로 작성한다면, 반드시 HashMap에서 제네릭을 Object로 설정한다. 쿼리로 받을때
		// 하지만 제네릭에 String을 작성해서 컴파일 오류가 발생하지 않고, 값을 가져올때 런타임 오류가 발생한다.
		//결론: resultType에 map은 앞으로 사용하지 말자.
//		
//		request.setAttribute("infoName",result.get("info_name"));
//		request.setAttribute("infoAge",result.get("info_age"));
//		request.setAttribute("infoGender",result.get("info_gender"));
//		request.getRequestDispatcher("index.jsp").forward(request, response);// 시작점이 webContents
		request.getRequestDispatcher ("index.jsp?infoName=" + infoName + "&infoAge=" + infoAge + "&infoGender="+infoGender). forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
