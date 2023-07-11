package chapter03.homeworks;

public class Homework24 {
	public static void main(String[] args) {
		
		// Game: pick a card

		int rank = (int) (Math.random() * 13);
		int suit = (int) (Math.random() * 4);

		String card = "";

		switch (rank) {
		case 0:
			card = "Ace";
			break;
		case 1:
			card = "2";
			break;
		case 2:
			card = "3";
			break;
		case 3:
			card = "4";
			break;
		case 4:
			card = "5";
			break;
		case 5:
			card = "6";
			break;
		case 6:
			card = "7";
			break;
		case 7:
			card = "8";
			break;
		case 8:
			card = "9";
			break;
		case 9:
			card = "10";
			break;
		case 10:
			card = "Jack";
			break;
		case 11:
			card = "Queen";
			break;
		case 12:
			card = "King";
			break;
		}

		String suitType = "";

		switch (suit) {
		case 0:
			suitType = "Clubs";
			break;
		case 1:
			suitType = "Diamonds";
			break;
		case 2:
			suitType = "Hearts";
			break;
		case 3:
			suitType = "Spades";
			break;
		}

		System.out.println("The card you picked is " + card + " of " + suitType);
	}
}
