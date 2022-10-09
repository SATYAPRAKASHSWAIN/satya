package com.practice.string;

import java.util.Scanner;

public class SmallestAndLargestWordInString {
	public static void smallestAndGreatestNo(String str) {
		String word = "", small = "", large = "";
		str = str + " ";
		int temp = 0, len;
		len = str.length();
//		String words[] = new String[str.length()];
//		for (int i = 0; i < len; i++) {
//			if (str.charAt(i) != ' ') {
//				word = word + str.charAt(i);
//			} else {
//				words[temp] = word;
//				temp++;
//				word = " ";
//			}
//		}
		String[] words = str.split(" ");
		small = large = words[0];
		for (int k = 0; k < words.length; k++) {
			if (small.length() > words[k].length())
				small = words[k];

			if (large.length() < words[k].length())
				large = words[k];

		}
		System.out.println("Large no is" + large);
		System.out.println("small no is" + small);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String  you want to see the smallest and greatest no in the String:");
		String st = sc.nextLine();
		smallestAndGreatestNo(st);
		// System.out.println("Small no is" + smallestAndGreatestNo(st));
	}

}
