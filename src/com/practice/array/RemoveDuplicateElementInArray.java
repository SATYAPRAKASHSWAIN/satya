package com.practice.array;

import java.util.Scanner;

public class RemoveDuplicateElementInArray {
	public static void removeDuplicateElement(int n) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[n];
		int visit = -1;
		System.out.println("Enter the elements  into the array ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Before array is:");
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + ",");
		}
		System.out.println();
		System.out.println("After the removing duplicate elements");
		for (int k = 0; k < a.length; k++) {
			for (int l = k + 1; l < a.length; l++) {
				if (a[k] == a[l]) {
					a[l] = visit;
				}
			}
		}
		//System.out.println("eeded");
		for (int k = 0; k < a.length; k++) {
			if (a[k] != visit) {
				System.out.print(a[k]+",");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int x = sc.nextInt();
		removeDuplicateElement(x);
	}

}
