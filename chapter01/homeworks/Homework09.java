package chapter01.homeworks;

public class Homework09 {
	
	/* Question: Write a program that displays 
	 * the area and perimeter of a rectangle 
	 * with the width of 4.5 and height of 7.9. */
	 
	
	public static void main(String[] args) {
        double width = 4.5;
        double height = 7.9;
        double area = width * height;
        double perimeter = 2 * width + 2 * height;
        System.out.print("Area = ");
        System.out.println(area);
        System.out.print("Perimeter = ");
        System.out.println(perimeter);
    }
}
