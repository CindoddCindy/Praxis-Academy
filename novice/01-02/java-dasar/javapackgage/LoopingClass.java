public class LoopingClass{
     public static void main(String[] args) {
         String nilai_string="SayaLapar";
//for tunggal
         for(int i=1;i<=5;i++){
             System.out.println(nilai_string);
         }
         //for nested
         int i;
         int j;
         
    for( i=1;i<5;i++){
        for( j=5;j>1;j--)
             System.out.println("nilai dari i : " +i);
             System.out.println("\n" );
             System.out.println("nilai dari j : " + j);
             System.out.println("\n" );
         }

     }
}