package chapter03.exercises;

import java.util.Scanner;

public class Exercise22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		
		// the same two expressions 
		System.out.println(x % 2 == 0 && x % 3 == 0);
		System.out.println(x % 6 == 0);			
	}
}
