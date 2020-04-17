package br.edu.utfpr.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FormToRegister {

    public String execute(HttpServletRequest request, HttpServletResponse response) throws IOException {

        return "forward:register.jsp";
    }
}