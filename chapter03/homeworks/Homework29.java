package chapter03.homeworks;

import java.util.Scanner;

public class Homework29 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter circles1's center x,y coordinates and radius: ");
		
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double r1 = input.nextDouble();
		
		System.out.println("Enter circles2's center x,y coordinates nad radius: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double r2 = input.nextDouble();

		// Distance between the two centers;
		double distance = Math.pow((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1), 0.5);

		if (r1 < r2) {
			double temp = r1;
			r2 = r1;
			temp = r2;
		}
		if (distance <= r1 - r2)
			System.out.println("Circle2 is inside circle1");
		else if (distance <= r1 + r2)
			System.out.println("Circle2 overlaps circle1");
		else
			System.out.println("Circle2 does not overlap circle1");
	}
}
