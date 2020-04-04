package br.edu.utfpr.servlet;

import br.edu.utfpr.model.DataBase;
import br.edu.utfpr.model.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/enrollList")
public class ServletEnrollList extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        Boolean notLogin = (session.getAttribute("user") == null);
//        Boolean protectWay = !(way.equals("Login") || way.equals("FormToLogin"));

        if(notLogin) {
            response.sendRedirect("list?way=FormToLogin");
            return;
        }

        System.out.println("matriculado");

        DataBase db = new DataBase();
        List<Student> studentList = db.getStudentsList();

        request.setAttribute("students", studentList);

        RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/enroll-list.jsp");
        rd.forward(request, response);

    }
}
