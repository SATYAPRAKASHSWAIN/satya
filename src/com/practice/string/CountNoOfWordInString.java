package com.practice.string;

import java.util.Scanner;

public class CountNoOfWordInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string you want to check the number of word avilable in that string");
		System.out.println(countNoOfWord(sc.nextLine()));
	}
	public static int countNoOfWord(String string) {
		String[] string1 = string.trim().split(" ");
		System.out.println(string1[0]);
		return string1.length;
	}
}
