package com.practice.string;

import java.util.Scanner;

public class FrequencyOfCharacter {
	public static void frequncyCharacter(String str) {
		int fre[] = new int[str.length()];
		char string[] = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			fre[i] = 1;
			for (int j = i + 1; j < str.length(); j++) {
				if (string[i] == string[j]) {
					fre[i]++;
					string[j] = '0';

				}
			}
		}
		System.out.println("Character and their correspding frequncy is:");
		for (int i = 0; i < fre.length; i++) {
			if (string[i] != ' ' && string[i] != '0')
				System.out.println(string[i] + "<====>" + fre[i]);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string you want to check the frequncy of that character:");
		String st = sc.nextLine();
		frequncyCharacter(st);
	}

}
