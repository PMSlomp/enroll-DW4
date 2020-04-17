package br.edu.utfpr.model;

public class Student {

    private Integer id;
    private String name;
    private String curse;
    private String year;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setNome(String name) {
        this.name = name;
    }

    public String getCurse() {
        return curse;
    }
    public void setCurse(String curse) {
        this.curse = curse;
    }

    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
}
