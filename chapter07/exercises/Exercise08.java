package chapter07.exercises;

public class Exercise08 {
	public static void main(String[] args) {
		
		// Write statements to do the following: 
			// a. Create an array to hold 10 double values. 
		double[] listA = new double[10];
			// b. Assign the value 5.5 to the last element in the array. 
		listB[listB.length() - 1] = 5.5;
			// c. Display the sum of the first two elements. 
		System.out.println(listC[0] + listC[1]);
			// d. Write a loop that computes the sum of all elements in the array.
		int sum = 0;
		for (int e : listD) {
			sum += e;
		}
			// e. Write a loop that finds the minimum element in the array.
		int min = listE[0];
		for (int e : listE) {
			if (e < min) {
				min = e;
			}
		}
			// f. Randomly generate an index and display the element of this index in the array.
		System.out.println(listF[(int)(Math.random()*listF.length)]);
			// g. Use an array initializer to create another array with the initial values 3.5, 5.5, 4.52, and 5.6.
		double[] ListG = {3.5, 5.5, 4.52, 5.6};
				
	}

}
