package chapter05.homeworks;

public class Homework05 {
	public static void main(String[] args) {

		// Conversion from kilograms to pounds and pounds to kilograms
		System.out.println("Kilograms    Pounds     |     Pounds    Kilograms");

		int pounds = 20;
		for (int kilogram = 1; kilogram < 200; kilogram += 2) {
			
			// 1 kilogram is 2.2 pounds
			System.out.printf("%-15d%.1f", kilogram, (kilogram * 2.2));
			System.out.printf("\t|\t");
			System.out.printf("%-9d%.2f\n", pounds, (pounds / 2.2));

			pounds += 5;
		}
	}
}