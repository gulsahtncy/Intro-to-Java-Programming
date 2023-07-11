package chapter03.homeworks;

import java.util.Scanner;

public class Homework27 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Geometry: points in triangle

		System.out.println("Enter a point's x- and y-coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();

		if ((x == 0 && y <= 100) || (y == 0 && x <= 200) || (x <= 200 && y <= 100 && y / x < 0.5))
			System.out.print("The point is in the triangle");
		else
			System.out.print("The point is not in the triangle.");	
	}
}
