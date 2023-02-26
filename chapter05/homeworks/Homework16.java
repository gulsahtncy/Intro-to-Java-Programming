package chapter05.homeworks;

public class Homework16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer: ");
		int i = input.nextInt();
		int f = 2;
		while (f <= i) {
			if (i % f == 0) {
				System.out.printf("%d,", f);
				i = i / f;
			} else
				f++;
		}
	}

}
