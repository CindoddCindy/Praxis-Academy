public class SetNama{
    String nama;

    public SetNama(String nama){
        this.nama=nama;
    }
    public void SetNama(String nama){
        System.out.println("Jadi namanya adalah " + nama);
    }

    public String getNama(){
        return nama;
    }
}