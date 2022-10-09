package com.start.pattern;

import java.util.Scanner;
/*
 
    *
   ***
  *****
 *******
 */

public class Equilateral_tringle_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number you want to right angle tringle");
		int row = sc.nextInt();

		for (int i = 1; i <= row; i++) {
			// printing space in decreasing order
			for (int space = row; space >= i; space--) {
				System.out.print(" ");
			}
			// printing star in increasing order (I*2)-1 ways
			for (int star = 1; star <= (i * 2) - 1; star++) {
				System.out.print("*");
			}
			// New lines
			System.out.println();
		}
		sc.close();
	}

}
