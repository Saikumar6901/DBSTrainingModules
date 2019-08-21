<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<jsp:useBean id="language" scope="page" class="com.language.beans.Languageclass"/>
<jsp:setProperty name="language" property="*"/>
<jsp:getProperty name="language" property="name"/>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
out.println("Your name: "+language.getName());
out.println("Your choosen language: "+language.getLanguage());
out.println("language comments");
out.println(language.getLanguageComments());
%>
</body>
</html>