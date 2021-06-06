package com.dev.service;

import com.dev.dao.EnrolmentDAO;
import com.dev.vo.EnrolmentVO;

public class Service {
	private static Service service = new Service();
	public EnrolmentDAO dao = EnrolmentDAO.getInstance();
	private Service() {}
	
	public static Service getInstance() {
		// TODO Auto-generated method stub
		return service;
	}

	public void profSubjectEnroll(EnrolmentVO em) {
		// TODO Auto-generated method stub
		dao.profEnrollSubject(em);
	}

	public EnrolmentVO studentApply(String id) {
		// TODO Auto-generated method stub
		EnrolmentVO em = dao.studentApply(id);
		return em;
	}

	public EnrolmentVO Search(String num) {
		// TODO Auto-generated method stub
		EnrolmentVO em = dao.studentApply(num);
		return em;
	}
	
	public boolean index(String id, String pwd) {
		return dao.index(id, pwd);
	}

	public EnrolmentVO EnrolmentSearch(String id) {
		// TODO Auto-generated method stub
		return null;
	}


}
