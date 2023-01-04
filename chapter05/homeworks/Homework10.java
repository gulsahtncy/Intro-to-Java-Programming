package chapter05.homeworks;

import java.util.Scanner;

public class Homework10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of student: ");
		int total = input.nextInt();
		System.out.print("Enter each student's name and score (i,e, John 85):");
		String name = input.next();
		int score = input.nextInt();
		int i = 1;
		String n2 = "";
		int s2 = 0;
		while (i < total) {
			String n1 = input.next();
			int s1 = input.nextInt();
			i++;
			if (s1 > score) {
				s2 = score;
				n2 = name;
				score = s1;
				name = n1;
			} else if (s1 < score && s1 > s2) {
				s2 = s1;
				n2 = n1;
			}
		}
		System.out.println("The highest score is " + name + "'s score, it is " + score);
		System.out.println("The second highest score is " + n2 + "'s score, it is " + s2);
	}

}
