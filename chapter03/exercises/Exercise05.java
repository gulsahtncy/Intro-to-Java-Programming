package chapter03.exercises;

import java.util.Scanner;

public class Exercise05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Score : ");
		int score = input.nextInt();
		
		if (score > 90) {
			System.out.println("Increases pay by 3%.");
		}
	}

}
