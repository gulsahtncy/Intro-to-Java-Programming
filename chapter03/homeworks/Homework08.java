package chapter03.homeworks;

import java.util.Scanner;

public class Homework08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Sort three integers
		
		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();
		
		if (x > y) {
		 int temp1 = x;
		 x = y;
		 y = temp1;
		} 
		
		if (y > z) {
		 int temp2 = y;
		 y = z;
		 z = temp2;	
		}
		
		if (x > y) {
		 int temp3 = x;
		 x = y;
	     y = temp3;
		}
	
		System.out.println(x + " " + y + " " + z);	
	}		
}			


