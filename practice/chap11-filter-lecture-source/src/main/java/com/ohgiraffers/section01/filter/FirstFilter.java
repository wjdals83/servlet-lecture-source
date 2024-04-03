package com.ohgiraffers.section01.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

@WebServlet("/first/*")
public class FirstFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        System.out.println("Filter init() 호출됨...");

    }

    @Override
    public void destroy() {

        System.out.println("Filter destroy() 메소드 호출됨...");

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        // 중요. Servlet 으로 request 가 전달되기 전에 요청을 가로챈다.
        System.out.println("Filter doFilter() 호출됨...");

        // 필기. 처리할 코드 작성하기. 처리 후 다음 필터 or 서블릿의 doGet/doPost 를 호출한다.
        filterChain.doFilter(servletRequest, servletResponse);

        // 필기. 서블릿에서 처리 후 다시 수행할 내용 작성
        System.out.println("servlet 요청 수행 완료!!");


    }
}
