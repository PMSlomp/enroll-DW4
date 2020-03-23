package br.edu.utfpr;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/call-listS")
public class CallListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        DataBase db = new DataBase();
        List<Student> studentList = db.getStudentsList();

        request.setAttribute("students", studentList);

        RequestDispatcher rd = request.getRequestDispatcher("/call-list.jsp");
        rd.forward(request, response);

    }
}
