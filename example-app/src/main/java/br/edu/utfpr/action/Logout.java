package br.edu.utfpr.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Logout {

    public String execute(HttpServletRequest request, HttpServletResponse response){

        HttpSession session = request.getSession();
        session.invalidate();
        
        return "redirect:index?way=FormToLogin";
    }
}
