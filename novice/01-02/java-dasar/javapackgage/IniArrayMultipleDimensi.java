public class IniArrayMultipleDimensi{

    public static void main(String[] args) {
String [][] arrayMennu={{"sate","mieayam","bakso"},{"ayamgeprek","saladbuah","pecel"},{"semurjengkol","nasiliwet","ikanbakar"},};

for(int baris=0;baris<3;baris++){
    for(int kolom=0;kolom<3;kolom++){
        System.out.println("isi array adalah " + (arrayMennu[baris][kolom]));
        System.out.println("Isi array ke satu adalah" + arrayMennu[kolom][0]);
    }
}

    }
}