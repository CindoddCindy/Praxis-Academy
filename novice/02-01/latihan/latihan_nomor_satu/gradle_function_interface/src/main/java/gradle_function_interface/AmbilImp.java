package gradle_function_interface;

public class AmbilImp implements MyInterface{
    public static void main(String []args){

        MyInterface myInterface= new MyInterface(){
        
            @Override
            public void run() {
                // TODO Auto-generated method stub
                
            }
        };

        myInterface.run();

    }
}