<%--
  Created by IntelliJ IDEA.
  User: thain
  Date: 12/12/2023
  Time: 1:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page language="java" import="java.util.ArrayList" %>
<%@ page language="java" import="model.bean.*" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Home</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js" integrity="sha512-v2CJ7UaYy4JwqLDIrZUI/4hqeoQieOmAZNXBeQyjo21dadnwR+8ZaIJVT8EE2iyI61OV8e6M8PP2/4hpQINQ/g==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>
    <style>
        span{
            position: absolute;
            margin-top: 5px;
            font-size: 23px;
            color: rgb(10, 103, 175);
            margin-left: 200px;
        }
    </style>
</head>
<body>

    <form action="SearchServlet" method="POST" >
        <nav class="navbar navbar-expand-lg bg-body-tertiary">
            <div class="container-fluid">
                <a class="navbar-brand" href="">
                    <img src="./image/Logo.png" width="190" height="60"/>
                </a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="ReturnHomeServlet?username=<%=request.getAttribute("username")%>"> Trang chủ </a>
                            <ul class="navbar-nav me-auto mb-2 mb-lg-0" style="margin-right: 10px;">
                                <li class="nav-item dropdown">
                                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                        <%--         đây là để tên user              --%>  <%=request.getAttribute("username")%>
                                    </a>
                                    <ul class="dropdown-menu" >
                                        <li><a class="dropdown-item" href="PointServlet?username=<%=request.getAttribute("username")%>">Điểm</a></li>
                                        <li><a class="dropdown-item" href="ComeToUpdate?username=<%=request.getAttribute("username")%>">Đổi mật khẩu</a></li>
                                        <li><a class="dropdown-item" href="Login.jsp">Thoát</a></li>
                                    </ul>
                                </li>
                            </ul>
                        </li>
                    </ul>

                    <form class="d-flex" role="search" style="margin-left: 10px;" action="SearchServlet" method="POST">
                        <label for="input_search_room" > Nhập vào đây phòng bạn muốn tìm kiếm  </label>
                        <input name="search"  class="form-control me-2" type="search" placeholder="Search" aria-label="Search" style="width:200px;" id="input_search_room">
                        <input type="hidden" name="username" value="<%=request.getAttribute("username")%>">
                        <button class="btn btn-outline-success" type="submit">Search</button>
                    </form>
                </div>

            </div>

        </nav>
        <table class="table table-striped" style="width: 350px; margin-left: 40%;margin-top: 200px;">
            <thead>
            <tr>

                <th>Môn Học </th>
                <th>Điểm </th>

            </tr>
            </thead>
            <tbody>
            <%
                ArrayList<StudentPoint> wifeArray = (ArrayList<StudentPoint>)request.getAttribute("studentPoints");
                for (int i=0; i<wifeArray.size();i++){
            %>
            <tr>
                <td><%= wifeArray.get(i).getName_room() %></td>
                <td><%= wifeArray.get(i).getPoint_student() %></td>

            </tr>
            <% } %>
            </tbody>
        </table>
    </form>
</body>
</html>
