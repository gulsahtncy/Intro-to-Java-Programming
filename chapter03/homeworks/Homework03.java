package chapter03.homeworks;

import java.util.Scanner;

public class Homework03 {
	public static void main(String[] args) {
		
		//Algebra: solve 2 * 2 linear equations
		Scanner input = new Scanner(System.in);
		
		/*Cramer’s rule
		 *ax + by = e      x = (ed - bf) / (ad - bc) 	  
	     *cx + dy = f      y = (af - ec) / (ad - bc)         	     
	     */
		
		System.out.println("Enter a, b, c, d, e, f: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		double x = (e * d - b * f) / (a * d - b * c);
		double y = (a * f - e * c) / (a * d - b * c);
		
		if ((a * d - b * c) != 0) {
		System.out.println("x is " + x + " and y is " + y);		
		}
		else  {
		System.out.println("The equation has no solution");	
		}	
	}
}
