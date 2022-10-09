package com.practice.array;

import java.util.Scanner;

public class PrintAnArrayInReverseOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int x = sc.nextInt();
		reverseArray(x);

	}

	public static void reverseArray(int n) {
		Scanner Sc = new Scanner(System.in);
		int a[] = new int[n];
		System.out.println("Enter the element of the given array");
		for (int i = 0; i < a.length; i++) {
			a[i] = Sc.nextInt();
		}
		System.out.println("Before reverse of the array");
		for (int k = 0; k < a.length; k++) {
			System.out.print(a[k] + ",");
		}
		System.out.println();
		System.out.println("After reverse array is");
		for (int p = a.length - 1; p >= 0; p--) {
			System.out.print(a[p] + ",");
		}
	}

}
