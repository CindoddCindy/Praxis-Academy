public class Pengunjung{
    int pesan_minuman;
    int pesan_makanan;

    public Pengunjung(int pesan_minuman,int pesan_makanan){
        this.pesan_minuman=pesan_minuman;
        this.pesan_makanan=pesan_makanan;
    }

    public void setPesanMinuman(int pesan_minuman){
        System.out.println("Pengunjung pesan minuman"+ pesan_minuman);
    }

    public int getPesanMinuman(){
        return pesan_minuman;
    }

    public void setPesanMakanan(int pesan_makanan){
        System.out.println("Pengunjung pesan makananan" + pesan_makanan);
    }
    public int getPesanMakanan(){
        return pesan_makanan;
    }

}