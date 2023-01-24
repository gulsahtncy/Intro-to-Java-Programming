package chapter06.exercises;

public class Exercise14 {
	
	// Stack content just before the max-method is invoked:
	|           |
	| max     0 |
	-------------
	
	// Stack content just entering the max-method, we use more stack now because max need to store some data:
	|           |
	| max     0 |
	| value2  2 |
	| value1  1 |
	-------------
	| max     0 |
	-------------
	
	// Stack content just before return from the max-method, that now have done some writing in the memory:
	|           |
	| max     0 |
	| value2  2 |
	| value1  1 |
	-------------
	| max     0 |
	-------------
	
	// Stack content after return from the max-method, the memory needed by the max-method is now free again:
	|           |
	| max     0 |
	-------------
	
}
