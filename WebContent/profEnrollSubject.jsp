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
	<form action="profEnrollSubject.do" method="post">
	ID : <input type = "text" name = "num" value = "num">교과목 번호<br>
	TITLE : <input type = "text" name = "title">강의명<br>
	# of Student : <input type = "text" name = "studentNum">학생 수<br>
	<a href = "profMenu.jsp">Enroll</a>
	</form>
</body>
</html>