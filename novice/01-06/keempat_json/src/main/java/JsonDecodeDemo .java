import java.text.ParseException;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

class JsonDecodeDemo {

   public static void main(String[] args) {
	
      JsonParser parser = new JsonParser();
      String s = "[0,{\"1\":{\"2\":{\"3\":{\"4\":[5,{\"6\":7}]}}}}]";
		
      try{
         Object obj = parser.parse(s);
         JsonArray array = (JsonArray)obj;
			
         System.out.println("The 2nd element of array");
         System.out.println(array.get(1));
         System.out.println();

         JsonObject obj2 = (JsonObject)array.get(1);
         System.out.println("Field \"1\"");
         System.out.println(obj2.get("1"));    

         s = "{}";
         obj = parser.parse(s);
         System.out.println(obj);

         s = "[5,]";
         obj = parser.parse(s);
         System.out.println(obj);

         s = "[5,,2]";
         obj = parser.parse(s);
         System.out.println(obj);
      }catch(Exception pe) {
         System.out.println("position: " + pe.getLocalizedMessage());
         System.out.println(pe);
      }
   }
}