package  maria_db_dua;
import java.sql.*;

public class CreateDb{

     //static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
     static final String JDBC_DRIVER="org.mariadb.jdbc.Driver";
     // static final String DB_URL="jdbc:mysql://localhost/";
     static final String DB_URL="jdbc:mariadb://localhost/";
  
      static final String USER ="cindy";
      static final String PASS="160712";
  
    public void createDb(){

        Connection conn = null;
         Statement stmt = null;
         try{
             Class.forName("org.mariadb.jdbc.Driver");
             System.out.println(" Connecting to database");
             conn =DriverManager.getConnection(DB_URL, USER, PASS);
             System.out.println(conn);
             System.out.println("creating database");
             stmt=conn.createStatement();

             String sql ="CREATE DATABASE STUDENTS";
             stmt.executeUpdate(sql);

         }catch(SQLException se){
             se.printStackTrace();
         }catch (Exception e){
             e.printStackTrace();
         }finally{
             try{
                 if(stmt!=null)
                 conn.close();
             }catch (SQLException se){
                 se.printStackTrace();
             }

         }
         System.out.println("goodbye");

        
    }
}