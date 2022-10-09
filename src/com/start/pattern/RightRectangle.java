package com.start.pattern;

import java.util.Scanner;
/*
 
    *****
   *****
  *****
 *****
*****

 */

public class RightRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number you want to right angle tringle");
		int row = sc.nextInt();

		for (int i = 1; i <= row; i++) {
			// printing space in decreasing order
			for (int space = row; space > i; space--) {
				System.out.print(" ");
			}
			// printing star in increasing order
			for (int star = 1; star <= row; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
