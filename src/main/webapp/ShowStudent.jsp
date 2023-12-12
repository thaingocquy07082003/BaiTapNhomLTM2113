<%--
  Created by IntelliJ IDEA.
  User: 0409k
  Date: 12/12/2023
  Time: 1:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page language="java" import="java.util.ArrayList" %>
<%@ page language="java" import="model.bean.*" %>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Danh sách nhân viên</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous" />
</head>

<body>
<div class="box" style="padding:50px 50px ;">
    <form action="" method="post">
        <table border="1" width="100%" class="table table-striped">
            <thead>
            <TR>
                <TH>MSSV</TH>
                <TH>HOTEN</TH>
                <TH>USERNAME</TH>
                <TH>Option</TH>
            </TR>
            </thead>
           <tbody>
           <%
               ArrayList<Student> students = (ArrayList<Student>) request.getAttribute("students");
               for(Student student : students) {
           %>
               <tr>
                   <td><%=student.getMssv()%></td>
                   <td><%=student.getName_student()%></td>
                   <td><%=student.getUsername()%></td>
                   <td>
                       <a href="DeleteStudentServlet?mssv=<%=student.getMssv()%>">DELETE</a>
                       <a href="UpdateStudentServlet?mssv=<%=student.getMssv()%>">UPDATE</a>
                   </td>
               </tr>
           <%
               }
           %>
           </tbody>
        </table>
    </form>
        <button class="btn btn-primary float-left " style="margin-right:30px ;">Quay Lai</button></a>
</div>
</body>

</html>
