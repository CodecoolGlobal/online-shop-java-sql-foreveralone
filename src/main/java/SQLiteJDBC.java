import  java.sql.*;

public class SQLiteJDBC {


    Connection c = null;


    public void connect(){

        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:onlineshop.db");
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("opened database succesfully");
    }

    public void dissconnect(){
        try {
            c.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
