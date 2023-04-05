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
			$('#b22').click(function() {
				$('#result').empty()
		         $.ajax({
		            url: "jsonResponse4",
		            dataType : "json",
		            success: function(array) {
		    
		              for(i=0;i<array.length;i++){
		            	console.log(array[i].id+""+array[i].pw+""+array[i].name+""+array[i].tel)
		            	
		            		table = "<table><tr><td>항목명</td><td>값</td></tr>" + 
		    					"<tr><td>아이디</td><td>" + array[i].id +"</td></tr>" + 
		    					"<tr><td>패스워드</td><td>" + array[i].pw +"</td></tr>" + 
		    					"<tr><td>이름</td><td>" + array[i].name +"</td></tr>" + 
		    					"<tr><td>전화번호</td><td>" + array[i].tel +"</td></tr></table>"
		    			$('#result').append(table)	
		              }
		             
		            } //success 
		         }) //ajax
			})//b22
	})//$
</script>
</head>
<body>

	<button id="b22">list</button>
	<hr color="red">
	<div id="result" style="background: yellow"></div>
</body>
</html>