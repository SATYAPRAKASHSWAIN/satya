package com.practice.naming;

public class PrimeNoGivenRange {
	public static void givenRange(int n1, int n2) {
		int k;
		for (int d = n1; d <= n2; d++) {
			for (k = 2; k <= d; k++) {
				if (d % k == 0) {
					break;
				}

			}
			if (d == k) {
				System.out.print(d+",");

			}
		}

	}
	public static void main(String[] args) {
		System.out.println("Prime no in between 1 to 15 is: ");
		givenRange(2, 222);

	}

}
