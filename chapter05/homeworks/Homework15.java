package chapter05.homeworks;

public class Homework15 {
	public static void main(String[] args) {

		int count = 0;
		int i = '!';
		for (i = 33; i <= 126; i++) {
			System.out.printf("%c ", (char) (i));
			count++;
			if (count % 10 == 0) {
				System.out.println();
			}
		}
	}
}
