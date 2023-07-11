package chapter03.homeworks;

import java.util.Scanner;

public class Homework05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Find future dates
		
		System.out.print("Enter today's day(for example for sunday enter 0 - saturday enter 63): "); 
		int today = input.nextInt();
		
		System.out.print("Enter the number of days elapsed since today: ");
		int nextDay = input.nextInt();

		int nextDayNumber = (today + nextDay) % 7;
		
		switch (today) {
		case 0: System.out.print("Today is Sunday and"); break;
		case 1: System.out.print("Today is Monday and"); break;
		case 2: System.out.print("Today is Thuesday and"); break;
		case 3: System.out.print("Today is Wednesday and"); break;
		case 4: System.out.print("Today is Thursday and"); break;
		case 5: System.out.print("Today is Friday and"); break;
		case 6: System.out.print("Today is Saturday and"); break;
		}		
		
		switch (nextDayNumber) {
		case 0: System.out.println(" the future day is Sunday."); break;
		case 1: System.out.println(" the future day is Monday."); break;
		case 2: System.out.println(" the future day is Thuesday."); break;
		case 3: System.out.println(" the future day is Wednesday."); break;
		case 4: System.out.println(" the future day is Thursday."); break;
		case 5: System.out.println(" the future day is Friday."); break;
		case 6: System.out.println(" the future day is Saturday."); break;
		}				
	} 
}
		
