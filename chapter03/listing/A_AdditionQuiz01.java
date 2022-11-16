package chapter03.listing;

import java.util.Scanner;

public class A_AdditionQuiz01 {
	public static void main(String[] args) {
		
		//Addition Quiz
		
		/* for (int i = 0; i < 10; i++) {
		  		System.out.println(Math.random());
		 } */
		  
		//0 <= Math.random() < 1	
		//int number1 = (int)(Math.random() * 10);
		//int number2 = (int)(Math.random() * 10);

		int number1 = (int)(System.currentTimeMillis() % 10);
		int number2 = (int)(System.currentTimeMillis() / 7 % 10);
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is " + number1 + " + " + number2 + "? ");
		
		int answer = input.nextInt();
		
		System.out.println(number1 + " + " + number2 + " = " + answer + " is " +
				(number1 + number2 == answer));	
	}
}


