package chapter04.homeworks;

import java.util.Scanner;

public class Homework17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Days of a month

		System.out.println("Enter a year: ");
		System.out.println("Enter a month: ");
		int year = input.nextInt();
		String month = input.next();

		int days = 0;
		switch (month) {
		case "Feb":
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				days = 29;
				break;
			}
			days = 28;
			break;
		case "Apr":
		case "Jun":
		case "Sep":
		case "Nov":
			days = 30;
			break;
		case "Jan":
		case "Mar":
		case "May":
		case "Jul":
		case "Aug":
		case "Oct":
		case "Dec":
			days = 31;
			break;
		default:
			System.out.println("Invalid input.");
		}
		System.out.println(month + " " + year + " has " + days + " days");
	}
}
