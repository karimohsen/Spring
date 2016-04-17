<%-- 
    Document   : home
    Created on : Apr 5, 2015, 1:10:19 PM
    Author     : Karim
--%>
<%@page import="java.util.Enumeration"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Here after redirecting
            <c:forEach items="${list}" var="item">
                <c:out value="${item}"/><br/>
            </c:forEach>	
    </body>
</html>
