package com.practice.array;

import java.util.Scanner;

public class SumOfAllTheNoInArray {
	public static void sumAllNo(int n) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[n];
		System.out.println("Enter the element into the given array :");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Before the array is");
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + ",");
		}
		System.out.println();
		System.out.println("After sum of all the element is:");
		int sum = 0;
		for (int k = 0; k < a.length; k++) {
			sum = sum + a[k];
		}
		System.out.print(sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int x = sc.nextInt();
		sumAllNo(x);
	}

}
