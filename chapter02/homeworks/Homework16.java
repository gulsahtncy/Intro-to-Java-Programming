package chapter02.homeworks;

import java.util.Scanner;

public class Homework16 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Geometry: area of a hexagon
		
		System.out.print("Enter the side: ");
		double lengthOfASide = input.nextDouble();
		
		double area = (3 * Math.pow(3, 0.5) * Math.pow(lengthOfASide, 2)) / 2;		
		
		System.out.println("The area of the hexagon is " + (int)(area * 10000) / 10000.0);				
	}
}
