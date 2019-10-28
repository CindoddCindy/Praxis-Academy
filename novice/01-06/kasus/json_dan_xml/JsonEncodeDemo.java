import org.json.simple.JSONObject;

class JsonEncodeDemo {

   public static void main(String[] args) {
      JSONObject obj = new JSONObject();

      obj.put("nip", "10106031");
      obj.put("nama", "Eko");
      obj.put("email", "eko@gmail.com");
      obj.put("nip", "10106032");
      obj.put("nama", "Khannedy");
      obj.put("email", "khannedy@gmail.com");
      System.out.print(obj);
   }
}