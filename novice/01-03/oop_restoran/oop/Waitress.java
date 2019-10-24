public class Waitress{
    String nama_witress;
    String shift_waitress;

    public Waitress(String nama_waitress,String shift_waitress){

    }

    public void setNamaWaitress(String nama_waString){
        System.out.println("Nama Waitress adalah " + nama_waString);
    }
    public String getNamaWaitress(){
        return nama_witress;
    }

    public void setShiftWaitress(String shift_waitress){
        System.out.println("Shift Waitres " + shift_waitress);
    }

    public String getShiftWaitress(){
        return shift_waitress;
    }
}