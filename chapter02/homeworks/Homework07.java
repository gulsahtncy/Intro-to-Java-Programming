package chapter02.homeworks;

import java.util.Scanner;

public class Homework07 {
	public static void main(String[] args) {
		
		//Find the number of years
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of minutes: ");
		int minute = input.nextInt();
		
		//One year 365 days, One day 1440 minutes
		int years = (minute / 1440) / 365;
		int days = (minute / 1440) - ((minute / 1440) / 365) * 365;
		int minutes = minute % 1440;
		
		System.out.print(minute + " minutes is approximately " + years + " years " +
		days + " days and " + minutes + " minutes ");				
	}
}
