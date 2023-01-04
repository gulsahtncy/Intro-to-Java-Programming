package chapter05.homeworks;

import java.util.Scanner;

public class Homework09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of students: ");
		int numberOfStudents = input.nextInt();

		System.out.print("Enter each student’s name and score (i.e. John 85): ");
		String studentName = input.next();
		int score = input.nextInt();

		String studentName2 = "";
		int score2 = 0;

		int i = 1;
		while (i < numberOfStudents) {

			String studentName1 = input.next();
			int score1 = input.nextInt();
			i++;

			if (score1 > score) {
				score2 = score;
				studentName2 = studentName;
				score = score1;
				studentName = studentName1;
			} else if (score > score1 && score1 > score2) {
				score2 = score1;
				studentName2 = studentName1;
			}
		}
		System.out.println("The highest score is " + studentName + "'s score, it is " + score);
		System.out.println("The second-highest score is " + studentName2 + "'s score, it is " + score2);
	}
}
