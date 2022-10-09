package com.practice.naming;

import java.util.Scanner;

public class EvenAndOddNoInGivenRange {
	public static void evenAndOddNo(int n) {
		System.out.println("Even no are:");
		for (int i = 1; i < n; i++) {
			if (i % 2 == 0) {
				System.out.print(i + ",");
			}
		}
		System.out.println();
		System.out.println("Odd no are:");
		for (int j = 1; j < n; j++) {
			if (j % 2 != 0) {
				System.out.print(j + ",");
			}
		}
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no you want to check the even and odd no in given range");
		int x = sc.nextInt();
		evenAndOddNo(x);
	}

}
