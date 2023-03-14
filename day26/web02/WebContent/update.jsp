<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String id = request.getParameter("id");
    String tel = request.getParameter("tel");

    
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
회원정보 수정 요청되었음.
<hr color="red">
수정할 id:<%=id %><br>
수정한 tel:<%=tel %>
</body>
</html>