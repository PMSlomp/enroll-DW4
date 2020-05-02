package br.edu.utfpr.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

//@WebFilter("/index")
public class FilterLogin implements Filter {

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        System.out.println("Login");

        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;

        String way = request.getParameter("way");

        HttpSession session = request.getSession();
        Boolean notLogin = (session.getAttribute("user") == null);
        Boolean protectWay = !(way.equals("Login") || way.equals("FormToLogin") || way.equals("FormToRegister") || way.equals("Register"));

        if(notLogin && protectWay) {
            response.sendRedirect("index?way=FormToLogin");
            return;
        }

        chain.doFilter(req, resp);
    }

}
