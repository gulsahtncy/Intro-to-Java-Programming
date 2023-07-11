package chapter03.homeworks;

import java.util.Scanner;

public class Homework16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Random point
		int x = (int) ((Math.random() * (50 + 50)) - 50);
		int y = (int) ((Math.random() * (100 + 100)) - 100);

		System.out.println("Random coordinate points in a rectangle is " + x + "," + y);

	}
}
