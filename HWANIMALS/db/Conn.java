package HWANIMALS.db;

import java.sql.*;

import static db.ConnectData.*;

public class Conn {
    private Connection connect;

    static Connection connect() throws ClassNotFoundException, SQLException {
        Class.forName(DRIVER);
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
