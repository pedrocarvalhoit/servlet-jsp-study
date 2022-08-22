<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="fn"  uri="http://java.sun.com/jsp/jstl/functions" %> 
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
</head>
	<body>
		
		<c:set var="str" value="Pedro Duarte Personal Trainer "  />
		<c:set var="size"  value=" --- Size of the String with the spaces" />
		${size } <br>
	
		Length of str : ${fn:length(str) }<br>
		
		<c:set var="split" value="--- List of the content (split)" />
		${split }<br>
		
		<c:forEach items="${fn:split(str, ' ') }"  var="s">
		${s }
		<br>
		</c:forEach>
		
		--- Is there check <br>
		Is there: ${fn:contains(str, "P") }<br>
		
		---If whit c: <br>
		<c:if test=" ${fn:endsWith(str, 'Trainer') } ">
			You are rigth
		</c:if>
		
		
		
		
	</body>
</html>