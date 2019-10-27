public class PanggilSemua{

    public static void main(String[]args){
        InnerClass innerClass = new InnerClass();
        innerClass.panggilrealInner();

        EnumClass jenisBaju = new EnumClass();

        jenisBaju.setJenisBaju(getJenisBaju, urutanBaju);
        jenisBaju.getJenisBaju();
        jenisBaju.getUrutanBaju();

        BajuOnline bajuOnline = new BajuOnline();
        bajuOnline.setJenisBaju(jenis);
        bajuOnline.setharga(harga);
        bajuOnline.getJenis();
        bajuOnline.getHarga();


        
    }
}