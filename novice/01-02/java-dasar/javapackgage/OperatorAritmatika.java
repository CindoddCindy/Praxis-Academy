public class OperatorAritmatika{
    public static void main(String[] args) {
        //operator adalah simbol yang bukan huruf atau angka yang di gunakan untuk mengolah variable 
        // 6 jenis operator pada java 
        //pertama adalah operator aritmatika
        int angka_satu=10;
        int angka_dua=10;
        int tambah = angka_satu + angka_dua;
        double bagi = angka_satu / angka_dua;
        double modulus = angka_satu % angka_dua;
        int kali = angka_satu * angka_dua;
        int kurang = angka_satu - angka_dua;

        System.out.println("Hasil penjumlahan " + tambah);
        System.out.println("Hasil pembagian " + bagi);
        System.out.println("Hasil modulus atau sisa bagi " + modulus);
        System.out.println("Hasil perkalian " + kali);
        System.out.println("Hasil pengurangan " + kurang);
        
        
        
    }
}