<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.dreamteam.connection.*"%>
<%@page import="com.dreamteam.data.*"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
		int rid,eid ;
		String date, stime ,etime , desc ;
		rid=Integer.parseInt(request.getParameter("rid"));
		eid=Integer.parseInt(request.getParameter("eid"));
		date=request.getParameter("date");
		stime=request.getParameter("stime");
		etime=request.getParameter("etime");
		desc=request.getParameter("desc");
		
		Connection conn;
		Statement stmt = null;
		
		ConferenceRooms rooms = new ConferenceRooms();
		ConnectToDatabase obj = new ConnectToDatabase();
		
		conn = obj.connect();
		stmt = conn.createStatement();
		String sql1;
		sql1 = "INSERT INTO schedule_details (empid,roomid,scheduleDate,startTime,endTime,comment) values("+eid+
				","+rid+",'"+date+"','"+stime+"','"+etime+"','"+desc+"')";
		stmt.executeUpdate(sql1);
	%>
	
	<h2>Success !!! Your Room has been booked !!! </h2>
</body>
</html>