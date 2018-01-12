<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<style>
	<h2>Login Form</h2>
	
	<%
	String msg = (String)request.getAttribute("msg");
	
	if(msg!=null){
		
		%>
		<label><b><%=msg%></b></label>
		<%}  %>
		
</style>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="/LoginAction" method=post>
		<div class="container">
			<label><b>Username</b></label>
			<input type = "text" placeholder="Enter Username" name="id" required>
			
			<label><b>Password</b></label>
			<input type = "password" placeholder="Enter Password" name="pwd" required>
			
			<button type = "submit">Login</button>
			<input type="checkbox" checked="checked"> Remember me		
		</div>
		
		<div class="container" style="background-color:#f1f1f1">
			<button type="button" class="cancelbtn">Cancel</button>
			<span class="psw">Forgot <a href="#">password</a></span>
		</div>
</form>
</body>
</html>