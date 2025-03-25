<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 회원가입  -->
<form method="post" action="/signUp">
	
	<input type="hidden" name="id"><br>
	<input type="text" name="userId" placeholder="아이디를 입력하세요"> <br>
	<input type="password" name="userPw" placeholder="비밀번호를 입력하세요"> <br>
	<input type="email" name="userEmail" placeholder="이메일를 입력하세요"> <br>
	<input type="text" name="userAddr" placeholder="주소를 입력하세요"> <br>
	<input type="text" name="userJob" placeholder="직업을 입력하세요"> <br>
	<input type="text" name="userLike" placeholder="좋아하는것을 입력하세요"> <br>
	<button>회원가입</button>
	
</form>
</body>
</html>