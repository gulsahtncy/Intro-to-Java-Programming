package chapter07.exercises;

public class Exercise11 {
	public static void main(String[] args) {
		
		int list[] = { 1, 2, 3, 4, 5, 6 };
		for (int i = 1; i < list.length; i++)
			list[i] = list[i - 1]; // 

		for (int i = 0; i < list.length; i++) // 1 2 3 4 5 6 
			System.out.print(list[i] + " ");
	}
}
