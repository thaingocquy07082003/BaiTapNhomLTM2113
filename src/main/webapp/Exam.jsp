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
        /* CSS để thiết lập vị trí cho đồng hồ */
        #countdown {
            position: fixed;
            top: 10px; /* Khoảng cách từ phía trên xuống */
            right: 10px; /* Khoảng cách từ bên phải qua */
            background-color: #fff;
            padding: 10px;
            border: 3px solid red;
            border-radius: 5px;
        }
    </style>
</head>
<body>
    <form>
        <div style="border: 3px solid red;background-color: #fff;border-radius: 5px;width: 100px;">
            <p>Xin chào <%=request.getAttribute("username")%></p>
        </div>
        <%
            int time = (int) request.getAttribute("time");
            int id_room = (int) request.getAttribute("id_room");
            String username = (String) request.getAttribute("username");
            ArrayList<Question> questions = (ArrayList<Question>) request.getAttribute("questions");
            ArrayList<Answer> answers = (ArrayList<Answer>) request.getAttribute("answers");
            for(int i = 0; i<questions.size();i++) {
        %>
            <div style="background-image:url('./image/EXBG.jpg');height: 270px;width: 800px;color: black;margin-top: 50px;solid-color: bisque;margin-left: 23%;">
                Câu hỏi <%=i+1%>/<%=questions.size()%> : <p><%=questions.get(i).getQuestion()%></p>
                <input type="radio" name="option" value="1"> <%=answers.get(i).getAnswer_a()%> <br>
                <br>
                <input type="radio" name="option" value="2"> <%=answers.get(i).getAnswer_b()%> <br>
                <br>
                <input type="radio" name="option" value="3"> <%=answers.get(i).getAnswer_c()%> <br>
                <br>
                <input type="radio" name="option" value="4"> <%=answers.get(i).getAnswer_d()%> <br>
                <br>
            </div>
        <%
            }
        %>
        <div id="countdown">Countdown will be displayed here</div>

        <script>
            // Thời gian setup (thời gian hiện tại + số giây cần đếm ngược)
            const setupTime = new Date();
            setupTime.setMinutes(setupTime.getMinutes() + <%=time%>); // Thêm 1 phút cho ví dụ

            function updateCountdown() {
                const now = new Date().getTime();
                const distance = setupTime - now;

                // Tính toán thời gian còn lại
                const minutes = Math.floor((distance % (1000 * 60 * 60)) / (1000 * 60)); // Lấy phút
                const seconds = Math.floor((distance % (1000 * 60)) / 1000); // Lấy giây


                // Hiển thị thời gian đếm ngược trong phần tử có id="countdown"
                document.getElementById("countdown").innerHTML = "time: " + minutes + " : " +seconds;

                // Kiểm tra nếu thời gian đã hết
                if (distance <= 0) {
                    clearInterval(timer); // Dừng đồng hồ khi thời gian đếm ngược kết thúc
                    document.getElementById("countdown").innerHTML = "Countdown expired";
                    autoSubmitForm(); // Gọi hàm tự động submit form
                }
                function autoSubmitForm() {
                    document.getElementById("submitButton").click(); // Nhấn nút submit tự động
                }
            }

            // Gọi hàm updateCountdown mỗi 1 giây
            const timer = setInterval(updateCountdown, 1000);
            updateCountdown(); // Gọi hàm lần đầu khi trang được tải
        </script>
        <input type="hidden" name="id_room" value="<%=id_room%>">
        <input type="hidden" name="username" value="<%=username%>">
        <button type="submit" id="submitButton" value="submit" class="btn btn-outline-success" style="margin-left: 45%;margin-top: 50px;width:250px;"> Nộp bài </button>
    </form>
</body>
</html>
