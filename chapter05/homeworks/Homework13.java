package chapter05.homeworks;

public class Homework13 {
	public static void main(String[] args) {
		
		// Find the largest n such that n3 < 12.000
		int number = 0;
		
		while(number < 12000) {
			number++;
			if (Math.pow(number, 3) > 12000) {
				break;
			}				
		}
		System.out.println(number - 1);
	}
}
