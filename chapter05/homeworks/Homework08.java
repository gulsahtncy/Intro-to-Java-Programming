package chapter05.homeworks;

import java.util.Scanner;

public class Homework08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Find the highest score
		System.out.print("Enter the number of students: ");
		int numberOfStudents = input.nextInt();

		System.out.print("Enter each student’s name and score (i.e. John 85): ");
		String studentName = input.next();
		int score = input.nextInt();

		int i = 1;
		while (i < numberOfStudents) {
			String studentName1 = input.next();
			int score1 = input.nextInt();
			i++;
			if (score1 > score) {
				score = score1;
				studentName = studentName1;
			}
		}
		System.out.println("The highest score is " + studentName + "'s score, it is " + score);
	}
}
