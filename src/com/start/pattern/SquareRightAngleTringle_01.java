package com.start.pattern;

import java.util.Scanner;
/*
 
     *
    **
   * *
  *  *
 *   *
******
 */

public class SquareRightAngleTringle_01 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number you want to right angle tringle");
		int row = sc.nextInt();

		for (int i = 1; i <= row; i++) {
			// printing space in decreasing order
			for (int space = row; space > i; space--) {
				System.out.print(" ");

			}
			// printing star in increasing order
			for (int star = 1; star <= i; star++) {
				if (star == 1 || star == i ||i==row) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
