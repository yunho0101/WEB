<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String title = request.getParameter("title");
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
게시판 수정 요청되었음.
<hr color="red">
수정할 title:<%=title %><br>
수정한 content:<%=content %>
</body>
</html>