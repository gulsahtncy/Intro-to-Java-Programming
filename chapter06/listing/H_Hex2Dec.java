package chapter06.listing;

import java.util.Scanner;

public class H_Hex2Dec {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a hex number: ");
		String hex = input.nextLine();

		int dec = hexToDecimal(hex.toUpperCase());
		System.out.println("The decimal value for hex number " + hex + " is " + dec);

	}

	public static int hexToDecimal(String hex) {
		int dec = 0;

		int digitValue = 1;
		for (int i = hex.length() - 1; 0 <= i; i--) {
			char hexChar = hex.charAt(i);
			int decValue = hexCharToDecimal(hexChar);
			dec += decValue * digitValue;
			digitValue *= 16;
		}
		return dec;
	}

	public static int hexCharToDecimal(char ch) {
		if ('A' <= ch && ch <= 'F')
			return ch - 'A' + 10;
		else
			return ch - '0';
	}
}
