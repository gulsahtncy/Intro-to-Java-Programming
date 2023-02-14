package chapter07.exercises;

public class Exercise13 {
	public static void main(String[] args) {
		
		// The following code will copy the content of the array called "source" to the other array called "target".
		int[] source = { 3, 4, 5 };
		int[] target = new int[source.length];
		System.arraycopy(source, 0, target, 0, source.length);
	}
}
