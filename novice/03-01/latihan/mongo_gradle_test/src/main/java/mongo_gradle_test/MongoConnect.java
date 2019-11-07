package mongo_gradle_test;

// import com.mongodb.ServerAddress;

// import com.mongodb.client.MongoDatabase;
// import com.mongodb.client.MongoCollection;

// import org.bson.Document;
// import java.util.Arrays;
// import com.mongodb.Block;

// import com.mongodb.client.MongoCursor;
// import static com.mongodb.client.model.Filters.*;
// import com.mongodb.client.result.DeleteResult;
// import static com.mongodb.client.model.Updates.*;
// import com.mongodb.client.result.UpdateResult;
// import java.util.ArrayList;
// import java.util.List;
// import java.util.Arrays;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;

public class MongoConnect {

    public void mongoConnect() {

        //membuat mongo client
        MongoClient mongo = new MongoClient("localhost", 27017);

        // membuat credential
        MongoCredential credential;
        credential = MongoCredential.createCredential("", "myDb", "".toCharArray());

        System.out.println("Connected to the database successfully");

        // Mengakses database
        MongoDatabase database = mongo.getDatabase("myDb");
        System.out.println("Credentials ::"+credential);
    }
}