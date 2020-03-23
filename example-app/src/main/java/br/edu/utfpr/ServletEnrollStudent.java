package br.edu.utfpr;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/enroll")
public class ServletEnrollStudent extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("cadastrando aluno");

        String studentName = request.getParameter("name");

        Student student = new Student();
        student.setNome(studentName);

        DataBase db = new DataBase();
        db.add(student);

        response.sendRedirect("enrollList");

//        RequestDispatcher rd =  request.getRequestDispatcher("/confirm.jsp");
//        request.setAttribute("student", student.getName());
//        rd.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
