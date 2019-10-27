public class KelasLuar{

    public void akses(){
        //KelasDalam kelasDalam = new KelasDalam(nama, alamat);
        
        KelasDalam kelasDalam = new KelasDalam();
        kelasDalam.setTesInner();
        
    
        /*
        kelasDalam.alamat="jalanjalan";
        kelasDalam.nama="namaanam";
        kelasDalam.getalamat();
        kelasDalam.getNama();
        kelasDalam.setNama(nama, alamat);
        */
        

    }

    public class KelasDalam{
        String nama;
        String alamat;
        public KelasDalam(){

        }
        public KelasDalam (String nama, String alamat){
            this.nama=nama;
            this.alamat=alamat;
        }
        public void setNama(String nama,String alamat){
            System.out.println(nama);
            System.out.println(alamat);

        }
        public String getNama(){
            return nama;

        }

        public String getalamat(){
            return alamat;
        }

        public void setTesInner(){
            System.out.println("Set Inner Class");
        }
    }

}