package com.practice.string;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniCharacter {
	private static void uni(String str) {
		if (str == null || str.length() == 0) {
			System.out.println("please enter a valid string");
		}

		Set<Character> set = new HashSet();

		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
		System.out.print(set.size());
		System.out.println();
		for (Character fruit : set)
			System.out.print(fruit+" , ");

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string you want to  check the unicharacter of the string : ");
		String str = sc.nextLine();
		UniCharacter.uni(str);
	}

}
