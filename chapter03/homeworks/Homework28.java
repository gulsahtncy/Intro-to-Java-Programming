package chapter03.homeworks;

import java.util.Scanner;

public class Homework28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Geometry: two rectangles

		System.out.println("Enter r1's center x-, y-coordinates, width, and height: ");
		System.out.println("Enter r2's center x-, y-coordinates, width, and height: ");

		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double w1 = input.nextDouble();
		double h1 = input.nextDouble();

		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double w2 = input.nextDouble();
		double h2 = input.nextDouble();

		double maxx1 = x1 + w1 / 2;
		double minx1 = x1 - w1 / 2;
		double maxy1 = y1 + h1 / 2;
		double miny1 = y1 - h1 / 2;

		double maxx2 = x2 + w2 / 2;
		double minx2 = x2 - w2 / 2;
		double maxy2 = y2 + h2 / 2;
		double miny2 = y2 - h2 / 2;

		if (maxx1 <= maxx2 && minx1 >= minx2 && maxy1 <= maxy2 && miny1 >= miny2) {
			System.out.println("r1 is inside r2");
		} else if (maxx2 <= maxx1 && minx2 >= minx1 && maxy2 <= maxy1 && miny2 >= miny1) {
			System.out.println("r2 is inside r1");
		} else if (maxx1 < minx2 || minx1 > maxx2 || maxy1 < miny2 || miny2 > maxy1) {
			System.out.println("r2 does not overlaps r1");
		} else
			System.out.println("r2 overlaps r1");
	}

}
