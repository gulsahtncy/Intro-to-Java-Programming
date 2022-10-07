package chapter03.homeworks;

import java.util.Scanner;

public class Homework19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Compute the perimeter of a triangle
		
		System.out.println("Enter the three edges for a triangle: ");
		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();
		
		if (x + y > z || x + z > y || y + z > x) {
			System.out.println("The perimeter of a triangle is " + (x + y + z));			
		}
		else
			System.out.println("The input is invalid.");				
	}

}
