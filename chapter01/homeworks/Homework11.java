package chapter01.homeworks;

public class Homework11 {
	public static void main(String[] args) {
		 
		//Population projection
		
		/*One birth every 7 seconds, 
		 * One death every 13 seconds, 
		 * One new immigrant every 45 seconds
		 */
		
		//Current population is 312.032.486
		//365 days 31.536.000 seconds
		
		System.out.println("1.Year:");
		System.out.println(312032486 + 31536000 / 7 - 31536000 / 13 + 31536000 / 45);
		System.out.println("2.Year:");
		System.out.println(312032486 + (31536000 / 7 - 31536000 / 13 + 31536000 / 45) * 2);
		System.out.println("3.Year:");
		System.out.println(312032486 + (31536000 / 7 - 31536000 / 13 + 31536000 / 45) * 3);
		System.out.println("4.Year:");
		System.out.println(312032486 + (31536000 / 7 - 31536000 / 13 + 31536000 / 45) * 4);
		System.out.println("5.Year:");
		System.out.println(312032486 + (31536000 / 7 - 31536000 / 13 + 31536000 / 45) * 5);	
	}
}