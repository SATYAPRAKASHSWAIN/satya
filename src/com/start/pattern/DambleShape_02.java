package com.start.pattern;

import java.util.Scanner;

/*
  
    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *


 */

public class DambleShape_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number you want to right angle tringle");
		int row = sc.nextInt();

		for (int i = 1; i <= row; i++) {
			// printing space in descending order
			for (int space1 = row; space1 > i; space1--) {
				System.out.print(" ");
			}
			for (int star1 = 1; star1 <= (i * 2) - 1; star1++) {
				if (star1 == 1 || star1 == (i * 2) - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			// New lines
			System.out.println();
		}

		// ============================================================================
		for (int j = 1; j < row; j++) {
			// printing space in increasing order
			for (int space1 = 1; space1 <= j; space1++) {
				System.out.print(" ");
			}
			// printing star in descending order
			for (int star1 = (row * 2) - 1; star1 > 2 * j; star1--) {
				if (star1 == (row * 2) - 1 || star1 == (j * 2) + 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			} // New lines
			System.out.println();

		}
		sc.close();
	}

}
