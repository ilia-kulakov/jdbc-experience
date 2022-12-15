package jdbc.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    private static final String USERNAME = "dbuser";
    private static final String PASSWORD = "15648977";
    private static final String CONN_STRING = "jdbc:mariadb://localhost:3306/explorecalifornia";

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            System.out.println("Connected");
        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            if(connection != null) {
                connection.close();
            }
        }
    }
}