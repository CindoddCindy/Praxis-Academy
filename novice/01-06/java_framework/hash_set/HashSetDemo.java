import java.util.ArrayList;
import java.util.HashSet;
 
public class HashSetDemo {
  public static void main(String[] args) {
    HashSet<Human> set = new HashSet<Human>();
    ArrayList<Human> list = new ArrayList<Human>();
 
    Human a = new Human("A");
    Human b = new Human("B");
    Human c = new Human("A");
 
    set.add(a);
    set.add(b);
    set.add(c);
 
    list.add(a);
    list.add(b);
    list.add(c);
 
    System.out.println("Print Set");
    for(Human h : set) {
      System.out.println(h.name);
    }
 
    System.out.println("Print List");
    for(Human h : list) {
      System.out.println(h.name);
    }
  }
}
 
class Human {
  public String name;
  public Human(String name) {
    this.name = name;
  }
 
  @Override
  public boolean equals(Object obj) {
    if(!(obj instanceof Human)) {
      return super.equals(obj);
    } else {
      Human comp = (Human)obj;
      return comp.hashCode() == obj.hashCode();
    }
  }
 
  @Override
  public int hashCode() {
    int hash = 7;
    hash = 53 * hash + (this.name != null ? this.name.hashCode() : 0);
    return hash;
  }
}