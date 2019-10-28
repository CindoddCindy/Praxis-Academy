import arya.serialization.Mahasiswa;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
 
/**
 *
 * @author bandenk
 */
public class UjiSerialize {
 
 public static void main(String[] args) {
 Mahasiswa mahasiswa = new Mahasiswa();
 mahasiswa.setNim("07410100133");
 mahasiswa.setNama("I Gede Arya Wiratama");
 mahasiswa.setJurusan("Sistem Informasi");
 mahasiswa.setUmur(22);
 mahasiswa.cetakData();
 //Serialized Object
 try{
 FileOutputStream outputStream = new FileOutputStream("mahasiswa.ser");
 ObjectOutputStream stream = new ObjectOutputStream(outputStream);
 stream.writeObject(mahasiswa);
 stream.close();
 outputStream.close();
 }catch(IOException exception){
 }
 
 System.out.println();
 
 //Deserialization Object
 System.out.println("Deserialized Object....");
 try{
 FileInputStream inputStream = new FileInputStream("mahasiswa.ser");
 ObjectInputStream stream = new ObjectInputStream(inputStream);
 Mahasiswa mhs = (Mahasiswa) stream.readObject();
 mhs.cetakData();
 stream.close();
 inputStream.close();
 }catch(IOException exception){
 
 }catch(ClassNotFoundException exception){
 
 }
 }
}