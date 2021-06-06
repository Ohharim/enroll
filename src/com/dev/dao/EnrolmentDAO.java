package com.dev.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.dev.vo.EnrolmentVO;

public class EnrolmentDAO {
	private static EnrolmentDAO dao = new EnrolmentDAO();
	private EnrolmentDAO() {}
	public static EnrolmentDAO getInstance()
	{
		return dao;
	}
	
	public Connection connect()
	{
		Connection conn = null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/exam", "root", "cs1234");
		}catch(Exception e) 
		{
			System.out.println("Conn error!!!");
		}
		return conn;
	}
	
	private void close(Connection conn, PreparedStatement pstmt) {
		// TODO Auto-generated method stub
		if(pstmt != null)
		{
			try
			{
				conn.close();
			}catch(Exception e) {}
		}
	}
	
	private void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		// TODO Auto-generated method stub
		if(pstmt != null)
		{
			try
			{
				conn.close();
			}catch(Exception e) {}
		}
		if(conn != null)
		{
			try
			{
				conn.close();
			}catch(Exception e) {}
		}
		if(rs != null)
		{
			try
			{
				rs.close();
			}catch(Exception e) {}
		}
	}
	
	public boolean index(String id, String pwd) { //login
		// TODO Auto-generated method stub
		boolean result = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try 
		{
			conn = connect();
			pstmt = conn.prepareStatement("select * from account where id= ? and pwd = ?;");
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			rs = pstmt.executeQuery();
			if(rs.next())
			{
				result = true;
			}
			else 
				result = false;	
		}catch(Exception e) 
		{
			System.out.println("login error"+e);	
		}
		finally 
		{
			close(conn, pstmt, rs);		
		}
		return result;
	}
	
	public EnrolmentVO studentApply(String id) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		EnrolmentVO em = null;
		try 
		{
			conn = connect();
			pstmt = conn.prepareStatement(null);
			ResultSet rs = pstmt.executeQuery("select * from subject where num = ?;");
				if(!rs.next())
				{
					System.out.println("error");
				}
				while(rs.next())
				{
					String num = rs.getString("num");
					String title = rs.getString("title");
					System.out.println("" +num+ "" +title+ "");
				}
		}catch(Exception e) {
			System.out.println("MDAO:mInsert"+e);
		}
		finally 
		{
			close(conn, pstmt);	
		}
		return em;
	}
	

	
	public void profEnrollSubject(EnrolmentVO em) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		try 
		{
			conn = connect();
			pstmt = conn.prepareStatement("insert into subject values(?,?);");
			pstmt.setString(1, em.getId());
			pstmt.setString(2, em.getTitle());
			pstmt.executeUpdate();
		}catch(Exception e) {
			System.out.println("MDAO:mInsert"+e);
		}finally {
			close(conn, pstmt);
			
		}
		
	}
	//뫄목 리스트 출력 
	public List<EnrolmentVO> selectAllSubject(){
		List<EnrolmentVO> list = new ArrayList<EnrolmentVO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			System.out.println("access DB");
			conn = connect();
			pstmt = conn.prepareStatement("select * from member");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EnrolmentVO em = new EnrolmentVO();
				em.setId(rs.getString("num"));
				em.setStudentNum(rs.getString("StudentNum"));
				em.setTitle(rs.getString("title"));
			}
		} catch (Exception e) {
			System.out.println("MDAO:mInsert"+e);
		}finally {
			close(conn, pstmt, rs);
		}
		return list;
	}
	
	public EnrolmentVO Search(String num)
	{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		EnrolmentVO em = null;
		try 
		{
			conn = connect();
			pstmt = conn.prepareStatement("select * from account where num= ?;");
			pstmt.setString(1, num);
			rs = pstmt.executeQuery();
			if(rs.next())
			{
				em = new EnrolmentVO();
				em.setNum(rs.getString(1));
			}
			
		}catch(Exception e) 
		{
			System.out.println("error"+e);	
		}
		finally 
		{
			close(conn, pstmt, rs);		
		}
		return em;
	}

}
