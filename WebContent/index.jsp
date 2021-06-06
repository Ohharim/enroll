<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
YongIn LMS <br>
	<form action="index.do" method="post">
		ID : <input type = "text" name = "id"><br>
		PASSWORD : <input type = "password" name = "pwd"><br>
		Professor <input type = "radio" name = "prof" value = "0">
		Student <input type = "radio" name = "std" value = "1" checked>
		<input type = "submit" value = "send">
	</form>

</body>
</html>