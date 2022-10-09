package com.practice.string;

import java.util.Scanner;

public class RemoveAllTheWhiteSpaceOfStirng {
	public static void removeWhiteSpace(String str) {
		str=str.replaceAll("\\s+","");
		System.out.println("After removeing white space :"+str);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string you want to remove the white space in that stirng  ");
		String str=sc.nextLine();
		removeWhiteSpace(str);
		
		

	}

	
}
