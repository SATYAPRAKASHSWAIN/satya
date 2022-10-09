
package com.practice.naming;

import java.util.Scanner;

public class PerfectNoInGivenRange {
	public static void perNo(int n) {
		int sum = 0, i, j, n1;
		for (i = 1; i <= n; i++) {
			sum = 0;
			for (j = 1; j < i; j++) {
				if (i % j == 0) {
					sum = sum + j;
				}
			}
			if (sum==i) {
				System.out.println(i + ",\t");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Enter the number upto that  number   you want to check whether the no is perfect number or not ");
		int x = sc.nextInt();
		perNo(x);
	}

}
