public class SingletonObject{

    private static SingletonObject singletonObject = new SingletonObject();
    private SingletonObject(){
        System.out.println("object Koki");
        System.out.println("object Waitress");
        System.out.println("object Pembeli");
    }
     
    public static SingletonObject getInstance() {
        return singletonObject;
    }

    
}
