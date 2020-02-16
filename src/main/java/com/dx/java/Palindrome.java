package com.dx.java;

import java.util.Scanner;

/**
 * Palindrome program
 *
 */
public class Palindrome {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your string: ");
		
		String x1 = input.nextLine();
		StringBuffer str1 = new StringBuffer(x1);
		
		StringBuffer str2 = new StringBuffer(str1.reverse());
		String x2 = new String(str2);
		
		System.out.println("The Reversed String is: " + str2);
		
		if (x1.equals(x2))
			System.out.println("The given string "+ x1+ " is a palindrome");
		else
			System.out.println("The given string "+ x1+ " is not a palindrome");
	}
}
