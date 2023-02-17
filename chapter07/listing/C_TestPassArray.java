package chapter07.listing;

public class C_TestPassArray {
	public static void main(String[] args) {
		int x = 1; // x represents an int value
		int[] y = new int[10]; // y represents an array of int values
		String a = "gülşah";
		char k = a.charAt(0);
		
		m(x, y, a); // Invoke m with arguments x and y
		System.out.println(k); 
		
		System.out.println("x is " + x);
		System.out.println("y[0] is " + y[0]);
		
		
	}

	public static void m(int number, int[] numbers, String a) {
		number = 1001; // Assign a new value to number
		numbers[0] = 5555; // Assign a new value to numbers[0]
		a = "Hüseyin";
		
	}

}
