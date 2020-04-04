package br.edu.utfpr.action;

import br.edu.utfpr.model.DataBase;
import br.edu.utfpr.model.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FormToEdit {

    public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        Integer id = Integer.parseInt(request.getParameter("id"));

        DataBase db = new DataBase();
        Student student = db.findStudent(id);

        System.out.println("Editar: " + student.getName());

        request.setAttribute("student", student);

        return "forward:edit-student.jsp";
    }
}
