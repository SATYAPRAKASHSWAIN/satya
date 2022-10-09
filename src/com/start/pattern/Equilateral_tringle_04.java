package com.start.pattern;

import java.util.Scanner;
/*
***********
 *       *
  *     *
   *   *
    * *
     *
      
 */

public class Equilateral_tringle_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number you want to right angle tringle");
		int row = sc.nextInt();

		for (int i = 1; i <= row; i++) {
			// printing space in increasing order
			for (int space = 1; space <i; space++) {
				System.out.print(" ");
			}
			// printing star in decresing order (i*2)-1 ways
			for (int star = (row * 2) - 1; star >2*i; star--) {
				//System.out.print("*");
				if ( star==(row * 2) - 1||star==(i*2)+1||i==1) {
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
