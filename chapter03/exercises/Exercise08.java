package chapter03.exercises;

public class Exercise08 {
	public static void main(String[] args) {

		int x = 3;
		int y = 2;

		if (x > 2) {
			if (y > 2) {
				int z = x + y;
				System.out.println("z is " + z);
			}
		} else
			System.out.println("x is " + x);

		// There will be no output if x = 3 and y = 2.

		x = 3;
		y = 4;

		if (x > 2) {
			if (y > 2) {
				int z = x + y;
				System.out.println("z is " + z);
			}
		} else
			System.out.println("x is " + x);

		x = 2;
		y = 2;

		if (x > 2) {
			if (y > 2) {
				int z = x + y;
				System.out.println("z is " + z);
			}
		} else
			System.out.println("x is " + x);
	}
}
