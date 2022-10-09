package com.start.pattern;

import java.util.Scanner;
/*
 
**** 
***  
**   
* 
 */

public class RightAngleTringleStar_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number you want to see the right angle tringle");
		int row = sc.nextInt();

		for (int i = 1; i <= row; i++) {
			// printing star in decreasing order
			for (int star = row; star >= i; star--) {
				System.out.print("*");
			}
			// printing space in increasing order
			for (int space = 1; space <= i; space++) {
				System.out.print(" ");
			}
			// New lines
			System.out.println();
		}
		sc.close();

	}

}
