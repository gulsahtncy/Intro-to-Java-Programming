package chapter05.exercises;

public class Exercise08 {
	public static void main(String[] args) {

		for (int i = 0; i < 10; ++i) {
			sum += i;
		}

		for (int i = 0; i < 10; i++) {
			sum += i;
		}

		/*
		 * The above two loops will result in the same value in sum. This is so because
		 * the control variable i will have identical value, when used in the
		 * loop-continuiation-condition, regardless of ++i or i++ is used to increment
		 * i.
		 */
	}
}
