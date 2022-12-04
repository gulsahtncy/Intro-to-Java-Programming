package chapter04.homeworks;

public class Homework25 {
	public static void main(String[] args) {
		
		// Generate vehicle plate numbers
		
		char ch1 = (char)((int)(Math.random() * 26 + 65));
		char ch2 = (char)((int)(Math.random() * 26 + 65));
		char ch3 = (char)((int)(Math.random() * 26 + 65));
		int num = (int)(Math.random() * 9001 + 1000);
		
		System.out.println("The plate is " + ch1 + ch2 + ch3 + num);
	}
}
