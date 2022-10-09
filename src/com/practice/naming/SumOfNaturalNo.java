package com.practice.naming;

import java.util.Scanner;

public class SumOfNaturalNo {
	public static void sumNo(int n) {
		int sum = 0, r;
		while (n != 0) {
			r = n % 10;
			sum = sum + r;
			n = n / 10;
		}
		System.out.println("Sum of that given no is:" + sum);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number you want to show the sum of that number");
		int x = sc.nextInt();
		sumNo(x);
	}

}
