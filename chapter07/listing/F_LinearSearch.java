package chapter07.listing;

public class F_LinearSearch {
	public static void main(String[] args) {
		int[] list = {1, 4, 4, 2, 5, -3, 6, 2};
		int i = linearSearch(list, 4); // Returns 1
		int j = linearSearch(list, -4); // Returns -1
		int k = linearSearch(list, -3); // Returns 5
	}
	
	/** The method for finding a key in the list */
	public static int linearSearch(int[] list, int key) {
		for (int i = 0; i < list.length; i++) {
			if (key == list[i])
				return i;
		}
		return -1;
	}
}
