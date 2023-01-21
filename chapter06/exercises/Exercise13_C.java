package chapter06.exercises;

public class Exercise13_C {
	public static void main(String[] args) {
		// Initialize times
		int times = 3;
		System.out.println("Before the call," + " variable times is " + times);

		// Invoke nPrintln and display times
		nPrintln("Welcome to Java!", times);
		System.out.println("After the call," + " variable times is " + times);
	}

	// Print the message n times
	public static void nPrintln(String message, int n) {
		while (n > 0) {
			System.out.println("n = " + n);
			System.out.println(message);
			n--;
		}
	}
}
