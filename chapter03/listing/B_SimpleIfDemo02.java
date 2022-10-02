package chapter03.listing;

import java.util.Scanner;

public class B_SimpleIfDemo02 {
	public static void main(String[] args) {
		
		   //Simple If Demo
			
			Scanner input = new Scanner(System.in);

		    System.out.println("Enter an integer: ");
		    int number = input.nextInt();

		    if (number % 5 == 0) {
		      System.out.println("Hi Five");	      
		    }
		   
		    if (number % 2 == 0) {
		      System.out.println("Hi Even");
		    }
		}
	}	

