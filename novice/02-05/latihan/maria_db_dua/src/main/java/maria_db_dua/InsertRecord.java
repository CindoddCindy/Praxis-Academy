package maria_db_dua;

//import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class InsertRecord{
    static final String JDBC_DRIVER="org.mariadb.jdbc.Driver";
    static final String DB_URL="jdbc:mariadb://localhost/STUDENTS";

    static final String USER = "cindy";
    static final String PASS="160712";

    public void insertRecord(){
        Connection conn=null;
        Statement stmt = null;

        try{
            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("Conecting to a selected database ...");
            conn=DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully ...");

            System.out.println("Inserting records into table ...");
            stmt = conn.createStatement();

            String sql = " INSERT INTO REGISTRATION " + 
            " VALUES (100,'Zara','ALI',18)";
            stmt.execute(sql);
            sql= "INSERT INTO REGISTRATION " + "VALUES (101,'Mahnaz','Fatma',25)";
            stmt.execute(sql);
            sql ="INSERT INTO REGISTRATION " +
            "VALUES (103,'Sumit', 'Mittal',28)";
            stmt.execute(sql);
            System.out.println("Inserted records into the table ...");


        }catch(SQLException se){
            se.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(stmt !=null)
                conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
        System.out.println("goodbye");
    }
}