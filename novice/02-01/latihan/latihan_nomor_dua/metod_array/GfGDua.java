// Java code to demonstrate set() method of Array class 
import java.lang.reflect.Array; 
public class GfGDua { 
	// main method 
	public static void main(String[] args) 
	{ 

		// Declaring and defining a String array 
		String s[] = null; 

		try { 
			// set method of class Array 
			Array.set(s, 1, "for"); 
		} 
		catch (Exception e) { 
			System.out.println("Exception : " + e); 
		} 
	} 
} 
