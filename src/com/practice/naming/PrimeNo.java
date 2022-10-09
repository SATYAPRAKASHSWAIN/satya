package com.practice.naming;

import java.util.Scanner;

public class PrimeNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no you want to check");
		int number=sc.nextInt();
		int d;
		for( d=2;d<number;d++) {
			if(number%d==0)
				break;
		}
		if(d==number) {
			System.out.println("Enter no  "+number+"  is prime no");
		}else {
			System.out.println("Enter no  "+number+" is not prime no");
		}
		
	}

}
