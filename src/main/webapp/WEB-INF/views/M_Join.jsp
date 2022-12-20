<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 페이지</title>
</head>
<body>
	<form action="mJoin" method="POST" enctype="multipart/form-data">
	<table>
		<caption>회원가입 양식</caption>
		
		<tr>
			<th>아이디</th>
			<td><input type="text" name="memId"/></td>
		</tr>
		
		<tr>
			<th>비밀번호</th>
			<td><input type="password" name="memPw"/></td>
		</tr>
		
		<tr>
			<th>이름</th>
			<td><input type="text" name="memName"/></td>
		</tr>
		
		<tr>
			<th>생년월일</th>
			<td><input type="date" name="memBirth"/></td>
		</tr>
		
		<tr>
			<th>성별</th>
			<td>남 <input type="radio" name="memGender" value="남"/>
			    여 <input type="radio" name="memGender" value="여"/></td>
		</tr>
		
		<tr>
			<th>이메일</th>
			<td><input type="email" name="memEmail"/></td>
		</tr>
		
		<tr>
			<th>연락처</th>
			<td><input type="text" name="memPhone"/></td>
		</tr>
		
		<tr>
			<th>주소</th>
			<td><input type="text" name="memAddr"/></td>
		</tr>
		
		<tr>
			<th>프로필 사진</th>
			<td><input type="file" name="memProfile"/></td>
		</tr>
		
		<tr>
			<th colspan="2">
				<input type="submit" value="가입"/>
			</th>
		</tr>
	</table>
	</form>
</body>
</html>