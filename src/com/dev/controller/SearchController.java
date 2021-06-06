package com.dev.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.service.Service;
import com.dev.vo.EnrolmentVO;

public class SearchController implements Controller{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String num = request.getParameter("num");
		String job = request.getParameter("job");
		String path = null;
		if (job.equals("search"))
			path = "/studentApply.jsp";
		
		Service service = Service.getInstance();
		EnrolmentVO em = service.studentApply(num);

	}
}
