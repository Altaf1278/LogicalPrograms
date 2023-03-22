package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		
		 Scanner user = new Scanner(System.in);
	        System.out.print("Enter a number to check if it's a perfect number: ");
	        int num = user.nextInt();

	        int sum = 0;
	        for (int i = 1; i <= (num /2); i++) 
	        {
	            if (num %i == 0) 
	            {
	                sum += i;
	            }
	        }

	        if (sum == num) {
	            System.out.println(num+ " is a perfect number.");
	        } else {
	            System.out.println(num+ " is not a perfect number.");
	        }
	        user.close();
	}

}
