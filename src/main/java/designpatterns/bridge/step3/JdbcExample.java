package designpatterns.bridge.step3;

import java.sql.*;

public class JdbcExample {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.h2.Driver");

        try (Connection conn = DriverManager.getConnection("jdbc:h2:mem:~/test", "sa", "")) {
            String sql = "CREATE TABLE ACCOUNT " +
                    "(id INTEGER not NULL," +
                    " email VARCHAR(255)," +
                    " password VARCHAR(255)," +
                    " PRIMARY KEY (id)";

            Statement statement = conn.createStatement();
            statement.execute(sql);
        }
    }
}
