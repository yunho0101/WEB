<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
	$(function() { //body부분이 dom tree로 메모리에 준비가 되었을 때, 
		//입력값으로 넣은 함수를 실행해주세요.
		//alert("월컴...월요일~~~")
		$('#b2').click(function() {
			$.ajax({
				url : "computer",
				data : {
					com : $('#com').val(),
					price : $('#price').val()
					
				},
				success : function(x) {
					alert('movie요청 성공!' )
					alert(x)
					$('#result').append(x + "<br>")
				},
				error : function() {
					alert('movie요청 실패!')
				} //error
			}) //ajax
		})//b2
	}) //$
</script>
</head>
<body>
	영화제목  :
	<input id="movie">
	<br> 컴퓨터 가격 :
	<input id="price">
	
	<input id="b2" type="button" value="영화 관람 확인">
	<br>
	<hr color="red">
	<div id="result"></div>
</body>
</html>