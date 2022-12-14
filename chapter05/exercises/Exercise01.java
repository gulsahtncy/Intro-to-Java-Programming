package chapter05.exercises;

public class Exercise01 {
	public static void main(String[] args) {
		int count = 0;
		while (count < 100) {
		// *Point A 
			// The condition count < 100 is always true at point A.
		System.out.println("Welcome to Java!");
		count++;
		// *Point B 
			// The condition count < 100 can be both true and false at point B.
		}
		// *Point C
			// The condition count < 100 is always false at point C.		
	}
}
