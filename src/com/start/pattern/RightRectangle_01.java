package com.start.pattern;

import java.util.Scanner;
/*
****
 ****
  ****
   ****
    ****

 */

public class RightRectangle_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number you want to right angle tringle");
		int row = sc.nextInt();

		for (int i = 1; i <= row; i++) {
			// printing spcace in increaing order
			for (int space = 1; space < i; space++) {
				System.out.print(" ");
			}
			// printing star in same order
			for (int star = 1; star < row; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();

	}

}
