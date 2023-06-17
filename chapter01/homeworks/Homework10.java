package chapter01.homeworks;

public class Homework10 {

	/*
	 * Assume a runner runs 14 kilometers in 45 minutes and 30 seconds. Write a
	 * program that displays the average speed in miles per hour. (Note that 1 mile
	 * is 1.6 kilometers.)
	 */

	public static void main(String[] args) {
		double mile = 1.6;
		double totalPath = 14.0 / mile;
		double minute = 60.0; // 1 hour is 60 minutes.
		double totalMinute = 45.0;		
		double totalSecond = 30.0 / minute;
		double totalTimeMinute = totalMinute + totalSecond;
		double totalTimeHour = totalTimeMinute / minute;
		
		System.out.print("Average speed = ");
		System.out.println(totalPath / (totalTimeHour));
				
	}
}
