<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
    <h1>Cookie Handling</h1>
    <form action="cookie" method="post">
          <table>
            <tr>
              <td>firstName : </td>
              <td><input type="text" name="firstName"></td>
            </tr>
            <tr>
              <td>lastName : </td>
              <td><input type="text" name="lastName"></td>
            </tr>
            <tr>
                <td colspan="2">
                    <button type="submit">전송</button>       <!-- 전송 버튼은 두 열에 영향받음 -->
                </td>
            </tr>
          </table>
    </form>
</body>
</html>