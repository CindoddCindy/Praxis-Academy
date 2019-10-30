package kasus;



import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.List;


 public class TestSimpleBlockingQueue<T> {
    private List<T> queue = new LinkedList<T>();
 
  @Test  public int getSize() {
        synchronized(queue) {
            return queue.size();
        }
    }
     
   @Test public void put(T obj) {
        synchronized(queue) {
            queue.add(obj);
            queue.notify();
        }
    }
     
    @Test public T get() throws InterruptedException  {
        while(true) {
            synchronized(queue) {
                if(queue.isEmpty()) {
                    queue.wait();
                } else {
                    return queue.remove(0);
                }
            }
        }
    }
}