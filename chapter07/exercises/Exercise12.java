package chapter07.exercises;

public class Exercise12 {
	
	for (int i = 0; i < 4; i++) {
		int cardNumber = (int)(Math.random() * deck.length);
		String suit = suits[cardNumber / 13];
		String rank = ranks[cardNumber % 13];
		System.out.println("Card number " + cardNumber + ": " + rank + " of " + suit);	
		}

	/*
	 * No the new version of the code, presented in the check point, will not work
	 * since it would be possible to get the same card more than once.
	 */

}
