package chapter04.homeworks;

import java.util.Scanner;

public class Homework18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Student major and status

		System.out.print("Enter two characters: ");
		String status = input.nextLine();
		char major = status.charAt(0);
		char grade = status.charAt(1);

		String str = "";
		switch (major) {
		case 'M':
			str = "Mathematics";
			break;
		case 'C':
			str = "Computer Science";
			break;
		case 'I':
			str = "Information Technology";
			break;
		default:
			System.out.println("Invalid input.");
			System.exit(0);
		}
		String cls = "";
		switch (grade) {
		case '1':
			cls = "Freshman";
			break;
		case '2':
			cls = "Sophomore";
			break;
		case '3':
			cls = "Junior";
			break;
		case '4':
			cls = "Senior";
			break;
		default:
			System.out.println("Invalid input.");
			System.exit(0);
		}
		System.out.println(str + " " + cls);
	}
}
