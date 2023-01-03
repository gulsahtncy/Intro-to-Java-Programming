package chapter05.listing;

import java.util.Scanner;

public class N_Palindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String s = input.nextLine();

		boolean isPalindrome = true;
		for (int low = 0, high = s.length() - 1; low < high; low++, high--) {
			char ch1 = s.charAt(low);
			char ch2 = s.charAt(high);
			if (ch1 != ch2) {
				isPalindrome = false;
				break;
			}
		}
			if (isPalindrome) {
				System.out.println(s + " is a palindrome");
			} else
				System.out.println(s + " is not a palindrome");	
		
	}
}
