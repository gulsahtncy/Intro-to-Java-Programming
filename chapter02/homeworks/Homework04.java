package chapter02.homeworks;

import java.util.Scanner;

public class Homework04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Convert pounds into kilograms
		System.out.println("Enter a number in pounds: ");
		double pounds = input.nextDouble();
		
		//one pound is 0.454 kilograms
		double kilograms = pounds * 0.454;
		
		System.out.println(pounds + " pounds is " + kilograms + " kilograms ");		
	}
}
