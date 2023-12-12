<%--
  Created by IntelliJ IDEA.
  User: thain
  Date: 12/12/2023
  Time: 9:20 AM
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
    <form name="form" action="AddQuestionServlet" method='post'>
        <div class="card">
            <div class="card-header">
                <b>Thêm câu hỏi </b>
            </div>
            <div class="card-body">
                <div class="form-group">
                    <label >Câu hỏi</label>
                    <input type="text" class="form-control" name="question" id="question">
                </div>
                <div class="form-group">
                    <label >id_result</label>
                    <input type="text" class="form-control" name="id_result" id="id_result">
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
