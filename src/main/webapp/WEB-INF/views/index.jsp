<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원제 게시판</title>
</head>
<body>
	<h1>회원제 게시판 index 페이지</h1>
	
	
	<!-- c:choose는 switch-case문법과 비슷(choose=switch, when=case, otherwise=default -->
	<!-- 
		c when test = "${loginId eq 'admin'}" : 관리자로 로그인 했을 경우
		c when test = "${loginId ne null}" : 일반 사용자로 로그인 했을 경우
		c otherwise : 로그인을 하지 않았을 경우
	 -->
	
	<c:choose>
	
		<c:when test = "${loginId eq 'admin'}">
			<h3>로그인 아이디 : ${loginId}</h3>
			<button onclick="location.href='mList'">회원목록</button>
			<button onclick="location.href='boWriteFrom'">게시글 작성</button>			
			<button>게시글 목록</button>			
			<button>로그아웃</button>
		</c:when>
		
		<c:when test = "${loginId ne null}">
			<h3>로그인 아이디 : ${loginId}</h3>
			<button onclick="location.href='boWriteFrom'">게시글 작성</button>		
			<button>게시글 목록</button>
			<button>로그아웃</button>
		</c:when>
		
		<c:otherwise>
			<button onclick="location.href='mJoinForm'">회원가입</button>
			<button onclick="location.href='mLoginForm'">로그인</button>
			<button>회원목록</button>
		</c:otherwise>
	
	</c:choose>
	
	
	
	
</body>
</html>