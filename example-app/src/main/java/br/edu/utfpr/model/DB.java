package br.edu.utfpr.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {

    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3310/college?useTimezone=true&serverTimezone=UTC", "root", "root");

        connection.close();
    }
}
