package chapter06.exercises;

public class Exercise13_A {
	public static void main(String[] args) {
		int max = 0;
		max(1, 2, max);
		System.out.println(max); // It is only the local copy that is altered by the method, the original is left unchanged.
	}

	public static void max(int value1, int value2, int max) {
		if (value1 > value2)
			max = value1;
		else
			max = value2;			
	}
}

