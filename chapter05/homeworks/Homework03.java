package chapter05.homeworks;

public class Homework03 {
	public static void main(String[] args) {
		
		// Conversion from kilograms to pounds
		System.out.println("Kilograms\tPounds");
				
		for (int kilogram = 1; kilogram < 200; kilogram += 2) {
			// 1 kilogram is 2.2 pounds
			System.out.printf("%-14d%7.1f\n", kilogram , (kilogram  * 2.2));			
		}		
	}
}
