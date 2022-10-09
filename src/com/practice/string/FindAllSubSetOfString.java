package com.practice.string;

import java.util.Scanner;

public class FindAllSubSetOfString {
	public static void allSubString(String str) {
		int len = str.length(), temp = 0;
		String aSubString[] = new String[len * (len + 1) / 2];
		for (int i = 0; i < len; i++) {
			for (int j = i ; j < len; j++) {
				aSubString[temp] = str.substring(i, j + 1);
				temp++;
			}
		}
		System.out.println();
		System.out.println("SubString of that string is:");
		for (int j = 0; j < aSubString.length; j++) {
			System.out.println(aSubString[j]);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string you want to see the subset of that string");
		String st = sc.nextLine();
		allSubString(st);
	}

}
