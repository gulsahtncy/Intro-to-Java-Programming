package chapter03.exercises;

public class Exercise09 {
	public static void main(String[] args) {

		int x = 2;
		int y = 3;
		
		if (x > 2)
			if (y > 2) {
				int z = x + y;
				System.out.println("z is " + z);
			} else
				System.out.println("x is " + x);
		
		x = 3;
		y = 2;
		
		if (x > 2)
			if (y > 2) {
				int z = x + y;
				System.out.println("z is " + z);
			} else
				System.out.println("x is " + x);
		
		x = 3;
		y = 3;
		
		if (x > 2)
			if (y > 2) {
				int z = x + y;
				System.out.println("z is " + z);
			} else
				System.out.println("x is " + x);
	}
}
