<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 import="com.bean.book.Book,java.util.*" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table style="width: 80%" border=1>
		<tr>
			<th>Id</th>
			<th>Title</th>
			<th>Author</th>
			<th>Price</th>
		</tr>
<%  
	ArrayList<Book> ar= (ArrayList)request.getAttribute("list"); 
for(Book b:ar){
	%>
<tr>
			<td><%=b.getBookid()%></td>
			<td><%=b.getTitle()%></td>
			<td><%=b.getAuthor()%></td>
			<td><%=b.getPrice()%></td>
</tr>
<%
			}
%>
</table>
</body>
</html>