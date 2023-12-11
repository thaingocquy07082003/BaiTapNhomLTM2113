<%--
  Created by IntelliJ IDEA.
  User: 0409k
  Date: 12/11/2023
  Time: 11:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous" />
    <title>Document</title>
</head>

<body>

<div class="col-5 offset-4 mt-4">
    <form name="form" action="AddAnswerServlet" method='post'>
        <div class="card">
            <div class="card-header">
                <b>Thêm câu trả lời</b>
            </div>
            <div class="card-body">
                <div class="form-group">
                    <label>Câu A</label>
                    <input type="text" class="form-control" name="answer_a" id="answer_a">
                </div>
                <div class="form-group">
                    <label>Câu B</label>
                    <input type="text" class="form-control" name="answer_b" id="answer_b">
                </div>
                <div class="form-group">
                    <label>Câu C</label>
                    <input type="text" class="form-control" name="answer_c" id="answer_c">
                </div>
                <div class="form-group">
                    <label >Câu D</label>
                    <input type="text" class="form-control" name="answer_d" id="answer_d">
                </div>
            </div>
            <div class="card-footer text-muted">
                <input type="reset" class="float-right btn btn-primary ml-2" value="Reset">
                <input type="submit" class="float-right btn btn-primary" name="insert" value="OK">

            </div>
        </div>
    </form>

</div>
<a href="javascript:history.back();"><button class="btn btn-primary float-right " style="margin-right:30px ;">Quay Lai</button></a>
</body>
</html>