package chapter03.exercises;

import java.util.Scanner;

public class Exercise19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		
		System.out.println((number > 1) && (number < 100));
		System.out.println((number > 1) && (number < 100) || (number < 0));
	}
}
