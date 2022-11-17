package chapter03.exercises;

public class Exercise37 {
	public static void main(String[] args) {
		//The precedence of the the Boolean operators is (listed from high to low):
		
		/* NOT: !
		 * XOR: ^
		 * AND: &&
		 * OR : || 
		 */
		
		// The expression true || true && false will be evaluated as follows.
		
		/* true || (true && false)  
		 * true || false
		 * true
		 */
		
		//The expression true && true || false will be evaluated as follows.
		
		/*(true && true) || false  
		 * true || false  
		 * true
		 */	
	}
}
