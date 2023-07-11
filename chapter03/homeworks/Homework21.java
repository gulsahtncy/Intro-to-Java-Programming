package chapter03.homeworks;

import java.util.Scanner;

public class Homework21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Science: day of the week
		
		// h = (q + (26 * (m + 1) /10) + k + (k / 4) + (j / 4) + 5 * j ) % 7

		System.out.println("Enter year:");
		int year = input.nextInt();

		System.out.println("Enter month:");
		int month = input.nextInt(); // m

		System.out.println("Enter the day of the month:");
		int theDayOfTheMonth = input.nextInt(); // q

		int j = year / 100; // j is the century
		int k = year % 100; // k is the year of the century

		int h = (theDayOfTheMonth + (26 * (month + 1) / 10) + k + (k / 4) + (j / 4) + 5 * j) % 7;

		String day = "";

		switch (h) {
		case 0:
			// System.out.print("Saturday");
			day = "Saturday";
			break;
		case 1:
			// System.out.print("Sunday");
			day = "Sunday";
			break;
		case 2:
			// System.out.print("Monday");
			day = "Monday";
			break;
		case 3:
			// System.out.print("Tuesday");
			day = "Tuesday";
			break;
		case 4:
			// System.out.print("Wednesday");
			day = "Wednesday";
			break;
		case 5:
			// System.out.print("Thursday");
			day = "Thursday";
			break;
		case 6:
			// System.out.print("Friday");
			day = "Friday";
			break;
		}
		System.out.print("Day of the week is " + day);
	}
}
