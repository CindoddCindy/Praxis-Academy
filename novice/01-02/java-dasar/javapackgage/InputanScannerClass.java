import java.util.Scanner;

public class InputanScannerClass{

    public static void main(String[] args) {
    //int password=1001;
    Scanner inn=new Scanner(System.in);
    System.out.print(" Insert Password ");

   int password=inn.nextInt();
  if(password==1001){
      System.out.println("Login Successfully");
  }
  else{
      System.out.println("Password Dennied");
  }
 
    }
}