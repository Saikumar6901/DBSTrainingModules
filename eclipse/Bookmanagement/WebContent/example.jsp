<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   import="java.util.*" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div id="rates">
<input type="radio" name="bookdetails" id="b1" value="add" onClick="document.location.href='jsps/add.jsp'">Add a book<br>
<input type="radio" name="bookdetails" id="b2" value="view" onClick="document.location.href='jsps/view.jsp'">View a book<br>
<input type="radio" name="bookdetails" id="b3" value="viewall" onClick="document.location.href='Servletcontroller'; return true;">View all books<br>
<input type="radio" name="bookdetails" id="b4" value="delete" onClick="document.location.href='jsps/delete.jsp'">Delete a book<br>
<input type="radio" name="bookdetails" id="b5" value="update" onClick="document.location.href='jsps/update.jsp'">Update a book<br>
</div>
</form>
</body>
</html>