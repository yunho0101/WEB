<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
회원검색이 요청됨.!와~~~~!! 
<!-- 속성으로 지정한 값은 EL로 프린트 -->
<c:forEach items="${list}" var="vo">
<hr color="red">
${vo.id} <br>
${vo.pw} <br>
${vo.name} <br>
${vo.tel} <br>
</c:forEach>
</body>
</html>