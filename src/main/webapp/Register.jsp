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
  <form action="AddAccountServlet" method="POST">
    <div class="login">
      <div class="box1">
        <h3> Register </h3>
      </div>
      <div class="box2">
        <input type="text"  class="mail" placeholder="Email" autocomplete="off" required name="userName">

      </div>
      <div class="box3">
        <input type="password" class="mail"placeholder="Password" autocomplete="off" required id="password" name="password">

      </div>
      <div class="box3">
        <input type="password" class="mail"placeholder="Password" autocomplete="off" required id="repassword" name="repassword">
      </div>
      <div class="box5" >
        <button> Register </button>
      </div>
      <div class="box6">
        <p> you've haven a account? Let's Log in </p>
        <a href="Login.jsp"> Log In </a>
      </div>
    </div>
  </form>
</body>
</html>
