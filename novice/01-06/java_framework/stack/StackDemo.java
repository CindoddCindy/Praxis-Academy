import java.util.Stack;
 
public class StackDemo {
  public static void main(String[] args) {
    Stack<String> stack = new Stack<String>();
    stack.push("A");
    stack.push("B");
    stack.push("C");
    System.out.println("Print stack awal berurutan biasa");
    for(String s : stack) {
      System.out.println(s);
    }
    System.out.println("Keluarkan satu");
    System.out.println(stack.pop());
    System.out.println("Tambahkan dua");
    stack.push("D");
    stack.push("E");
    System.out.println("Print stack sesuai urutan keluar");
    while(!stack.empty()) {
      System.out.println(stack.pop());
    }
    System.out.println("Selesai");
  }
}