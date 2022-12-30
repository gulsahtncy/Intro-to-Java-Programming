package chapter05.exercises;

public class Exercise24B {
	public static void main(String[] args) {

		// The keyword continue is used in the following code:

		int balance = 10;
		while (true) {
			if (balance < 9)
				continue;
			balance = balance - 9;
		}
		System.out.println("Balance is " + balance);
	}	
	// The loop in this second example will never end because continue is mistakenly
	// used instead of break.
}
