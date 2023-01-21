package chapter06.exercises;

public class Exercise12 {
	public static void main(String[] args) {
		/*
		 * There is a mistake when calling the method. The order of the two parameters
		 * have been mixed up.
		 */
		nPrintln(5, "Welcome to Java!");
	}

	/*
	 * Another mistake is in the the body of nPrintln where n is declared even
	 * though n is used as an name for one of the formal parameters.
	 */
	public static void nPrintln(String message, int n) {
		int n = 1;
		for (int i = 0; i < n; i++)
			System.out.println(message);
	}
}
