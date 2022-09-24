package chapter02.homeworks;

import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Convert Celsius to Fahrenheit
		
		System.out.print("Enter a degree in Celsius: " );
		int santigrat = input.nextInt();
		
		double fahrenheit = (9.0 / 5) * santigrat + 32;
		System.out.println(santigrat + " Celsius is " + fahrenheit + " Fahrenheit ");	
	}
}
