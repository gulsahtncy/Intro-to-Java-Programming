package chapter05.homeworks;

public class Homework07 {
	public static void main(String[] args) {

		// Financial application: compute future tuition
		int tuition = 10000;

		for (int year = 0; year < 10; year++) {
			tuition = tuition + (tuition * 5) / 100;
			System.out.println("Tuition in " + (year + 1) + ".year : $" + tuition);
		}

		int sum = 0;
		for (int year = 11; year < 15; year++) {
			tuition = tuition + (tuition * 5) / 100;
			sum += tuition;
		}
		System.out.println("After the tenth year, the total cost of four years of tuition is $" + sum);
	}
}