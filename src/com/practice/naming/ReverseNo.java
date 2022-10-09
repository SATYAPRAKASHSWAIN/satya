package com.practice.naming;

import java.util.Scanner;

public class ReverseNo {
	public static void revNO(int n) {
		int sum=0,r;
		while(n!=0) {
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		System.out.println("Reverse of a given no is"+sum);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number you want to reverse it");
		int x=sc.nextInt();
		revNO(x);
		
	}

}
