package com.jstarczewski;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
	// write your code here


        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Jan\\databases\\base.db");
            Statement statement = connection.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS contacts" +
                    "(name TEXT, phone INT, email TEXT)");
            statement.execute("INSERT INTO contacts (name, phone, email) " +
                    "VALUES ('Tim', '997998999', 'TimSrim@pw.pl')");
            statement.close();
            connection.close();
        }
        catch (SQLException e) {
            System.out.println("Something went wrong "  + e.getMessage());
        }


    }
}
