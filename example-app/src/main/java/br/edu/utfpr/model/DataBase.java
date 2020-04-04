package br.edu.utfpr.model;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataBase {

    private static List<Student> studentsList = new ArrayList<>();
    private static List<User> usersList = new ArrayList<>();
    private static Integer id = 1;

   static {
       User notFound = new User();
       notFound.setLogin("NotFound");
       usersList.add(notFound);

       User u1 = new User();
       u1.setLogin("Pablo");
       u1.setPass("123");
       User u2 = new User();
       u2.setLogin("Amanda");
       u2.setPass("345");
       usersList.add(u1);
       usersList.add(u2);
   }

    //STUDENT
    public void addStudent(Student student) {
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

    //USER
    public void addUser(User user) {
        DataBase.usersList.add(user);
    }

    public User findUser(String login, String pass) {

        for (User user : usersList) {

            if(user.isEqual(login, pass)) {
                return user;
            }
        }

        return usersList.get(0);
    }
}
