<%--
  Created by IntelliJ IDEA.
  User: thain
  Date: 12/12/2023
  Time: 9:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous" />
    <title>Trang Admin</title>
</head>

<body>

<h1 align="center"> ADMIN </h1>
<ul class="list-group">
    <li class="list-group-item">
        <h2> 1. <a href="AddQuestion.jsp">Thêm câu hỏi </a></h2>
    </li>
    <li class="list-group-item">
        <h2> 2. <a href="AddAnswer.jsp">Thêm câu trả lời</a></h2>
    </li>
    <li class="list-group-item">
        <h2> 3. <a href="TablePointServlet">Xem bảng điểm </a></h2>
    </li>
    <li class="list-group-item">
        <h2> 4. <a href="StudentServlet">Xem thông tin sinh viên</a></h2>
    </li>
</ul>
</body>

</html>
