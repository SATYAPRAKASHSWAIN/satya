package com.practice.string;

import java.util.Arrays;
import java.util.Scanner;

public class DetermineStringIsAnagramOrNot {
	public static void checkStringIsAnagramOrNot(String str1, String str2) {

		if (str1.length() != str2.length()) {
			System.out.println("Both Sting are not anagram");
		}
		char[] string1 = str1.toLowerCase().toCharArray();
		char[] string2 = str2.toLowerCase().toCharArray();

		Arrays.sort(string1);
		Arrays.sort(string2);

	
		if ( Arrays.equals(string1, string2)) {
			System.out.println(str1 + " and " + str2 + " both string are anagram");
		} else {
			System.out.println(str1 + " and " + str2 + " both string are  not anagram");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string");
		String str1 = sc.nextLine();
		System.out.println("Enter the second string");
		String str2 = sc.nextLine();
		checkStringIsAnagramOrNot(str1, str2);

	}

}
