<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원상세보기 페이지</title>
</head>
<body>
	
	<table>
		<caption>회원정보 상세보기</caption>
		
		<tr>
			<th>아이디</th>
			<td>${view.memId}</td>
		</tr>
		
		<tr>
			<th>비밀번호</th>
			<td>${view.memPw}</td>
		</tr>
		
		<tr>
			<th>이름</th>
			<td>${view.memName}</td>
		</tr>
		
		<tr>
			<th>생년월일</th>
			<td>${view.memBirth}</td>
		</tr>
		
		<tr>
			<th>성별</th>
			<td>${view.memGender}</td>
		</tr>
		
		<tr>
			<th>이메일</th>
			<td>${view.memEmail}</td>
		</tr>
		
		<tr>
			<th>연락처</th>
			<td>${view.memPhone}</td>
		</tr>
		
		<tr>
			<th>주소</th>
			<td>${view.memAddr}</td>
		</tr>
		
		<tr>
			<th>프로필 사진</th>
			<td><img src="resources/Profile/${view.memProfileName}" width="200px"/><br/>
				${view.memProfileName}</td>
		</tr>
		
		
	</table>
</body>
</html>