package com.dev.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.service.Service;
import com.dev.vo.EnrolmentVO;

public class StudentApplyController implements Controller{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		String job = request.getParameter("job");
		String path = null;
		
		if(job.equals("search"))
			path = "/result/studentApply.jsp";
		
		Service service =Service.getInstance();
		EnrolmentVO em = service.EnrolmentSearch(id);
		
		HttpUtil.forward(request, response, "/result/studentSubjectList.jsp");
	}
}
