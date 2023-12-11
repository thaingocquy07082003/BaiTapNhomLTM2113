<%--
  Created by IntelliJ IDEA.
  User: thain
  Date: 12/11/2023
  Time: 3:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page language="java" import="java.util.ArrayList" %>
<%@ page language="java" import="model.bean.*" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Room</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="">
</head>
<body>
    <%
        String username = (String) request.getAttribute("username");
        int correct = (int) request.getAttribute("correct");
        int total_question = (int) request.getAttribute("total_question");
        String name_room = (String) request.getAttribute("name_room");
        double point = (double) correct  / total_question ;
        double decimalPart = (double) ((int) (point * 100)) / 10;
    %>
    <div style="margin-top: 200px;margin-left: 40%; width: 300px;height: 400px; border: aquamarine solid 3px;">
        <p>Môn học : <%=name_room%> </p>
        <br>
        <p>username :<%=username%>  </p>
        <br>
        <p>Số câu đúng : <%=correct%> / <%=total_question%>     </p>
        <br>
        <p>Điểm : <%=decimalPart%>   </p>
        <br>
    </div>
</body>
</html>
