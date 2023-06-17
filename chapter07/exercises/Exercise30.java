package chapter07.exercises;

public class Exercise30 {
	public static void main(String[] args) {
		System.out.println("Number of strings is " + args.length);
		for (int i = 0; i < args.length; i++)
			System.out.println(args[i]);

		// 1. java Test I have a dream //Number of strings is 4
		// 2. java Test “1 2 3” //Number of strings is 1
		// 3. java Test //Number of strings is 0
	}
}
