public class Koki{
    String nama_koki;
    String shift_koki;

    public Koki(String nama_koki, String shift_koki){
        this.nama_koki=nama_koki;
        this.shift_koki=shift_koki;
    }

    public void setNamaKoki(String nama_koki){
        System.out.println("Nama koki " + nama_koki);
    }
    public String getNamaKoki(){
        return nama_koki;
    }

    public void setShiftKoki(Sring shift_koki){
        System.out.println("Shift koki " + shift_koki);
    }
    
    public String getShiftKoki(){
        return shift_koki;
    }
}