package com.start.pattern;

import java.util.Scanner;

/*
   
 * 
 ** 
 * * 
 *  *
 *****  
 
 */
public class SquareRightAngleTringle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number you want to right angle tringle");
		int row = sc.nextInt();

		for (int i = 1; i <= row; i++) {
			//printing star in increasing order
			for (int star = 1; star <=i; star++) {
				if(star==1 || star==i) {
				System.out.print("*");				
			}
				else {
				System.out.print(" ");
			}
			}
			System.out.println();
		}for (int i = 1; i <=row+1; i++) {
			System.out.print("*");
			
		}

	}

}
