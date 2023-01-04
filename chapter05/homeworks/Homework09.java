package chapter05.homeworks;

import java.util.Scanner;

public class Homework09 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of student: ");
		int total = input.nextInt();
		System.out.print("Enter each student's name and score (i,e, John 85):");
		String name = input.next();
		int score = input.nextInt();
		int i = 1;
		while (i < total) {
			String n1 = input.next();
			int s1 = input.nextInt();
			i++;
			if (s1 > score) {
				score = s1;
				name = n1;
			}
		}
		System.out.print("The highest score is " + name + "'s score, it is " + score);
	}
}
