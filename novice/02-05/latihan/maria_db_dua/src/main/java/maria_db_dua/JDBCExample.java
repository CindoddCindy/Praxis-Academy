package maria_db_dua;

import java.sql.*;


public class JDBCExample{

   
    public static void main (String [] args){
         UseDatabase useDatabase = new UseDatabase();

        // useDatabase.useDb();

         CreateTable createTable = new CreateTable();
       //  createTable.createTable();

       InsertRecord insertRecord = new InsertRecord();
       //insertRecord.insertRecord();
       SelectRecord selectRecord = new SelectRecord();
       //selectRecord.selectRecord();

       UpdateRecord updateRecord = new UpdateRecord();
      // updateRecord.updateRecord();

      DeleteRecord deleteRecord= new DeleteRecord();
      //deleteRecord.deleteRecord();
      WhereClause whereClause = new WhereClause();
      //whereClause.whereClause();
      LikeClause likeClause = new LikeClause();
      //likeClause.likeClause();
      SortingData sortingData = new SortingData();
      sortingData.sortingData();

    }



}