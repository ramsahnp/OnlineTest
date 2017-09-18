<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Questions Page</title>
</head>
<body>
<div align="center">
<!-- displaying some info from controller.. -->
<font color="green">
${message}</font>



<h3>Adding Questions to the Data Base</h3><hr>
<form action="./addques.htm" method="post">
<table row="2">
<tr><th>s.no</th><th>Question</th><th>opt1</th><th>opt2</th><th>opt3</th><th>correct</th></tr>
<tr><td><input type="text" name="sno"/></td><td><input type="text" name="question" /></td><td><input type="text" name="opt1"/></td><td><input type="text" name="opt2"/></td><td><input type="text" name="opt3"/></td><td><input type="text" name="correct"/></td></tr>

<%-- <tr><% %> --%>


</table>
<input type="submit" value="Insert"/>
</form>
</div>
</body>
</html>