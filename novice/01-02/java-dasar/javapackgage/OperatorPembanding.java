public class OperatorPembanding{
    public static void main(String[] args) {
        //operator pembanding
        int angka_pertama=10;
        int angka_kedua=20;

        //menggunakan operator pembanding (<)
        if(angka_pertama<angka_kedua){
            System.out.println("benar karena 10 lebih kecil dari 20");
        }//ini block

        /* ini komen */
        // ini juga komen maka tidak akan di compile

        //menggunakan operator pembanding (>)
        if(angka_pertama>angka_kedua){
            System.out.println("salah karena 10 lebih kecil dari 20");
        }

        //menggunakan operator pembanding (!=)
        if(angka_pertama != angka_kedua){
            System.out.println("benar karena 10 tidak sama dengan 20");
        }

        //menggunakan operator pembanding (==)

        if(angka_pertama == angka_kedua){   
            System.out.println("salah karena 10 tidak sama dengan 20");
        }

    }
}