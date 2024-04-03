<%--
  Created by IntelliJ IDEA.
  User: tjwjd
  Date: 2024-04-03
  Time: 오후 5:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <!-- 포워드 값을 변수에 담아주기. getAttribute 는 object 를 가져오기 때문에 알맞는 자료형으로 형변환 필요 -->
    <%
        String menuName = (String) request.getAttribute("menuName");
        int amount = (int) request.getAttribute("amount");
        int orderPrice = (int) request.getAttribute("orderPrice");
    %>
    <h3>주문하신 음식 : <%= menuName%></h3><br>
    <h3>주문하신 수량 : <%= amount%></h3><br>
    <h3>결제하실 금액 : <%= orderPrice%></h3><br>
</body>
</html>
