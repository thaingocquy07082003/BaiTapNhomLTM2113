<%--
  Created by IntelliJ IDEA.
  User: thain
  Date: 12/9/2023
  Time: 9:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page language="java" import="java.util.ArrayList" %>
<%@ page language="java" import="model.bean.*" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%  Room room = (Room)request.getAttribute("rooms");  %>
    đã vào được phòng <%=room.getName_room()%>
</body>
</html>
