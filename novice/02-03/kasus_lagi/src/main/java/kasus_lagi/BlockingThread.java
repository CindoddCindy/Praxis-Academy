package kasus_lagi;

import java.util.List;
import java.util.LinkedList;

public class SimpleBlockingQueue<T> {
    private List<T> queue = new LinkedList<T>();
 
    public int getSize() {
        synchronized(queue) {
            return queue.size();
        }
    }
     
    public void put(T obj) {
        synchronized(queue) {
            queue.add(obj);
            queue.notify();
        }
    }
     
    public T get() throws InterruptedException  {
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
private static class BlockingThread extends Thread {
    private SimpleBlockingQueue queue;
    private boolean wasInterrupted = false;
    private boolean reachedAfterGet = false;
    private boolean throwableThrown;
 
    public BlockingThread(SimpleBlockingQueue queue) {
        this.queue = queue;
    }
     
    public void run() {
        try {
            try {
                queue.get();
            } catch (InterruptedException e) {
                wasInterrupted = true;
            }
            reachedAfterGet = true;
        } catch (Throwable t) {
            throwableThrown = true;
        }
    }
 
    public boolean isWasInterrupted() {
        return wasInterrupted;
    }
 
    public boolean isReachedAfterGet() {
        return reachedAfterGet;
    }
     
    public boolean isThrowableThrown() {
        return throwableThrown;
    }
}