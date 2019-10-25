import java.util.*;

public class GenericDua{
    public static void main(String args[]){  
        ArrayList<String> list=new ArrayList<String>();  
        list.add("sharukh");  
        list.add("khan");  
        list.add("nama");
        //list.add(32);//compile time error  
          
        String s=list.get(1);//type casting is not required  
        System.out.println("element is: "+s);  
          
        Iterator<String> itr=list.iterator();  
        while(itr.hasNext()){  
        System.out.println(itr.next());  
        }  
        }  
}