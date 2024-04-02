package com.ohgiraffers.section01.forward;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/forward")     // form 의 action 부분
public class ReceiveInformationServlet  extends HttpServlet {

    @Override  // request 는 에는 우리가 전달한 아이디 비번 파라미터가 들어감.
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String userId = req.getParameter("userId");
        String password = req.getParameter("password");

        System.out.println("UserId = " + userId);
        System.out.println("password = " + password);  // payload 쪽에 가면 확인가능

        req.setAttribute("userId", userId);       // 어트리뷰트엔 키, 밸류 입력하기

        /* 필기.
        *   /print url 가진 서블릿 호출해야 함.
        *   RequestDispatcher
        *   - 서블릿을 호출하기 위한 방향 정보를 가진 객체
        *  */

        RequestDispatcher rd = req.getRequestDispatcher("print");

        rd.forward(req, resp);          // set 으로 넣어준 값들을 가지고 떠난다.


    }
}
