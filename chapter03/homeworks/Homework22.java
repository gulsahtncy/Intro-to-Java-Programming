package chapter03.homeworks;

import java.util.Scanner;

public class Homework22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Geometry: point in a circle?
		
		System.out.println("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();

		// A point is in the circle if its distance to (0, 0) is less than or equal to 10.
	
		double distance = Math.pow((x * x + y * y), 0.5);

		if (distance <= 10) {
			System.out.println("Point (" + x + ", " + y + ") is in the circle");
		} else
			System.out.println("Point (" + x + " , " + y + ") is not in the circle");
	}
}
