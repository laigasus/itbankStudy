<%@ page import="kr.co.jsp.scores.model.Scores"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("utf-8");
	Scores scores=new Scores();
	
	scores.setName(request.getParameter("name"));
	scores.setKor(Integer.parseInt(request.getParameter("kor")));
	scores.setKor(Integer.parseInt(request.getParameter("eng")));
	scores.setKor(Integer.parseInt(request.getParameter("math")));
	
	scores.setTotal();
	scores.setAverage();
	
	
	
%>
