import com.mongodb.client.MongoCollection; 
import com.mongodb.client.MongoDatabase; 

import org.bson.Document; 
import com.mongodb.MongoClient; 
import com.mongodb.MongoCredential;  

public class selectingCollection { 
   
   public static void main( String args[] ) {  
      
      // Creating a Mongo client 
      MongoClient mongo = new MongoClient( "localhost" , 27017 ); 
     
      // Creating Credentials 
      MongoCredential credential; 
      credential = MongoCredential.createCredential("sampleUser", "myDb", 
         "password".toCharArray()); 
      System.out.println("Connected to the database successfully");  
      
      // Accessing the database 
      MongoDatabase database = mongo.getDatabase("myDb");  
      
      // Creating a collection 
      System.out.println("Collection created successfully"); 

      // Retieving a collection
      MongoCollection<Document> collection = database.getCollection("myCollection"); 
      System.out.println("Collection myCollection selected successfully"); 
   }
}