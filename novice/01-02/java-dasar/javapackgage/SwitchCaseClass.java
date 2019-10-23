import java.util.Scanner;

public class SwitchCaseClass{
    public static void main(String[] args) {
        
        int password =1001;
        int pass;

        switch(1001){
            case 1:
            pass=101;
            System.out.println("password anda salah " + pass);
            break;
            case 2:
            pass=10001;
            System.out.println("password anda salah " + pass);
             break;
             case 3:
             pass=10201;
            System.out.println("password anda salah " + pass);
             break;
             case 4 :
             pass=1001;
            System.out.println("password anda benar" + pass);
             break;
             case 5:
             pass=101001;
            System.out.println("password anda salah " + pass);
             break;
             default:
             pass=1011001;
            System.out.println("password anda salah " + pass);
        }
//kembali ke default karena saya belum buat inputan
    }

}