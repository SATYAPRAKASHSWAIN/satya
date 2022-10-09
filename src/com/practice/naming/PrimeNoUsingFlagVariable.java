package com.practice.naming;

public class PrimeNoUsingFlagVariable {
	public static void checkP(int n) {
		int m = n / 2, d = 2, flag = 0;
		if (n == 0 || n == 1) {
			System.out.println(n + "  is not a prime no");
		} else {
			for (d = 2; d <= m; d++) {
				if (n % d == 0) {
					System.out.println(n + " is not  a prime no");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(n + "  is not a prime no ");
			}
		}

	}

	public static void main(String[] args) {
		checkP(5);
		checkP(6);
	}

}
