package maria_db_dua;
import java.sql.*;
public class UseDatabase{
    static final String JDBC_DRIVER="org.mariadb.jdbc.Driver";
    static final String DB_URL="jdbc:mariadb://localhost/STUDENTS";

    static final String USER = "cindy";
    static final String PASS="160712";

    public void useDb(){
        Connection conn=null;
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("Connecting to a selected database");
            conn=DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected datbase successfully");

        }catch(SQLException se){
            se.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(conn!=null)
                conn.close();

            }catch(SQLException se){
                se.printStackTrace();
            }
        }
        System.out.println("goodbye");

    }

}