package chapter02.homeworks;

import java.util.Scanner;

public class Homework02 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Compute the volume of a cylinder
		
		System.out.print("Enter the radius and length of a cylinder: ");
		double radius = input.nextDouble();
		double length = input.nextDouble();
		
		double area = radius * radius * 3.1415926;
		double volume = area * length;
		System.out.println("The area is " + (int)(area * 10000) / 10000.0);
		System.out.println("The volume is " + (int)(volume * 10) / 10.0);		
	}
}
