package chapter01.listings;

public class E_ShowRuntimeErrors {

	/*
	 * public static void main(String[] args) { System.out.println(1 / 0); }
	 */

	// The runtime error causes the program to terminate abnormally

	// ShowRuntimeErrors.java: Program contains runtime errors

	public static void main(String[] args) {
		System.out.println("Hatadan önce");
		System.out.println(1 / 0);
		System.out.println("sıfıra bölünmez");
	}
}
