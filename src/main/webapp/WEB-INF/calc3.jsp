<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.FormulaBean"%>
<%
FormulaBean fb = (FormulaBean)request.getAttribute("formulaBean");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>四則演算</title>
</head>
<body>
	<h1>整数を2つ入力してね</h1>
	<form action="calc3" method="post">
		<input type="text" name="x" value="<%=fb.getX()%>" /> <input
			type="text" name="y" value="<%=fb.getY()%>" /> <input type="submit" />
	</form>
	<table>
		<tr>
			<td>加算：</td>
			<td><%=fb.getAddResult()%></td>
		</tr>
		<tr>
			<td>減算：</td>
			<td><%=fb.getSubResult()%></td>
		</tr>
		<tr>
			<td>乗算：</td>
			<td><%=fb.getMulResult()%></td>
		</tr>
		<tr>
			<td>除算：</td>
			<td><%=fb.getDivResult()%></td>
		</tr>
	</table>
</body>
</html>