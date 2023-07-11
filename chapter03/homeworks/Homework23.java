package chapter03.homeworks;

import java.util.Scanner;

public class Homework23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Geometry: Point in a rectangle?

		System.out.print("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();

		if (x > 5 || x < -5 || y > 2.5 || y < -2.5) {
			System.out.println("Point " + x + "," + y + " is not in the rectangle");
		} else
			System.out.println("Point " + x + "." + y + " is in the rectangle");
	}
}
