package br.com.upperapps.sakilasparkapi.infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {

    private static Connection connection;

    public static Connection getConnection(IJDBCProperties props) {

        try {
            Class.forName(props.getDriver()).newInstance();
            connection = DriverManager.getConnection(props.getURL(), props.getUser(), props.getURL());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
