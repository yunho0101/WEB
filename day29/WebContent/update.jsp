<%@page import="multi.MemberDAO3"%>
<%@page import="multi.MemberVO"%>
<%@page import="javax.net.ssl.HttpsURLConnection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String id = request.getParameter("id");
    String tel = request.getParameter("tel");
	
    MemberVO bag= new MemberVO();
    bag.setId(id);
    bag.setTel(tel);
    
    MemberDAO3 dao=new MemberDAO3();
    dao.update(bag);
    
    
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