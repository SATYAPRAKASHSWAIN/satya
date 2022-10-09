package com.practice.string;

import java.util.Scanner;

public class CountTotalNoOfPunchuationVouleConsonat {
	public static void countPVC(String str) {
		int vCount = 0, cCount = 0, pCount = 0;
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '!' || str.charAt(i) == '.' || str.charAt(i) == ',' || str.charAt(i) == '?'
					|| str.charAt(i) == ';' || str.charAt(i) == '"' || str.charAt(i) == '-') {
				pCount++;
			} else if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				vCount++;
			} else {
				cCount++;
			}
		}
		System.out.println("Number of punchuation in the given string is" + pCount);
		System.out.println("Number of vowel in the given string is" + vCount);
		System.out.println("Number of consonant in the given string is" + cCount);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string you want to know the punchuation,vouwel and consonant");
		String st = sc.nextLine();
		countPVC(st);
	}

}
