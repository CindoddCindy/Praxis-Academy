package maria_db_dua;
import java.sql.*;

public class SortingData{
    static final String JDBC_DRIVER ="org.mariadb.jdbc.Driver";
    static final String DB_URL="jdbc:mariadb://localhost/STUDENTS";

    static  final String USER = "cindy";
    static final String PASS = "160712";

    public void sortingData(){
        Connection conn = null;
        Statement stmt = null;
        try{
            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println(" Conecting to a selected database");
            conn=DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully");
            System.out.println("Creating statement ");
            stmt=conn.createStatement();
            System.out.println("Fetching records in asscending order ....");
            String sql = "SELECT id, first, last, age FROM REGISTRATION " +
            " ORDER BY first ASC ";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()){
                int id = rs.getInt("id");
                int age = rs.getInt("age");
                String first = rs.getString("first");
                String last= rs.getString("last");

                System.out.print("ID : " + id);
                System.out.print("Age : " + age);
                System.out.print("First : " + first);
                System.out.print("Last : " + last);
            
            }
            System.out.println(" Fetching record in descending order ...");
            sql = "SELECT id, first,last, age FROM  REGISTRATION " + " ORDER BY first DESC ";
            rs=stmt.executeQuery(sql);

            while (rs.next()){
                int id = rs.getInt("id");
                int age = rs.getInt("age");
                String first = rs.getString("first");
                String last= rs.getString("last");

                System.out.print("ID : " + id);
                System.out.print("Age : " + age);
                System.out.print("First : " + first);
                System.out.print("Last : " + last);
            
            

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
            if(conn !=null)
            conn.close();
        }catch(SQLException se){
            se.printStackTrace();

        }
    }
    System.out.println("goodbye");

}}