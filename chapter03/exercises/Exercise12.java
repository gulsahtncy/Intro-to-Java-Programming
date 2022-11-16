package chapter03.exercises;

import java.util.Scanner;

public class Exercise12 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);		
		int count = input.nextInt();
		
		/* if (count % 10 == 0)
		*	newLine = true;
		* else
		*	newLine = false; */
		
		boolean newLine = count % 10 == 0;
		System.out.println(newLine);		
	}
}
