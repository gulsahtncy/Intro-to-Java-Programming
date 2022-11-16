package chapter03.exercises;

import java.util.Scanner;

public class Exercise24 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// x = 2, y = 3, z = 6
		
		double x = input.nextDouble();
		double y = input.nextDouble();
		double z = input.nextDouble();
			
		System.out.println("(x < y && y < z) is " + (x < y && y < z));
		System.out.println("(x < y || y < z) is " + (x < y || y < z));
		System.out.println("!(x < y) is " + !(x < y));
		System.out.println("(x + y < z) is " + (x + y < z));
		System.out.println("(x + y > z) is " + (x + y > z));
	}
}
