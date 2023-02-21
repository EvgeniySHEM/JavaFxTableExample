package com.example.javafxtableexample;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class Repository {
    private final String URL = "jdbc:mysql://localhost:3306/demo";
    private final String USER = "root";
    private final String PASSWORD = "12345678";

    public Set<Authors> getAllAuthors() {
        Set<Authors> authorsSet = new HashSet<>();
        try(Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from AUTHORS")) {
            while (resultSet.next()) {
                authorsSet.add(new Authors(resultSet.getInt(1),
                        resultSet.getString(2), resultSet.getString(3)));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return authorsSet;
    }
}
