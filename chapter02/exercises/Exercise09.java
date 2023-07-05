package chapter02.exercises;

public class Exercise09 {
	
	//Translating arithmetic expression to Java expression;
	
	public static void main(String[] args) {
		double x = 1;
		double y = 1;
		double a = 1;
		double b = 1;
		double c = 1;
		
		double result = ((3 + 4 * x) / 5) 
				- ((10 * (y  - 5) * (a + b + c)) / x)
				+ (9 * (4 / x + (9 + x) / y));
		System.out.println(result);
	}
}
