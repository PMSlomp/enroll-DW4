package br.edu.utfpr.model;

public class User {

    private String login;
    private String pass;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public boolean isEqual(String login, String pass) {

        if(this.login.equals(login)) {
            System.out.println("login OK");
            if(this.pass.equals(pass)) {
                System.out.println("Pass OK");
                return true;
            }
        }

        return false;
    }
}
