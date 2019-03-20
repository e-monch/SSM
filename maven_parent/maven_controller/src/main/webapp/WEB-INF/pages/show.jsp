<%--
  Created by IntelliJ IDEA.
  User: monch
  Date: 2018/11/20
  Time: 13:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js" type="application/javascript"></script>
    <script>
        $(function ()
        {
            var t = "";
            <c:forEach var="a" items="${users}">
                t += "<tr><td>${a.id}</td><td>${a.username}</td><td>${a.password}</td><td>${a.name}</td><td>${a.birthday}</td><td>${a.sex}</td></tr>"
            </c:forEach>
            $("#t1").html(t);
        });
    </script>
</head>
<body>
    <h1>展示</h1>

    <table id="t1">

    </table>
</body>
</html>
