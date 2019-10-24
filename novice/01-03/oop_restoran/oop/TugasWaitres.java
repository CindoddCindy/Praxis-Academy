public class TugasWaitress implements MakananMinuman{

    @Override
    public void antarMakanan() {
        System.out.println("Mengatantar Makanan ke pengunjung");
    }

    @Override
    public void antarMinuman() {
        System.out.println("Mengantar Minuman");
    }

    public void AntarDenganSenyum(String sikap){
        boolean senyum = true;
        if(senyum !=true){
            System.out.println("dapat bintang 1");
        }
        else{
            System.out.println("dapat bintang 5");
        }
        
    }
}