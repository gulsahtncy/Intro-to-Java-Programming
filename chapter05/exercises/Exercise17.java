package chapter05.exercises;

public class Exercise17 {
	public static void main(String[] args) {

		int sum = 0; // sum was not defined in original code
		for (int i = 0; i < 10; i++) // removed a semicolon here
			sum += i;

		int j = 10; // j was not defined
		int i = 5; // i was not defined
		if (i < j)
			System.out.println(i); // added missing semicolon
		else
			System.out.println(j);

		while (j < 10) // removed semicolon
		{
			j++;
		}

		do {
			j++;
		} while (j < 10); // added semicolon
	}
}
