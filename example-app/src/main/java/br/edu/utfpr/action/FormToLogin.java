package br.edu.utfpr.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class FormToLogin {

    public String execute(HttpServletRequest request, HttpServletResponse response) throws IOException {

        return "forward:login.jsp";
//        return "redirect:list?way=IncludeStudent";
    }
}
