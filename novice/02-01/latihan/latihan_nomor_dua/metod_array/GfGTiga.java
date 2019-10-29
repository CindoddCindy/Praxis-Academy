// Java code to demonstrate set() method of Array class 
import java.lang.reflect.Array; 
public class GfGTiga { 
	// main method 
	public static void main(String[] args) 
	{ 

		// Declaring and defining a String array 
		String s[] = { "Geeks", "for", "Geeks" }; 

		try { 
			// set method of class Array 
			Array.set(s, 4, "for"); 
		} 
		catch (Exception e) { 
			System.out.println("Exception : " + e); 
		} 
	} 
} 
