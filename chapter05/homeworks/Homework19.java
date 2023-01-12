package chapter05.homeworks;

public class Homework19 {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		System.out.printf("%36d\n", a);
		for (int i = 1; i <= 7; i++) {
			for (int j = 8; j > i; j--) {
				System.out.print("    ");
			}
			for (int k = 1; k <= a; k *= 2) {
				System.out.printf("%4d", k);
			}
			for (int l = b; l > 0; l /= 2) {
				System.out.printf("%4d", l);
			}
			System.out.println();
			a *= 2;
			b *= 2;
		}
	}
}
