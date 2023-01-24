package chapter05.homeworks;

public class Homework14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter two positive integers: ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int gcd = 1;
		int d = Math.min(n1, n2);
		while (d > 1) {
			if (n1 % d == 0 && n2 % d == 0) {
				gcd = d;
				break;
			}
			d--;
		}
		System.out.println(gcd + " is the greatest common divisor.");
	}

}
