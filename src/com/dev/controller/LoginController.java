package com.dev.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dev.service.Service;
import com.dev.vo.EnrolmentVO;

public class LoginController implements Controller{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		EnrolmentVO em = new EnrolmentVO(id, pwd);
		
		Service s = Service.getInstance();
		boolean result = s.index(id, pwd);
		String path = null;
		if(result)
		{
			HttpSession session = request.getSession();
			session.setAttribute("id", id);
			path = "/profMenu.jsp";
			path = "/studentMenu.jsp";
		}
		else
		{
			path = "index.jsp";
		}
			
		HttpUtil.forward(request, response, path);
	}

	
}
