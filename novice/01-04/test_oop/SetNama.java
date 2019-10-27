public class SetNama{

    String nama;

    public SetNama(String nama){
        this.nama=nama;
    }

    public void setNama(String nama){
        System.out.println(" set nama menjadi" + nama);
    }

    public String getNama(){
        return nama;
    }
}