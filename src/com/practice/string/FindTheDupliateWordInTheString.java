package com.practice.string;

import java.util.Scanner;

public class FindTheDupliateWordInTheString {
	public static void duplicateString(String str) {
		str = str.toLowerCase();
		String words[] = str.split(" ");
		int count = 1;
		System.out.println("Duplicate word are:");

		for (int i = 0; i < words.length; i++) {
			count = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
					words[j] = "0";
				}
			}
		
			if ( count > 1 && words[i]!="0") {
				System.out.println(words[i]);
			}
		
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ,you want to check the duplicate word in that string :");
		String st = sc.nextLine();
		duplicateString(st);
	}

}
