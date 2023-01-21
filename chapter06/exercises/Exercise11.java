package chapter06.exercises;

public class Exercise11 {

	/*
	 * The arguments passed to a method must be passed in the same order as in the
	 * method signature and the types of all argument must be compatible to the
	 * formal parameters in the method signature.
	 */

	/*
	 * An argument can have the same name as a formal parameter, this is for example
	 * a valid program:
	 */

	public static void main(String[] args) {
		int i = 5;
		int j = 10;
		printSum(i, j);
	}

	public static void printSum(int i, int j) {
		System.out.println(i + j);
	}
}
