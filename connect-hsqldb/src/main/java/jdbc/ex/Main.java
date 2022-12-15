package jdbc.ex;

import jdbc.ex.tables.Tours;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    private static final String USERNAME = "dbuser";
    private static final String PASSWORD = "dbpassword";
    private static final String CONN_STRING = "jdbc:hsqldb:res:data/explorecalifornia";

    public static void main(String[] args) throws SQLException {

        try(
            Connection connection = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery("SELECT * FROM tours");
            ) {
            Tours.displayData(rs);
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
}