package br.edu.utfpr.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataBase {

    private static List<Student> studentsList = new ArrayList<>();
    private static Integer id = 1;

    public void add(Student student) {
        student.setId(DataBase.id++);
        DataBase.studentsList.add(student);
    }

    public List<Student> getStudentsList() {
        return DataBase.studentsList;
    }

    public void deleteStudent(Integer id) {

        Iterator<Student> itStd = studentsList.iterator();

        while (itStd.hasNext()) {
            Student student = itStd.next();
            if(student.getId() == id) {
                itStd.remove();
                break;
            }
        }
    }

    public Student findStudent(Integer id) {

        for (Student std: studentsList) {

            if(std.getId() == id) {

                return std;
            }
        }
        return null;
    }
}
