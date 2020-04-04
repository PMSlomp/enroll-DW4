package br.edu.utfpr.action;

import br.edu.utfpr.model.DataBase;
import br.edu.utfpr.model.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EditStudent {

    public String execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String studentName = request.getParameter("name");
        Integer id = Integer.parseInt(request.getParameter("id"));

        DataBase db = new DataBase();

        Student student = db.findStudent(id);
        student.setNome(studentName);

//        response.sendRedirect("enrollList");
        return"redirect:enrollList";
    }
}
