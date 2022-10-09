package com.practice.string;

import java.util.Scanner;

public class StringPalindrom {
	public static void checkStringPalindromOrNot(String str) {
		boolean flag = true;
		for(int i=0;i<=str.length()/2;i++) {
			if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println("Enter string "+str+"  is palindrom!");
		}else {
			System.out.println("Enter string "+str+" is not a palindrom number!");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string you want to check the string is palindrom or not");
		checkStringPalindromOrNot(sc.nextLine());

	}

	
}
