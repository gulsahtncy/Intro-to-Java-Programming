package chapter07.exercises;

public class Exercise24 {
	public static void main(String[] args) {
		double[] list = { 3.4, 5, 3, 3.5, 2.2, 1.9, 2 };
		selectionSort(list);
		for (double d : list) {
			System.out.println(d + " ");
		}
	}

	/** The method for sorting the numbers */
	public static void selectionSort(double[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			// Find the minimum in the list[i..list.length-1]
			double currentMin = list[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < list.length; j++) {
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}

			// Swap list[i] with list[currentMinIndex] if necessary
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}
}
