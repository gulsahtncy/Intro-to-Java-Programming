package chapter07.exercises;

public class Exercise28 {
	public static void main(String[] args) {

		// Show the output of the following code:

		int[] list1 = { 2, 4, 7, 10 };
		java.util.Arrays.fill(list1, 7);
		System.out.println(java.util.Arrays.toString(list1)); // Fill the 7 to the whole array

		int[] list2 = { 2, 4, 7, 10 };
		System.out.println(java.util.Arrays.toString(list2)); // 2, 4, 7, 10
		System.out.print(java.util.Arrays.equals(list1, list2)); // false because whole first array filled with 7
	}

}
