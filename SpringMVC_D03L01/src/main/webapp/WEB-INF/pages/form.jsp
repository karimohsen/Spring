<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Karim
  Date: 4/9/2015
  Time: 1:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form:form method="post" commandName="customer">
  User Name :<form:input path="fname"/><form:errors path="fname"/>
  Phone Number :<form:input path="num"/><form:errors path="num"/>
  <input type="submit" value="Save"/>
</form:form>
</body>
</html>
