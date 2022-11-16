package chapter03.exercises;

import java.util.Scanner;

public class Exercise10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int score = input.nextInt();

		/*The problem with the code in this checkpoint is that only D or F 
		* will be printed. D will be printed whenever score is 60 or more, 
		* F is printed if score is less than 60.*/
		
		if (score >= 60.0)
			System.out.println("D");
		else if (score >= 70.0)
			System.out.println("C");
		else if (score >= 80.0)
			System.out.println("B");
		else if (score >= 90.0)
			System.out.println("A");
		else
			System.out.println("F");
	}
}
