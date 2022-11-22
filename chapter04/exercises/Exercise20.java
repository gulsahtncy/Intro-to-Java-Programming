package chapter04.exercises;

public class Exercise20 {
	public static void main(String[] args) {
		
		String s1 = " Welcome ";
		String s2 = " welcome ";
				
		boolean isEqual = s1.equals(s2); // a
		
		boolean isEqual = s1.equalsIgnoreCase(s2); // b
		
		int x = s1.compareTo(s2); // c
		
		int x = s1.compareToIgnoreCase(s2); // d
		
		boolean b = s1.startsWith("AAA"); // e
		
		boolean b = s1.endsWith("AAA"); // f  
		
		int x = s1.length(); // g  		
		
		char x = s1.charAt(0); // h  		
		
		String s3 = s1 + s2; // i  		
		
		String s3 = s1.substring(1); // j  		
		
		String s3 = s1.substring(1, 5); // k  		
		
		String s3 = s1.toLowerCase(); // l  		
		
		String s3 = s1.toUpperCase(); // m  		
		
		String s3 = s1.trim(); // n  		
		
		int x = s1.indexOf('e'); // o		
		
		int x = s1.lastIndexOf("abc"); // p		
	}
}
