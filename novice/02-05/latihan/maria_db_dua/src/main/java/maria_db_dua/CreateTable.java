package maria_db_dua;

// import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class CreateTable{
    public static final String JDBC_DRIVER="org.mariadb.jdbc.Driver";
    public static final String DB_URL="jdbc:mariadb://localhost/STUDENTS";

    static final String USER="cindy";
    static final String PASS="160712";

    public void createTable(){
        Connection conn=null;
        Statement stm= null;

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("Connecting to a selected database...");
            conn=DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("Connected database successfully ...");
            System.out.println ("Creating table in given database ...");
            stm = conn.createStatement();
            String sql = " CREATE TABLE REGISTRATION " +
            " (id INTEGER not NULL, " +
            " first VARCHAR(255), " +
            " last VARCHAR (255), " +
            " age INTEGER, " + 
            " PRIMARY KEY (id)) ";
            stm.executeQuery(sql);
            System.out.println("Created table in given database ...");

        }catch(SQLException se){
            se.printStackTrace();

        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(stm!=null)
                conn.close();
            }catch(SQLException se){

            }try{
                if(conn!=null)
                conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }

        }

        System.out.println("goodbye");
    }
}