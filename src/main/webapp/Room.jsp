<%--
  Created by IntelliJ IDEA.
  User: thain
  Date: 12/6/2023
  Time: 9:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>Title</title>
</head>
<style>
    .card{
        max-width: initial;

    }
    .card-block{
        padding: 28px 20px;
    }
    .jumbotron{
        background-color: white;
    }
</style>
<body>
    <div class="alert alert-danger" role="alert">
        Hi <b>{{ user.username }}</b>, Welcome to Chatapp
    </div>

<br/>
</body>
</html>
