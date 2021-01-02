package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionManager {
    private Connection conn;
    private static DBConnectionManager connectionInstance = new DBConnectionManager();

    public DBConnectionManager() {
    }

    public static DBConnectionManager getConnectionInstance() {
        return connectionInstance;
    }
    public void connect() throws SQLException {
        conn = DriverManager.getConnection("url");
        System.out.println("establishing connection");
    }

    public Connection getConnectionObject() {
        return conn;
    }


}
