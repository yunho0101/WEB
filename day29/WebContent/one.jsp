<%@page import="multi.BbsVO"%>
<%@page import="multi.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	
    	String no = request.getParameter("no"); //String, "100" 
    	
    	BbsDAO dao = new BbsDAO();
    	BbsVO bag2=dao.one(Integer.parseInt(no));
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
당신이 검색을 원하는 번호는 <%= no %>
<hr color="red">
검색한 제목:<%=bag2.getTitle() %><br>
검색한 내용:<%=bag2.getContent() %><br>
검색한 장소:<%=bag2.getWriter() %>
</body>
</html>