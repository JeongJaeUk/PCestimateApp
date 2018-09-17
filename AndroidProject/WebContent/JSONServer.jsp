<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import = "org.json.simple.*" %>
<%@ page import="fordatabase.ConnectDB" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	ConnectDB connectDB = ConnectDB.getInstance();
	connectDB.insert("COMPUTERCASE", "C:/Users/skstk/workspace2/Term/deviceCSV/COMPUTERCASE.csv");
//	connectDB.insert("CPU", "C:/Users/skstk/workspace2/Term/deviceCSV/CPU.csv");
//	connectDB.insert("HDDISK", "C:/Users/skstk/workspace2/Term/deviceCSV/HDDISK.csv");
//	connectDB.insert("MAINBOARD", "C:/Users/skstk/workspace2/Term/deviceCSV/MAINBOARD.csv");
//	connectDB.insert("MEMORY", "C:/Users/skstk/workspace2/Term/deviceCSV/MEMORY.csv");
//	connectDB.insert("POWER", "C:/Users/skstk/workspace2/Term/deviceCSV/POWER.csv");
//	connectDB.insert("SSDISK", "C:/Users/skstk/workspace2/Term/deviceCSV/SSDISK.csv");
//	connectDB.insert("VGA", "C:/Users/skstk/workspace2/Term/deviceCSV/VGA.csv");
	
	
	
//	connectDB.insert("CASE", "C:/Users/skstk/workspace2/Term/deviceCSV/CASE.csv");
%>

Hello World!
</body>
</html>