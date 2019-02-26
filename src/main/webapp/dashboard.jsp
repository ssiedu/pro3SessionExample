<%
	String username=(String)session.getAttribute("user");	
	if(username==null){
		response.sendRedirect("index.jsp");
	}
	
	int n=session.getMaxInactiveInterval();
	
	
%>

<html>
<body>
	<h3>Dashboard For <%=username%></h3>
	<h5>If you remain idle for <%=n%> seconds, your session will expire</h5>
	<hr>
		<a href="ServletOne">Call-ServletOne</a><br>
		<a href="ServletTwo">Call-ServletTwo</a><br>
		<a href="KillSession">Logout</a><br>
	<hr>
</body>
</html>