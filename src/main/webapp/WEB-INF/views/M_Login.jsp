<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 페이지</title>
</head>
<body>
	<form action="mLogin" method="POST">
	<table>
		<caption>로그인</caption>
		<tr>
			<th>아이디</th>
			<td><input type="text" name="memId"/></td>
		</tr>
		<tr>
			<th>비밀번호</th>
			<td><input type="password" name="memPw"/></td>
		</tr>
		<tr>
			<th colspan="2">
				<input type="submit" value="로그인"/>
			</th>
		</tr>
	</table>
	</form>
</body>
</html>