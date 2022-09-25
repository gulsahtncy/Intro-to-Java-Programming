package chapter02.homeworks;

import java.util.Scanner;

public class Homework11 {
	public static void main(String[] args) {
				
		Scanner input = new Scanner(System.in);
		
		//Population projection
				
		/*One birth every 7 seconds, 
		 * One death every 13 seconds, 
		 * One new immigrant every 45 seconds
		 */
		
		//Current population is 312.032.486
		//365 days 31.536.000 seconds
		
		System.out.print("Enter the number of years: ");
		int year = input.nextInt();
		
		double population = 312032486;
		double newPopulation = population + (31536000 / 7 - 31536000 / 13 + 31536000 / 45) * year;
		
		System.out.println("The population in " + year + " years is " + (int)newPopulation);						
	}
}
