package chapter03.exercises;

import java.util.Scanner;

public class Exercise25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int age = input.nextInt();				
		System.out.println(age > 13 && age < 18);
	}
}
