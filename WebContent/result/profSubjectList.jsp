<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	[교수:등록한 과목 리스트]
	<tr>
	<td>과목번호</td><td>과목명</td><td>최대인원</td><td>수강인원</td>
	</tr>
	
	<tr>
	<td><a href = "/studentList.do">${em.num }</a></td>
	<td>${em.title }</td>
	<td>${em.maxNum }</td>
	<td>${em.studentNum }</td>
	</tr>
	<%@ include file="menu.jsp" %>
</body>
</html>