<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Karim
  Date: 4/6/2015
  Time: 1:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form:form method="post" commandName="user">
  <table>
    <tr>
      <td>Name:<form:input path="name"/></td>
      <td><form:errors path="name"/></td>
      <td>Age:<form:input path="age"/></td>
      <td><form:errors path="age"/></td>
    </tr>
    <tr>
      <td colspan="4"><input type="submit" value="Ok"/></td>
    </tr>
    </table>
</form:form>
</body>
</html>
