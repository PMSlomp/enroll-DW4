package br.edu.utfpr.servlet;

import br.edu.utfpr.model.DataBase;
import br.edu.utfpr.model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/enroll")
public class ServletEnrollStudent extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        if(session.getAttribute("user") == null) {
            response.sendRedirect("redirect:list?way=FormToLogin");
        }

        String studentName = request.getParameter("name");

        Student student = new Student();
        student.setNome(studentName);

        DataBase db = new DataBase();
        db.addStudent(student);

        response.sendRedirect("enrollList");

    }

}
