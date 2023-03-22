package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of terms in the series: ");
		int number = input.nextInt();
         
		//Fibonacci series is a special type of series in which the next term is the sum of previous two terms.
		 
		int firstTerm = 0, secondTerm = 1;
		System.out.print("Fibonacci series of " + number + " terms: ");
		for (int i = 1; i <= number; ++i) {
			System.out.print(firstTerm + " ");

			//
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}
}
