package com.exception;

import java.util.Scanner;

public class Try_catchException {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you want to devide by a");
		int b=sc.nextInt();
		try {
			int a=100,c;
			c=a/b;
			System.out.println("Division of two no is:"+c);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Zero cann't be devided to that integer, you must enter a valid number :" +e);
		}
		
	}

}
