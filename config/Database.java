package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private final String dbname;
    private final String username;
    private final String password;
    private final String host;
    private final String port;
    private Connection connection;

    public Database(String dbname, String username, String password, String host, String port) {
        this.dbname = dbname;
        this.username = username;
        this.password = password;
        this.host = host;
        this.port = port;
    }
    public Connection getConnection() {
        return connection;
    }

    public void setup() {
        String mysqlConnUrlTemplate = "jdbc:mysql://%s:%s/%s";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(String.format(mysqlConnUrlTemplate, host, port, dbname), username, password);
            System.out.println("Database connected!");

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
