package com.practice.naming;

import java.util.Scanner;

public class FactorialNo {
	public static void factorial(int n) {
		int fact = 1;
		for (int k = 1; k <= n; k++) {
			fact = fact * k;
		}
		System.out.println("Factorial of given no " + n + "is " + fact);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no you want to see the factorial of that no:");
		int x = sc.nextInt();
		factorial(x);

	}

}
