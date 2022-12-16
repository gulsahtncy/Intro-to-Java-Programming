package chapter05.exercises;

public class Exercise05 {
	public static void main(String[] args) {

		int x = 80000000;
		while (x > 0)
			x++;
		System.out.println("x is " + x);

		/*
		 * The reason: When a variable is assigned a value that is too large (in size)
		 * to be stored, it causes overflow. 2147483647 + 1 is actually -2147483648
		 */
	}
}
