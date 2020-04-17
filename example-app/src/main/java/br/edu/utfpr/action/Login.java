package br.edu.utfpr.action;

import br.edu.utfpr.model.DataBase;
import br.edu.utfpr.model.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class Login {

    public String execute(HttpServletRequest request, HttpServletResponse response) throws IOException {


        String login = request.getParameter("login");
        login = login.toLowerCase();
        String pass = request.getParameter("pass");

        DataBase db = new DataBase();
        User user = db.findUser(login, pass);

        if(user.getLogin() != "NotFound") {

            System.out.println("usuário existente");

            HttpSession session = request.getSession();
            session.setAttribute("user", user);

//            return "forward:include-student.jsp";
            return "redirect:index?way=IncludeStudent";
        } else {

            request.setAttribute("user", user.getLogin());

            System.out.println("nao existente");
//            return "redirect:list?way=FormToLogin";
            return "forward:login.jsp";
        }
    }
}
