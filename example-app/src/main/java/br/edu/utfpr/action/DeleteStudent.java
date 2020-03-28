package br.edu.utfpr.action;

import br.edu.utfpr.model.DataBase;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteStudent {

    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {

        Integer id = Integer.parseInt(request.getParameter("id"));

        DataBase db = new DataBase();
        db.deleteStudent(id);

        response.sendRedirect("enrollList");
    }
}
