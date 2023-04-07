<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.CountBean" %>
<%
CountBean cb = (CountBean)request.getAttribute("countBean");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <% for (int i = 0; i < cb.getCount(); i++) { %>
    <h1>Hello, world!</h1>
  <% } %>
</body>
</html>