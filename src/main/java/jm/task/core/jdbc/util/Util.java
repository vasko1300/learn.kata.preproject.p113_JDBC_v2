package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // В JDBC версии младше 4.0 регистрация драйвера обязательна. С 4.0 подхватывается автоматом из classpath
    // Драйвер необходимо зарегистрировать один раз до вызова getConnection - при загрузке класса. Поэтому в static блоке
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Unable to register driver", e);
        }
    }
    private static String url = "jdbc:mysql://localhost:3306/preproject113";
    private static String user = "root";
    private static String password = "132435";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
}
