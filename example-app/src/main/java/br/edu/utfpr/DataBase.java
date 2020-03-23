package br.edu.utfpr;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    private static List<Student> studentsList = new ArrayList<>();

    public void add(Student student) {
        DataBase.studentsList.add(student);
    }

    public List<Student> getStudentsList() {
        return DataBase.studentsList;
    }
}
