package com.practice.string;

import java.util.Scanner;

public class MinAndMaxOccurenceStingCharacter {
	private static void stringOccurence(String str) {
		int feq[] = new int[str.length()];
		char minChar = str.charAt(0), maxChar = str.charAt(0);
		int i, j, min, max;

		char string[] = str.toCharArray();

		for (i = 0; i < string.length; i++) {
			feq[i] = 1;
			for (j = i + 1; j < string.length; j++) {
				if (string[i] == string[j] && string[i] != '0' ) {
					feq[i]++;
					string[j] = '0';
				}
			}
		}
		min = max = feq[0];
		for (i = 0; i < feq.length; i++) {

			if (min > feq[i] && feq[i] != '0') {
				min = feq[i];
				minChar = string[i];
			}

			if (max < feq[i]) {
				max = feq[i];
				maxChar = string[i];
			}
		}

		System.out.println("Minimum occurring character: " + minChar);
		System.out.println("Maximum occurring character: " + maxChar);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string you want to check the occurence of a character in that string: ");
		String str = sc.nextLine();
		stringOccurence(str);

	}

}
