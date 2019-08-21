<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="../Servletcontroller">
book id: <input type="number" name="bookid" required><br></br>
 <input type="hidden" name="bookdetails" value="delete">
 <input type="submit" class="subbutton" value="submit"><br>
 </form>
</body>
</html>