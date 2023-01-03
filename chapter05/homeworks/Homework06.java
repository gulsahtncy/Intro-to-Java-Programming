package chapter05.homeworks;

public class Homework06 {
	public static void main(String[] args) {

		// Conversion from miles to kilometers
		System.out.println("Miles    Kilometers     |     Kilometers    Miles");

		int kilometers = 20;
		for (int miles = 1; miles < 11; miles++) {
			// 1 mile is 1.609 kilometers
			System.out.printf("%-11d%.3f", miles, (miles * 1.609));
			System.out.printf("\t|\t");
			System.out.printf("%-11d%.3f\n", kilometers, (kilometers / 1.609));
			kilometers += 5;

		}
	}
}
