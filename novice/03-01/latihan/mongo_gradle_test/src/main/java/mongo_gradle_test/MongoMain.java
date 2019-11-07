package mongo_gradle_test;

public class MongoMain{

    public static void main(String [] args){
        MongoConnect mongoConnect = new MongoConnect();
        //mongoConnect.mongoConnect();
        CreateCollection createCollection = new CreateCollection();
        createCollection.createCollection();
    }
}