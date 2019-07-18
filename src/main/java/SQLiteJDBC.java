import  java.sql.*;

public class SQLiteJDBC {


    Connection connection = null;


    public Connection connect(){
        try {
            String url = "jdbc:sqlite:/Users/MartaSibielak/Desktop/online-shop-java-sql-foreveralone/src/main/resources/onlineshop.db";
            connection = DriverManager.getConnection(url);
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("opened database successsfully");
        return connection;
    }


    public void disconnect(){
        try {
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
