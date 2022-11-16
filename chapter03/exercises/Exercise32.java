package chapter03.exercises;

import java.util.Scanner;

public class Exercise32 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a day (for example: for Sunday enter 0): ");
		int day =input.nextInt();
		
		switch (day) {
		case 0:	
			System.out.println("Sunday");
			break;
		case 1:	
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:	
			System.out.println("Wednesday");
			break;
		case 4:	
			System.out.println("Thursday");
			break;
		case 5:	
			System.out.println("Thursday");
			break;
		case 6:	
			System.out.println("Thursday");
			break;
		}
	}
}
