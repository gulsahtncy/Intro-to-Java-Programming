package chapter04.exercises;

public class Exercise11 {
	public static void main(String[] args) {
		
		int i = '1';
		int j = '1' + '2' * ('4' - '3') + 'b' / 'a';
		int k = 'a';
		char c = 90;
		
		System.out.println(i); // the ASCII code for 1 is 49, i will hence become 49
		System.out.println(j); // int j = 49 + 50 * (52 - 51) + 98 / 97;
		System.out.println(k); // the ASCII code for a is 97, k will hence become 97
		System.out.println(c); // the 90 equals Z in the ASCII table, c will hence hold the value Z
	}
}
