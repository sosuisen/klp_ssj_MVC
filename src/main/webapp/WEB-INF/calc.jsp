<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>四則演算</title>
</head>
<body>
	<h1>整数を2つ入力してね</h1>
	<form action="calc" method="post">
		<input type="text" name="x" />
		<input type="text" name="y" />
		<input type="submit" />
	</form>
	<table>
		<tr><td>加算：</td><td><%= request.getAttribute("add") %></td></tr>
		<tr><td>減算：</td><td><%= request.getAttribute("sub") %></td></tr>
		<tr><td>乗算：</td><td><%= request.getAttribute("mul") %></td></tr>
		<tr><td>除算：</td><td><%= request.getAttribute("div") %></td></tr>			
	</table>
</body>
</html>