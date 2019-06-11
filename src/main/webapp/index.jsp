<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"   prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<h3>users list!!!</h3>
<table>
<tr>
<td>序号</td>
<td>name</td>
<td>birthday</td>
<td>money</td>
<td>修改</td>
<td>删除</td>
</tr>
<c:forEach items="${users }" var="u" >
<tr>
<td>${u.uid}</td>
<td>${u.uname}</td>
<td>${u.birthday}</td>
<td>${u.umoney}</td>
<td><a href="Users_findOne?uid=${u.uid }">修改</a></td>
<td><a href="Users_delete?uid=${u.uid }">删除</a></td>
</tr>
</c:forEach>



</table>
<a href="addUsers.jsp">添加</a>


</body>
</html>