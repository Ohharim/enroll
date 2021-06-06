package com.dev.vo;

public class EnrolmentVO {
	private String id;
	private String pwd;
	private String num;	
	private String title;
	private String studentNum;
	private String maxNum;
	public EnrolmentVO() {}
	
	public EnrolmentVO(String tId, String tPwd) 
	{
		this.id = tId;
		this.pwd = tPwd;
	}
	public String getId()
	{
		return id;
	}
	public void setId(String tId)
	{
		this.id = tId;
	}
	public String getPwd()
	{
		return pwd;
	}
	public void setPwd(String tPwd)
	{
		this.id = tPwd;
	}
	public String getNum()
	{
		return num;
	}
	public void setNum(String tNum)
	{
		this.num = tNum;
	}
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String tTitle)
	{
		this.title = tTitle;
	}
	public String getStudentNum()
	{
		return studentNum;
	}
	public void setStudentNum(String tStudentNum) 
	{
		this.studentNum = tStudentNum;
	}
	public String getMaxNum()
	{
		return maxNum;
	}
	public void setMaxNum(String tMaxNum) 
	{
		this.maxNum = tMaxNum;
	}
}
