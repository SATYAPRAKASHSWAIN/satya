package com.start.pattern;

import java.util.Scanner;
/*
     *
    * *
   *   *
  *     *
 *********
 */

public class Equilateral_tringle_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number you want to right angle tringle");
		int row = sc.nextInt();

		for (int i = 1; i <= row; i++) {
			// printing space in decresing order
			for (int space = row; space >= i; space--) {
				System.out.print(" ");
			}
			// printing star in increasing order (i*2)-1 ways
			for (int star = 1; star <= (i * 2) - 1; star++) {
				if (star == 1 || star == (i * 2) - 1 || row == i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
