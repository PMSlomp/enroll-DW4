package br.edu.utfpr;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/edit")
public class ServletEditStudent extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Integer id = Integer.parseInt(request.getParameter("id"));

        DataBase db = new DataBase();
        Student student = db.findStudent(id);

        System.out.println(student.getName());

        request.setAttribute("student", student);
        RequestDispatcher rd = request.getRequestDispatcher("/edit-student.jsp");
        rd.forward(request, response);

    }
}
