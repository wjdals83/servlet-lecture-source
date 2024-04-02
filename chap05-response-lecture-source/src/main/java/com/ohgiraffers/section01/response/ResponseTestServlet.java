package com.ohgiraffers.section01.response;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/response")
public class ResponseTestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /* 필기.
        *   서블릿이 수행하는 역할을 크게 3가지 이다.
        *   1. 요청 받기 - HttpMethod GET/POST 요청에 다라서 parameter 로 전달받은 데이터를 꺼낸다.
        *   2. 비즈니스 로직 처리 - ex) DB 접속과 CRUD 관련된 로직 작성
        *   3. 응답하기 - 문자열로 동적인 웹(HTML 태그) 페이지를 만드록 스트림을 이요하여 보낸다. */

        String hi = "안녕 여러분";

        StringBuilder responseBuilder = new StringBuilder();

        responseBuilder.append("<!doctype html>\n")
                .append("<html>\n")
                .append("<head></head>\n")
                .append("<body>\n")
                .append("<h1>" + hi + "</h1>")
                .append("</body>\n")
                .append("</html>");

        resp.setContentType("text/html; charset=UTF-8");        // headr 의 내용을 직접 설정할 수 있다. content-type

        PrintWriter out = resp.getWriter();
        out.write(responseBuilder.toString());

        out.flush();
        out.close();

    }
}
