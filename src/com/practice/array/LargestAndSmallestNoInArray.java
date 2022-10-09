package com.practice.array;

import java.util.Scanner;

public class LargestAndSmallestNoInArray {
	public static void largestAndSmallest(int n) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[n];
		System.out.println("Enter the element of the given array");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Before arrray is:");
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + ",");
		}
		int lar, sma, temp;
		sma=lar = a[0];
		
		for (int k = 0; k < a.length; k++) {
			if (lar < a[k]) {
				temp = a[k];
				a[k] = lar;
				lar = temp;
			}

		}
		System.out.println();
		System.out.println("Largest no in the given array is:" + lar);

		for (int k = 0; k < a.length; k++) {
			if (sma > a[k]) {
				temp = a[k];
				a[k] = sma;
				sma = temp;
			}

		}
		System.out.println("Smallest no in the given array is:" + sma);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int x = sc.nextInt();
		largestAndSmallest(x);
	}

}
