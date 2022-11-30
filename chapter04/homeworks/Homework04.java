package chapter04.homeworks;

import java.util.Scanner;

public class Homework04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Geometry: area of a hexagon)
		
		System.out.print("Enter the side: ");
		double s = input.nextDouble();
		
		double area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6));
		System.out.printf("The area of the hexagon is %2.2f" , area);
		
	}
}
