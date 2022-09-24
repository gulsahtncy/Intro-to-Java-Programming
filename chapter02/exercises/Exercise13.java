package chapter02.exercises;

public class Exercise13 {
	public static void main(String[] args) {
		
		// Increment and Decrement Operators
		int i = 3;
		int j = 3;
		i++; // i becomes 4, i = i + 1 or i += 1;
		j--; // j becomes 2, j = j - 1 or j -= 1;
		
		System.out.println(i);
		System.out.println(j);
		
		int var = 10;
		int a = var;
		
		System.out.println(a);
		
		var = 5;
		
		System.out.println(a);
		
		a = ++var;
		
		System.out.println("a: " + a);
		System.out.println("var: " + var);		
		
		a = var++;
		
		System.out.println("a: " + a);
		System.out.println("var: " + var);		
	}
}
