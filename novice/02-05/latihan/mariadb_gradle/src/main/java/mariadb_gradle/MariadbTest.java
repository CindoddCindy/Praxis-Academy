package mariadb_gradle;
import java.sql.*;

public class MariadbTest {

    public static void main( String[] args ) throws SQLException {
        //create connection for a server installed in localhost, with a user "root" with no password
        try (Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/DB?user=root&password=160712")) {
            // create a Statement
            //("jdbc:mariadb://localhost:3306/DB?user=root&password=myPassword");
            //jdbc:mariadb://localhost/", "root", null
            try (Statement stmt = conn.createStatement()) {
                //execute query
                try (ResultSet rs = stmt.executeQuery("SELECT 'Hello World!'")) {
                    //position result to first
                    rs.first();
                    System.out.println(rs.getString(1)); //result is "Hello World!"
                }
            }
        }
    }
}