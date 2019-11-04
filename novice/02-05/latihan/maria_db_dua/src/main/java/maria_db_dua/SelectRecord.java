package maria_db_dua;
import java.sql.*;

import javax.sound.midi.SysexMessage;
public class SelectRecord{
    static final String JDBC_DRIVER="org.mariadb.jdbc.Driver";
    static final String DB_URL="jdbc:mariadb://localhost/STUDENTS";

    static final String USER ="cindy";
    static final String PASS="160712";

    public void selectRecord(){
        Connection conn=null;
        Statement stmt=null;

        try{
            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("Connecting to a selected database");
            conn=DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully");

            System.out.println("Creating Statement ...");
            stmt= conn.createStatement();
            String sql = "SELECT id, first,last, age FROM REGISTRATION";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                int id = rs.getInt("id");
                int age = rs.getInt("age");
                String first = rs.getString("first");
                String last = rs.getString("last");

                System.out.println("ID" + id);
                System.out.println("Age" + age);
                System.out.println("First" + first);
                System.out.println("last" + last);


            }
            rs.close();

        }catch(SQLException se){
            se.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(stmt !=null)
                conn.close();
            }catch(SQLException se){

            }
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