<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Subject
<form method="post" action="search.do">
	<select>
	<option value = "num"></OPTION>
	</select>
	ID : <input type = "text" name = "num"> 
	<input type = "submit" value="Search">	
</form>
<form action="StudentApply.do" method="post" >
${em.num } / ${em.title } <input type = "submit" value="Enrolment">
</form>>
	<%@ include file="index.jsp" %>
</body>
</html>