package chapter03.homeworks;

import java.util.Scanner;

public class Homework30 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the time zone offset to GMT: ");
		long time = input.nextLong();

		// Obtain the total milliseconds since midnight, Jan 1, 1970
		long totalMilliseconds = System.currentTimeMillis();

		// Obtain the total seconds since midnigt, Jan 1, 1970
		long totalSeconds = totalMilliseconds / 1000;

		// Compute the current second in the minute in the hour
		long currentSecond = totalSeconds % 60;

		// Obtain the total minutes
		long totalMinutes = totalSeconds / 60;

		// Compute the current minute in the hour
		long currentMinute = totalMinutes % 60;

		// Obtain the total hours
		long totalHours = totalMinutes / 60;

		// Compute the current hour
		long currentHours = totalHours % 24;

		// Add the difference of the time and GMT
		long newtime = currentHours + (time);

		String hour = "";

		if (newtime <= 12)
			hour = "AM";
		else
			hour = "PM";

		// Display results
		System.out.println("Current time is " + newtime + ":" + currentMinute + ":" + currentSecond + hour);
	}
}
