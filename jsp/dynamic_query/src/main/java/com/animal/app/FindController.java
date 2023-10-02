package com.animal.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import com.animal.app.dao.AnimalDAO;
import com.animal.app.vo.Criteria;

public class FindController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServerException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("application/json;charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		
		JSONArray animals = new JSONArray();
		
		Criteria criteria = new Criteria();
		criteria.setType(req. getParameter ("type"));
		criteria.setKeyword(req. getParameter("keyword")); 
		criteria.setOrder(req.getParameter("order"));
		
		
		AnimalDAO animalDAO = new AnimalDAO();
		animalDAO.find(criteria).stream() .map(animalVO -> new JSONObject(animalVO)).forEach(animal -> animals.put(animal));
		
		out.write(animals.toString());
		out.close();
		

	}

}
