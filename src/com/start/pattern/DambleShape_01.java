package com.start.pattern;

import java.util.Scanner;
/*
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
   * * 
  * * * 
 * * * * 
* * * * * 

 */

public class DambleShape_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number you want to right angle tringle");
		int row = sc.nextInt();

		for (int i = 1; i <= row; i++) {
			// printing space in increasing order
			for (int space = 1; space < i; space++) {
				System.out.print(" ");
			}
			// printing star in decreasing order
			for (int star = row; star >= i; star--) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// ---------------------------------------------------------------------------

		for (int i = 1; i < row; i++) {
			// printing space in decreasing order
			for (int space = row-1; space > i; space--) {
				System.out.print(" ");
			}
			// printing star in decreasing order
			for (int star = 1; star <= i + 1; star++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
