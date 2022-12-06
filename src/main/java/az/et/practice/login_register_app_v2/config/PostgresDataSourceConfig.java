package az.et.practice.login_register_app_v2.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresDataSourceConfig implements DataSourceConfig {
    @Override
    public Connection getConnection() {
        try {
            return DriverManager.getConnection(
                    System.getenv("db_url"),
                    System.getenv("db_user"),
                    System.getenv("db_password")

            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
