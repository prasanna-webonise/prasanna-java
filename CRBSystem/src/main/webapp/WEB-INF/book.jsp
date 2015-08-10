<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% String number = request.getParameter("rid"); %>
	<p> Your : <%=number%> 
	<h2>Welcome to the booking Page</h2>
	<form action="index.jsp"><pre>
		
		Enter your Employee Id 		: <input type="text" id="eid"><br>
		Enter the Date for booking 	: <input type="Date" id="date"><br>
		Enter the Start Time 		: <input type="text" id="stime"><br>
		Enter the End Time 			: <input type="text" id="etime"><br>
		Enter the Purpose 			: <textarea rows="2" cols="25" ></textarea><br> </pre>
		<input type="submit" value="BOOK">
	</form>
</body>
</html>