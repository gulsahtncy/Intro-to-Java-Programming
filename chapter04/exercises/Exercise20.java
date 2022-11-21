package chapter04.exercises;

public class Exercise20 {
	public static void main(String[] args) {
		
		String s1 = " Welcome ";
		String s2 = " welcome ";
				
		boolean isEqual = s1.equals(s2);
		boolean isEqual = s1.equalsIgnoreCase(s2);
		int x = s1.compareTo(s2);
		int x = s1.compareToIgnoreCase(s2);  
		boolean b = s1.startsWith("AAA");  
		boolean b = s1.endsWith("AAA");  
		int x = s1.length();  		
		char x = s1.charAt(0);  		
		String s3 = s1 + s2;  		
		String s3 = s1.substring(1);  		
		String s3 = s1.substring(1, 5);  		
		String s3 = s1.toLowerCase();  		
		String s3 = s1.toUpperCase();  		
		String s3 = s1.trim();  		
		int x = s1.indexOf('e');		
		int x = s1.lastIndexOf("abc");		
	}
}
