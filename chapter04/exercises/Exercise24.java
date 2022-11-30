package chapter04.exercises;

public class Exercise24 {
	public static void main(String[] args) {
		System.out.print("(a)"); 
		System.out.printf("amount is %f %e\n", 32.32, 32.32);
	    System.out.println();
	    
	    System.out.print("(b)");
		System.out.printf("amount is %5.2f%% %5.4e\n", 32.327, 32.32);
		System.out.println();
		    
		System.out.print("(c)");
		System.out.printf("%6b\n", (1 > 2));
		System.out.println();
		    
		System.out.print("(d)");
		System.out.printf("%6s\n", "Java");
		System.out.println();
		    
		System.out.print("(e)");
		System.out.printf("%-6b%s\n", (1 > 2), "Java");
		System.out.println();
		    
		System.out.print("(f)");
		System.out.printf("%6b%-8s\n", (1 > 2), "Java");
		System.out.println();		    
	}
}
