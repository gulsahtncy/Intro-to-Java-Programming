package chapter04.homeworks;

import java.util.Scanner;

public class Homework05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Geometry: area of a regular polygon
		
		System.out.println("Enter the number of sides: ");
		System.out.println("Enter the side: ");
		
		double n = input.nextDouble();
		double s = input.nextDouble();
		
		double area = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));
		
		System.out.printf("The area of the polygon is %2.2f" , area);		
	}
}
