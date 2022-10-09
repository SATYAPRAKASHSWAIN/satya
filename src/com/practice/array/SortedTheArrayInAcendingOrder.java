package com.practice.array;

import java.util.Scanner;

public class SortedTheArrayInAcendingOrder {
	public static void acendNO(int n) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[n];
		System.out.println("Enter the elements into the given array");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Before array is:");
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + ",");
		}
		System.out.println();
		int temp;
		System.out.println("After acending order sorting,the given array is");
		for (int j = 0; j < a.length; j++) {
			for (int k = j + 1; k < a.length; k++) {
				if (a[j] > a[k]) {
					temp = a[j];
					a[j] = a[k];
					a[k] = temp;
				}
			}
		}
		for(int j=0;j<a.length;j++) {
			System.out.print(a[j]+",");
		}
		System.out.println();
			System.out.println("Largest number of the array is:"+a[a.length-1]);
		//System.out.println();
		System.out.println("Array after decending order sorting,the given array is:");
		for (int j = 0; j < a.length; j++) {
			for (int k = j + 1; k < a.length; k++) {
				if (a[j] < a[k]) {
					temp = a[j];
					a[j] = a[k];
					a[k] = temp;
				}
			}
		}
		for(int j=0;j<a.length;j++) {
			System.out.print(a[j]+",");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int x = sc.nextInt();
		acendNO(x);
	}

}
