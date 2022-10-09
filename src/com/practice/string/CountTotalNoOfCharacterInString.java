package com.practice.string;

import java.util.Scanner;

public class CountTotalNoOfCharacterInString {
	public static void strCharacter(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)!=' ')
			count++;
		}
		System.out.println("Character of the entered string is" + count);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string you want to check the character to that string");
		String st = sc.nextLine();
		strCharacter(st);

	}

}
