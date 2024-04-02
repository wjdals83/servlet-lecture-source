package com.ohgiraffers.section01.xml;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;

public class LifeCycleTestServlet extends HttpServlet {

    private int initCount = 1;
    private int serviceCount = 1;
    private int destroyCount = 1;

    private LifeCycleTestServlet() {};

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("xml 매핑 service 메소드 호출 : " + serviceCount++);
    }

    @Override
    public void destroy() {
        System.out.println("xml 매핑 destroy() 메소드 " + destroyCount++);
    }

    @Override
    public void init() throws ServletException {
        System.out.println("xml 매핑 init()" + initCount++);
    }
}
