package br.edu.utfpr;

import br.edu.utfpr.model.DataBase;
import br.edu.utfpr.model.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/enrollList")
public class ServletEnrollList extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        DataBase db = new DataBase();
        List<Student> studentList = db.getStudentsList();

        request.setAttribute("students", studentList);

        RequestDispatcher rd = request.getRequestDispatcher("/enroll-list.jsp");
        rd.forward(request, response);

    }
}
