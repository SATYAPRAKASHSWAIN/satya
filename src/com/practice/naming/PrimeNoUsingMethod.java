package com.practice.naming;

public class PrimeNoUsingMethod {
	public static void checkP(int n) {
		int d = 2;
		for (d = 2; d <= n; d++) {
			if (n % d == 0) {
				break;
			}
		}
		if (d == n) {
			System.out.println("Enter no " + n + " is prime no");
		} else {
			System.out.println("Enter no " + n + " is no prime no");
		}

	}

	public static void main(String[] args) {
		checkP(3);
		checkP(5);
		checkP(14);

	}

}
