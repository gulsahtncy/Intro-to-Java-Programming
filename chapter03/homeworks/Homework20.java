package chapter03.homeworks;

import java.util.Scanner;

public class Homework20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
		//Science: wind-chill temperature
		
		System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
		double fahrenheit = input.nextDouble();
		
		System.out.print("Enter the wind speed (>=2) in miles per hour: ");
		double windSpeed = input.nextDouble();
		
		/*Wind-chill temperature = 35.74 + 0.6215 * degrees Fahrenheit - 
		 * 35.75 * speed^0.16 + 0.4275 * degrees Fahrenheit * speed^0.16 
		 */
				
		double windChill = 35.74 + (0.6215 * fahrenheit) - (35.75 * (Math.pow(windSpeed, 0.16))) +
				0.4275 * fahrenheit * (Math.pow(windSpeed, 0.16));
		
		if (fahrenheit > -58 && fahrenheit < 41 && windSpeed >= 2 ) {
			System.out.println("The wind chill index is " + (int)(windChill * 100000) / 100000.0);
		}
		else
			System.out.println("Invalid temperature or wind speed");
	}
}
