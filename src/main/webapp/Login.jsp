<%--
  Created by IntelliJ IDEA.
  User: thain
  Date: 12/6/2023
  Time: 4:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./CSS/dangnhap.css">
    <script src="https://kit.fontawesome.com/c9f5871d83.js" crossorigin="anonymous"></script>
    <title>Log In</title>
</head>
<body>
    <form action="GetAllRoomServlet" method="POST">
        <div class="login">
            <div class="box1">
                <h3> Login </h3>
            </div>
            <div class="box2">
                <input type="text"  class="mail" placeholder="Email" autocomplete="off" required >
                <i class="fa-solid fa-envelope" ></i>
            </div>
            <div class="box3">
                <input type="password" class="mail"placeholder="Password" autocomplete="off" required>
                <i class="fa-solid fa-lock" ></i>
            </div>
            <div class="box4">
                <input type="checkbox" class="checkbox" id="mycheckbox">
                <label for="mycheckbox" > Remember Me Forget Password </label>
            </div>
            <div class="box5">
                <button> Log in </button>
            </div>
            <div class="box6">
                <p> Dont't have a account </p>
                <a href="Register.jsp"> Register </a>
            </div>
        </div>
    </form>
</body>
</html>
