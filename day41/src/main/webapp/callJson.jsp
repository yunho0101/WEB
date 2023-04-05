<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- content delivery network  : CDN -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(
				function() {
					$.ajax({
						url : "json.jsp",
						dataType : "json",
						success : function(json) {
							age1 = json.age
							name1 = json.name
							id1 = json.id
							$('#result').append(
									age1 + " " + name1 + " " + id1 + "<br>")
						} //success
					}) //ajax
				})//b1
		$('#b2').click(
				function() {
					$.ajax({
						url : "json2.jsp",
						dataType : "json",
						success : function(json) {
							age1 = json[1].age
							name1 = json[1].name
							id1 = json[1].id
							$('#result').append(
									age1 + " " + name1 + " " + id1 + "<br>")

						} //success
					}) //ajax
				})//b2

		$('#b3').click(
				function() {
					$.ajax({
						url : "json3.jsp",
						dataType : "json",
						success : function(json) {
							weather = json.weather
							temp = json.temp
							hum = json.hum
							$('#result').append(
									weather + " " + temp + " " + hum + "<br>")
							if (weather == 'rain') {
								$('#result').append(
										"<img src=resources/img/rain.png><br>")
							} else if (weather == 'sun') {
								$('#result').append(
										"<img src=resources/img/sun.jpg><br>")
							}
						} //success
					}) //ajax
				})//b3
		$('#b4').click(function() {
			$.ajax({
				url : "json4.jsp",
				dataType : "json",
				success : function(json) {
					max1 = json[0].max
					min1 = json[0].min
					end1 = json[0].end
					max2 = json[1].max
					min2 = json[1].min
					end2 = json[1].end
					$('#result').append("어제 주가: "+max1 + " " + min1 + " " + end1 + "<br>")
					$('#result').append("오늘 주가: "+max2 + " " + min2 + " " + end2 + "<br>")

				} //success
			}) //ajax
		})//b4	
	})//$
</script>

</head>
<body>
	<button id="b1">JSON을 받아오자.!</button>
	<button id="b2">JSONArray를 받아오자.!</button>
	<button id="b3">JSON3을 받아오자.!</button>
	<button id="b4">JSONArray4를 받아오자.!</button>
	<hr color="red">
	<div id="result"></div>
</body>
</html>