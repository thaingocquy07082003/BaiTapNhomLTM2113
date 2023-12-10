<%--
  Created by IntelliJ IDEA.
  User: thain
  Date: 12/9/2023
  Time: 9:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page language="java" import="java.util.ArrayList" %>
<%@ page language="java" import="model.bean.*" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
    <%
        ArrayList<Question> questions = (ArrayList<Question>) request.getAttribute("questions");
        ArrayList<Answer> answers = (ArrayList<Answer>) request.getAttribute("answers");
        for(int i = 0; i<questions.size();i++) {
    %>

        <div style="background-image:url('./image/BG.jpg');height: 270px;width: 800px;color: black;margin-top: 50px;solid-color: bisque">
            Câu hỏi <%=i+1%>/<%=questions.size()+1%> :
            <p><%=answers.get(i).getAnswer_a()%></p>
            <br>
            <p><%=answers.get(i).getAnswer_b()%></p>
            <br>
            <p><%=answers.get(i).getAnswer_c()%></p>
            <br>
            <p><%=answers.get(i).getAnswer_d()%></p>
            <br>
        </div>

    <% } %>
</body>
</html>
