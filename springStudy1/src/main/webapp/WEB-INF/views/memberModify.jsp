<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 회원정보 수정 -->

<form method="post" action="/signUp">
	<input type="text" name="id" value="${info.userId }" readonly placeholder="아이디를 입력하세요"> <br>
	<input type="password" name="pw" placeholder="비밀번호를 입력하세요"> <br>
	<input type="email" name="email" value="${info.userEmail }" placeholder="이메일를 입력하세요"> <br>
	<input type="text" name="addr" value="${info.userAddr }" placeholder="주소를 입력하세요"> <br>
	<input type="text" name="job" value="${info.userJob }" placeholder="직업을 입력하세요"> <br>
	<input type="text" name="like" value="${info.userLike }" placeholder="좋아하는것을 입력하세요"> <br>
	<button>정보수정</button>
	
</form>

</body>
</html>