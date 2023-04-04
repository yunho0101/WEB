<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
	$(function() {
		$('#result').empty()
		$.ajax({
				url : "list5",
				success : function(x) {
					$('#result').append(x)
				} //success
			})
		
		$('#b1').click(function() {
			//기존의 것 삭제됨.
			$('#result').empty()
			$.ajax({
				url : "update2",
				data : {
					no: $("#no").val(),
					content :$("#content").val()
				},
				success : function(x) {
					$('#result').append(x)
				} //success
			}) //ajax
		})//b1
		$('#b2').click(function() {
			$('#result').empty()
			$.ajax({
				url : "list6",
				data : {
					bbsno : 1
				},
				success : function(x) {
					$('#result').append(x)
				} //success
			}) //ajax
		})//b2
		
	})//$
</script>
</head>
<body>
	게시물 번호 : <input id = "no" ><br>
	게시물 번호 : <input id = "no" ><br>
	<button id="b1">bbs 수정</button>
	<button id="b2">bbs 삭제</button>

	<hr color="red">
	<div id="result" style = "background: yellow"></div>
</body>
</html>