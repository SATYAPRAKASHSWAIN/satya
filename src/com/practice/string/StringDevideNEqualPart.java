package com.practice.string;

import java.util.Scanner;

public class StringDevideNEqualPart {
	public static void devideNEqualPart(String str) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no you want to devide the string:");
		int n = sc.nextInt();
		int len, c, temp = 0;
		len = str.length();
		c = len / n;
		String eqStr[] = new String[n];
		if (len % n != 0) {
			System.out.println("Enter string cann't devided " + n + " equal part");
		} else {
			for (int i = 0; i < len; i = i + c) {
				String part = str.substring(i, i + c);
				eqStr[temp] = part;
				temp++;
			}
			System.out.println("Equal string is:");
			for (int j = 0; j <=c; j++) {
				System.out.println(eqStr[j]);
			}

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string you want to devid n equal part");
		String st = sc.nextLine();
		devideNEqualPart(st);
	}

}
