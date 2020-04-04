package br.edu.utfpr.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FormToLogin {

    public String execute(HttpServletRequest request, HttpServletResponse response) throws IOException {

        //DEIXAR MENSAGEM DE USUÁRIO NAO ENCONTRADO
        System.out.println(request.getAttribute("user"));

        return "forward:login.jsp";
    }
}
