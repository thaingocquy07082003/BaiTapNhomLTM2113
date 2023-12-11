<%--
  Created by IntelliJ IDEA.
  User: 0409k
  Date: 12/12/2023
  Time: 12:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Danh sách sinh viên</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous" />
</head>

<body>
<div class="box" style="padding:50px 50px ;">
    <table border="1" width="100%" class="table table-striped">
        <thead>
        <tr>
            <th>Name Room</th>
            <th>UserName</th>
            <th>MSSV</th>
            <th>Name</th>
            <th>Mark</th>
        </tr>
        </thead>
  <tbody>
  <c:forEach var="tablePoint" items="${tablePoints}">
      <tr>
          <td>${tablePoint.name_room}</td>
          <td>${tablePoint.username}</td>
          <td>${tablePoint.mssv}</td>
          <td>${tablePoint.name_student}</td>
          <td>${tablePoint.point_student}</td>
      </tr>
  </c:forEach>

  </tbody>


</table>
    <a href="javascript:history.back();"><button class="btn btn-primary float-right " style="margin-right:30px ;">Quay Lai</button></a>
</div>
</body>
</html>