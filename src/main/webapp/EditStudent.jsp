<%--
  Created by IntelliJ IDEA.
  User: 0409k
  Date: 12/12/2023
  Time: 12:49 AM
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
    <form name="form" action="" method='post'>
        <div class="card">
            <div class="card-header">
                <b>Chỉnh sửa thông tin sinh viên </b>
            </div>
            <div class="card-body">
                <div class="form-group">
                    <label >MSSV</label>
                    <input type="text" class="form-control" name="mssv" id="mssv">
                </div>
                <div class="form-group">
                    <label >Tên sinh viên</label>
                    <input type="text" class="form-control" name="name_student" id="name_student">
                </div>
                <div class="form-group">
                    <label >Username</label>
                    <input type="text" class="form-control" name="username" id="username">
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