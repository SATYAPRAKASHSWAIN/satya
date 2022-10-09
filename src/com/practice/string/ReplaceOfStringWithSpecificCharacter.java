package com.practice.string;

import java.util.Scanner;

public class ReplaceOfStringWithSpecificCharacter {
	public static void enterCharaterIntoString(String str, char ch) {
		str=str.replace(' ', ch);
		System.out.println("After enter into the give character into the stirng :"+str);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ther string you want to ,enter a specific chareacter in it ");
		String str=sc.nextLine();
		System.out.println("Enter the specific character ,enter to the given string ");
		char ch=sc.next().charAt(0);
		enterCharaterIntoString(str,ch);

	}

	
}
