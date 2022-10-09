package com.practice.naming;

import java.util.Scanner;

public class GcdOfTwoNo {
	public static void gcd(int x, int y) {
		int i,g=0;
		for (i = 1; i < (x>y?x:y); i++) {
			if (x % i == 0 && y % i == 0) {
                 g=i;
			}
		}
		System.out.println("GCD of two no " + x + " and " + y + " is " + g);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two nnmber you want to check the gcd of two no ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		gcd(x, y);

	}

}
