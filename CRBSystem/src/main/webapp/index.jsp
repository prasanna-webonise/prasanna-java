<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.dreamteam.connection.*"%>
<%@page import="com.dreamteam.data.*"%>
<%@page import="java.sql.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
	<h2>Conference Room Booking System</h2>
	<P><pre>R.Id   F.No    Desc         Capacity </pre></P>
	<%!Connection conn;
	Statement stmt = null;
	
	ConferenceRooms rooms = new ConferenceRooms();
	ConnectToDatabase obj = new ConnectToDatabase();%>
	<%
		try {
			conn = obj.connect();
			stmt = conn.createStatement();
			String sql;
			sql = "SELECT * FROM conference_rooms";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {

				rooms.setFloorNo(rs.getInt(2));
				rooms.setRoomId(rs.getInt(1));
				rooms.setDescription(rs.getString(3));
				rooms.setCapacity(rs.getInt(4));
				int id = rooms.getRoomId();
				int floor = rooms.getFloorNo();
				int capacity = rooms.getCapacity();
				String desc = rooms.getDescription();
				
	%>
	<p>
		<pre><%=id %>   	<%=floor%>    <%=desc%>    <%=capacity%></pre>
	</p>
	<%
		}
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	%>
	<form action="book.jsp" method="post">
		<input type="text" id="rid" name="rid"><input type="submit"> 
	</form>


</body>
</html>
