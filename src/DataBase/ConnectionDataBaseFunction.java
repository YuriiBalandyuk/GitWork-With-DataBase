package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;

/* Метод підключення до DataBase (PostgreSQL) */
public class ConnectionDataBaseFunction {
    public Connection connect_to_db(String dbname, String user, String password) {
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + dbname, user, password);
            if (connection != null) {
                System.out.println("---------------------------------------------------------------------------------------------------------------");
                System.out.println("Connection Done");
                System.out.println("---------------------------------------------------------------------------------------------------------------");
            } else {
                System.out.println("---------------------------------------------------------------------------------------------------------------");
                System.out.println("Connection Failed");
                System.out.println("---------------------------------------------------------------------------------------------------------------");
            }

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("---------------------------------------------------------------------------------------------------------------");
        }
        return connection;
    }
}
