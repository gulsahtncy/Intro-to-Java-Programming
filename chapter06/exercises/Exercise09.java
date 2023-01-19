package chapter06.exercises;

public class Exercise09 {
	public static void method1(int n, int m) {
		n += m;
		method2(3.4);
	}
	
	public static int method2(double n) {
		if (n > 0)
			return 1;
		else if (n == 0)
			return 0;
		else 
			return -1;

	}		
}
