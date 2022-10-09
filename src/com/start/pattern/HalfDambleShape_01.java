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

public class HalfDambleShape_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number you want to right angle tringle");
		int row = sc.nextInt();

		for (int i = 1; i <= row; i++) {
			// printing star in increasing order
			for (int star1 = 1; star1 <= i; star1++) {
				System.out.print("*");
			}
			// print space in decreasing order
			for (int space1 = row; space1 > 1; space1--) {
				System.out.print(" ");
			}
			// New lines
			System.out.println();
		}
		for (int i1 = 1; i1 < row; i1++) {
			// printing star in decresting order
			for (int star1 = row; star1 > i1; star1--) {
				System.out.print("*");
			}
			// print space in incresing order
			for (int space1 = 1; space1 < i1; space1++) {
				System.out.print(" ");
			}
			// New lines
			System.out.println();
		}
		sc.close();
	}

}
