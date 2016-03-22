package com.maxtropy.javaweb;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by hanxiao on 2016/3/22.
 */
public class FirstServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("info", "request域中的信息");
        RequestDispatcher dispatcher = request.getRequestDispatcher("/return.jsp");
        dispatcher.forward(request, response);
    }
}
