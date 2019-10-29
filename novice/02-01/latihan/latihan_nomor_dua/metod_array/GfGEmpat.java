import java.lang.reflect.Array; 

public class GfGEmpat { 
	// main method 
	public static void main(String[] args) 
	{ 
		// int (Not an array) 
		int y = 0; 

		try { 
			// illegalArgument 
			int x = (int)Array.get(y, 6); 

			System.out.println(x); 
		} 
		catch (Exception e) { 
			// Throws exception 
			System.out.println("Exception : " + e); 
		} 
	} 
} 
