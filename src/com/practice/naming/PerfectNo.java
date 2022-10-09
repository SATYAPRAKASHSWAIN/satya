package com.practice.naming;

import java.util.Scanner;

public class PerfectNo {
	public static void perNo(int n) {
		int sum = 0, i;
		for (i = 1; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == n) {
			System.out.println("Enter no  " + n + " is a perfact no");
		} else {
			System.out.println("Enter no " + n + "is not a perfect no");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number you want to check whether number is perfact or not");
		int x = sc.nextInt();
		perNo(x);
	}

}
