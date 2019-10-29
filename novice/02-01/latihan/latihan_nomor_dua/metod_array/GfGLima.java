// Java code to demonstrate getFloat() method of Array class 
import java.lang.reflect.Array; 
public class GfGLima { 
	// main method 
	public static void main(String[] args) 
	{ 

		// Declaring and defining a float array 
		float a[] = { 1.0f, 2.0f, 3.0f }; 

		// Traversing the array 
		for (int i = 0; i < 3; i++) { 

			// Array.getBoolean() method 

			float x = Array.getFloat(a, i); 
			// Printing the values 
			System.out.print(x + " "); 
		} 
	} 
} 
