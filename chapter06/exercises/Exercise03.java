package chapter06.exercises;

public class Exercise03 {
	public static void main(String[] args) {
		int i = 5;
		int j = 2;
		int k = max(i, j);
		System.out.println("The maximum of " + i + " and " + j + " is " + k);
	}

	/** Return the max of two numbers */
	public static int max(int num1, int num2) {
		return ( num1 > num2 ) ? num1 : num2;
	}

}
