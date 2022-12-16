package chapter05.exercises;

public class Exercise02 {
	public static void main(String[] args) {

		// What is wrong if guess is initialized to 0 in line 11 in Listing 5.3?

		/*
		 * The problem with initializing guess to zero is that the number that shall be
		 * guessed will sometimes be zero. This will cause the while to not even run one
		 * iteration and the player will never get to guess the number.
		 */
	}
}
