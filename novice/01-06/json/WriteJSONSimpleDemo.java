import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
 
public class WriteJSONSimpleDemo {
     public static void main(String[] args) {
 
	JSONObject obj = new JSONObject();
	obj.put("npm", "201490100");
        obj.put("nama", "Nursalim");
	obj.put("usia", new Integer(100));
 
	JSONArray list = new JSONArray();
	list.add("Travelling");
	list.add("Menonton");
	list.add("Tidur");
 
	obj.put("hobies", list);
 
	try {
 
		FileWriter file = new FileWriter("/Desktop/Praxis-Academy/novice/01-06/json/test.json");
		file.write(obj.toJSONString());
		file.flush();
		file.close();
 
	} catch (IOException e) {
		e.printStackTrace();
	}
 
	System.out.print(obj);
 
     }
 
}

