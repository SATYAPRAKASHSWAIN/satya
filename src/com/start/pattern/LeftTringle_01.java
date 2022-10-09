package com.start.pattern;

import java.util.Scanner;

/*
*****
 ****
  ***
   **
    *
   **
  ***
 ****
*****

 */

public class LeftTringle_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number you want to right angle tringle");
		int row = sc.nextInt();

		for (int i = 1; i <= row; i++) {
			// printing space in increasing order
			for (int space1 = 1; space1 < i; space1++) {
				System.out.print(" ");
			}
			// printing star in decresing order
			for (int star = row; star >= i; star--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for (int i1 = 1; i1 < row; i1++) {
			// printing space in decresing order
			for (int space = row-1; space > i1; space--) {
				System.out.print(" ");
			}
			// printing star in increasing order
			for (int star = 1; star<=i1+1; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
