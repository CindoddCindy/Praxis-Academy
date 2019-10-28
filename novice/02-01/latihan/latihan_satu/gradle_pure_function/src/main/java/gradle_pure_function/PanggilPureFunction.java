
package gradle_pure_function;


public class PanggilPureFunction{
    public static void main (String[]args){

    
ObjectWithPureFunction objectWithPureFunction= new ObjectWithPureFunction();
objectWithPureFunction.add(50);
objectWithPureFunction.sum(5, 11);
System.out.print("hasil penjumlahan method add adalah : " + objectWithPureFunction.add(50));
System.out.print("hasil penjumlahan method sum adalah : "+ objectWithPureFunction.sum(20, 10));

    }
}