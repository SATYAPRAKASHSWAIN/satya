package com.practice.string;

import java.util.Scanner;

public class ReverseAStringWithoutReverseMethod {
	public static void reverseString(String str) {
		String[] string = str.split(" ");
		System.out.print("[");
		for (int k = 0; k < string.length; k++) {
			for (int i = string[k].length(); i > 0; i--) {
				System.out.print(string[k].charAt(i - 1));
			}
			System.out.print(" ");
		}
		System.out.print("]");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String you want to reverse that string :");
		reverseString(sc.nextLine());
	}

}
