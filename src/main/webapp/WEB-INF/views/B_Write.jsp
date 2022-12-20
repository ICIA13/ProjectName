<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 작성 페이지</title>
</head>
<body>
	<form action="boWrite" method="POST" enctype="multipart/form-data">
	<input type="hidden" value="${loginId}" name="boWriter"/>
	
	<table>
		<caption>게시글 작성</caption>
		
		<!-- 
			<tr>
				<th>작성자</th>
				<td><input type="text" name="boWriter"/></td>
			</tr>
			작성자 대신에 로그인 한 아이디를 작성자로 대신하다.
		 -->
		
		<tr>
			<th>제목</th>
			<td><input type="text" name="boTitle"/></td>
		</tr>
		
		<tr>
			<th>내용</th>
			<td><textarea name="boContent" rows="5" cols="20"></textarea></td>
		</tr>
		
		<tr>
			<th>첨부파일</th>
			<td><input type="file" name="boFile"/></td>
		</tr>
		
		
		
		<tr>
			<th colspan="2">
				<input type="submit" value="등록"/>
			</th>
		</tr>
	</table>
	</form>
</body>
</html>