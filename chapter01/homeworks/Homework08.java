package chapter01.homeworks;

public class Homework08 {
	
	/* Question: Write a program that displays the area and 
	perimeter of a circle that has a radius of 5.5. */
	
	 public static void main(String[] args) {
	        double radius = 5.5;
	        double pi = 3.14;
	        double perimeter = 2.0 * radius * pi;
	        double area = radius * radius * pi;
	        System.out.print("Perimeter = ");
	        System.out.println(perimeter);
	        System.out.print("Area = ");
	        System.out.println(area);
	    }
}
