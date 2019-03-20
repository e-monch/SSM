<%--
  Created by IntelliJ IDEA.
  User: monch
  Date: 2018/11/20
  Time: 13:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js" type="application/javascript"></script>
    <script>

    </script>
</head>
<body>
    <form action="${pageContext.request.contextPath}/user/showAll">
        <input type="submit" value="查询所有">
    </form>
    <form action="${pageContext.request.contextPath}/user/showById">
        <input type="text" name="id" placeholder="输入id查询"/><input type="submit" value="查询"> <br/>
    </form>
    <form action="${pageContext.request.contextPath}/user/showByName">
        <input type="text" name="name" placeholder="输入姓名查询"/><input type="submit" value="查询"><br/>
    </form>
    <form action="${pageContext.request.contextPath}/user/showBySex">
        <input type="text" name="sex" placeholder="输入性别查询"/><input type="submit" value="查询"><br/>
    </form>
</body>
</html>
