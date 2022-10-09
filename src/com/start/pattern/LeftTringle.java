package com.start.pattern;

import java.util.Scanner;
/*
 
 
*******
****** 
*****  
****   
***    
**     
*      
**      
***     
****    
*****   
******  
******* 

 */

public class LeftTringle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number you want to right angle tringle");
		int row = sc.nextInt();

		for (int i = 1; i <= row; i++) {
			// printing star in descending order
			for (int star = row; star >= i; star--) {
				System.out.print("*");
			}
			// printing space in increasing order
			for (int space1 = 1; space1 < i; space1++) {
				System.out.print(" ");
			}
			// new lines
			System.out.println();
		}

		for (int i = 1; i < row; i++) {
			// printing star in increaing order
			for (int star = 1; star <=i+1; star++) {
				System.out.print("*");
			}
			// printing space in descending order
			for (int space1 = row; space1 > i; space1--) {
				System.out.print(" ");
			}
			// new lines
			System.out.println();
		}
		sc.close();

	}

}
