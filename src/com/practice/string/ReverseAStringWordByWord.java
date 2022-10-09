package com.practice.string;

import java.util.Scanner;

public class ReverseAStringWordByWord {
	public static String reverseWordByWord(String str) {
		String[] string=str.trim().split(" ");
		String r = "";
		for (int i = str.length(); i > 0; --i) {
			r = r + (str.charAt(i - 1));
		}
		return r;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no you want to reverse word by word");
		System.out.println("Reverse the word by word is: " + reverseWordByWord(sc.nextLine()));

	}

}
