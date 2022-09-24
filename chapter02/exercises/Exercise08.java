package chapter02.exercises;

import java.util.Scanner;

public class Exercise08 {
	
	public static void main(String[] args) {
		
		//Display time
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter an integer for seconds: ");
	        int seconds = input.nextInt();
	        int minutes = seconds / 60;
	        int remainingSeconds = seconds % 60;
	        System.out.println(seconds + " seconds is " + minutes + " minutes and " + 
	        remainingSeconds + " seconds");	   
	    }
}
