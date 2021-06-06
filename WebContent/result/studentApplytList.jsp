 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	[학생:수강신청한 과목 리스트]
	<tr>
	<td>과목번호</td><td>과목명</td>
	</tr>
	
	<tr>
	<td>${em.num }</td>
	<td>${em.title }</td>
	</tr>
	<%@ include file="menu.jsp" %>
</body>
</html>