public class PanggilKelasSetNama{

public static void main(String[] args){
    SetNama settNama=new SetNama("panji");
System.out.println(settNama);

settNama.setNama("panji");
System.out.println("namanya adalah : " + settNama.getNama());
}
}