import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void main(String[] args) {
		
		Karyawan karyawan = new Karyawan("Nursalim", "L", "Brebes",
				new java.util.Date());
		
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("Desktop/Praxis-Academy/novice/01-06/serialisasi/Karyawan.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(karyawan);
			oos.flush();
			System.out.println("success");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}