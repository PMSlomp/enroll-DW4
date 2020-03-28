package br.edu.utfpr;

import br.edu.utfpr.action.DeleteStudent;
import br.edu.utfpr.action.EditStudent;
import br.edu.utfpr.action.ShowToEdit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/list")
public class Servlet extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String way = request.getParameter("way");

        if(way.equals("delete")) {

            System.out.println("deletar");

            DeleteStudent deleteStudent = new DeleteStudent();
            deleteStudent.execute(request, response);
        } else if(way.equals("edit")) {

            System.out.println("editar");

            ShowToEdit showToEdit = new ShowToEdit();
            showToEdit.execute(request, response);
        } else if(way.equals("edited")) {

            System.out.println("editado");

            EditStudent editStudent = new EditStudent();
            editStudent.execute(request, response);
        }

    }
}
