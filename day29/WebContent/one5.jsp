<%@page import="multi.RestVO"%>
<%@page import="multi.RestDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");

RestDAO dao = new RestDAO();
RestVO bag2 = dao.one(id);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	당신이 검색을 원하는 id는
	<%=id%>
	<hr color="red">
	<table class="table table-danger table-striped">
		<tr>
			<td>식당아이디</td>
			<td><%=bag2.getId()%></td>
		</tr>
		<tr>
			<td>식당이름</td>
			<td><%=bag2.getName()%></td>
		</tr>
		<tr>
			<td>대표메뉴</td>
			<td><%=bag2.getMenu()%></td>
		</tr>
		<tr>
			<td>음식 가격</td>
			<td><%=bag2.getPrice()%></td>
		</tr>
		<tr>
			<td>음식사진</td>
			<td><%=bag2.getImg()%></td>
		</tr>

	</table>
</body>
</html>