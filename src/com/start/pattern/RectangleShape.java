package com.start.pattern;

import java.util.Scanner;
/*
*****
*   *
*   *
*   *
*****
 */

public class RectangleShape {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number you want to right angle tringle");
		int row = sc.nextInt();

		for (int i = 1; i <= row; i++) {
			// printing star in same order
			for (int star = 1; star <= row; star++) {
				if (i == 1 || star==1||star==row||i==row) 
				{
					System.out.print("*");
				} 
				else 
				{
					System.out.print(" ");
				}
			}
			
				System.out.println();
		}
			
		

	}

}
