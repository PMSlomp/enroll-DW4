package br.edu.utfpr.servlet;

import br.edu.utfpr.action.*;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

//@WebFilter("/index")
public class FilterController implements Filter {

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        System.out.println("controllador");

        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;

        String way = request.getParameter("way");

        String name = null;
        String[] action;

        if(way.equals("DeleteStudent")) {

            System.out.println("deletar");

            DeleteStudent deleteStudent = new DeleteStudent();
            name = deleteStudent.execute(request, response);
        } else if(way.equals("FormToEdit")) {

            System.out.println("editar");

            FormToEdit showToEdit = new FormToEdit();
            name = showToEdit.execute(request, response);
        } else if(way.equals("EditStudent")) {

            System.out.println("editado");

            EditStudent editStudent = new EditStudent();
            name = editStudent.execute(request, response);
        } else if(way.equals("IncludeStudent")) {

            System.out.println("incluir");

            IncludeStudent includeStudent = new IncludeStudent();
            name = includeStudent.execute(request, response);
        } else if(way.equals("FormToLogin")) {

            System.out.println("logando");

            FormToLogin toLogin = new FormToLogin();
            name = toLogin.execute(request, response);
        } else if(way.equals("Login")) {

            System.out.println("login");

            Login login = new Login();
            name = login.execute(request, response);
        } else if(way.equals("Logout")) {

            System.out.println("saindo");

            Logout logout = new Logout();
            name = logout.execute(request, response);
        } else if(way.equals("FormToRegister")) {

            System.out.println("registrando");

            FormToRegister toRegister = new FormToRegister();
            name = toRegister.execute(request, response);
        } else if(way.equals("Register")) {

            System.out.println("saindo");

            Register register = new Register();
            name = register.execute(request, response);
        }


        action = name.split(":");
        if(action[0].equals("redirect")) {
            response.sendRedirect(action[1]);
        } else {
            RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/" + action[1]);
            rd.forward(request, response);
        }

    }

}
