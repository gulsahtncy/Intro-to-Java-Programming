package chapter06.exercises;

public class Exercise02 {

	// How do you define a method? How do you invoke a method?

	// A number of properties about a given method need to be decided before it can be defined:

	// What modifiers are suitable
	// The type of the value, if any, that shall be returned
	// The name of the method
	// What parameters are needed as data for the method to be able to do its work
	// What the method is intended to do and how it shall do it

	// When all of the above decisions have been made so can the method be defined.
	// An example of a method definition looks like this:

	public static int max(int num1, int num2) {
		if (num1 > num2)
			return num1;
		else
			return num2;
	}

	/*
	 * The keywords public and static are examples of modifiers. The following int
	 * indicates that the method will return an int after being executed. The name
	 * of the method is max and it takes two int's as data parameters. The part
	 * between the braces is the body of the loop and it this part that does the
	 * actual work. In this case so will it be checked which of the parameters that
	 * is biggest and the value of this parameter is returned to the caller of the
	 * method. A method is invoked by using the name of the method combined with the
	 * same number and type of actual parameter values as in the definition of the
	 * method. An invocation of the max method can for example look like this:
	 * 
	 */
	
	int biggestNumber = max(15, 42);  

}
