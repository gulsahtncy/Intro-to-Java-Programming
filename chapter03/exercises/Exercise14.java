package chapter03.exercises;

public class Exercise14 {
	public static void main(String[] args) {

		int number1 = 14;
		int number2 = 15;
		int number3 = 30;

		// A
		if (number1 % 2 == 0)
			System.out.println(number1 + " is even");
		if (number1 % 5 == 0)
			System.out.println(number1 + " is multiple of 5");

		if (number2 % 2 == 0)
			System.out.println(number2 + " is even");
		if (number2 % 5 == 0)
			System.out.println(number2 + " is multiple of 5");

		if (number3 % 2 == 0)
			System.out.println(number3 + " is even");
		if (number3 % 5 == 0)
			System.out.println(number3 + " is multiple of 5");

		// B
		if (number1 % 2 == 0)
			System.out.println(number1 + " is even");
		else if (number1 % 5 == 0)
			System.out.println(number1 + " is multiple of 5");
		
		if (number2 % 2 == 0)
			System.out.println(number2 + " is even");
		else if (number2 % 5 == 0)
			System.out.println(number2 + " is multiple of 5");
		
		if (number3 % 2 == 0)
			System.out.println(number3 + " is even");
		else if (number3 % 5 == 0)
			System.out.println(number3 + " is multiple of 5");
	}
}
