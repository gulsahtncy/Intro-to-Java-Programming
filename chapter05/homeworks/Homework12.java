package chapter05.homeworks;

public class Homework12 {
	public static void main(String[] args) {

		// Find the smallest n such that n2 > 12.000
		int number = 0;

		while (number < 1200) {
			number++;
			if (Math.pow(number, 2) > 12000)
				break;
		}
		System.out.println(number);
	}

}
