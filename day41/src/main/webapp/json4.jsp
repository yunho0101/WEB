<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	//스크릿트릿 
JSONObject json = new JSONObject();
json.put("max", 5000); //{name : hong}
json.put("min", 4850);
json.put("end", 4960);

JSONObject json2 = new JSONObject();
json2.put("max", 5200); //{name : hong}
json2.put("min", 4930);
json2.put("end", 5140);

JSONArray array = new JSONArray();
array.add(json);
array.add(json2);
//out.print(json.toJSONString());
%><%=array.toJSONString()%>