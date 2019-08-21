<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="myapp" class="com.sj.beans.Beans" />
<jsp:setProperty name="myapp" property="age"/>
<jsp:setProperty name="myapp" property="name"/>

<jsp:getProperty name="myapp" property="age"/>
<jsp:getProperty name="myapp" property="name"/>
<% out.println(myapp.getAge()); out.println(myapp.getName());%>
<f:view>
</f:view>
</body>
</html>