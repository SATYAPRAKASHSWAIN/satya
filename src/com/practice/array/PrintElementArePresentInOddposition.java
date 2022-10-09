package com.practice.array;

import java.util.Scanner;

public class PrintElementArePresentInOddposition {
	public static void oddPositionInArray(int n) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[n];
		System.out.println("Enter the element of the array ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.print("Before  array is :");
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + ",");
		}
		System.out.println();
		System.out.println();
		System.out.print("After sorting the odd position of array is:");
		for (int k = 0; k < a.length; k++) {
			if (a[k] % 2 != 0) {
				System.out.print(a[k] + ",");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int x = sc.nextInt();
		oddPositionInArray(x);

	}

}
