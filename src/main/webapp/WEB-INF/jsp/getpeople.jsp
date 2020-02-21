<%--
  Created by IntelliJ IDEA.
  User: zhangxue
  Date: 2020/2/21
  Time: 23:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="list" var="e" varStatus="state">
    <input type="checkbox" name="people" value="${e.empid}"/>${e.empname}
    <c:if test="${state%3==0}">
        <br/>
    </c:if>
</c:forEach>
</body>
</html>
