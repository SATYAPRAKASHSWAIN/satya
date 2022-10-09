package com.practice.naming;

import java.util.Scanner;

public class AmstrongNo {
	public static void amstrongNo(int n) {
		int count = 0, r, num, num1;
		double sum = 0;
		num = n;
		num1 = n;
		while (num != 0) {
			r = num % 10;
			count++;
			num = num / 10;
		}
		System.out.println(count);
		System.out.println(num1);
		int r1;
		while (num1 != 0) {
			r1 = num1 % 10;
			sum = sum + Math.pow(r1, count);
			num1 = num1 / 10;
		}
		System.out.println(sum);
		if (sum == n) {
			System.err.println("Enter no " + n + " is amstrong number");
		} else {
			System.out.println("Enter no " + n + " is not amstrong number");
		}
	}
 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no you want to check");
		int x = sc.nextInt();
		amstrongNo(x);
	}

}
