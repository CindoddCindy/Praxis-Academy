public  class StaticClass{

   public static String nama;
    int noHp;

    public  StaticClass(int noHp){
        this.noHp=noHp;

    }

    public static void setNama(String nama){
        System.out.println(nama);

    }

    public static String getNama(){
        return nama;
    }

    public void setNoHape(int noHp){
        System.out.println(noHp);
    } 

    public int getNoHp(){
        return noHp;
    }

}