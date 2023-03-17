
<%@page import="multi.RestVO"%>
<%@page import="multi.RestDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	
    	RestDAO dao = new RestDAO();
    //5,6)dao가 리턴한 BbsVO가 들어간 ArrayList를 받는다. 
    	ArrayList<RestVO> list = dao.list();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
전체 영화 갯수: <%= list.size()  %>
<% if(list.size() == 0) { %>
<h3>등록된 영화가 없습니다.</h3>
<img src="img/empty.jpg" width=250 height="250">
<%}else{ %>
<table class="table table-warning table-striped">
 <tr>
 	<td>id</td>
 	<td>name</td>
 	<td>content</td>
 </tr>
<% 
	for(RestVO bag2: list){
%>
 <tr>
 	<td><%= bag2.getId() %></td>
 	<td>
 	        <!-- one4.jsp?id=102 -->
 		<a href="one5.jsp?id=<%= bag2.getId() %>">
			<%= bag2.getName() %>
		</a>
 	</td>
 	<td><%= bag2.getPrice() %></td>
 </tr>
 <% } //for %>
 </table>
 <% } //else %>
</body>
</html>