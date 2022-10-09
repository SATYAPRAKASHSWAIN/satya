package com.practice.string;

import java.util.Scanner;

public class LowerCaseToUpperCaseAndViceVersa {
	public static void lowerToHigherViceversa(String str) {
		StringBuffer newStr = new StringBuffer(str);
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLowerCase(str.charAt(i))) {
				newStr.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			} else {
				newStr.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}

		}
		System.out.println("After converting the string the required string is :" + newStr);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string you want to convert the uppercase to lower case");
		String str = sc.nextLine();

		lowerToHigherViceversa(str);

	}

}
