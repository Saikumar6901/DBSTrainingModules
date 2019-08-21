<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="authen" class="com.beans.Authentication"/>
<jsp:setProperty name="authen" property="uname"/>
<jsp:setProperty name="authen" property="pass"/>
<% if(authen.isValid()){
	out.println("Welcome home #Starks");
}
else{
out.println("better luck next time");
}
%>
</body>
</html>