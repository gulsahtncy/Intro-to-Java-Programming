package chapter05.exercises;

public class Exercise24A {
	public static void main(String[] args) {

		// The keyword break can be used in a loop to exit the loop.

		// The keyword continue is used in a loop to terminate the current iteration and
		// move execution directly to the loop control section.

		// The keyword break is used in the following code:

		int balance = 10;
		while (true) {
			if (balance < 9)
				break;
			balance = balance - 9;
		}
		System.out.println("Balance is " + balance);
	}
}
