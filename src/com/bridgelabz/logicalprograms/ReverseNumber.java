package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		System.out.print("Enter a number to reverse: ");
		int num = user.nextInt();
		int reversed = reverseNumber(num);
		System.out.println("The reversed number is: " + reversed);
	}

	public static int reverseNumber(int num) {
		int reverse = 0;
		while (num != 0) {
			int remainder = num % 10;
			reverse = (reverse * 10) + remainder;
			num /= 10;
		}
		return reverse;
	}

}
