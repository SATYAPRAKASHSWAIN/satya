package com.practice.naming;

public class PallindromNo {
	public static void pallindromNo(int n) {
		int r = 0, sum = 0, num;
		num = n;
		while (num != 0) {
			r = num % 10;
			sum = sum * 10 + r;
			num = num / 10;
		}
		if (sum == n) {
			System.out.println("Enter no " + n + "  is pallindrom");
		} else {
			System.out.println("Enter no " + n + "  is not pallindrom");
		}
	}

	public static void main(String[] args) {
		pallindromNo(121);
		pallindromNo(12321);
		
	}

}
