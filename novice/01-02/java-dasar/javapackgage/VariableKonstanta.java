public class VariableKonstanta {

public static void main(String[] args){

//variable konstanta di tulis dengan huruf besar dengan keyword static dan keyword final jika kita hendak memanggilnya di kelas lain
// alasan konstanta adalah isi dari variable ini tidak dapat diubah
//misalkan variable akan di panggil pada kelas lain maka isi variabel ini mutlak
 int NILAI_KONSTAN=10;
 String NILAI_KONSTANTA_STRING="NASI BUNGKUS";

System.out.println("Nilai konstanta int adalah " + NILAI_KONSTAN);
System.out.println("Nilai konstanta String adalah " + NILAI_KONSTANTA_STRING);

}
}