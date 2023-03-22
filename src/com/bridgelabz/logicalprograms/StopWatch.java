package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class StopWatch {
	public static void main(String[] args) {

		// Press Enter To Start:
		Scanner user = new Scanner(System.in);
		System.out.print("Press Enter to start the stopwatch");
		user.nextLine();

		// Press Enter To Stop:
		long startTime = System.currentTimeMillis();
		System.out.print("Press Enter to stop the stopwatch");
		user.nextLine();

		/* If we want in minutes then divide currentTimeMillis by 60000:
		 * And for Seconds divide currentTimeMillis by 1000: 
		 * ex :- long currentTimeMillis = System.currentTimeMillis(); 
		 *       long currentTimeMinutes =currentTimeMillis / 60000;
		 */
		long endTime = System.currentTimeMillis();
		long elapsedTime = endTime - startTime;
		System.out.println("Elapsed time: " + elapsedTime + " milliseconds");
	}

}
