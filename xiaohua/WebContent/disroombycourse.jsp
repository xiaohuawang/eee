<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"



    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table>
<c:forEach var="l" items="${list}">
	<thread><tr><th>bldgname</th><th>room</th><th>maxcap</th></tr></thread>
    <tr>
    	
    	
    	<td>${l.hcclassroom.bldgname}</td>
        <td>${l.hcclassroom.room}</td>
        <td>${l.hcclassroom.maxcap}</td>
     
       
    </tr>
</c:forEach>
</table>




</body>
</html>