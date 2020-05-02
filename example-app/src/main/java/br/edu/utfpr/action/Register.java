package br.edu.utfpr.action;

import br.edu.utfpr.model.DataBase;
import br.edu.utfpr.model.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class Register {

    public String execute(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String login = request.getParameter("login");
        String pass = request.getParameter("pass");

        User user = new User();
        user.setLogin(login.toUpperCase());
        user.setPass(pass);

        DataBase db = new DataBase();
        db.addUser(user);

        System.out.println(user);
        System.out.println(user.getLogin() + " - " + user.getPass());
        System.out.println(db.findUser(user.getLogin(), user.getPass()));

        return "redirect:index?way=FormToLogin";
    }
}