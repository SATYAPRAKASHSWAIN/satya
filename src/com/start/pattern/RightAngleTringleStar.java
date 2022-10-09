package com.start.pattern;

import java.util.Scanner;
/*
*      
**    
***   
****  
***** 
******

 */

public class RightAngleTringleStar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to see the right angle tringle");
		int row = sc.nextInt();
		for (int i = 1; i <= row; i++) {
			// printing the start the first right angle tringle
			for (int star = 1; star <= i; star++) {
				System.out.print("*");
			}
			// printing space the second right angle tringle
			for (int space = row; space > i; space--) {
				System.out.print(" ");
			}
			// New line
			System.out.println();

		}
		sc.close();

	}

}
