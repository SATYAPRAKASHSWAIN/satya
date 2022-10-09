package com.practice.array;

import java.util.Scanner;

public class LeftshiftAndRightshiftOfTheArray {
	public static void leftRightShift(int n) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[n];
		int i, first = 0, j, k, l, last = 0, p, m;
		System.out.println("Enter the element into the given array");
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Before left and right shift the given array is:");
		for (j = 0; j < a.length; j++) {
			System.out.print(a[j] + ",");
		}
		first = a[0];
		for (k = 0; k < a.length - 1; k++) {
			a[k] = a[k + 1];
		}
		a[a.length - 1] = first;
		System.out.println();
		System.out.println("After left shift the given array is");
		for (l = 0; l < a.length; l++) {
			System.out.print(a[l] + ",");
		}
		System.out.println();
		for (int t = 0; t < 2; t++) {

			last = a[a.length - 1];
			for (m = a.length - 1; m > 0; m--) {
				a[m] = a[m - 1];
			}
			a[0] = last;
		}
		System.out.println();
		System.out.println("After right shift the given array is");
		for (p = 0; p < a.length; p++) {
			System.out.print(a[p] + ",");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int x = sc.nextInt();
		leftRightShift(x);
	}

}
