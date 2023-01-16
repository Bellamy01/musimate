package rw.ac.mediaplayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args){
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\BELLAMY\\IdeaProjects\\mediaplayer\\myFirstDB.db" );
            Statement statement = connection.createStatement();
            //sql query
            //statement.execute("CREATE TABLE contacts(Name TEXT, Phone TEXT, EMAIL TEXT, AGE INTEGER )");
            System.out.println("Executing statement...");
            statement.execute("INSERT INTO contacts(Name,Phone,Email,Age) VALUES ('Lebron James','0783679024','lebro@gmail.com',34)");
            //closing connection
            System.out.println("Closing statement...");
            statement.close();
            System.out.println("Closing connection...");
            connection.close();
        } catch(SQLException e) {
            System.out.println("Something went wrong!!");
        }
    }
}
