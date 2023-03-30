import model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class DBUtils {
    public static Connection connect() {
        Connection connection = null;
        String Url = "jbdc:sqlite:src/main/resources/database/preBoards.db";
        try {
            connection = DriverManager.getConnection(Url);
            System.out.println("Connection Established");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }

    public static List<User> display_user(Connection connection) {
        return null;
    }

    public static List<Class> display_class(Connection connection) {
        return null;
    }

    public static void insert_user(Connection connection, User user) {
    }

    public static void insert_class(Connection connection, Class classobject) {
    }

    public static void insert_attendence(Connection connection, User user, Class classobject) {
    }
}
