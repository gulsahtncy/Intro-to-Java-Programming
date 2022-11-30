package chapter04.homeworks;

import java.util.Scanner;

public class Homework08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		
		// Find the character of an ASCII code

		System.out.print("Enter an ASCII code: ");
		int asci = input.nextInt();
		
		char ch = (char)asci;
		
		System.out.println("The character for ASCII code " + asci + " is " + ch);
	}
}
