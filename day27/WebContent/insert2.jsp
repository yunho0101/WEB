<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 1.전달된 값 받아주세요(request 이용) -->
<!-- 2.dao에게 값 전달 (DAO이용) 생략 -->
<!-- 3. 전달된 값을 출력하는 결과를 브라우저에 Html로 보내주세요 -->
<%
	String no = request.getParameter("no");
String title = request.getParameter("title");
String writer = request.getParameter("writer");
String content = request.getParameter("content");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
	background: lime;
}
</style>
</head>
<body>
	글이 작성되었음
	<hr color="red">
	작성한 no:<%=no%><br> 
	글 제목:<%=title%><br> 
	작성자 이름 :<%=writer%><br>
	게시물 내용:<%=content%><br>
</body>
</html>