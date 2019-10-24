public class ExceptionHandling{
    try{
        // pernyataan yang berpotensi mengakibatkan Exception
       int angka = 7;
       int hasil = angka/0;
       System.out.println(hasil);
    }catch(ArithmeticException ex){
        // pernyataan disini akan di eksekusi jika terjadi Exception
        System.out.println("Tidak Boleh Menggunakan Pembagian dengan 0 (nol)");
    }
}