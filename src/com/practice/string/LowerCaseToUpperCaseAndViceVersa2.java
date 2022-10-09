package com.practice.string;

import java.util.Scanner;

public class LowerCaseToUpperCaseAndViceVersa2 {
	public static void lowerToHigherViceversa(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				System.out.print(Character.toLowerCase(str.charAt(i)));
			} else {
				System.out.print(Character.toUpperCase(str.charAt(i)));
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string you want to convert the uppercase to lower case");
		String str = sc.nextLine();
		lowerToHigherViceversa(str);

	}

}
