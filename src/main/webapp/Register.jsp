<%--
  Created by IntelliJ IDEA.
  User: thain
  Date: 12/6/2023
  Time: 8:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="./CSS/dangnhap.css">
  <script src="https://kit.fontawesome.com/c9f5871d83.js" crossorigin="anonymous"></script>
  <title>Title</title>
</head>
<body>
<form form action="AddAccountServlet" method="post" class="login">
  <div class="box1">
    <h3> Register </h3>
  </div>
  <div class="box2">
    <input id="userName" name="userName" type="text"  class="mail" placeholder="Email" autocomplete="off" required >

  </div>
  <div class="box3">
    <input id="password" name="password" type="password" class="mail"placeholder="Password" autocomplete="off" required>

  </div>
  <div class="box3">
    <input  id="repassword" name="repassword" type="password" class="mail"placeholder="Password" autocomplete="off" required>
    <p style="color: red">${re}</p>

  </div>
  <div class="box5">
    <button> Register </button>
  </div>
  <div class="box6">
    <h3  style="color: red">${exit}<a href="Login.jsp"> Log In </a> </h3>
  </div>
</form>
</body>
</html>
