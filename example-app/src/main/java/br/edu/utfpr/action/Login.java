package br.edu.utfpr.action;

import br.edu.utfpr.model.DataBase;
import br.edu.utfpr.model.User;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class Login {

    public String execute(HttpServletRequest request, HttpServletResponse response) throws IOException {


        String login = request.getParameter("login");
        login = login.toUpperCase();
        Cookie ck = new Cookie("login", login + "CK");
        String pass = request.getParameter("pass");

        DataBase db = new DataBase();
        User user = db.findUser(login, pass);

        if(user.getLogin() != "NotFound") {

            System.out.println("usuário existente");

            HttpSession session = request.getSession();
            session.setAttribute("user", user);

            ck.setMaxAge(-1);
            System.out.println("tempo do cookie: " + ck.getMaxAge());
            response.addCookie(ck);

            return "redirect:index?way=IncludeStudent";
        } else {

            request.setAttribute("user", user.getLogin());

            System.out.println("nao existente");
//            return "redirect:list?way=FormToLogin";
            return "forward:login.jsp";
        }
    }
}
