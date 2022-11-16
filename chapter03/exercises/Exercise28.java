package chapter03.exercises;

import java.util.Scanner;

public class Exercise28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int weight = input.nextInt();
		int height = input.nextInt();
		System.out.println((weight > 50 && !(height > 60)) || (!(weight > 50) && height > 60));
	}
}
