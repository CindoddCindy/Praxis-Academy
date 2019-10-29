// Java code to demonstrate getFloat() method of Array class 
import java.lang.reflect.Array; 
public class GfGTujuh { 
	// main method 
	public static void main(String[] args) 
	{ 

		// Declaring and defining a float array 
		float a[] = { 1.0f, 2.0f, 3.0f }; 

		try { 
			float x = Array.getFloat(a, 4); 
		} 
		catch (Exception e) { 
			System.out.println("Exception : " + e); 
		} 
	} 
} 
