package chapter03.homeworks;

import java.util.Scanner;

public class Homework11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Find the number of days in a month
		int month = input.nextInt();
		int year = input.nextInt();
		
		switch (month) {
		case 1: System.out.println("January " + year + "," + " 31 days"); break;
		case 2: 
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
				System.out.println("February " + year + "," + " 28 days"); 
			else
				System.out.println("February " + year + "," + " 29 days"); break;
		case 3: System.out.println("March " + year + "," + " 31 days"); break;
		case 4: System.out.println("April " + year + "," + " 30 days"); break;
		case 5: System.out.println("May " + year + "," + " 31 days"); break;
		case 6: System.out.println("June " + year + "," + " 30 days"); break;
		case 7: System.out.println("July " + year + "," + " 31 days"); break;
		case 8: System.out.println("Augst " + year + "," + " 31 days"); break;
		case 9: System.out.println("September " + year + "," + " 30 days"); break;
		case 10: System.out.println("October " + year + "," + " 31 days"); break;
		case 11: System.out.println("November " + year + "," + " 30 days"); break;
		case 12: System.out.println("December " + year + "," + " 31 days"); break;
		}			
	}
}
