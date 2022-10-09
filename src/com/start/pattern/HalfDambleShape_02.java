package com.start.pattern;

import java.util.Scanner;

/*
      
    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *

 */

public class HalfDambleShape_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number you want to right angle tringle");
		int row = sc.nextInt();

		for (int i = 1; i <= row; i++) {
			// printing space in decreasing order
			for (int space1 = row; space1 > i; space1--) {
				System.out.print(" ");
			}
			// printing star in incresing order
			for (int star1 = 0; star1 < i; star1++) {
				System.out.print("*");
			} // New lines
			System.out.println();
		}

		for (int i1 = 1; i1 < row; i1++) {
			// printing space in incresing order
			for (int space1 = 1; space1 <= i1; space1++) {
				System.out.print(" ");
			}
			// printing star in decreasing order
			for (int star1 = row; star1 > i1; star1--) {
				System.out.print("*");
			} // New lines
			System.out.println();
		}
		sc.close();
	}

}
