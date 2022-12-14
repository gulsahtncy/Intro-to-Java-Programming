package chapter05.exercises;

public class Exercise03 {
	public static void main(String[] args) {

		// A
		int i = 1;
		while (i < 10)
			if (i % 2 == 0)
				System.out.println(i);
		/* The loop body will be run an infinite number of times. There will be no
		 * output because i is 1 all the time. */

		// B
		int i = 1;
		while (i < 10)
			if (i % 2 == 0)
				System.out.println(i++);
		/* The loop body will be run an infinite number of times. There will be no
		 * output because i is 1 all the time. */
	
		// C
		int i = 1;
		while (i < 10)
			if ((i++) % 2 == 0)
				System.out.println(i);
		// The loop body will be run nine times and the output will be: 3,5,7,9

	}
}
