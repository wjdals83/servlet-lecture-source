package com.ohgiraffers.menu.controller;

import com.ohgiraffers.mode.service.MenuPriceCalculator;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/menu/order")
public class MenuOrderServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String menuName = req.getParameter("menuName");
        int amount = Integer.parseInt(req.getParameter("amount"));

        System.out.println("menuName = " + menuName);
        System.out.println("amount = " + amount);

        int orderPrice = new MenuPriceCalculator().calcOrderPrice(menuName, amount);

        req.setAttribute("menuName", menuName);
        req.setAttribute("amount", amount);
        req.setAttribute("orderPrice", orderPrice);

        // forward
        RequestDispatcher rd = req.getRequestDispatcher("/jsp/5_response.jsp");
        rd.forward(req, resp);

    }
}
