package chapter01.listings;

public class F_ShowLogicErrors {

	/*
	 * System.out.println("Celsius 35 is Fahrenheit degree "); 
	 * System.out.println((9 / 5) * 35 + 32);
	 */

	// ShowLogicErrors.java: Program contains logic errors
	
	public static void main(String[] args) {

		System.out.println("Celsius 35 is Fahrenheit degree ");
		System.out.println((9.0 / 5) * 35 + 32);
	}
}
