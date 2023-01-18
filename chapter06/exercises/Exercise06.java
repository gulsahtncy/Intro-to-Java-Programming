package chapter06.exercises;

public class Exercise06 {
	
	// What would be wrong with not writing a return statement in a value-returning method?
	// Omitting a return statement in a value-returning method will cause a syntax error.
	
	// Can you have a return statement in a void method?
	// It is possible to have a return statement in a void function, this will end the execution of the method.
	
	// Does the return statement in the following method cause syntax errors?
	
	public static void xMethod(double x, double y) {
		System.out.println(x + y);
		return x + y;
		} // It is a syntax error to have a void function return a value.
	
	

}
