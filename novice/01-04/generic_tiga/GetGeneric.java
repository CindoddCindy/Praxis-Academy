public class GetGeneric {
    public static void main(String[] args) {
      
      GenericTiga<Sayuran> gTiga = new GenericTiga<Sayuran>();
      gTiga.blendIt(new Sayuran()); 

      GenericTiga<Buahan> genericTiga = new GenericTiga<Buahan>();     
      genericTiga.blendIt(new Buahan());
    }
  }