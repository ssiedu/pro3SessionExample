<%
	session.setMaxInactiveInterval(200);
%>
<html>
<body>
<h2>Hello World!</h2>
<form action="VerifyUser">
	userid	<input type="text" name="t1"/>
	password <input type="password" name="t2"/>
	<input type="submit"/>
</form>
</body>
</html>
