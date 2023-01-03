package chapter05.homeworks;

public class Homework04 {
	public static void main(String[] args) {

		// Conversion from miles to kilometers
		System.out.println("Miles\tKilometers");

		for (int miles = 1; miles < 11; miles++) {
			// 1 mile is 1.609 kilometers
			System.out.printf("%-10d%2.3f\n",  miles, (miles * 1.609));
		}
	}
}
