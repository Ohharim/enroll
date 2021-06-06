package com.dev.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.service.Service;
import com.dev.vo.EnrolmentVO;

public class ProfSEnrollController implements Controller{
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String num = request.getParameter("num");
		String title = request.getParameter("title");
		String maxNum = request.getParameter("maxNum");
		String studentNum = request.getParameter("studentNum");
		
		EnrolmentVO em = new EnrolmentVO();
		em.setId(num);
		em.setTitle(title);
		em.setMaxNum(maxNum);
		em.setStudentNum(studentNum);
		//service
		
		Service service = Service.getInstance();
		service.profSubjectEnroll(em);
		
		request.setAttribute("num", num);
		HttpUtil.forward(request, response, "/result/profSubjectList.jsp");
	}

}
