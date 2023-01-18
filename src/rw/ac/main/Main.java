package rw.ac.main;

import java.sql.*;

public class Main {
    public static void main(String[] args){
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\BELLAMY\\IdeaProjects\\mediaplayer\\myFirstDB.db" );
            Statement statement = connection.createStatement();
            //sql query
            System.out.println("Executing statements...");
            //Create query
            statement.execute("CREATE TABLE IF NOT EXISTS contacts(Name TEXT, Phone TEXT, EMAIL TEXT, AGE INTEGER )");
            //Insert query
//            statement.execute("INSERT INTO contacts(Name,Phone,Email,Age) VALUES ('Lebron James','0783679024','lebro@gmail.com',34)");
//            statement.execute("INSERT INTO contacts(Name,Phone,Email,Age) VALUES ('Steph Curry','0783541434','steph@here.com',23)");
//            statement.execute("INSERT INTO contacts(Name,Phone,Email,Age) VALUES ('Kevin Durant','0791308563','kd@nba.io',34)");
            //Update query
//            statement.execute("UPDATE contacts SET email = 'james23@gmail.com' WHERE Name = 'Lebron James'");
            //Delete query
//            statement.execute("DELETE FROM contacts WHERE Name='Lebron James'");
            //Select query
            ResultSet resultSet = statement.executeQuery("SELECT * FROM contacts");

            System.out.println();
            System.out.println("Contacts");

            while(resultSet.next()){
                System.out.println(
                        resultSet.getString("Name")+ " ---- "+
                        resultSet.getString("Phone")+ " ---- "+
                        resultSet.getString("Email")+ " ---- "+
                        resultSet.getInt("Age")
                );
            }
            //closing connection
            System.out.println();
            System.out.println("Closing result set...");
            resultSet.close();
            System.out.println("Closing statements...");
            statement.close();
            System.out.println("Closing connection...");
            connection.close();
        } catch(SQLException e) {
            System.out.println("Ooops!!Something went wrong!!");
        }
    }
}
