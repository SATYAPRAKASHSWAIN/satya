package com.practice.string;

import java.util.Scanner;

public class DuplicateCharacterInTheString {
	public static void duplicateCharacter(String str) {
		// str = str.toLowerCase();
		char string[] = str.toCharArray();
		int total[] = new int[100];
		int visit, temp = 0;
		System.out.println("duplicate characters of that string is :");
		for (int i = 0; i < str.length(); i++) {
			visit = 1;
			for (int j = i + 1; j < str.length(); j++) {
				if (string[i] == string[j] && string[i] != ' ') {
					string[j] = '0';
					visit++;
				}
			}
			total[temp] = visit;
			temp++;
		}
		for (int i = 0; i < str.length(); i++) {
			if (total[i] > 1 && string[i] != '0')
				System.out.println(string[i]);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string,you want to see the duplicate character in that string:");
		String st = sc.nextLine();
		duplicateCharacter(st);
	}
}
