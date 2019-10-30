package satu;
import java.util.concurrent.ExecutorService; 
import java.util.concurrent.Executors; 
  
/** 
* @author evivehealth on 08/02/19. 
*/
// Java program depicting  
// concurrent programming in action. 
  
// Runnable Class that defines the logic 
// of run method of runnable interface 
public class Counter implements Runnable  
{ 
    private final MainApp mainApp; 
    private final int loopLimit; 
    private final String task; 
  
    // Constructor to get a reference to the main class 
    public Counter 
          (MainApp mainApp, int loopLimit, String task) 
    { 
        this.mainApp = mainApp; 
        this.loopLimit = loopLimit; 
        this.task = task; 
    } 
  
    // Prints the thread name, task number and  
    // the value of counter 
    // Calls pause method to allow multithreading to occur 
    @Override
    public void run() 
    { 
        for (int i = 0; i < loopLimit; i++)  
        { 
            System.out.println("Thread: " + 
            Thread.currentThread().getName() + " Counter: "
                             + (i + 1) + " Task: " + task); 
            mainApp.pause(Math.random()); 
        } 
    } 
} 