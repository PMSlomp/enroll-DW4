package br.edu.utfpr.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class IncludeStudent {

    public String execute(HttpServletRequest request, HttpServletResponse response) {

        return "forward:include-student.jsp";
    }
}
