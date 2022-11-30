package chapter04.homeworks;

import java.util.Scanner;

public class Homework09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Find the Unicode of a character
		
		System.out.print("Enter a character: ");
		String str = input.nextLine();
		
		char ch = str.charAt(0);
		
		System.out.println("The Unicode for the character " + str + " is " + (int)ch);
	}

}
