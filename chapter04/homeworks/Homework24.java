package chapter04.homeworks;

import java.util.Scanner;

public class Homework24 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Order three cities

		System.out.println("Enter the first city: ");
		System.out.println("Enter the second city: ");
		System.out.println("Enter the third city: ");
		String city1 = input.nextLine();
		String city2 = input.nextLine();
		String city3 = input.nextLine();

		String temp = "";
		if (city1.compareTo(city2) > 0) {
			temp = city2;
			city2 = city1;
			city1 = temp;

		}
		if (city2.compareTo(city3) > 0) {
			temp = city3;
			city3 = city2;
			city2 = temp;

		}
		if (city1.compareTo(city2) > 0) {
			temp = city2;
			city2 = city1;
			city1 = temp;

		}
		System.out.println("The three cities in alphabetical order are " + city1 + " " + city2 + " " + city3);
	}
}
