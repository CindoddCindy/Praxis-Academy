public class BajuOnline{
    String jenis;
    int harga;
    
    public void setJenisBaju(String jenis){
        System.out.println("kamu memilih baju" + jenis);

    }

    public void setharga(int harga){
        System.out.println("harga baju ini adalah : "+ harga);
    }
    public String getJenis(){
        return jenis;
    }
    public int getHarga(){
        return harga;
    }
}