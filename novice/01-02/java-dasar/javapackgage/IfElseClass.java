public class IfElseClass{
     public static void main(String[] args) {

         // if else dengan variable global

         String nama ="belum_dinamai";
         
         if(nama=="sudah_dinamai"){
             System.out.println(" ini tidak akan di eksekusi karena salah");
         }else{
            System.out.println(" nama nya adalah sudah dinamai");
         }

         //if bercabang
         if(nama=="belum_dinamai"){
             System.out.println("namanya adalah : " + nama);
             if(nama!="belum_dinamai"){
                 System.out.println("ini tidak akan di eksekusi karena if yang pertama sudah betul");
             }
         }
     }
}