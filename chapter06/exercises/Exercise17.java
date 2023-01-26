package chapter06.exercises;

public class Exercise17 {
	public static void main(String[] args) {
		System.out.println(m(4, 5)); // The second method will be invoked in this case.
		System.out.println(m(4, 5.4));// The second method will be invoked in this case.
		System.out.println(m(4.5, 5.4));// The first method will be invoked in this case.
	}

	public static double m(double x, double y) {
		if (x > x)
			return x;
		else
			return y;
	}

	public static double m(int x, double y) {
		if (x > x)
			return x;
		else
			return y;
	}
}
